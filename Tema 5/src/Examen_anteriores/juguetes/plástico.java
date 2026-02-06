package Examen_anteriores.juguetes;

public class plástico extends Juguete {

    public plástico(String nombre, String marca) {
        super(nombre, marca);
    }


    @Override
    public String Tipo() {
        return "plástico";
    }
}
