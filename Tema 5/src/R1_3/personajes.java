package R1_3;

public class personajes {

    public String Nombre;

    public String[] Raza;

    public int Fuerza;
    public int Inteligencia;

    public int vida_max;
    public static int vida_act;

    public personajes(String nombre, String[] raza, int fuerza, int inteligencia, int vida_max, int vida_act) {
        Nombre = nombre;
        Raza = raza;
        Fuerza = fuerza;
        Inteligencia = inteligencia;
        this.vida_max = vida_max;
        personajes.vida_act = vida_act;
    }




}
