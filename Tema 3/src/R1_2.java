public class R1_2 {

    public static void main(String[] args) {
        int[] numeros = {7, -3, 234, -56, 7, 2, 4, 6, 7, 2, -4, 62, 78, -225, 54, -32};

        int contarnegativos = 0;

        for (int numero : numeros) {

            if (numero < 0) {

                contarnegativos++;

                System.out.println("El numero " + numero + " es negativo");


            } else {

                System.out.println("El numero " + numero + " es positivo");

            }

        }

        System.out.println("La cantidad de negativos es de " + contarnegativos);

    }

}
