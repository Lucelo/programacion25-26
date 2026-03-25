package R_7;

import java.util.Scanner;

public class R_7 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        System.out.println("1. Listar directorio");
        System.out.println("2. Listar directorio y buscar " +
                "ficheros que comiencen por una palabra");
        System.out.println("3. Listar archivos con cierta " +
                "extensión de un directorio");
        System.out.println("4. Buscar un archivo en un directorio");
        System.out.println("5. Buscar recursivamente un archivo " +
                "en un directorio");
        System.out.println("6. Salir");


        while (!salir){

            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc){

                case 1->{}

                case 2->{}

                case 3->{}

                case 4->{}

                case 5->{}

                case 6->salir = true;





                default -> salir = true;


            }

        }

    }
}
