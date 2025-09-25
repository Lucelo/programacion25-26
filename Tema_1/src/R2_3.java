import java.util.Scanner;

public class R2_3 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos números desea introducir: ");

        int a = sc.nextInt();

        if (a >= 1) {

            for (int b = 1; b <= a; b++) {

                System.out.print("Numero a introducir: ");

                int c = sc.nextInt();

                if (c % 2 == 0) {
                    System.out.println("El numero " + c + " es par");

                } else {
                    System.out.println("El numero " + c + " es impar");

                }

            }

        } else {
            System.out.println("El valor " + a + " no es valido solo valores de 0 para arriba");
        }

    }
}
