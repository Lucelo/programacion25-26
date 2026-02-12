package fiest;

public abstract class Invitado {

    public String Nombre;

    public int Hambre;
    public int Aburrimiento;

    public static int invitadodefiesta;

    public Invitado(String nombre, int hambre, int aburrimiento) {
        Nombre = nombre;
        Hambre = hambre;
        setAburrimiento(Aburrimiento);
        invitadodefiesta++;
    }

    public void setAburrimiento(int Aburrimiento) {

        if (Aburrimiento >= getAburrimientoMin() && Aburrimiento <= getAburrimientoMax()) {

            this.Aburrimiento = Aburrimiento;

        } else {
            throw new IllegalArgumentException("La aburrimiento no es correcto");
        }

    }

    public  int getAburrimientoMin(){return 0;};

    public  int getAburrimientoMax(){return 50;};

    public abstract void reaccionar(Evento eventoActual, Invitado invitado);


}
