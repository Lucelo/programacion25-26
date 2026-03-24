package R_5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

public class R_5 {

    static void main(String[] args) throws IOException {

        boolean salir = false;

        while (!salir) {

            Scanner sc = new Scanner(System.in);

            System.out.println("1.Crear directorio");
            System.out.println("2.Crear fichero de texto");
            System.out.println("3.Borrar fichero");
            System.out.println("4.Listar ficheros de una carpeta");
            System.out.println("5.Salir");

            int occion = sc.nextInt();

            switch (occion) {

                case 1 -> {
                    Path dir = Path.of("./src/directorio/");
                    
                    if (!Files.exists(dir)) {
                        Files.createDirectories(dir);

                    }
                }

                case 2 -> {

                    if (!Files.exists(Path.of("./src/directorio/fichero.txt"))){
                        Files.createFile(Path.of("./src/directorio/fichero.txt"));

                    }

                    String linea;
                    while (true) {
                        linea = sc.nextLine();

                        if (linea.equals("fin")) {
                            break;
                        }

                        Files.writeString(Path.of("./src/directorio/fichero.txt"), linea);


                    }


                }

                case 3 -> {

                    Files.deleteIfExists(Path.of("./src/directorio/fichero.txt"));

                }

                case 4 -> {


                    System.out.println(String.valueOf(Files.list(Path.of("./src/directorio")).sorted()));

                }

                case 5 -> {
                    salir = true;
                }

            }

        }


    }
}
