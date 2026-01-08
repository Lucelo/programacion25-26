package R1_1;

import java.util.Scanner;


public class MenuCuentaCredito {

    Scanner sc = new Scanner(System.in);

    void main(String[] args) {

        System.out.println("1. Ingresar dinero");
        System.out.println("2. Sacar dinero");
        System.out.println("3. Mostrar saldo y crédito");
        System.out.println("4. Salir");


        boolean salir = false;

        while (!salir) {

            int opc = sc.nextInt();


            switch (opc) {

                case 1 -> {
                }

                case 2 -> {
                }

                case 3 -> {
                }

                case 4 -> salir = true;

                default -> System.out.println("La opción no es valida");


            }

        }


    }
}
