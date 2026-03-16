package fiest;


import java.util.Objects;

import static fiest.Evento.*;
import static fiest.Invitado.invitadodefiesta;

public class MainAlumnos {
    private static final int ROPA_MAX = 4;

    public static void main(String[] args) {
        System.out.println("--- ¡COMIENZA EL CUMPLE DE LOLO! ---");

        // TODO 1: Crea un Array de Invitados de tamaño 10.



        Invitado[] invitado = new Invitado[10];
        String[] regalos = {};

        // TODO 2: Rellena las primeras posiciones:
        // - 3 Familiares (con nombres y stats aleatorios)
        // - 3 Colegas (con nombres y stats aleatorios)
        // - 1 fiest.Gorrón
        // PISTA: Usa un contador para saber en qué posición del array insertas.

        invitado[invitadodefiesta] = new Familiar("Papa", 50, 50);
        invitado[invitadodefiesta] = new Familiar("Mama", 50, 50);
        invitado[invitadodefiesta] = new Familiar("Tio Rafa", 50, 50);
        invitado[invitadodefiesta] = new Colega("Juan", 50, 50);
        invitado[invitadodefiesta] = new Colega("Bermudo", 50, 50);
        invitado[invitadodefiesta] = new Colega("Alejandro", 50, 50);
        invitado[invitadodefiesta] = new Gorrón("Señor Cangrejo", 50, 50);

        int ronda = 1;
        boolean fiestaSigue = true;
        boolean yaSeAbrieronRegalos = false;
        Evento eventoActual = null;

        // Bucle de la fiesta (máximo 10 rondas)
        while (fiestaSigue && ronda <= 10) {

            System.out.println("\n--- RONDA " + ronda + " ---");
            eventoActual = obtenerEventoAleatorio(yaSeAbrieronRegalos);
            System.out.println("Evento: " + eventoActual);

           /* // Evitamos que se abran regalos dos veces
            while (eventoActual == Evento.APERTURA_REGALOS && yaSeAbrieronRegalos) {
                eventoActual = obtenerEventoAleatorio(yaSeAbrieronRegalos);
            }*/

            System.out.println("Evento: " + eventoActual);

            // TODO 3: Recorre el array de invitados
            // 1. Cuidado con las posiciones null del array.
            // 2. Verifica si el invitado sigue en la fiesta.
            // 3. Haz que reaccione al evento (gestiona las excepciones).
            // 4. Si es APERTURA_REGALOS y el invitado es regalador:
            //    - Pide el regalo (imprímelo por pantalla).

            for (int i = 0; i < invitado.length; i++) {
                if (invitado[i] != null) {
                    if (invitado[i].Hambre >= 100) {
                        System.out.println("Se ha marchado "+invitado[i].Nombre+"Por Hambre");
                        invitado[i] = null;

                    } else if (invitado[i].Aburrimiento>= 100) {
                        if (invitado[i] instanceof Familiar){
                            System.out.println("Se ha marchado "+invitado[i].Nombre+"Por Aburrimiento");
                            invitado[i] = null;
                        }
                        if (invitado[i] instanceof Colega){
                            System.out.println("Se ha marchado "+invitado[i].Nombre+"Por Aburrimiento");
                            invitado[i] = null;
                        }

                    }
                }

            }

            for (Invitado item : invitado) {
                if (item != null) {
                    item.reaccionar(eventoActual, item);
                }
            }

            // TODO 4: Chequeo de fin de fiesta
            // - Si se han regalado 4 prendas de ropa -> Mensaje de decepción.
            // - Si no queda nadie en la fiesta -> Fin con mensaje.



            for (String regalo : regalos) {
                int noMasRopa = 0;
                if (Objects.equals(regalo, "ROPA")) {
                    noMasRopa++;
                    if (noMasRopa >= ROPA_MAX) {
                        fiestaSigue = false;
                        System.out.println("Lolo esta llorando el no quería tanta ropa ");
                    }
                }
            }

            int marchados = 0;
            for (Invitado value : invitado) {
                if (value == null) {
                    marchados++;
                    if (marchados >= invitado.length) {
                        fiestaSigue = false;
                        System.out.println("La fiesta a sido un fracaso todos se han marcado");
                    }

                }
            }


            ronda++;
        }

        System.out.println("--- FIN DE LA FIESTA ---");

    }

    private static Evento obtenerEventoAleatorio(Boolean yaSeAbrieronRegalos) {
        // TODO 5: Obtener un evento aleatorio


        int Cambiodeevento = (int) (Math.random() * (7 - 1) + 1);


        switch (Cambiodeevento) {

            case 1 -> {
                return CORTE_TARTA;
            }
            case 2 -> {
                return MUSICA_ALTA;
            }
            case 3 -> {
                return MÚSICA_BAJA;
            }
            case 4 -> {
                return CHARLITA_COLOQUIAL;
            }
            case 5 -> {
                return BAILE;
            }
            case 6 -> {
                return PIÑATA;
            }
            case 7 -> {

                yaSeAbrieronRegalos=true;

                return APERTURA_REGALOS;
            }


            default -> throw new IllegalStateException("Unexpected value: " + Cambiodeevento);
        }

    }
}