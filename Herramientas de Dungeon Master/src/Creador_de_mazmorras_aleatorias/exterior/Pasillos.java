package Creador_de_mazmorras_aleatorias.exterior;

public class Pasillos {
    //PASILLOS
    int pasillos = (int) (Math.random() * (20 - 1 + 1)) + 1;
    int anchoDelPasillo = (int) (Math.random() * (20 - 1 + 1)) + 1;

    String[] descripcionPasillos = new String[]{
            "Sigue recto 30 pies, sin puertas ni pasillos laterales",
            "Sigue recto 20 pies, una puerta a la derecha, después\n" +
                    "sigue recto otros 10 pies ",
            "Sigue recto 20 pies, una puerta a la izquierda, después\n" +
                    "sigue recto otros 10 pies ",
            "Sigue recto 20 pies; termina en una puerta. ",
            "Sigue recto 20 pies, un pasillo lateral a la derecha,\n" +
                    "después sigue recto otros 10 pies ",
            "Sigue recto 20 pies, un pasillo lateral a la izquierda,\n" +
                    "después sigue recto otros 10 pies",
            "Sigue recto 20 pies, acaba en un callejón sin salida;\n" +
                    "10 % de posibilidades de que haya una puerta secreta. ",
            "Sigue recto 20 pies, después gira a la izquierda y sigue\n" +
                    "recto otros l O pies ",
            "Sigue recto 20 pies, después gira a la derecha y sigue\n" +
                    "recto otros l O pies ",
            "Sala (tira en la tabla \"salas\")",
            "Escaleras* (tira en la tabla \"escaleras\") "



    };

    String[] descripcionanchoDelPasillo = new String[]{};

    public Pasillos() {

        int pasillos = (int) (Math.random() * (11 - 1 + 1)) + 1;
        int anchoDelPasillo = (int) (Math.random() * (12 - 1 + 1)) + 1;

        String A = descripcionPasillos[pasillos];
        String B = descripcionanchoDelPasillo[anchoDelPasillo];


    }
}
