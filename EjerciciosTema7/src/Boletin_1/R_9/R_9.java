package Boletin_1.R_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class R_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del fichero:");
        String nombre = sc.nextLine();

        Path ruta = Path.of(nombre);

        if (!Files.exists(ruta)) {
            System.out.println("El fichero no existe.");
            return;
        }

        String regex = "\\d{4}-[A-Z]{3}";

        Path salida = Path.of("MatriculasCorrectas.txt");

        try {
            // Limpia el archivo antes (sobrescribe)
            Files.writeString(salida, "");

            List<String> lineas = Files.readAllLines(ruta);

            for (String linea : lineas) {

                String[] partes = linea.split(" ");

                if (partes.length < 2) continue;

                String matricula = partes[partes.length - 1];

                if (matricula.matches(regex)) {

                    Files.writeString(
                            salida,
                            matricula + System.lineSeparator(),
                            StandardOpenOption.APPEND
                    );
                }
            }

            System.out.println("Proceso terminado.");

        } catch (IOException e) {
            System.out.println("Error.");
        }

        sc.close();
    }
}