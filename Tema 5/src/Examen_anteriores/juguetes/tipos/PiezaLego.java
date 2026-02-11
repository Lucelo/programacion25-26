package Examen_anteriores.juguetes.tipos;

import Examen_anteriores.juguetes.apilables;
import Examen_anteriores.juguetes.plástico;
import Examen_anteriores.juguetes.tipoDePlástico;

public class PiezaLego extends plástico implements apilables {

    tipoDePlástico tipoDePlástico;

    int longitud;

    String color;

    public PiezaLego(String nombre, String marca, int longitud, String color) {
        super(nombre, marca);

        this.longitud = longitud;
        this.color = color;

        tipoDePlástico = Examen_anteriores.juguetes.tipoDePlástico.ABS;

    }
}
