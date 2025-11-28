package R2_6;

public class Producto {

    public static int codigo=1;
    private final double coste;

    public int identifica;
    public String descripcion;
    public double sinIVA;

    private double IVA = 0.2;

    Producto(String descripcion, double sinIVA) {
        this.identifica = codigo++;
        this.descripcion = descripcion;
        this.sinIVA = sinIVA;
        this.coste = sinIVA + (sinIVA*IVA);

    }

    public static void consulta(Producto Producto) {
        System.out.println("Descripción: " + Producto.descripcion);
        System.out.println("Código: " + Producto.identifica);
        System.out.println("Precio sin IVA: " + Producto.sinIVA );


    }

    public static void Venta(Producto Producto){
        System.out.println("Precio con IVA: " + Producto.coste );
    }

}
