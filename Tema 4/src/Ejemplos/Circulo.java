package Ejemplos;

public class Circulo {
    // Atributos de la clase Círculo
    private double radio;
    public final double PI=3.14;
    // Aquí faltaría el método constructor, que debe inicializar radio
// Métodos de la clase Círculo
    public double calcularArea(){
        double area;
        area=PI*Math.pow(radio,2);
        return area;
    }
    public void setRadio(double radionuevo) {
        if (radionuevo > 0)
            radionuevo = radio;
    }
    public double getRadio() {
        return radio;
    }

    // Atributos de la clase Círculo


    // Método constructor
    public Circulo (double radioinicial)
    {
        radio = radioinicial;
    }

    public class circular {
        // Atributos de la clase Círculo
        private double radio;
        public final double PI=3.14;
        // Método constructor
        circular(double radio)
        {
            this.radio = radio;
        }
    }
}