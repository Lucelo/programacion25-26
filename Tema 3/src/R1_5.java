import java.util.Arrays;
import java.util.Scanner;

public class R1_5 {

    public static final int VALOR_MAX = 1000;
    public static final int VALOR_MIN = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos quieres hacer");

        int tamano = sc.nextInt();

        int[] array = new int[tamano];

        for (int i = 0; i < tamano; i++) {

            int numeroAleatorio = (int) ((Math.random() * (VALOR_MAX - VALOR_MIN + 1)) + VALOR_MIN);

            array[i] = numeroAleatorio;

        }

        System.out.println(Arrays.toString(array));

    }
}
