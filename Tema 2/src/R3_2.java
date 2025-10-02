import java.util.InputMismatchException;
import java.util.Scanner;

public class R3_2 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int base;

        int resu = 0;

        int expo;

        while (true) {

            try {

                System.out.print("Base: ");
                base = sc.nextInt();

                System.out.print("Exponente: ");
                expo = sc.nextInt();

                break;
            } catch (InputMismatchException e) {
                System.out.println("¡Error! La entrada no es un número. Por favor, inténtalo de nuevo.");
                sc.next();

            }
        }

        for (int i = 0; i < expo; i++) {

            resu += base;

        }

        System.out.println("La potencia de " + base + " ^ " + expo + " = " + resu);

    }
}
