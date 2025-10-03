import java.util.Scanner;

public class R3_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("coeficientes A: ");
        int A = sc.nextInt();
        System.out.print("coeficientes B: ");
        int B = sc.nextInt();
        System.out.print("coeficientes C: ");
        int C = sc.nextInt();
        double discriminante = Math.pow((double)B, (double)2.0F) - (double)(4 * A * C);
        if (discriminante > (double)0.0F) {
            double solucion1 = ((double)(-B) + Math.sqrt(discriminante)) / (double)(2 * A);
            double solucion2 = ((double)(-B) - Math.sqrt(discriminante)) / (double)(2 * A);
            System.out.println("La ecuación tiene dos soluciones reales: x1 = " + solucion1 + ", x2 = " + solucion2);
        } else if (discriminante == (double)0.0F) {
            double solucionUnica = (double)(-B / (2 * A));
            System.out.println("La ecuación tiene una única solución real: x = " + solucionUnica);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }

    }

}
