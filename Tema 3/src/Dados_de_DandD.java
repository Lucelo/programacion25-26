import java.util.Arrays;
import java.util.Scanner;

public class Dados_de_DandD {
    public static final int VALOR_MIN = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos dados desea tirar");
        int numdados = sc.nextByte();

        System.out.println("Cuantos dados desea tirar");
        int añadir = sc.nextByte();

        int[] dados = new int[numdados];

        System.out.println("Cuantas caras tiene el dado");
        int tamañomax = sc.nextByte();

        for (int i = 0; i < numdados; i++) {

            int numeroAleatorio = (int) ((Math.random() * (tamañomax - VALOR_MIN + 1)) + VALOR_MIN);

            dados[i] = numeroAleatorio;


        }

        System.out.println("Los resurtados han sido ");

        System.out.printf(Arrays.toString(dados));
        int totaldados = 0;

        for (int j = 0; j < numdados; j++) {
            totaldados += dados[j];
        }

        System.out.printf(" = " + String.valueOf(totaldados) + añadir);

    }

}
