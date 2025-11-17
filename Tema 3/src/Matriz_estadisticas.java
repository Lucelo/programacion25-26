import java.util.Arrays;

public class Matriz_estadisticas {
    public static final int VALOR_MIN = 1;

    public static void main(String[] args) {

        // metodo
        int[][] matriz = new int[6][4];
        tiradaDados(matriz);
        quitarValorMinimo(matriz);

        for (int[] ints : matriz) {
            int sumaTotal = 0;
            System.out.print(Arrays.toString(ints));
            for (int anInt : ints) {
                sumaTotal += anInt;

            }
            System.out.println(" = "+sumaTotal);
        }
    }

    public static void tiradaDados(int[][] matriz) {
        int dadoMax = 6;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numeroAleatorio = (int) ((Math.random() * (dadoMax - VALOR_MIN + 1)) + VALOR_MIN);

                matriz[i][j] = numeroAleatorio;
            }

        }
    }

    public static void quitarValorMinimo(int[][] matriz) {
        int columMinima = 0;
        //otro metodo
        for (int i = 0; i < matriz.length; i++) {
            int numeroPequenno = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < numeroPequenno) {
                    numeroPequenno = matriz[i][j];
                    columMinima = j;
                }

            }
            matriz[i][columMinima] = 0;

        }
    }

}
