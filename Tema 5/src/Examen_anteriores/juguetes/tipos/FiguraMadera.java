package Examen_anteriores.juguetes.tipos;

import Examen_anteriores.juguetes.apilables;
import Examen_anteriores.juguetes.madera;

public class FiguraMadera extends madera implements apilables {

    String Creado;

    int edadDeFabricacion;

    String colorDeLaFigura;

    int númeroDeLados;

    public FiguraMadera(String nombre, String marca, String creado, int edadDeFabricacion, String colorDeLaFigura, int númeroDeLados) {
        super(nombre, marca);
        Creado = creado;
        this.edadDeFabricacion = edadDeFabricacion;
        this.colorDeLaFigura = colorDeLaFigura;
        this.númeroDeLados = númeroDeLados;
    }
}
