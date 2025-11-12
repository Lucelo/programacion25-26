
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
        System.out.println("Introduce la primera fila (del 1 al " + N + ")");
        int fila1 = sc.nextInt();

        System.out.println("Introduce la primera columna (del 1 al " + N + ")");
        int columna1 = sc.nextInt();

        matrizoculta[fila1][columna1] = String.valueOf(matriz[fila1][columna1]);

        System.out.println(Arrays.deepToString(matrizoculta));

        System.out.println("Introduce la segunda fila (del 1 al " + N + ")");
        int fila2 = sc.nextInt();

        System.out.println("Introduce la segunda columna (del 1 al " + N + ")");
        int columna2 = sc.nextInt();


        //determina si se gana
        int aciertos = 0;


        for (int a = 0; a < matrizoculta.length; a++) {

            for (int z = 0; z < matrizoculta.length; z++) {
                if (!Objects.equals(matrizoculta[a][z], "?")) {
                    aciertos++;
                }
            }
        }


        //Analiza los factores dentro del bucle
        if (aciertos == N * N) {
            //Si se gano
            System.out.println("uste a ganado");
            ganar = true;
        } else if (i == INTENTOS) {
            //Si se perdio
            System.out.println("Uste a perdido la matriz era");
            System.out.println(Arrays.deepToString(matriz));
            break;
        } else if (fila1 == fila2 && columna1 == columna2) {
            //Determina si se ha repetido
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

    }


    System.out.println("El juego a terminado gracias por jugar");

}

