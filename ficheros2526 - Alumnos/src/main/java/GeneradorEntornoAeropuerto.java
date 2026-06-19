import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GeneradorEntornoAeropuerto {

    private static final Random random = new Random();
    public static final Path RAIZ = Path.of("entorno_aeropuerto");

    private static final List<String> DESCRIPCIONES_REALES = Arrays.asList(
            "Fallo de presión en cabina de pasajeros",
            "Aterrizaje abortado por presencia de aves en pista",
            "Retraso por incidencia en sistema hidráulico",
            "Fallo en sensor de temperatura del motor",
            "Pérdida temporal de comunicaciones con torre",
            "Impacto de ave durante maniobra de aproximación",
            "Alarma de humo en compartimento de carga",
            "Despresurización detectada en vuelo",
            "Avería en sistema eléctrico auxiliar",
            "Fallo en tren de aterrizaje principal",
            "Incidencia con puerta de embarque automática",
            "Error en sistema de navegación inercial",
            "Problema de combustible detectado durante inspección",
            "Fallo en radar meteorológico",
            "Activación de protocolo de emergencia técnica"
    );

    private static final List<String> SIMULACROS = Arrays.asList(
            "SIMULACRO de evacuación realizado correctamente",
            "Se inicia simulacro de incendio en terminal",
            "simulacro de aterrizaje de emergencia",
            "SIMULACRO programado por protección civil",
            "Prueba interna. Simulacro de accidente aéreo"
    );

    public static void execute() {

        if (Files.exists(RAIZ)){
            System.out.println("El entorno ya está creado.");
            return;
        }

        crearDirectorio(RAIZ);
        crearDirectorio(RAIZ.resolve("terminal1"));
        crearDirectorio(RAIZ.resolve("terminal2"));
        crearDirectorio(RAIZ.resolve("torre_control"));
        crearDirectorio(RAIZ.resolve("torre_control/historico"));
        crearDirectorio(RAIZ.resolve("hangares"));
        crearDirectorio(RAIZ.resolve("hangares/mantenimiento"));
        crearDirectorio(RAIZ.resolve("backup"));
        crearDirectorio(RAIZ.resolve("backup/2024"));
        crearDirectorio(RAIZ.resolve("backup/antiguo"));
        crearDirectorio(RAIZ.resolve("basura"));
        crearDirectorio(RAIZ.resolve("tmp"));
        crearDirectorio(RAIZ.resolve("tmp/pruebas"));

        // ==========================
        // INCIDENCIAS VÁLIDAS REALES
        // ==========================

        generarIncidenciaReal(
                RAIZ.resolve("terminal1"),
                "incidencia_IB3412_20251112.log");

        generarIncidenciaReal(
                RAIZ.resolve("terminal1"),
                "incidencia_FR992_20250520.txt");

        generarIncidenciaReal(
                RAIZ.resolve("terminal2"),
                "incidencia_VY2145_20250318.log");

        generarIncidenciaReal(
                RAIZ.resolve("terminal2"),
                "incidencia_UX7001_20250607.txt");

        generarIncidenciaReal(
                RAIZ.resolve("torre_control"),
                "incidencia_EZ3210_20250402.log");

        generarIncidenciaReal(
                RAIZ.resolve("torre_control/historico"),
                "incidencia_IB9999_20250111.log");

        generarIncidenciaReal(
                RAIZ.resolve("hangares"),
                "incidencia_FR4310_20250222.txt");

        generarIncidenciaReal(
                RAIZ.resolve("hangares/mantenimiento"),
                "incidencia_VY8877_20250719.log");

        generarIncidenciaReal(
                RAIZ.resolve("backup"),
                "incidencia_UX4455_20250814.log");

        generarIncidenciaReal(
                RAIZ.resolve("backup/2024"),
                "incidencia_IB1111_20250909.txt");

        // ==================================
        // VÁLIDOS DE NOMBRE PERO SIMULACROS
        // ==================================

        generarSimulacro(
                RAIZ.resolve("terminal1"),
                "incidencia_IB5555_20251101.log");

        generarSimulacro(
                RAIZ.resolve("terminal2"),
                "incidencia_FR7777_20250312.txt");

        generarSimulacro(
                RAIZ.resolve("backup"),
                "incidencia_VY1212_20250630.log");

        generarSimulacro(
                RAIZ.resolve("hangares"),
                "incidencia_UX8888_20250501.txt");

        // =====================
        // NOMBRES NO VÁLIDOS
        // =====================

        generarBasura(
                RAIZ.resolve("basura"),
                "incidencia_ib3412_20251112.log");

        generarBasura(
                RAIZ.resolve("basura"),
                "incidencia_IB12_20251112.log");

        generarBasura(
                RAIZ.resolve("basura"),
                "incidencia_IB3412_251112.log");

        generarBasura(
                RAIZ.resolve("basura"),
                "incidencia_IB3412_20251112.csv");

        generarBasura(
                RAIZ.resolve("basura"),
                "INCIDENCIA_IB3412_20251112.log");

        generarBasura(
                RAIZ.resolve("basura"),
                "incidencia_IB3412-20251112.log");

        generarBasura(
                RAIZ.resolve("basura"),
                "incidencia_1234_20251112.log");

        generarBasura(
                RAIZ.resolve("basura"),
                "incidencia_IB341_20251112.log");

        generarBasura(
                RAIZ.resolve("tmp"),
                "registro_IB3412_20251112.log");

        generarBasura(
                RAIZ.resolve("tmp/pruebas"),
                "incidencia_IB3412_202511.log");

        // ======================
        // FICHEROS TOTALMENTE
        // IRRELEVANTES
        // ======================

        generarBasura(RAIZ, "notas.txt");
        generarBasura(RAIZ, "vuelos.xlsx");
        generarBasura(RAIZ, "readme.md");
        generarBasura(RAIZ, "config.ini");
        generarBasura(RAIZ, "aeropuerto.dat");

        generarBasura(
                RAIZ.resolve("backup/antiguo"),
                "incidencia_antigua.bak");

        generarBasura(
                RAIZ.resolve("backup/antiguo"),
                "prueba.log");

        generarBasura(
                RAIZ.resolve("backup/antiguo"),
                "temp.txt");

        System.out.println("Entorno generado correctamente.");
    }

    private static void crearDirectorio(Path ruta) {
        try {
            Files.createDirectories(ruta);
        }
        catch (IOException e) {
            System.err.println("Error generando el directorio: " + ruta);
        }
    }

    private static void generarIncidenciaReal(Path carpeta,
                                              String nombreArchivo) {

        String hora = String.format(
                "[%02d:%02d:%02d]",
                random.nextInt(24),
                random.nextInt(60),
                random.nextInt(60));

        String descripcion =
                DESCRIPCIONES_REALES.get(
                        random.nextInt(DESCRIPCIONES_REALES.size()));

        try {
            Files.writeString(
                    carpeta.resolve(nombreArchivo),
                    hora + " " + descripcion);
        } catch (IOException e) {
            System.err.println("Error escribiendo el archivo: " + nombreArchivo);
        }
    }

    private static void generarSimulacro(Path carpeta,
                                         String nombreArchivo) {

        String texto =
                "[" +
                        String.format("%02d:%02d:%02d",
                                random.nextInt(24),
                                random.nextInt(60),
                                random.nextInt(60))
                        + "] "
                        + SIMULACROS.get(
                        random.nextInt(SIMULACROS.size()));

        try {
            Files.writeString(
                    carpeta.resolve(nombreArchivo),
                    texto);
        } catch (IOException e) {
            System.err.println("Error escribiendo el archivo: " + nombreArchivo);
        }
    }

    private static void generarBasura(Path carpeta,
                                      String nombreArchivo) {

        try {
            Files.writeString(
                    carpeta.resolve(nombreArchivo),
                    "Contenido irrelevante para la auditoría.");
        } catch (IOException e) {
            System.err.println("Error escribiendo el archivo: " + nombreArchivo);
        }
    }
}