package R1_3;

public class Clerigos extends personajes {
    public String Nombre_dios;

    public Clerigos(String nombre, String raza, int fuerza, int inteligencia, int vida_max, String nombre_dios) {
        super(nombre, raza, fuerza, inteligencia, vida_max);
        Nombre_dios = nombre_dios;
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

    public void curar(personajes aliado) {

        aliado.Vida_act += 10;

    }

    @Override
    public String toString() {
        return super.toString() +
                ", Nombre_dios='" + Nombre_dios + '\'' ;
    }
}
