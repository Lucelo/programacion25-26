package Examen_anteriores.juguetes;

public abstract class Juguete {

    String nombre;
    String marca;
    String Tipo;
    public Juguete(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
        this.Tipo = Tipo();
    }

    public abstract String Tipo();


}
