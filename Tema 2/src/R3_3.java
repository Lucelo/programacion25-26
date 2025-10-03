import java.util.Scanner;

public class R3_3 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");

        int num = Math.abs(sc.nextInt());

        int cont = 0;

        for (int i = 1; i <= num; cont++) {

            i = i * 10;

        }

        System.out.println();

        System.out.println("En " + num + " su numero de caracteres es " + cont);

    }
}