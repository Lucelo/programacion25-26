package Creador_de_mazmorras_aleatorias.exterior;

import static Creador_de_mazmorras_aleatorias.exterior.LanzamientoDeDado.d;

public class sala extends Nodo {

    private String forma;
    private int numeroSalidas;

    public sala(String id, Nodo padre) {
        super(id, padre);
        this.forma = sala();
        this.numeroSalidas = salidas();
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


    public String sala() {

        return salas[d(12) - 1];

    }

    public int salidas() {
        //Las salas pueden tener de 0 a 4 salidas
        return d(5)-1;
    }

    @Override
    public String toString() {
        return "sala{" +
                "forma= '" + forma + '\'' +
                ", numeroSalidas= " + numeroSalidas +
                '}';
    }
}
