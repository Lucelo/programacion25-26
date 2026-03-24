package R_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class R_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Path ruta = Paths.get("salidaEj3.txt");

        try {
            String linea;

            while (true) {
                linea = sc.nextLine();

                if (linea.equals("fin")) {
                    break;
                }

                Files.writeString(
                        ruta,
                        linea + System.lineSeparator(),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND
                );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
