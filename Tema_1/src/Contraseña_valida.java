import java.util.Scanner;

public class Contraseña_valida {

    static void main() {
        Scanner sc = new Scanner(System.in);

        String contr;

        do {
            System.out.println("Escriba una contraseña de minimo 8 caracteres");

            contr = sc.nextLine();

        } while (contr.length() < 8);

        System.out.println("Se ha introducido el numero de caracteres solicitados");

    }

}
