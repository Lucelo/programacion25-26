package R1_3;

public class Magos extends personajes {

    public String[] hechizos;

    public Magos(String nombre, String[] raza, int fuerza, int inteligencia,
                 int vida_max, int vida_act, String[] hechizos) {
        super(nombre, raza, fuerza, inteligencia, vida_max, vida_act);
        this.hechizos = hechizos;
    }

    public String aprendeHechizo(String hechizo) {
        if (hechizos.length < 4) {
            System.out.println("Ya no hay mas espacio");
        } else {
            return hechizos[hechizos.length] = hechizo;
        }

        return hechizo;
    }

    public void lanzaHechizo() {
        personajes.vida_act -= 10;
    }

}
