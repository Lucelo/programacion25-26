import java.util.Scanner;

public class R3_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te muestra la tabla de multiplicar del 1 al 10");
        System.out.println("Dime un numero que desees");
        int num1 = sc.nextInt();

        System.out.println("Tabla del " + num1);

        for (int i = 1; i <= 10; i++) {

            System.out.println(num1 + " * " + i + " = " + num1 * i);

        }

    }
}
