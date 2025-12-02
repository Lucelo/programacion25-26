package R3_1;

public class Juego {

    private String[] baraja = new String[48];
    private int cartasActuales = 48;

    static void main() {

        Juego juego = new Juego();

        Carta Diamante = new Carta("Diamante");
        Carta Picas = new Carta("Picas");
        Carta Corazones = new Carta("Corazones");
        Carta Trebol  = new Carta("Trebol");

        juego.crearBaraja(Diamante, Picas, Corazones, Trebol);


        //Almacena cada objeto y lo llama baraja

        // mostrarBaraja

        // barajar

        // repartir

        // cartasRestantes


    }


    public void crearBaraja(Carta c1, Carta c2, Carta c3, Carta c4) {
        int index = 0;

        Carta[] palos = {c1, c2, c3, c4};

        for (Carta c : palos) {
            for (int num : c.numero) {
                baraja[index] = num + " de " + c.palo;
                index++;
            }
        }
    }

}
