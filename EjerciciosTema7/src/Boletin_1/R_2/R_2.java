package Boletin_1.R_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class R_2 {

    static void main(String[] args) {
        File f = new File("./src/leeme.txt");

        try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {

            System.out.println(br.lines());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
