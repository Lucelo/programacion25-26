package R1_3;

public class Combate {



    static void main(String[] args) {

    new Combate();

    }

    public Combate() {

        Magos Gandalf = new Magos("Gandalf", "Humano", 12, 18, 72, new String[]{});

        Magos Saruman = new Magos("Saruman","Humano", 12, 18, 72, new String[]{});

        Clerigos Lancelot = new Clerigos("Lancelot", "Humano", 18, 12, 76, "Dios");


        Gandalf.aprendeHechizo();
        Gandalf.aprendeHechizo();

        Gandalf.lanzaHechizo();
        Saruman.aprendeHechizo();

        Saruman.lanzaHechizo();
        Lancelot.curar();



    }


}
