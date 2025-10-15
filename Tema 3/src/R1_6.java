import java.util.Arrays;
import java.util.Scanner;

public class R1_6 {

    public static final int VALOR_MAX = 50;
    public static final int VALOR_MIN = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[40];

        for (int i = 0; i < numeros.length; i++) {

            int numeroAleatorio = (int) ((Math.random() * (VALOR_MAX - VALOR_MIN + 1)) + VALOR_MIN);

            numeros[i] = numeroAleatorio;

        }

        //Para ver los valores dentro del array
        System.out.println(Arrays.toString(numeros));

        System.out.println("Introduce el número que quieres buscar:");

        int encontrar = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == encontrar) {

                System.out.println();

                System.out.println("Número encontrado en la posición: " + (i + 1));

                encontrado = true;

                break; // Sale del bucle cuando lo encuentra

            }

        }

        if (!encontrado) {

            System.out.println("El número no está en el array.");

        }

    }
}
