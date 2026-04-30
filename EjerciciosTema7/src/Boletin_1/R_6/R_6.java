package Boletin_1.R_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class R_6 {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("Debes pasar el nombre del directorio como parámetro.");
            return;
        }

        Path ruta = Path.of("./src/Boletin_1/R_6/" + args[0]);

        if (!Files.exists(ruta) || !Files.isDirectory(ruta)) {
            System.out.println("El directorio no existe.");
            return;
        }

        Files.list(ruta)
                .forEach(path -> {
                    if (Files.isRegularFile(path)) {
                        try {
                            System.out.println(path.getFileName() + " - " + (Files.size(path) / 1024) + " KB");
                        } catch (IOException e) {
                            System.out.println("Error al leer tamaño");
                        }
                    } else {
                        System.out.println(path.getFileName() + " (directorio)");
                    }
                });
    }

    }


