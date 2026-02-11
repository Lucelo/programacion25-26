package Creador_de_mazmorras_aleatorias;

import Creador_de_mazmorras_aleatorias.exterior.Nodo;
import Creador_de_mazmorras_aleatorias.exterior.ZonaInicial;
import Creador_de_mazmorras_aleatorias.exterior.sala;

import java.util.Scanner;

public class Generador {

    private int totalNodos = 0;

    public static void main(String[] args) {

         new Generador();

    }

    public Generador() {
        System.out.println("Cuantas habitaciones deseas");
        Scanner sc =new Scanner(System.in);

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
            // 2-3 salidas para empezar fuerte
        } else if (nodo instanceof sala sala) {
            numeroSalidas = sala.getNumeroSalidas();
        } else {
            return;
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
