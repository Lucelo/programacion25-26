public class R1_8 {

    public static final int VALOR_MAX = 50;
    public static final int VALOR_MIN = 1;
    public static int VALOR_A_ENCONTRAR = 12;


    public static int POSICION(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]== VALOR_A_ENCONTRAR){
                int encontrado = numeros[i];
            }
        }

        return -1;
    }

    static void main(String[] args) {

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {

            int numeroAleatorio = (int) ((Math.random() * (VALOR_MAX - VALOR_MIN + 1)) + VALOR_MIN);

            numeros[i] = numeroAleatorio;

        }

        POSICION(numeros);

        System.out.println("El valor se encuentra " + POSICION(numeros));

    }

}
