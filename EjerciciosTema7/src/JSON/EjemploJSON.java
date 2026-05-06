package JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

// Clase Persona
class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class EjemploJSON {

    static String archivo = "personas.json";
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {

        // 1. CREAR LISTA INICIAL Y GUARDARLA
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 20));
        personas.add(new Persona("Maria", 25));

        guardar(personas);

        // 2. LEER Y MOSTRAR
        List<Persona> lista = leer();
        System.out.println("Contenido inicial:");
        mostrar(lista);

        // 3. AÑADIR PERSONA
        lista.add(new Persona("Luis", 30));
        guardar(lista);

        System.out.println("\nDespués de añadir:");
        mostrar(leer());

        // 4. BORRAR PERSONA
        lista.removeIf(p -> p.nombre.equals("Maria"));
        guardar(lista);

        System.out.println("\nDespués de borrar:");
        mostrar(leer());
    }

    // 🔹 GUARDAR (ESCRIBIR JSON)
    public static void guardar(List<Persona> lista) {
        try (Writer writer = new FileWriter(archivo)) {
            gson.toJson(lista, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar.");
        }
    }

    // 🔹 LEER (JSON → OBJETO)
    public static List<Persona> leer() {
        try (Reader reader = new FileReader(archivo)) {

            Type tipoLista = new TypeToken<List<Persona>>() {
            }.getType();
            return gson.fromJson(reader, tipoLista);

        } catch (IOException e) {
            System.out.println("Error al leer.");
            return new ArrayList<>();
        }
    }

    // 🔹 MOSTRAR
    public static void mostrar(List<Persona> lista) {
        for (Persona p : lista) {
            System.out.println(p.nombre + " - " + p.edad);
        }
    }
}