package R1_4;

import R1_3.Personajes;

public abstract class Personaje {

    public String Nombre;

    private String Raza;

    private int Fuerza;
    private int Inteligencia;

    public int Vida_max;
    public int Vida_act;

    public String Clase;



    public static int PersonajesCreados;


    public Personaje(String nombre, String raza, int fuerza, int inteligencia, int vida_max) {
        this.Nombre = nombre;
        this.Raza = setRaza(raza);
        this.Fuerza = setFuerza(fuerza);
        this.Inteligencia = setInteligencia(inteligencia);
        this.Vida_max = vida_max;
        this.Vida_act = vida_max;
        this.Clase = "";

        PersonajesCreados++;


    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String setRaza(String raza) {

        if (raza.equals("Humano") ||
                raza.equals("Orco") ||
                raza.equals("Elfo") ||
                raza.equals("Enano")) {

            Raza = raza;

        } else {
            System.out.println("La raza de " + Nombre + " es inválida. Se asigna 'Humano' por defecto.");
            this.Raza = "Humano";
        }

        return raza;

    }

    public int setFuerza(int fuerza) {

        if (fuerza >= getFuerzaMin() && fuerza <= getFuerzaMax()) {

            Fuerza = fuerza;

        } else {
            throw new IllegalArgumentException("La fuerza no es correcta");
        }

        return fuerza;
    }

    public abstract int getFuerzaMin();

    public abstract int getFuerzaMax();

    public int setInteligencia(int inteligencia) {

        if (inteligencia >= getInteligenciaMin() && inteligencia <= getInteligenciaMax()) {

            Inteligencia = inteligencia;

        } else {
            throw new IllegalArgumentException("La inteligencia no es correcta");
        }

        return inteligencia;
    }

    public abstract int getInteligenciaMin();

    public abstract int getInteligenciaMax();

    public String getRaza() {
        return Raza;
    }

    public int getFuerza() {
        return Fuerza;
    }

    public int getInteligencia() {
        return Inteligencia;
    }

    @Override
    public String toString() {
        return
                "Nombre='" + Nombre + '\'' +
                        ", Raza='" + Raza + '\'' +
                        ", Fuerza=" + Fuerza +
                        ", Inteligencia=" + Inteligencia +
                        ", Vida_max=" + Vida_max +
                        ", Vida_act=" + Vida_act;
    }
}
