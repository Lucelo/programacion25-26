import java.util.Arrays;
import java.util.Scanner;

public class R1_7 {

    public static final int VALOR_MAX = 50;
    public static final int VALOR_MIN = 1;
    public static int VALOR_A_ENCONTRAR = 0;


    public static void contieneElemento(int[] numeros, Scanner sc) {

        for (int i = 0; i < numeros.length; i++) {

            int numeroAleatorio = (int) ((Math.random() * (VALOR_MAX - VALOR_MIN + 1)) + VALOR_MIN);

            numeros[i] = numeroAleatorio;

        }

        //Para ver los valores dentro del array
        System.out.println(Arrays.toString(numeros));

        System.out.println();

        System.out.print("Que valor desea: ");
        VALOR_A_ENCONTRAR = sc.nextInt();

    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[40];

        contieneElemento(numeros, sc);

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == VALOR_A_ENCONTRAR) {

                System.out.println();

                System.out.println("Número encontrado en la posición: " + (i + 1));

                encontrado = true;

                break; // Sale del bucle cuando lo encuentra

            }

        } if (!encontrado) {

            System.out.println("El número no está en el array.");

        }

    }

}