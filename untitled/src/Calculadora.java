import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Calculadora de suma y resta");

        System.out.println("Ingresa el primer numero");

        int num1 = sc.nextInt();

        System.out.println("Ingresa el segundo numero");

        int num2 = sc.nextInt();

        System.out.println("Que operación desea hacer");

        String vl = sc.next();

        System.out.println("resurtado ");

        int rs;

        if (vl.equals("suma")) {

            rs = num1 + num2;

            System.out.println("El resultado es " + rs);

        } else if (vl.equals("resta")) {

            rs = num1 - num2;

            System.out.println("El resultado de la resta es: " + rs);

        } else {

            System.out.println("Operación no válida.");

        }

        sc.close();
    }

}
