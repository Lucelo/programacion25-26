package R_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class R_6 {

    static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre de directorio");

        String dire = sc.nextLine();

        Files.list(Path.of("./src/R_6/" + dire))
                .forEach(path -> {
                    if (Files.isRegularFile(path)) {

                        try {

                            System.out.println(path.getFileName() + " " + Files.size(path) / 1024 + " KB ");

                        } catch (IOException e) {

                            throw new RuntimeException(e);

                        }

                    } else {

                        System.out.println(path.getFileName());

                    }

                });

    }

}
