package org.example.R_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.R_1.Videojuego;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {



    static void main(String[] args) throws IOException {

        ArrayList<Estudiante> estudiantes=new ArrayList<>();

        Estudiante e1 = new Estudiante("1A","Antonio",3.0);
        Estudiante e2 = new Estudiante("4B","Lucia",5.6);
        Estudiante e3 = new Estudiante("3C","Victor",7.1);

        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();


        String json = gson.toJson(estudiantes);
        System.out.println("JSON generado:");
        System.out.println(json);

        FileWriter writer = new FileWriter("Estudiante.json");
        gson.toJson(estudiantes, writer);
        writer.close();

        FileReader reader = new FileReader("Estudiante.json");

        Estudiante estudiantesmatriculados = gson.fromJson(reader, Estudiante.class);

        reader.close();

        System.out.println("\nObjeto leído:");
        System.out.println(estudiantesmatriculados);

    }

}
