package R1_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Magos extends Personaje {

    public String Clase;

    public String[] Hechizos;

    public int cantidadDeHechizos;



    public Magos(String nombre, String raza, int fuerza, int inteligencia,
                 int vida_max) {
        super(nombre, raza, fuerza, inteligencia, vida_max);
        this.Hechizos  =  new String[4];



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

    public void aprendeHechizo(String hechizo) {
        if (cantidadDeHechizos < 4) {

            Hechizos[cantidadDeHechizos] = hechizo;

            cantidadDeHechizos++;

        } else {

            System.out.println("Ya no hay mas espacio");


        }

    }

    public void lanzaHechizo(Personaje enemigo) {

        if (cantidadDeHechizos >= 1) {

            for (int i = 0; i < cantidadDeHechizos - 1; i++) {
                Hechizos[i] = Hechizos[i + 1];
            }

            Hechizos[cantidadDeHechizos - 1] = null;
            cantidadDeHechizos--;

            enemigo.Vida_act -= 10;
        } else {
            System.out.println("No hay hechizos en el repertorio");

        }

    }

    @Override
    public String toString() {


        return super.toString() +
                ", hechizos=" + Arrays.toString(Hechizos) +
                ", cantidadDeHechizos=" + cantidadDeHechizos;


    }
}
