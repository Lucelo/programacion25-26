import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) {
        String ficheroOrigen = "src/files/entrada.txt";
        String ficheroDestino = "src/files/salida.txt";

        // FileReader y FileWriter leen/escriben caracteres (char de 16 bits en Java)
        try (
                FileReader in = new FileReader(ficheroOrigen);
                FileWriter out = new FileWriter(ficheroDestino)
        ) {
            int c;

            // read() aquí no lee un byte, lee un carácter completo
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            System.out.println("Copia de caracteres completada.");

        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }
}