public class R2_11 {

    static Boolean SIMETRIA(int[][] num1, int[][] num2) {

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                if (num1[i][j] != num2[num2.length - 1 - i][num2.length - j]) {
                    return false;
                }
            }
        }

        return true;

    }

    static void main() {

        int[][] num1 = {{5, 8, 9, 0},
                        {4, 7, 5, 2},
                        {1, 7, 3, 2}};

        int[][] num2 = {{2, 3, 7, 1},
                        {2, 5, 7, 4},
                        {0, 9, 8, 5}};

        Boolean simetria = SIMETRIA(num1, num2);

        System.out.println(simetria);

    }

}
