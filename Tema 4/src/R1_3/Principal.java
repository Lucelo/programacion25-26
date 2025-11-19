package R1_3;

import java.util.Scanner;

import R1_3.Maquina.*;


public class Principal {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rellenar();


        boolean salir = false;
        while (!salir) {

            int eleccion = sc.nextInt();

            if (eleccion == 1) {
                Servir_cafe();
            } else if (eleccion == 2) {
                Servir_leche();
            } else if (eleccion == 3) {
                Servir_cafe_con_leche();
            } else if (eleccion == 4) {
                Estado_de_maquina();
            } else if (eleccion == 5) {
                salir = true;
            }


        }

    }




}
