import java.util.Scanner;

public class R3_1 {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int numA = sc.nextInt();
        System.out.print("Numero 2: ");
        int numB = sc.nextInt();
        System.out.print("Numero 3: ");
        int numC = sc.nextInt();

        if (numA < numB && numA < numC) {

            if (numB < numC) {
                System.out.println("El orden seria " + numA + ", " + numB + " y " + numC);
            } else {
                System.out.println("El orden seria " + numA + ", " + numC + " y " + numB);
            }

        } else if (numB < numA && numB < numC) {

            if (numA < numC) {
                System.out.println("El orden seria " + numB + ", " + numA + " y " + numC);
            } else {
                System.out.println("El orden seria " + numB + ", " + numC + " y " + numA);
            }

        } else if (numC < numA && numC < numB) {

            if (numA < numB) {
                System.out.println("El orden seria " + numC + ", " + numA + " y " + numB);
            } else {
                System.out.println("El orden seria " + numC + ", " + numB + " y " + numA);
            }

        }


    }


}
