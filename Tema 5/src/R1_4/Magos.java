
package R1_4;

import java.util.Arrays;

public class Magos extends Personaje {

    public int iMin=17;
    public int iMax=20;
    public int fMin=0;
    public int fMax=15;

    public String[] hechizos;

    public int cantidadDeHechizos;

    public Magos(String nombre, String raza, int fuerza, int inteligencia,
                 int vida_max) {
        super(nombre, raza, fuerza, inteligencia, vida_max);
        this.hechizos = new String[4];


    }

    @Override
    public int getInteligenciaMin() {
        return iMin;
    }

    @Override
    public int getInteligenciaMax() {
        return iMax;
    }

    @Override
    public int getFuerzaMin() {
        return fMin;
    }

    @Override
    public int getFuerzaMax() {
        return fMax;
    }

    public void aprendeHechizo(String hechizo) {
        if (cantidadDeHechizos < 4) {

            hechizos[cantidadDeHechizos] = hechizo;

            cantidadDeHechizos++;

        } else {

            System.out.println("Ya no hay mas espacio");

        }

    }

    public void lanzaHechizo(Personaje enemigo) {

        if (cantidadDeHechizos >= 1) {

            for (int i = 0; i < cantidadDeHechizos - 1; i++) {
                hechizos[i] = hechizos[i + 1];
            }

            hechizos[cantidadDeHechizos - 1] = null;
            cantidadDeHechizos--;

            enemigo.vidaAct -= 10;
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
