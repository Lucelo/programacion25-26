import java.util.Scanner;

public class R3_4 {
    public static final int MAX_INTENTOS = 5;
    public static final int VALOR_MAX = 100;
    public static final int VALOR_MIN = 1;

    static void main() {

        Scanner sc = new Scanner(System.in);

        int numeroIntruducido = 0;

        int numeroAleatorio = (int) ((Math.random() * (VALOR_MAX - VALOR_MIN + 1)) + VALOR_MIN);

        int intentos = 0;

        while (numeroIntruducido != numeroAleatorio && intentos < MAX_INTENTOS) {

            System.out.println("introduzca un numero entre el " + VALOR_MIN + " y el " + VALOR_MAX);

            intentos++;

            System.out.print("Intento Nº " + intentos + ": ");

            numeroIntruducido = sc.nextInt();

            System.out.println();

            if (numeroIntruducido > numeroAleatorio) {
                System.out.println("El numero oculto es más pequeño que " + numeroIntruducido);
                System.out.println();

            } else if (numeroIntruducido < numeroAleatorio) {
                System.out.println("El numero oculto es más grande que " + numeroIntruducido);
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
