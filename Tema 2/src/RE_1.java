import java.util.Scanner;

public class RE_1 {
    public static void main(String[] args) {

        System.out.println("Diga un numero: ");
        Scanner sc = new Scanner(System.in);

        int numbase = sc.nextInt();
        int numinver = 0;

        while (numbase != 0) {
            int resto = numbase % 10;
            numinver = numinver * 10 + resto;
            numbase /= 10;
        }

        System.out.println("Número invertido: " + numinver);

    }
}



