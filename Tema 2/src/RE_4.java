import java.util.Scanner;

public class RE_4 {

    public static void main(String[] args) {
        int s1 = 0;
        int m1 = 0;
        int h1 = 0;
        int dias = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las horas");
        int h2 = sc.nextInt();
        System.out.println("Dime los minutos");
        int m2 = sc.nextInt();
        System.out.println("Dime los segundos");
        int s2 = sc.nextInt();
        s1 = (s1 + s2) % 60;
        m1 += (s1 + s2) / 60;
        m1 = (m1 + m2) % 60;
        h1 = (m1 + m2) / 60;
        h1 = (h1 + h2) % 24;
        dias = (dias + h1) % 24;
        System.out.println("Son " + dias + " Días,  " + h1 + " Horas, " + m1 + " Minutos, " + s1 + " Segundos");
    }

}
