package Herramienta_de_generacion_aleatoria.Mazmorra;

import static Herramienta_de_generacion_aleatoria.PartesCompartidas.LanzamientoDeDado.d;

public class ZonaInicial extends Nodo {

    String Descripcion;

    //ZONA INICIAL
    public ZonaInicial() {
        super("1", null);
        Descripcion = Inicial();

    }

    String[] DescripcionzonaInicial = new String[]{
            "Cuadrada, 20 x 20 pies; un pasillo en cada pared",
            "Cuadrada, 20 x 20 pies; una puerta en dos de las paredes, un pasillo en una tercera",
            "Cuadrada, 40 x 40 pies; una puerta en tres de las paredes",
            "Rectangular, 80 x 20 pies, con una fila de pilares atravesándola por la mitad; dos pasillos en cada pared larga, una puerta en cada pared corta. ",
            "Rectangular, 20 x 40 pies; un pasillo en cada pared",
            "Circular, 40 pies de diámetro; un pasillo en cada punto cardinal",
            "Circular, 40 pies de diámetro; un pasillo en cada punto cardinal; un pozo en el medio de la sala",
            "Cuadrada, 20 x 20 pies; una puerta en dos paredes, un pasillo en una tercera, una puerta secreta en la cuarta. ",
            "Pasillo, 10 pies de ancho; intersección en T",
            "Pasillos, 10 pies de ancho; intersección de cuatro pasillos"
    };

    public String Inicial(){

        return DescripcionzonaInicial[d(10)];

    }

    @Override
    public String toString() {
        return "ZonaInicial{" +
                "Descripcion='" + Descripcion + '\'' +
                '}';
    }
}
