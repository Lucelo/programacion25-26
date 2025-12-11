package Mantenimiento_de_un_avión;

import java.util.Scanner;

public class aeropuerto_de_españa {

    Scanner sc = new Scanner(System.in);

    int newYork = 5600;
    int francia = 1100;
    int inglaterra = 1400;

    static void main(String[] args) {
        aeropuerto_de_españa aeropuerto = new aeropuerto_de_españa();
        aeropuerto.despegar();
    }



    public void despegar() {

        avión[] aviones = aviones();

        boolean salir = false;

        while (!salir) {

            menu();

            int elec = sc.nextInt();
            sc.nextLine();

            switch (elec) {

                // Estado de cada avión
                case 1 -> estado(aviones);

                // Vuelo desde España
                case 2 -> vuelo(aviones);

                //Salir
                case 3 -> salir = true;

                //Elección no válida
                default -> System.out.println("Elección no válida");
            }
        }
    }

    private static void estado(avión[] aviones) {
        for (avión a : aviones) {
            System.out.println(a);
            System.out.println("---------------------");
        }
    }

    private void vuelo(avión[] aviones) {
        System.out.println("Elige avión (0-4): ");
        int id = sc.nextInt();

        System.out.println("Destino:\n1=new York\n2=Francia\n3=Inglaterra");
        int des = sc.nextInt();

        int distancia = switch (des) {
            case 1 -> newYork;
            case 2 -> francia;
            case 3 -> inglaterra;
            default -> 0;
        };

        if (aviones[id].puedeViajar(distancia)) {
            System.out.println("El avión puede realizar el viaje.");
        } else {
            System.out.println("NO puede realizar el viaje.");
        }
    }

    private static void menu() {
        System.out.print("""
                --- Menú ---
                 1. Ver estado de los aviones
                 2. Intentar vuelo
                 3. Salir
                 Elige opción:
                """);
    }

    private static avión[] aviones() {
        avión[] aviones = new avión[]{

                //Avión 1
                new avión("Faren", "Agata", 5, 40),

                //Avión 2
                new avión("Granate", "Zafiro", 6, 45),

                //Avión 3
                new avión("Aurora", "Topacio", 4, 50),

                //Avión 4
                new avión("Cobalto", "Ópalo", 7, 400),

                //Avión 5
                new avión("Luna", "Perla", 5, 42),

        };

        registros(aviones);

        capacidadActual(aviones);

        return aviones;
    }

    private static void capacidadActual(avión[] aviones) {

        //Avión 1
        aviones[0].setCapacidadActual(22);
        //Avión 2
        aviones[1].setCapacidadActual(30);
        // Avión 3
        aviones[2].setCapacidadActual(40);
        // Avión 4
        aviones[3].setCapacidadActual(389);
        // Avión 5
        aviones[4].setCapacidadActual(25);
    }

    private static void registros(avión[] aviones) {
        //Avión 1
        aviones[0].registroDeRevisiones = new registro[]{new registro("12/04/2012", true, "24/12/2027")};
        //Avión 2
        aviones[1].registroDeRevisiones = new registro[]{new registro("05/06/2019", true, "01/01/2026")};
        // Avión 3
        aviones[2].registroDeRevisiones = new registro[]{new registro("20/08/2024", true, "20/08/2026")};
        // Avión 4
        aviones[3].registroDeRevisiones = new registro[]{new registro("15/11/2023", true, "15/11/2028")};
        // Avión 5
        aviones[4].registroDeRevisiones = new registro[]{new registro("01/02/2020", false, "01/02/2025")};
    }
}
