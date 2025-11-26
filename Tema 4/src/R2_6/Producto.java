package src.R2_6;

public class Producto {

    public int identifica;
    public String descripción;
    public double sinIVA;


    private static double IVA = 0.2;

    Producto(int identifica, String descripción, double sinIVA) {
        this.identifica = identifica;
        this.descripción = descripción;
        this.sinIVA = sinIVA;


    }

    public double getCoste() {
        return sinIVA + (sinIVA * IVA);
    }


}
