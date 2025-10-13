import java.util.Scanner;

public class R1_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos numeros desea que tenga el array : ");

        int sumadeArrays = 0;

        int numArrays = sc.nextInt();

        if (numArrays <= 0) {

            numArrays = -numArrays;

            System.out.println("El numero no debe ser negativo el error se ha autocorrigido a " + numArrays);

        }

        int[] numeros = new int[numArrays];

        for (int i = 0; i < numArrays; i++) {

            System.out.print("Introduzca el numero " + (i + 1) + ": ");

            numeros[i] = sc.nextInt();

        }

        int valorMayor = numeros[0];
        int valorMenor = numeros[0];

        for (int a = 0; a < numArrays; a++) {

            if (numeros[a] > valorMayor) {
                valorMayor = numeros[a];
            }
            if (numeros[a] < valorMenor) {
                valorMenor = numeros[a];
            }

        }

        int contMayor = 0;
        int contMenor = 0;

        for (int numero : numeros) {

            if (numero == valorMayor) {
                contMayor++;
            }

            if (numero == valorMenor) {
                contMenor++;
            }

        }


        for (int numero : numeros) {
            sumadeArrays += numero;
        }

        double media = (double) sumadeArrays / numArrays;

        System.out.println("El mayor número introducido es " + valorMayor);

        if (contMayor > 1) {

            System.out.println("El numero mayor se repite " + contMayor + " veces");

        }

        System.out.println("El menor número introducido es " + valorMenor);

        if (contMenor > 1) {

            System.out.println("El numero menor se repite " + contMenor + " veces");

        }

        System.out.println("La media de los números introducidos es: " + media);

    }

}
