import java.util.Scanner;

public class R2_15 {

    static String BUSQUEDA (int[][] matriz){

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame los valores desde donde calcular: ");
        System.out.print("Fila: ");
        int a =(sc.nextByte());
        System.out.print("Columna: ");
        int b =(sc.nextByte());


        return String.valueOf(matriz [a][b]);
    }

    static void main() {

        int[][] matriz = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
        };



        System.out.println("El valor que se encontró seria " +  BUSQUEDA(matriz));


    }


}
