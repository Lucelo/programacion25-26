public class R1_1 {

    public static void main(String[] args) {
        int[] numeros = {7, 3, 234, 56, 7, 2, 4, 6, 7, 2, 4, 62, 78, 12};

        int sumarPares = 0;

        for (int i = 0; i < numeros.length; i += 2) {

            sumarPares += numeros[i];

        }

        System.out.println("La suma de posiciones de los pares seria " + sumarPares);

    }

}
