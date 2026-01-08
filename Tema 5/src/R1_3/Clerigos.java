package R1_3;

public class Clerigos extends personajes {
    public String Nombre_dios;

    public Clerigos(String nombre, String[] raza, int fuerza, int inteligencia, int vida_max, int vida_act, String nombre_dios) {
        super(nombre, raza, fuerza, inteligencia, vida_max, vida_act);
        Nombre_dios = nombre_dios;
    }

   public void curar(){
        personajes.vida_act+=10;
    }

}
