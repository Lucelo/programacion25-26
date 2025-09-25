import java.util.Scanner;

public class R2_4 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número positivo: ");

        int a = sc.nextInt();

        if (a >= 1) {

            System.out.println("El resultado de " + a + " seria " + a * (a + 1) / 2);

        }

    }
}
