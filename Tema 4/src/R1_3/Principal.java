package R1_3;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Maquina maquina = new Maquina();

        Scanner sc = new Scanner(System.in);

        maquina.llenarDepositos();

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
                maquina.servirCafe();
            } else if (eleccion == 2) {
                maquina.servirLeche();
            } else if (eleccion == 3) {
                maquina.servirCafeConLeche();
            } else if (eleccion == 4) {
                maquina.estadoDeMaquina();
            } else if (eleccion == 5) {
                salir = true;
            } else if (eleccion < 0 || eleccion > 5) {
                System.out.println("El numero es incorrecto");
            }


        }

    }


}
