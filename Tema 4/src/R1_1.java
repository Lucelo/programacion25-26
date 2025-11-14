public class R1_1 {

    private int ancho = 1;
    private  int longitud = 1;

    void main(String[] args) {

        Rectangulo r = new Rectangulo();

        r.setLongitud(21);
        r.setAncho(7);

        System.out.println(areaRectangulo(ancho, longitud));
        System.out.println(perimetroRectangulo(ancho, longitud));

    }

    public class Rectangulo {


        //private int ancho;
        //private int longitud;

        public int getLongitud() {
            return longitud;
        }

        public void setLongitud(int longitud) {
            if (longitud > 0 && longitud < 20) {
                this.longitud=longitud;
            }

        }



        public int getAncho() {
            return ancho;
        }

        public void setAncho(int ancho) {
            if (ancho > 0 && ancho < 20) {
                this.ancho=ancho;
            }


        }

    }

    public int areaRectangulo(int ancho, int longitud) {

        return (2 * (ancho * longitud));
    }

    public int perimetroRectangulo(int ancho, int longitud) {

        return (ancho * longitud);
    }

}
