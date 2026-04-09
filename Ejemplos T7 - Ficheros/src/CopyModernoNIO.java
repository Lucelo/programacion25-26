import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class CopyModernoNIO {
    public static void main(String[] args) {
        Path origen = Paths.get("src/files/entrada.txt");
        Path destino = Paths.get("src/files/salida.txt");

        try {
            // OPCIÓN A: Copia directa de fichero a fichero (La más rápida y recomendada)
            Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copia directa completada con NIO.2");

            // OPCIÓN B: Leer todo el texto a un String y escribirlo (Para ficheros pequeños)
            /*
            String contenido = Files.readString(origen);
            Files.writeString(destino, contenido);
            System.out.println("Lectura y escritura de String completada con NIO.2");
            */

        } catch (IOException e) {
            System.err.println("Error de E/S con NIO.2: " + e.getMessage());
        }
    }
}