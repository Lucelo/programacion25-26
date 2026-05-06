package Boletin_1.R_1;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class R_1 {
    void main() {

        File f = new File("./src/leeme.txt");

        try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {

            System.out.println("El contenido dentro de leeme tiene " + br.lines().count() + " lineas ");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

}


