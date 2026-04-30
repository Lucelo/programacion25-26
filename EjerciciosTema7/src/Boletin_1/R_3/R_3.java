package Boletin_1.R_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class R_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("salidaEj3.txt", true))) {
            String linea;

            while (true) {
                linea = sc.nextLine();

                if (linea.equals("fin")) {
                    break;
                }

                bw.write(linea);
                bw.newLine(); // salto de línea
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}