package Herramienta_de_generacion_aleatoria.Mazmorra;

import static Herramienta_de_generacion_aleatoria.PartesCompartidas.LanzamientoDeDado.d;

public class Pasillos {
    //PASILLOS

    public String pasillos;

    public String anchoDelPasillo;

    public Pasillos() {
         pasillos = descripcionPasillos[d(descripcionPasillos.length)];
         anchoDelPasillo = descripcionanchoDelPasillo[d(descripcionanchoDelPasillo.length)];

    }

    String[] descripcionPasillos = new String[]{
            "Sigue recto 30 pies, sin puertas ni pasillos laterales",
            "Sigue recto 20 pies, una puerta a la derecha, después sigue recto otros 10 pies ",
            "Sigue recto 20 pies, una puerta a la izquierda, después sigue recto otros 10 pies ",
            "Sigue recto 20 pies; termina en una puerta. ",
            "Sigue recto 20 pies, un pasillo lateral a la derecha después sigue recto otros 10 pies ",
            "Sigue recto 20 pies, un pasillo lateral a la izquierda después sigue recto otros 10 pies",
            "Sigue recto 20 pies, acaba en un callejón sin salida 10 % de posibilidades de que haya una puerta secreta. ",
            "Sigue recto 20 pies, después gira a la izquierda y sigue recto otros 10 pies ",
            "Sigue recto 20 pies, después gira a la derecha y sigue recto otros 10 pies ",
            "Sala (tira en la tabla \"salas\")",
            "Escaleras* (tira en la tabla \"escaleras\") "



    };

    String[] descripcionanchoDelPasillo = new String[]{
            "5 pies",
            "5 pies",
            "10 pies",
            "10 pies",
            "10 pies",
            "10 pies",
            "10 pies",
            "10 pies",
            "10 pies",
            "10 pies",
            "10 pies",
            "20 pies",
            "20 pies",
            "30 pies",
            "30 pies",
            "40 pies, con una fila de pilares recorriéndolo por la mitad",
            "40 pies, con dos filas de pilares recorriéndolo por la mitad",
            "40 pies de ancho, 20 pies de alto",
            "40 pies de ancho, 20 pies de alto, una galería a 10 pies del suelo permite acceder al nivel superior",
    };

    @Override
    public String toString() {
        return  pasillos + ", ancho Del Pasillo='" + anchoDelPasillo ;
    }
}
