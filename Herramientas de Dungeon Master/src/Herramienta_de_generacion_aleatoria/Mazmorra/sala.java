package Herramienta_de_generacion_aleatoria.Mazmorra;

import static Herramienta_de_generacion_aleatoria.PartesCompartidas.LanzamientoDeDado.d;

public class sala extends Nodo {

    private String forma;
    private int numeroSalidas;

    private Pasillos pasillo;
    private puertas puerta;

    public static int Contador = 2;
    public int Nsala;


    public sala(String id, Nodo padre) {
        super(id, padre);

        this.Nsala = Contador++;

        this.forma = salas[d(salas.length)];
        this.numeroSalidas = 0; // se decide fuera

        this.pasillo = new Pasillos();
        this.puerta = new puertas();
    }


    public int getNumeroSalidas() {
        return numeroSalidas;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setNumeroSalidas(int numeroSalidas) {
        this.numeroSalidas = numeroSalidas;
    }

    //SALAS
    String[] salas = new String[]{
            "Cuadrada, 20 x 20 pies",
            "Cuadrada, 30 x 30 pies",
            "Cuadrada, 40 x 40 pies",
            "Rectangular, 20 x 30 pies",
            "Rectangular, 30 x 40 pies",
            "Rectangular, 40 x SO pies",
            "Rectangular, SO x 80 pies",
            "Circular, 30 pies de diámetro",
            "Circula r, SO pies de diámetro",
            "Octagonal, 40 x 40 pies",
            "Octagonal, 60 x 60 pies2",
            "Trapezoidal, 40 x 60 pies aproximadamente"
    };

    public int salidas() {
        //Las salas pueden tener de 0 a 4 salidas
        return d(4);
    }

    @Override
    public String toString() {
        return "Puerta " + puerta +
                ", pasillo=" + pasillo +
                ", sala nº " + Nsala +
                ", estilo='" + forma + '\'';
    }

}
