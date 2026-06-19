import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * - Clase principal para procesar las incidencias del aeropuerto y generar el informe JSON.
 */
public class MainAlumnos {

    // Definimos la ruta del archivo JSON de salida
    private static final Path ARCHIVO_INFORME = Paths.get("informe_incidencias.json");

    public static void main(String[] args) {

        // Generamos el entorno de prueba con los logs desordenados
        GeneradorEntornoAeropuerto.execute();

        // Limpiamos el archivo de destino antes de empezar para evitar
        // mezclar resultados de ejecuciones anteriores
        try {
            Files.deleteIfExists(ARCHIVO_INFORME);
        } catch (IOException e) {
            System.out.println("Error intentando eliminar el informe anterior: " + e.getMessage());
        }

        creaInformeIncidencias(GeneradorEntornoAeropuerto.RAIZ);
    }

    /**
     * - Busca de forma recursiva, valida y procesa los archivos de incidencias reales
     * para generar un informe final en formato JSON.
     * * @param raiz - La ruta del directorio base donde se encuentran las subcarpetas con los archivos.
     */
    private static void creaInformeIncidencias(Path raiz) {
        List<Incidencia> listaIncidencias = new ArrayList<>();

        // Expresión regular para validar el nombre del archivo:
        // - incidencia_[CODIGO_VUELO]_[FECHA].(log|txt)
        // - Código: 2 letras mayúsculas (A-Z) y de 3 a 4 números.
        // - Fecha: 8 dígitos numéricos continuos.
        String regexNombre = "^incidencia_([A-Z]{2}\\d{3,4})_(\\d{8})\\.(log|txt)$";
        Pattern patternNombre = Pattern.compile(regexNombre);

        // Recorrido recursivo del directorio utilizando java.nio.file.Files.walk
        try (Stream<Path> stream = Files.walk(raiz)) {
            stream.filter(Files::isRegularFile)
                    .forEach(path -> {
                        String nombreArchivo = path.getFileName().toString();
                        Matcher matcherNombre = patternNombre.matcher(nombreArchivo);

                        // 1. Filtrado por el patrón del nombre
                        if (matcherNombre.matches()) {
                            String codigoVuelo = matcherNombre.group(1);
                            String fechaRaw = matcherNombre.group(2); // AAAAMMDD

                            // Reformatear la fecha de AAAAMMDD a DD/MM/AAAA
                            String anio = fechaRaw.substring(0, 4);
                            String mes = fechaRaw.substring(4, 6);
                            String dia = fechaRaw.substring(6, 8);
                            String fechaFormateada = dia + "/" + mes + "/" + anio;

                            // 2. Análisis del contenido del archivo
                            Incidencia incidenciaProcesada = procesarContenidoArchivo(path, codigoVuelo, fechaFormateada);
                            if (incidenciaProcesada != null) {
                                listaIncidencias.add(incidenciaProcesada);
                            }
                        }
                    });

            // 3. Generación del informe JSON si se encontraron incidencias
            InformeAeropuerto informe = new InformeAeropuerto(listaIncidencias.size(), listaIncidencias);
            guardarInformeJson(informe);

        } catch (IOException e) {
            System.out.println("Error al procesar el directorio de archivos: " + e.getMessage());
        }
    }

    /**
     * - Lee el archivo, descarta simulacros y extrae la hora y descripción mediante Regex.
     * * @param path - Ruta del archivo a analizar.
     * @param codigoVuelo - Código de vuelo extraído del nombre del archivo.
     * @param fecha - Fecha formateada (DD/MM/AAAA) extraída del nombre del archivo.
     * @return - Un objeto Incidencia si el archivo es válido y real; null en caso contrario.
     */
    private static Incidencia procesarContenidoArchivo(Path path, String codigoVuelo, String fecha) {
        // Expresión regular para la línea: [HH:MM:SS] DESCRIPCIÓN
        String regexLinea = "^\\[(\\d{2}:\\d{2}:\\d{2})\\]\\s+(.+)$";
        Pattern patternLinea = Pattern.compile(regexLinea);

        try {
            // Leemos todas las líneas (el enunciado indica que suele tener una sola línea)
            List<String> lineas = Files.readAllLines(path);

            for (String linea : lineas) {
                // Si contiene la palabra SIMULACRO (insensible a mayúsculas/minúsculas), se descarta el archivo por completo
                if (linea.toUpperCase().contains("SIMULACRO")) {
                    return null;
                }

                Matcher matcherLinea = patternLinea.matcher(linea);
                if (matcherLinea.matches()) {
                    String hora = matcherLinea.group(1);
                    String descripcion = matcherLinea.group(2).trim();

                    // Retornamos el registro de la incidencia mapeado
                    return new Incidencia(codigoVuelo, fecha, hora, descripcion);
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo " + path.getFileName() + ": " + e.getMessage());
        }
        return null;
    }

    /**
     * - Serializa el objeto informe a formato JSON de manera formateada y lo guarda en un archivo.
     * * @param informe - El objeto InformeAeropuerto que contiene los totales y la lista de incidencias.
     */
    private static void guardarInformeJson(InformeAeropuerto informe) {
        // Configuramos GSON con Pretty Printing para que quede idéntico al ejemplo estructurado
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOutput = gson.toJson(informe);

        try {
            Files.writeString(ARCHIVO_INFORME, jsonOutput);
            System.out.println("Informe JSON generado con éxito en: " + ARCHIVO_INFORME.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo JSON: " + e.getMessage());
        }
    }
}