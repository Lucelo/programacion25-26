package R1_3;

import java.util.Arrays;

public class Magos extends personajes {

    public String[] hechizos;

    public int cantidadDeHechizos;


    public Magos(String nombre, String raza, int fuerza, int inteligencia,
                 int vida_max, String[] hechizos) {
        super(nombre, raza, fuerza, inteligencia, vida_max);
        this.hechizos = hechizos;
    }

    @Override
    public int getInteligenciaMin() {
        return 17;
    }

    @Override
    public int getInteligenciaMax() {
        return 20;
    }

    @Override
    public int getFuerzaMin() {
        return 0;
    }

    @Override
    public int getFuerzaMax() {
        return 15;
    }

    public String aprendeHechizo(String hechizo) {
        if (cantidadDeHechizos < 4) {
            System.out.println("Ya no hay mas espacio");
        } else {

            cantidadDeHechizos++;

            return hechizos[cantidadDeHechizos] = hechizo;

        }

        return hechizo;
    }

    public void lanzaHechizo(personajes enemigo) {

        if (hechizos[0] !=null){

            hechizos[0] = hechizos[1];
            hechizos[1] = hechizos[2];
            hechizos[2] = hechizos[3];
            hechizos[3] = null;

            cantidadDeHechizos--;

            enemigo.Vida_act -= 10;
        } else {
            System.out.println("No hay hechizos en el repertorio");
        }

    }

    @Override
    public String toString() {


        return super.toString() +
                ", hechizos=" + Arrays.toString(hechizos) +
                ", cantidadDeHechizos=" + cantidadDeHechizos;


    }
}
