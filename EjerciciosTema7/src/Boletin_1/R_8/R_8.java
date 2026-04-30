package Boletin_1.R_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class R_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del fichero:");
        String nombre = sc.nextLine();

        Path ruta = Path.of(nombre);

        if (!Files.exists(ruta)) {
            System.out.println("El fichero no existe.");
            return;
        }

        String regex = "^[A-Za-z]{2,} [A-Za-z]{2,} [A-Za-z]{2,} ([1-9]|[1-9][0-9])$";

        try {
            List<String> lineas = Files.readAllLines(ruta);

            for (String linea : lineas) {

                if (linea.matches(regex)) {
                    System.out.println("OK: " + linea);
                } else {
                    System.out.println("ERROR: " + linea);
                }

            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
        }

        sc.close();
    }
}