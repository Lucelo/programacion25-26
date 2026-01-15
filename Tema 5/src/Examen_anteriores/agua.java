package Examen_anteriores;

public class agua extends pokemon {

    public int hidratación;

    public agua(String nombre, int vida_max, int ataque, int defensa, int hidratación) {
        super(nombre, vida_max, ataque, defensa);
        this.hidratación = hidratación;
    }

    @Override
    public String getTipo() {
        return "agua";
    }

}
