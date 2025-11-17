import java.util.Arrays;
import java.util.Scanner;

public class Dados_de_DandD {
    public static final int VALOR_MIN = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos dados desea tirar");
        int cantidaddedaddos = sc.nextByte();

        int[] dados = new int[cantidaddedaddos];

        System.out.println("Cuantas caras tiene el dado");
        int tamañomax = sc.nextByte();

        for (int i = 0; i < cantidaddedaddos; i++) {

            int numeroAleatorio = (int) ((Math.random() * (tamañomax - VALOR_MIN + 1)) + VALOR_MIN);

            dados[i] = numeroAleatorio;


        }

        System.out.println("Los resurtados han sido ");

        System.out.printf(Arrays.toString(dados));
        int totaldados = 0;

        for (int j = 0; j < cantidaddedaddos; j++) {
            totaldados += dados[j];
        }

        System.out.printf(" = " + String.valueOf(totaldados));

    }

}
