package A.R_1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class R_1 {

    public static void main(String[] args) {
        Path destino = Path.of("src/main/java/ej1/salida/pesonas.json");

        // 1. Crear la colección y añadir 5 personas (sin fecha de nacimiento)
        List<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona("Laura Gómez", "12345678A", "600111222"));
        listaPersonas.add(new Persona("Carlos Ruiz", "87654321B", "611222333"));
        listaPersonas.add(new Persona("Ana Martínez", "11223344C", "622333444"));
        listaPersonas.add(new Persona("Pedro Sánchez", "44332211D", "633444555"));
        listaPersonas.add(new Persona("Sofía López", "55667788E", "644555666"));

        // 2. Exportar la colección a JSON usando Gson
        exportarAJson(listaPersonas, destino);
    }

    private static void exportarAJson(List<Persona> personas, Path destino) {

        // Configuramos Gson para que el JSON salga con saltos de línea y tabulaciones
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(personas);

        try {
            Files.writeString(destino, json);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
