package Boletin_4.R_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class R_3 {

    public static void main(String[] args) {

        Path ruta = Path.of("./Boletin_4/R_3/archivo.txt");

        long contador = 0;

        //Contador de palabras
        try (Stream<String> lineas = Files.lines(ruta)) {

            contador = lineas
                    .flatMap(linea -> Stream.of(linea.trim()
                            .split("\\s+")))
                    .filter(palabra -> palabra.equals("queso"))
                    .count();

            System.out.println("El archivo tiene la palabra queso un total de "
                    + contador);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
