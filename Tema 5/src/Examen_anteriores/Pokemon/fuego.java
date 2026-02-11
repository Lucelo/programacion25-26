package Examen_anteriores.Pokemon;

public class fuego extends Pokemon {

    public int resistenciaAlAgua;


    public fuego(String nombre, int vida_max, int ataque, int defensa,int resistenciaAlAgua) {
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
