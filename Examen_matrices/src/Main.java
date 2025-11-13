
public static int N = 4;
public static int INTENTOS = 6;

Scanner sc = new Scanner(System.in);

void main() {

    int[][] matriz = new int[N][N];

    //Matriz con la pareja de números
    matriz = new int[][]{
            {1, 2, 1, 2},
            {2, 1, 2, 1},
            {1, 2, 1, 2},
            {2, 1, 2, 1},
    };

    //Sera el que se muestre para poder usar simbolos como ? debe ser un String
    String[][] matrizoculta = new String[N][N];

    //Rellena la matrizoculta
    for (int i = 0; i < matrizoculta.length; i++) {
        for (int f = 0; f < matrizoculta[i].length; f++) {
            matrizoculta[i][f] = "?";
        }
    }

    //Determina las dos cosas que se usaran para determinar ganar o perder
    int i = 0;
    boolean ganar = false;

    //Hace un bucle hasta que se cumpla alguna de las condiciones
    while (i < INTENTOS || ganar) {

        //Musetra la matrizoculta y los espacios rellenados
        System.out.println(Arrays.deepToString(matrizoculta));

        //Se introducen las filas y columnas que se usaran

        boolean primero = false;
        boolean segundo = false;

        int fila1 = 0;
        int columna1 = 0;
        int fila2 = 0;
        int columna2 = 0;


        while (!primero) {
            System.out.println("Introduce la primera fila (del 1 al " + N + ")");
            fila1 = sc.nextInt() + -1;

            System.out.println("Introduce la primera columna (del 1 al " + N + ")");
            columna1 = sc.nextInt() + -1;


            if (Objects.equals(matrizoculta[fila1][columna1], "?")) {
                matrizoculta[fila1][columna1] = String.valueOf(matriz[fila1][columna1]);

                System.out.println(Arrays.deepToString(matrizoculta));

                primero = true;
            } else {
                System.out.println("El numero ya esta descubierto");
            }
        }
        while (!segundo) {
            System.out.println("Introduce la segunda fila (del 1 al " + N + ")");
            fila2 = sc.nextInt() + -1;

            System.out.println("Introduce la segunda columna (del 1 al " + N + ")");
            columna2 = sc.nextInt() + -1;


            if (Objects.equals(matrizoculta[fila2][columna2], "?")) {
                segundo = true;

            } else {
                System.out.println("El numero ya esta descubierto o ha salido de los valores");
            }
        }


        //Analiza los factores dentro del bucle
        if (fila1 == fila2 && columna1 == columna2) {
            //Determina si se ha repetido el primero y el segundo
            matrizoculta[fila1][columna1] = "?";

            System.out.println("Por favor no repita números de ambas casillas");

        } else if (matriz[fila1][columna1] == matriz[fila2][columna2]) {
            //Determina si se ha acertado las parejas

            matrizoculta[fila2][columna2] = String.valueOf(matriz[fila2][columna2]);


        } else if (matriz[fila1][columna1] != matriz[fila2][columna2]) {
            //Determina si ha fallado
            matrizoculta[fila1][columna1] = "?";

            i++;

            System.out.println("Se a consumido un intento te quedan " + (INTENTOS - i));

        }

        //determina si se gana
        int aciertos = 0;


        for (int a = 0; a < matrizoculta.length; a++) {

            for (int z = 0; z < matrizoculta.length; z++) {
                if (!Objects.equals(matrizoculta[a][z], "?")) {
                    aciertos++;
                }
            }
        }

        if (aciertos == N * N) {
            //Si se gano
            System.out.println("uste a ganado");
            ganar = true;
        } else if (i == INTENTOS) {
            //Si se perdio
            System.out.println("Uste a perdido la matriz era");
            System.out.println(Arrays.deepToString(matriz));

        }

    }


    System.out.println("El juego a terminado gracias por jugar");

}

