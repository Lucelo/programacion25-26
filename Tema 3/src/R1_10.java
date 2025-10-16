import java.util.Arrays;

public class R1_10 {

    static void main() {

        int[] numeros = {2, 3, 4, 5, 2, 1, 5, 3, 6, 7, 2, 5, 7, 2, 7, 3, 7, 8, 2, 5, 9, 3, 6, 9, 3, 8, 3, 4, 7, 6, 2, 5};

        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);

        int cantidadparaelnarray = 0;

        int valorigual = 0;

        for (int j : numeros) {
            if (j != valorigual) {

                cantidadparaelnarray++;

            }

            valorigual = j;

        }

        int a = 0;

        int[] numerosinrepeticiones = new int[cantidadparaelnarray];

        valorigual = 0;

        for (int numero : numeros) {

            if (numero != valorigual) {

                numerosinrepeticiones[a++] = numero;

            }

            valorigual = numero;

        }

        System.out.println(Arrays.toString(numerosinrepeticiones));

    }

}
