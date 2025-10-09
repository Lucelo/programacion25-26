import java.util.Scanner;

public class RE_4 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime los dias");
        int dias1 = sc.nextInt();
        System.out.println("Dime las horas");
        int h1 = sc.nextInt();
        System.out.println("Dime los minutos");
        int m1 = sc.nextInt();
        System.out.println("Dime los segundos");
        int s1 = sc.nextInt();

        System.out.println("Dime los dias adicionales que quieres añadir");
        int dias2 = sc.nextInt();
        System.out.println("Dime las horas adicionales que quieres añadir");
        int h2 = sc.nextInt();
        System.out.println("Dime los minutos adicionales que quieres añadir");
        int m2 = sc.nextInt();
        System.out.println("Dime los segundos adicionales que quieres añadir");
        int s2 = sc.nextInt();

        //parte 1 sumamos los valores y les dividimos para pasarlo a uno mayor
        int s3 = s1 + s2;
        int m3 = m1 + m2 + s3 / 60;
        int h3 = h1 + h2 + m3 / 60;
        int dias3 = dias1 + dias2 + h3 / 24;

        //parte 2 pasamos los valores dentro de los rangos horarios
        s3 = s3 % 60;
        m3 = m3 % 60;
        h3 = h3 % 24;

        //parte 3 mostramos el resultado
        System.out.println("Son " + dias3 + " Días, " + h3 + " Horas, " + m3 + " Minutos, " + s3 + " Segundos");
    }

}
