
package R1_4;

public class Clerigos extends Personaje {
    public String nombreDios;

    public Clerigos(String nombre, String raza, int fuerza, int inteligencia, int vida_max, String nombreDios) {
        super(nombre, raza, fuerza, inteligencia, vida_max);
        this.nombreDios = nombreDios;

    }

    @Override
    public int getFuerzaMin() {
        return 18;
    }

    @Override
    public int getFuerzaMax() {
        return 20;
    }

    @Override
    public int getInteligenciaMin() {
        return 12;
    }

    @Override
    public int getInteligenciaMax() {
        return 16;
    }

    public void curar(Personaje aliado) {

        if (aliado.vidaAct + 10 <= aliado.vidaMax) {
            aliado.vidaAct += 10;
        } else {
            System.out.println("Se ha curado toda la vida posible");
            System.out.println("Siendo " + (aliado.vidaAct - aliado.vidaMax));

            aliado.vidaAct = aliado.vidaMax;

        }

    }

    @Override
    public String toString() {
        return super.toString() +
                ", Nombre_dios='" + nombreDios + '\'';
    }

}
