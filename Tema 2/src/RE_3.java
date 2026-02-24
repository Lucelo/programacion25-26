import java.util.Scanner;

public class RE_3 {


    public static void main(String[] args) {

        final int I = 1;
        final int V = 5;
        final int X = 10;
        final int L = 50;
        final int C = 100;
        final int D = 500;
        final int M = 1000;

        Scanner sc = new Scanner(System.in);
        String numRomano;
        int acumulado = 0;
        int temporal = 0;

        int anterior = Integer.MAX_VALUE;

        System.out.print("Introduce el número romano: ");

        numRomano = sc.nextLine();

        for (int i = 0; i < numRomano.length(); i++) {
            char letraActual = numRomano.charAt(i);
            int valorDeLetra = 0;

            switch (letraActual) {
                case 'M': {
                    valorDeLetra = M;
                    break;
                }
                case 'D': {
                    valorDeLetra = D;
                    break;
                }
                case 'C': {
                    valorDeLetra = C;
                    break;
                }
                case 'L': {
                    valorDeLetra = L;

                    break;
                }
                case 'X': {
                    valorDeLetra = X;
                    break;
                }
                case 'V': {
                    valorDeLetra = V;
                }
                case 'I': {
                    valorDeLetra = I;
                }
            }
            if (valorDeLetra < anterior) {

                if (temporal > 0) {

                    acumulado += temporal;
                }

                temporal = valorDeLetra;
            } else if (valorDeLetra == anterior) {

                acumulado += temporal + valorDeLetra;

                temporal = 0;

            } else {

                acumulado += valorDeLetra - temporal;
                temporal = 0;

            }

            anterior = valorDeLetra;

        }

        if (temporal > 0) {
            acumulado += temporal;
        }

        System.out.printf("El número %s en decimal es %d", numRomano, acumulado);

    }

}

/*String numromano = "MMXIX";

int valoractual = 0;
int valorantiguo = 0;
int numfinal = 0;

int cantnum = numromano.length();

        for (int i = 0; i < cantnum; i++) {

valoractual = numromano.charAt(i);

            if (valoractual < valorantiguo) {
numfinal += valoractual;

            } else {
numfinal -= valoractual;
            }
valorantiguo = valoractual;

        }

                System.out.println("Es " + numfinal);*/