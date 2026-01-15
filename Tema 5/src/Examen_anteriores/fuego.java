package Examen_anteriores;

public class fuego extends pokemon {

    public int resistenciaAlAgua;


    public fuego(String nombre, int vida_max, int ataque, int defensa) {
        super(nombre, vida_max, ataque, defensa);
        setResistenciaAlAgua(resistenciaAlAgua);
    }

    public void setResistenciaAlAgua(int resistenciaAlAgua) {

        if (resistenciaAlAgua >= getResistenciaAlAguaMin() && resistenciaAlAgua <= getResistenciaAlAguaMax()) {

            this.resistenciaAlAgua = resistenciaAlAgua;

        } else {
            throw new IllegalArgumentException("La resistencia Al Agua no es correcta");
        }

    }

    public int getResistenciaAlAguaMin() {
        return 5;
    }

    public int getResistenciaAlAguaMax() {
        return 10;
    }

    @Override
    public String getTipo() {
        return "fuego";
    }
}
