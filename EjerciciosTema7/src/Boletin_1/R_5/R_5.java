package Boletin_1.R_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class R_5 {

    static void main(String[] args) throws IOException {

        boolean salir = false;

        while (!salir) {

            Scanner sc = new Scanner(System.in);

            System.out.println();
            System.out.println("1.Crear directorio");
            System.out.println("2.Crear fichero de texto");
            System.out.println("3.Borrar fichero");
            System.out.println("4.Listar ficheros de una carpeta");
            System.out.println("5.Salir");

            int occion = sc.nextInt();
            sc.nextLine();
            switch (occion) {

                case 1 -> crearDirectorio(sc);

                case 2 -> crearFichero(sc);

                case 3 -> borrarFichero(sc);

                case 4 -> listarFicheros(sc);

                case 5 -> salir = true;

                default -> throw new IllegalStateException("Unexpected value: " + occion);

            }

        }


    }

    private static void crearDirectorio(Scanner sc) throws IOException {
        System.out.println("Nombre del directorio");
        String directorio = sc.nextLine();

        Path dir = Path.of("./src/R_5/" + directorio);

        if (Files.exists(dir)) {
            System.out.println("El directorio ya existe.");
        } else {
            Files.createDirectories(dir);
            System.out.println("Directorio creado correctamente.");
        }
    }

    private static void crearFichero(Scanner sc) {
        try {
            System.out.println("Nombre del fichero:");
            String nombre = sc.nextLine();

            Path ruta = Path.of("./src/Boletin_1/R_5/" + nombre);

            if (Files.exists(ruta)) {
                System.out.println("El fichero ya existe.");
                return;
            }

            System.out.println("Introduce el contenido:");
            String contenido = sc.nextLine();

            Files.writeString(ruta, contenido);
            System.out.println("Fichero creado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al crear el fichero.");
        }
    }

    private static void borrarFichero(Scanner sc) {
        try {
            System.out.println("Nombre del fichero a borrar:");
            String nombre = sc.nextLine();

            Path ruta = Path.of("./src/Boletin_1/R_5/" + nombre);

            if (Files.deleteIfExists(ruta)) {
                System.out.println("Fichero borrado correctamente.");
            } else {
                System.out.println("No existe el fichero.");
            }

        } catch (IOException e) {
            System.out.println("Error al borrar el fichero.");
        }
    }

    private static void listarFicheros(Scanner sc) throws IOException {
        System.out.println("Nombre de la carpeta:");
        String nombre = sc.nextLine();

        Path ruta = Path.of("./src/Boletin_1/R_5/" + nombre);

        if (!Files.exists(ruta) || !Files.isDirectory(ruta)) {
            System.out.println("La carpeta no existe.");
            return;
        }

        Files.list(ruta)
                .filter(Files::isRegularFile)
                .sorted()
                .forEach(path -> System.out.println(path.getFileName()));
    }

}


















