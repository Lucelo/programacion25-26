import java.util.Scanner;

public class RE_2 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Diga un numero: ");
        int numbase = sc.nextInt();

        int numinver = 0;

        int numComprobante = numbase;

        while (numbase != 0) {
            int resto = numbase % 10;
            numinver = numinver * 10 + resto;
            numbase /= 10;
        }

        if (numComprobante == numinver) {
            System.out.println("El numero " + numComprobante + " es capicúa");
        } else {
            System.out.println("El numero " + numComprobante + " no es capicúa");
        }
    }
}
