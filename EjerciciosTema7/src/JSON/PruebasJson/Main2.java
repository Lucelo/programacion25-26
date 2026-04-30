package JSON.PruebasJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Path destino = Path.of("src/main/java/ej1/salida/pesonas2.json");
        // 1. Crear la colección y añadir 5 personas
        List<Persona2> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona2("Laura Gómez", "12345678A", "600111222", LocalDate.of(1955,1,23)));
        listaPersonas.add(new Persona2("Carlos Ruiz", "87654321B", "611222333", LocalDate.of(1925,1,23)));
        listaPersonas.add(new Persona2("Ana Martínez", "11223344C", "622333444", LocalDate.of(1945,1,23)));
        listaPersonas.add(new Persona2("Pedro Sánchez", "44332211D", "633444555", LocalDate.of(1975,1,23)));
        listaPersonas.add(new Persona2("Sofía López", "55667788E", "644555666", LocalDate.of(1995,1,23)));

        // 2. Exportar la colección a un fichero JSON
        exportarAJson(listaPersonas, destino);
    }

    private static void exportarAJson(List<Persona2> personas, Path destino) {

        // Configuramos Gson para que el JSON salga con saltos de línea y tabulaciones
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .setPrettyPrinting().create();

        String json = gson.toJson(personas);

        try {
            Files.writeString(destino, json);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}