import java.util.Scanner;

public class R2_6 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime dos numeros que desee mulpiplicar");

        System.out.print("Numero 1: ");
        int numA = sc.nextInt();

        System.out.print("Numero 2: ");
        int numB = sc.nextInt();

        int numC = 0;

        if (numA < 0) {

            numA = -numA;

            for (int i = 0; i < numA; i++) {
                numC += numB;
            }

            numA = -numA;

            if (numB < 0) {

                numC = - numC;

            }

            numC = - numC;


        } else {

            for (int i = 0; i < numA; i++) {
                numC += numB;
            }

        }

        System.out.println(numA + " * " + numB + " = " + numC);

    }
}
