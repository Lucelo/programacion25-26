package Herramienta_de_generacion_aleatoria;

import Herramienta_de_generacion_aleatoria.Mazmorra.Nodo;
import Herramienta_de_generacion_aleatoria.Mazmorra.ZonaInicial;
import Herramienta_de_generacion_aleatoria.Mazmorra.sala;

import java.util.Scanner;

public class GeneradorDeMazmorras {

    private int totalNodos = 0;

    public static void main(String[] args) {

        new GeneradorDeMazmorras();

    }

    public GeneradorDeMazmorras() {
        System.out.println("Cuantas habitaciones deseas");
        Scanner sc = new Scanner(System.in);

        int maxNodos = sc.nextInt();
        generarDungeon(maxNodos).imprimir("");


    }

    public Nodo generarDungeon(int maxNodos) {

        Nodo entrada = new ZonaInicial();
        totalNodos++;

        expandir(entrada, 0, maxNodos);

        return entrada;

    }

    private void expandir(Nodo nodo, int profundidad, int maxNodos) {

        // Frenos de seguridad


        if (totalNodos >= maxNodos) return;

        if (profundidad >= 5) return; // recomendable añadirlo

        int numeroSalidas;

        if (nodo instanceof ZonaInicial) {

            numeroSalidas = 2 + (int) (Math.random() * 2);

        } else {

            numeroSalidas = (int) (Math.random() * 4);

            // menos salidas cuando te alejas
            if (profundidad >= 3)
                numeroSalidas = Math.min(numeroSalidas, 2);

            // posibilidad de dead end
            if (profundidad > 2 && Math.random() < 0.25)
                numeroSalidas = 0;
        }


        for (int i = 1; i <= numeroSalidas; i++) {

            if (totalNodos >= maxNodos) return;

            String idHijo = Nodo.generarId(nodo, i);

            sala nuevaSala = new sala(idHijo, nodo);

            nodo.conectar(nuevaSala);

            totalNodos++;

            expandir(nuevaSala, profundidad + 1, maxNodos);

        }

    }

}
