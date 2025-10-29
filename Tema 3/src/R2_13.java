public class R2_13 {

    public static void reflejoDiagonal(int[][] matriz) {
        // 1. Comprobar que la matriz es cuadrada
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            if (matriz[i].length != n) {
                throw new IllegalArgumentException("La matriz no es cuadrada.");
            }
        }

        // 2. Crear una nueva matriz para almacenar el reflejo diagonal
        int[][] matrizReflejada = new int[n][n];

        // 3. Rellenar la nueva matriz con los elementos reflejados
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizReflejada[i][j] = matriz[n -1 -j][n-1 -i];
            }
        }

        // 4. Opcionalmente, se puede asignar la nueva matriz a la matriz original
        //    (para modificarla en el lugar)
        // matriz = matrizReflejada; // Esta línea requiere que el método no sea void y devuelva un int[][]

        // 5. Opcionalmente, imprimir la matriz reflejada
        System.out.println("La matriz original es:");
        imprimirMatriz(matriz);
        System.out.println("\nLa matriz reflejada diagonalmente es:");
        imprimirMatriz(matrizReflejada);

    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
    static void main() {
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };

        reflejoDiagonal(matriz);





    }
}
