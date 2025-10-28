public class R2_10 {

    static boolean SIMETRIA(int[][] num) {

        int numColumnas = num[0].length;

        for (int[] ints : num) {
            for (int j = 0; j < numColumnas / 2; j++) {
                if (ints[j] != ints[numColumnas - 1 - j]) {
                    return false;
                }
            }
        }

        return true;

    }


    static void main() {

        int[][] num = {
                {1, 3, 0, 3, 1},
                {4, 2, 7, 2, 4},
                {6, 1, 9, 1, 6},
                {0, 8, 8, 8, 0}
        };

        boolean res = SIMETRIA(num);

        if (res){
            System.out.println("La matriz es simetrica");

        } else {
            System.out.println("La matriz no es simetrica");

        }


    }


}
