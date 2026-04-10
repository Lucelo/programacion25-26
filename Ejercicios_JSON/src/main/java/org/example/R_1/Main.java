package org.example.R_1;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // 1. Crear objeto
        Videojuego juego = new Videojuego("Elden Ring", "FromSoftware", 2022);

        // 2. Crear Gson (bonito)
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            // 3. Convertir a JSON
            String json = gson.toJson(juego);
            System.out.println("JSON generado:");
            System.out.println(json);

            // 4. Guardar en archivo
            FileWriter writer = new FileWriter("videojuego.json");
            gson.toJson(juego, writer);
            writer.close();

            // 5. Leer archivo
            FileReader reader = new FileReader("videojuego.json");

            // 6. Convertir JSON a objeto
            Videojuego juegoLeido = gson.fromJson(reader, Videojuego.class);

            reader.close();

            // 7. Mostrar objeto
            System.out.println("\nObjeto leído:");
            System.out.println(juegoLeido);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}