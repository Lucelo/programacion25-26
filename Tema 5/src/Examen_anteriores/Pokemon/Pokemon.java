package Examen_anteriores.Pokemon;

public abstract class Pokemon {

    public String Nombre;

    public int Vida_max;
    public int Vida_act;

    public int Ataque;
    public int Defensa;

    public String tipo;

    public int id;
    public static int criaturasCreadas;

    public Pokemon(String nombre, int vida_max, int ataque, int defensa) {
        Nombre = nombre;
        setVida_max(vida_max);
        Vida_act = Vida_max;
        setAtaque(ataque);
        setDefensa(defensa);
        this.tipo = getTipo();

        id = criaturasCreadas;

        criaturasCreadas++;

    }

    public void setVida_max(int vida_max) {

        if (vida_max >= getVida_maxMin() && vida_max <= getVida_maxMax()) {

            Vida_max = vida_max;

        } else {
            throw new IllegalArgumentException("La Vida maxima no es correcta");
        }

    }

    public int getVida_maxMin() {
        return 0;
    }

    public int getVida_maxMax() {
        return 100;
    }

    public void setAtaque(int ataque) {

        if (ataque >= getAtaqueMin() && ataque <= getAtaqueMax()) {

            Ataque = ataque;

        } else {
            throw new IllegalArgumentException("El ataque no es correcto");
        }

    }

    public int getAtaqueMin() {
        return 5;
    }

    public int getAtaqueMax() {
        return 15;
    }

    public void setDefensa(int defensa) {


        if (defensa >= getDefensaMin() && defensa <= getDefensaMax()) {

            Defensa = defensa;

        } else {
            throw new IllegalArgumentException("El ataque no es correcto");
        }

    }

    public int getDefensaMin() {
        return 5;
    }

    public int getDefensaMax() {
        return 25;
    }

    public abstract String getTipo();


    @Override
    public String toString() {
        return "Pokemon " + id +
                " " + Nombre +
                ", PS " + Vida_max +
                "/ " + Vida_act +
                ", Ata=" + Ataque +
                ", Def=" + Defensa +
                ", tipo=" + tipo;
    }
}
