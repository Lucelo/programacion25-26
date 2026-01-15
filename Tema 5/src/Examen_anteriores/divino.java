package Examen_anteriores;

public class divino extends pokemon{

    public divino(String nombre, int vida_max, int ataque, int defensa) {
        super(nombre, vida_max, ataque, defensa);
    }

    @Override
    public String getTipo() {
        return "divino";
    }
}
