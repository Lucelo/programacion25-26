package Libro_de_conjuros.conjuros;

public class Conjuro {

    private String nombre;
    private int nivel; // 0 = Truco
    private String escuela;
    private String descripcion;
    private String alcance;
    private String componentes;

    public Conjuro(String nombre, int nivel, String escuela,
                   String descripcion, String alcance, String componentes) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.escuela = escuela;
        this.descripcion = descripcion;
        this.alcance = alcance;
        this.componentes = componentes;
    }

    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public String getEscuela() { return escuela; }
    public String getDescripcion() { return descripcion; }
    public String getAlcance() { return alcance; }
    public String getComponentes() { return componentes; }
}