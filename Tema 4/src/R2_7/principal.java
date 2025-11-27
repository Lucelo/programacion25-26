package R2_7;

import java.util.Scanner;

public class principal {


    static void main() {
        Scanner sc = new Scanner(System.in);

        Jarra A = new Jarra(0);
        A.Limite(7);
        Jarra B = new Jarra(0);
        B.Limite(4);

        System.out.println(
                "a. Llenar jarra: \n" +

                        "b. Vaciar jarra: \n" +

                        "c. Volcar jarra A en B \n" +

                        "d. Volcar jarra B en A \n" +

                        "e. Ver estado de las jarras: \n" +

                        "f. Salir:");

        boolean salir = false;

        while (!salir) {

            String menu = sc.nextLine();

            switch (menu) {
                case "A" -> {

                    String llenar = sc.nextLine();
                    switch (llenar) {
                        case "A" -> {

                        }
                        case "B" -> {

                        }

                    }

                }
                case "B" -> {
                    String Vaciar = sc.nextLine();
                    switch (Vaciar) {
                        case "A" -> {

                        }
                        case "B" -> {

                        }
                    }
                }
                case "C" -> {
                }
                case "D" -> {
                }
                case "E" -> {
                }
                case "F" -> salir = true;
            }
        }
    }
}