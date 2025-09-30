import java.util.Scanner;

public class R2_7 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuenta cantidad de numeros de sea ver su media: ");

        int cn = sc.nextInt();

        int num = 0;

        int num1 = 0;

        for (int i = 1; cn + 1 > i; i++) {

            System.out.print(i + ": ");

            num = sc.nextInt();

            num1 += num;

        }

        int num2 = num1 / 2;

        System.out.print("La suma es " + num1);

        System.out.print(" y el valor de media de los numeros introducidos es " + num2);

    }

}
