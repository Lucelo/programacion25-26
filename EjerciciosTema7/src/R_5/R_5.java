package R_5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

                case 4 -> listarFicheros();

                case 5 -> salir = true;

                default -> throw new IllegalStateException("Unexpected value: " + occion);

            }

        }


    }

    private static void crearDirectorio(Scanner sc) throws IOException {
        System.out.println("Nombre del directorio");
        String directorio = sc.nextLine();

        Path dir = Path.of("./src/R_5/" + directorio);

        if (!Files.exists(dir)) {
            Files.createDirectories(dir);

        }
    }

    private static void crearFichero(Scanner sc) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("./src/R_5/salidaEj5.txt", true));

            String linea;

            while (true) {
                linea = sc.nextLine();

                if (linea.equals("fin")) {
                    break;
                }

                bw.write(linea);
                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void borrarFichero(Scanner sc) throws IOException {
        String borrar= sc.nextLine();

        if (Files.exists(Path.of("./src/R_5/" + borrar))) {

            Files.deleteIfExists(Path.of("./src/R_5/" + borrar));

            System.out.println("Se pudo borrar");

        }

        if (!Files.exists(Path.of("./src/R_5/" + borrar))){

            System.out.println("No se pudo borrar");

        }

    }

    private static void listarFicheros() throws IOException {

        Files.list(Path.of("./src/R_5/"))
                .filter(Files::isRegularFile)
                .sorted()
                .forEach(path -> System.out.println(path.getFileName()));

    }

}


















