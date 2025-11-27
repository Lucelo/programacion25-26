package R2_6;

public class Producto {

    public static int codigo=1;

    public int identifica;
    public String descripcion;
    public double sinIVA;

    private double IVA = 0.2;

    Producto(String descripcion, double sinIVA) {
        this.identifica = codigo++;
        this.descripcion = descripcion;
        this.sinIVA = sinIVA;
    }



}
