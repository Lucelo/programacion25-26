public class R2_9 {

    static Boolean SIMETRIA(int[][] num) {

        for (int i = 0; i < num.length / 2; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] != num[num.length - 1 - i][j]) {
                    return false;
                }
            }
        }

        return true;

    }


    static void main() {

        int[][] num = {
                {1, 3, 5, 6},
                {4, 2, 0, 8},
                {4, 2, 0, 8},
                {1, 3, 5, 6}
        };



        System.out.println("La matriz es simetrica " + SIMETRIA(num));

    }


}
