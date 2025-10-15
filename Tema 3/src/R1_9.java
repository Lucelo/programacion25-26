import java.util.Arrays;
import java.util.Scanner;

public class R1_9 {

    public static final int VALOR_MAX = 50;
    public static final int VALOR_MIN = 1;

    public static void ORDEN(int[] numeros) {

        Arrays.sort(numeros);

    }

    public static void ORDENINVERTIDO(int[] numeros) {

        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {

            int numeroAleatorio = (int) ((Math.random() * (VALOR_MAX - VALOR_MIN + 1)) + VALOR_MIN);

            numeros[i] = numeroAleatorio;

        }

        System.out.print("Desea ordenar el array: ");

        String resp = sc.next();

        if (resp.equals("si")) {

            System.out.println("Ascendente o descendiente");

            resp = sc.next();

            if (resp.equals("Ascendente")) {

                ORDEN(numeros);

                System.out.println(Arrays.toString(numeros));

            } else if (resp.equals("descendiente")){

                ORDENINVERTIDO(numeros);

                System.out.println(Arrays.toString(numeros));

            }

        } else {

            System.out.println(Arrays.toString(numeros));

        }

    }

}
