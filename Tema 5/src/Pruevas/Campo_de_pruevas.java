package Pruevas;

import java.util.Objects;
import java.util.Scanner;

public class Campo_de_pruevas {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int muñeco = 100;

        boolean terminar = false;
        Muñeco m1 = new Muñeco(100);

        Armas alabarda = new Armas("Alabarda", 1, 12);
        Armas mandoble = new Armas("mandoble", 2, 6);
        Armas cimitarra = new Armas("cimitarra", 1, 6);
        System.out.println("Posees una alabarda, un mandoble y una cimitarra");

        while (!terminar) {

            System.out.println("Con que arma va a atacar");
            String arma = sc.nextLine();

            if (Objects.equals(arma, "alabarda")) {
                alabarda.Ataque(m1);
            }
            if (Objects.equals(arma, "mandoble")) {
                mandoble.Ataque(m1);

            }
            if (Objects.equals(arma, "cimitarra")) {
                cimitarra.Ataque(m1);

            }

            System.out.println("Al muñeco le queda " + m1.vida);


            if (m1.vida <= 0) {
                terminar = true;
            }

        }


    }


}
