package Examen_anteriores;

public class tierra extends pokemon {

    public int resistenciaEléctrica;

    public tierra(String nombre, int vida_max, int ataque, int defensa) {
        super(nombre, vida_max, ataque, defensa);
    }

    public void setResistenciaEléctrica(int resistenciaEléctrica) {
        this.resistenciaEléctrica = resistenciaEléctrica;

        if (resistenciaEléctrica >= getresistenciaEléctricaMin() && resistenciaEléctrica <= getresistenciaEléctricaMax()) {

            this.resistenciaEléctrica = resistenciaEléctrica;

        } else {
            throw new IllegalArgumentException("La resistencia Eléctrica no es correcta");
        }
    }

    public int getresistenciaEléctricaMin() {
        return 1;
    }

    public int getresistenciaEléctricaMax() {
        return 9;
    }

    @Override
    public String getTipo() {
        return "tierra";
    }
}
