package Mantenimiento_de_un_avión;

import java.util.Scanner;

public class aeropuerto_de_españa {

    Scanner sc=new Scanner(System.in);

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




    }



    private static avión[] aviones() {
        avión[] aviones= new avión[]{

                //Avión 1
                new avión("Faren", "Agata", 5, 40),

                //Avión 2
                new avión("Granate", "Zafiro", 6, 45),

                //Avión 3
                new avión("Aurora", "Topacio", 4, 50),

                //Avión 4
                new avión("Cobalto", "Ópalo", 7, 38),

                //Avión 5
                new avión("Luna", "Perla", 5, 42),

        };

        registros(aviones);

        capacidadActual(aviones);

        return aviones;
        
        
        
    }

    private static void capacidadActual(avión[] aviones) {

        //Avión 1
        aviones[0].capacidadActual = 22;
        //Avión 2
        aviones[1].capacidadActual = 30;
        // Avión 3
        aviones[2].capacidadActual = 40;
        // Avión 4
        aviones[3].capacidadActual = 18;
        // Avión 5
        aviones[4].capacidadActual = 25;
    }

    private static void registros(avión[] aviones) {
        //Avión 1
        aviones[0].registroDeRevisiones = new registro[]{ new registro("12/04/2012", true, "24/12/2027") };
        //Avión 2
        aviones[1].registroDeRevisiones = new registro[]{ new registro("05/06/2019", true, "01/01/2026") };
        // Avión 3
        aviones[2].registroDeRevisiones = new registro[]{ new registro("20/08/2024", true, "20/08/2026") };
        // Avión 4
        aviones[3].registroDeRevisiones = new registro[]{ new registro("01/02/2020", false, "01/02/2025") };
        // Avión 5
        aviones[4].registroDeRevisiones = new registro[]{ new registro("15/11/2023", true, "15/11/2028") };
    }
}
