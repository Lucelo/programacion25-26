package R1_3;

import java.util.Scanner;

import R1_3.Maquina.*;
import static R1_3.Maquina.*;


public class Principal {

    public static void main(String[] args) {

        Maquina maquina = new Maquina();

        Scanner sc = new Scanner(System.in);

        maquina.Llenar_depositos();

        boolean salir = false;

        while (!salir) {

            System.out.println();

            System.out.print("1.Cafe ");
            System.out.print("2.leche ");
            System.out.println("3.Cafe con leche ");
            System.out.print("4.Estado ");
            System.out.println("5.apagar ");

            System.out.println();

            System.out.print("-");
            int eleccion = sc.nextInt();

            System.out.println();

            if (eleccion == 1) {
                maquina.Servir_cafe();
            } else if (eleccion == 2) {
                maquina.Servir_leche();
            } else if (eleccion == 3) {
                maquina.Servir_cafe_con_leche();
            } else if (eleccion == 4) {
                maquina.Estado_de_maquina();
            } else if (eleccion == 5) {
                salir = true;
            } else if (eleccion < 0 || eleccion > 5) {
                System.out.println("El numero es incorrecto");
            }


        }

    }


}
