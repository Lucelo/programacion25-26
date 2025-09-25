import java.util.Scanner;

public class Multiplo_de_un_numero {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el numero para ver sus divisores: ");

        int num = sc.nextInt();

        int comprobante = 2;

        while (comprobante <= num / 2 && num % comprobante != 0) {
            comprobante++;
        }

        if (num % comprobante == 0) {
            System.out.println("El comprobante de " + num + " es " + comprobante);

        } else {

            System.out.println("El numero " + num + " es primo");

        }

    }
}
