package Examen_anteriores.juguetes;

public class madera extends Juguete {

    public madera(String nombre, String marca) {
        super(nombre, marca);
    }

    @Override
    public String Tipo() {
        return "madera";
    }
}
