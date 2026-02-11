package Creador_de_mazmorras_aleatorias;







public class Mapa {

    public Mapa(String Tamaño) {

        switch (Tamaño) {
            case "pequeño" -> {
                String[][] Mapa = new String[10][10];

            }
            case "mediano" -> {
                String[][] Mapa = new String[20][20];

            }
            case "grande" -> {
                String[][] Mapa = new String[40][40];

            }
        }


    }
}
