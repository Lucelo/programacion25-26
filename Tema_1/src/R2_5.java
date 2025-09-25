import java.util.Scanner;

public class R2_5 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int num;

        int contador = 0;

        do {

            System.out.print("Introduce un número (negativo para terminar): ");

            num = sc.nextInt();

            contador++;

        } while (num >= 0);

        System.out.println("Has introducido " + (contador - 1) + " números positivos");

    }

}
