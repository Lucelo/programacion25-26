package Examen_anteriores.juguetes.tipos;

import Examen_anteriores.juguetes.madera;

public class InstrumentoMusical extends madera {

    String creado;

    int edadDeLaMadera;

    int edadMínima;

    public InstrumentoMusical(String nombre, String marca, String creado, int edadDeLaMadera, int edadMínima) {
        super(nombre, marca);
        this.creado = creado;
        this.edadDeLaMadera = edadDeLaMadera;
        this.edadMínima = edadMínima;
    }
}
