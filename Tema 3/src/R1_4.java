
public class R1_4 {

    public static final int cantNum = 6000;
    public static final int VALOR_MAX = 100;
    public static final int VALOR_MIN = 1;

    public static void main(String[] args) {

        int sumaArrays = 0;

        int numArrays = cantNum;

        int[] conteoDigitos = new int[10];

        int digitoMasFrecuente = 0;

        int digitoMenosfrecuente = 0;

        int maxConteo = 0;

        int minConteo = Integer.MAX_VALUE;

        int[] numeros = new int[numArrays];

        for (int i = 0; i < numArrays; i++) {

            int numeroAleatorio = (int) ((Math.random() * (VALOR_MAX - VALOR_MIN + 1)) + VALOR_MIN);

            numeros[i] = numeroAleatorio;

            int ultimoDigito = numeros[i] % 10;

            conteoDigitos[ultimoDigito]++;

        }

        for (int i = 0; i < conteoDigitos.length; i++) {
            if (conteoDigitos[i] > maxConteo) {

                maxConteo = conteoDigitos[i];

                digitoMasFrecuente = i;
            }

            if (conteoDigitos[i] < minConteo) {

                minConteo = conteoDigitos[i];

                digitoMenosfrecuente = i;
            }

        }

        for (int numero : numeros) {
            sumaArrays += numero;
        }

        int media = (int) ((double) sumaArrays / numArrays);

        //La media de los números leídos.

        System.out.println("La media es " + media);

        // El dígito en el que más números terminan.

        System.out.println("El dígito en el que más terminan los números es: " + digitoMasFrecuente);

        // En qué dígitos no ha terminado ningún número.

        System.out.println("El dígito en el que menos terminan los números es: " + digitoMenosfrecuente);


        double totalPorcentajes = 0;

        double porcentaje = 0;
        for (int i = 0; i < conteoDigitos.length; i++) {

            double sumaPorcentajes = 0;

            porcentaje = (double) (conteoDigitos[i] * 100) / numArrays;

            System.out.printf(" El nº " + i + " se ha repetido " + conteoDigitos[i] + " veces. ");

            sumaPorcentajes += porcentaje;

            totalPorcentajes += porcentaje;

            System.out.println("Esto equivale al " + sumaPorcentajes);

        }

        double mediaPorcentajes = totalPorcentajes / porcentaje;

        System.out.println("La suma de todos los porcentajes es equivalente al " + totalPorcentajes+ " %");

        System.out.printf("La media de los porcentajes es %s%n", mediaPorcentajes);

    }

}