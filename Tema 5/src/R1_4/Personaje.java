package R1_4;

public abstract class Personaje {

    public String nombre;

    private String raza;

    private int fuerza;
    private int inteligencia;

    public int vidaMax;
    public int vidaAct;

    public static int PersonajesCreados;


    public Personaje(String nombre, String raza, int fuerza, int inteligencia, int vidaMax) {
        this.nombre = nombre;
        setRaza(raza);
        setFuerza(fuerza);
        setInteligencia(inteligencia);
        setVidaMax(vidaMax);
        this.vidaAct = setVidaMax(vidaMax);

        PersonajesCreados++;

    }

    public void setRaza(String raza) {

        if (raza.equals("Humano") ||
                raza.equals("Orco") ||
                raza.equals("Elfo") ||
                raza.equals("Enano")) {

            this.raza = raza;

        } else {

            System.out.println("La raza de " + nombre + " es inválida. Se asigna 'Humano' por defecto.");

            this.raza = "Humano";

        }

    }

    public void setFuerza(int fuerza) {

        if (fuerza >= getFuerzaMin() && fuerza <= getFuerzaMax()) {

            this.fuerza = fuerza;

        } else {
            throw new IllegalArgumentException("La fuerza no es correcta");
        }

    }

    public abstract int getFuerzaMin();

    public abstract int getFuerzaMax();

    public void setInteligencia(int inteligencia) {

        if (inteligencia >= getInteligenciaMin() && inteligencia <= getInteligenciaMax()) {

            this.inteligencia = inteligencia;

        } else {
            throw new IllegalArgumentException("La inteligencia no es correcta");
        }

    }

    public abstract int getInteligenciaMin();

    public abstract int getInteligenciaMax();

    public int setVidaMax(int vida_max) {
        if (vida_max > getVida_maxMin() && vida_max <= getVida_maxMax()) {

            vidaMax = vida_max;

        } else {
            throw new IllegalArgumentException("La Vida maxima no es correcta");
        }

        return vida_max;

    }

    public int getVida_maxMin() {
        return 0;
    }

    public int getVida_maxMax() {
        return 100;
    }


    @Override
    public String toString() {
        return
                "Nombre='" + nombre + '\'' +
                        ", Raza='" + raza + '\'' +
                        ", Fuerza=" + fuerza +
                        ", Inteligencia=" + inteligencia +
                        ", Vida_max=" + vidaMax +
                        ", Vida_act=" + vidaAct;
    }
}
