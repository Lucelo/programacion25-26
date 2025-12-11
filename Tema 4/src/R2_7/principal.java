package R2_7;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jarra A = new Jarra(0);
        A.setLimite(7);

        Jarra B = new Jarra(0);
        B.setLimite(4);

        opciones();

        boolean salir = false;

        while (!salir) {

            String menu = sc.nextLine().trim().toUpperCase();

            switch (menu) {
                case "A" -> llenar(sc, A, B);

                case "B" -> vaciar(sc, A, B);

                case "C" -> volcarB(B, A);

                case "D" -> volcarA(A, B);

                case "E" -> estado(A, B);

                case "F" -> salir = true;

                default -> System.out.println("Opción no válida");

            }


        }
        sc.close();
    }

    private static void llenar(Scanner sc, Jarra A, Jarra B) {
        System.out.println("¿Qué jarra quieres llenar? (A/B)");
        String llenar = sc.nextLine().trim().toUpperCase();
        switch (llenar) {
            case "A" -> {
                A.capacidad = A.limite;
                System.out.println("La jarra A tiene " + A.capacidad + " litros");
            }
            case "B" -> {
                B.capacidad = B.limite;
                System.out.println("La jarra B tiene " + B.capacidad + " litros");
            }

        }
    }

    private static void vaciar(Scanner sc, Jarra A, Jarra B) {
        System.out.println("¿Qué jarra quieres vaciar? (A/B)");
        String Vaciar = sc.nextLine().trim().toUpperCase();
        switch (Vaciar) {
            case "A" -> {
                A.capacidad = 0;
                System.out.println("La jarra A ahora tiene " + A.capacidad + " litros");
            }
            case "B" -> {
                B.capacidad = 0;
                System.out.println("La jarra B ahora tiene " + B.capacidad + " litros");
            }
        }
    }

    private static void volcarB(Jarra B, Jarra A) {
        // Volcar A en B
        int espacio = B.limite - B.capacidad;

        if (A.capacidad <= espacio) {
            B.capacidad += A.capacidad;
            A.capacidad = 0;
        } else {
            A.capacidad -= espacio;
            B.capacidad = B.limite;
        }
        System.out.println("La jarra B ahora tiene " + B.capacidad + " litros");
    }

    private static void volcarA(Jarra A, Jarra B) {
        // Volcar B en A
        int espacio = A.limite - A.capacidad;

        if (B.capacidad <= espacio) {
            A.capacidad += B.capacidad;
            B.capacidad = 0;
        } else {
            B.capacidad -= espacio;
            A.capacidad = A.limite;
        }
        System.out.println("La jarra A tiene " + A.capacidad + " litros");
    }

    private static void estado(Jarra A, Jarra B) {
        System.out.println("La jarra A tiene " + A.capacidad + " litros");

        System.out.println("La jarra B tiene " + B.capacidad + " litros");
    }

    private static void opciones() {
        System.out.println(
                "a. Llenar jarra: \n" +

                        "b. Vaciar jarra: \n" +

                        "c. Volcar jarra A en B \n" +

                        "d. Volcar jarra B en A \n" +

                        "e. Ver estado de las jarras: \n" +

                        "f. Salir:");
    }
}