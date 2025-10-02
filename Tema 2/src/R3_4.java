import java.util.Scanner;

public class R3_4 {
    public static final int MAX_INTENTOS = 5;

    static void main() {

        Scanner sc = new Scanner(System.in);

        int numeroIntruducido = 0;

        int numeroAleatorio = (int) (Math.random() * 100) + 1;

        int intentos = 0;


        while (numeroIntruducido != numeroAleatorio && intentos < MAX_INTENTOS) {

            System.out.println("introduzca un numero entre el 1 y el 100");

            intentos++;

            System.out.print("Intento Nº " + intentos + ": ");

            numeroIntruducido = sc.nextInt();

            System.out.println();

            if (numeroIntruducido > numeroAleatorio) {
                System.out.println("El numero " + numeroIntruducido + " es mas grande que el oculto");
                System.out.println();

            } else if (numeroIntruducido < numeroAleatorio) {
                System.out.println("El numero " + numeroIntruducido + " es mas pequeño que el oculto");
                System.out.println();

            } else {
                System.out.println();

            }


        }


        if (numeroIntruducido == numeroAleatorio) {
            System.out.println("Has acertado el número secreto era el " + numeroAleatorio);
        } else {
            System.out.println("No has acertado, el número secreto era el " + numeroAleatorio);
        }


    }

}
