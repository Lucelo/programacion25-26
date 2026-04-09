import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class CopyLines {
    public static void main(String[] args) {
        String ficheroOrigen = "src/files/entrada.txt";
        String ficheroDestino = "src/files/salida.txt";

        // Envolvemos el FileReader en un BufferedReader
        // Y el FileWriter en un PrintWriter (que tiene el cómodo método println)
        try (
                BufferedReader in = new BufferedReader(new FileReader(ficheroOrigen));
                PrintWriter out = new PrintWriter(new FileWriter(ficheroDestino))
        ) {
            String linea;

            // Leemos línea a línea (hasta encontrar un salto de línea o el final del fichero)
            while ((linea = in.readLine()) != null) {
                out.println(linea); // Escribimos la línea y añadimos un salto de línea en destino
            }

            System.out.println("Copia por líneas completada.");

        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }
}