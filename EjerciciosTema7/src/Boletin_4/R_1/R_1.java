package Boletin_4.R_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class R_1 {

    public static void main(String[] args) {

        Path ruta = Path.of("./Boletin_4/R_1/archivo.txt");

        //Cuenta las lineas
        try (Stream<String> lineas = Files.lines(ruta)) {

            long contador = lineas.count();

            System.out.println("El archivo tiene " + contador + " líneas.");

        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo.");
        }

        long contador = 0;

        //Contador de palabras
        try (Stream<String> lineas = Files.lines(ruta)) {

            contador = lineas
                    .flatMap(linea -> Stream.of(linea.trim().split("\\s+")))
                    .filter(palabra -> !palabra.isEmpty())
                    .count();

            System.out.println("El archivo tiene " + contador + " palabras.");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }


    }
}