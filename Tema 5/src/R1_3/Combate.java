package R1_3;

public class Combate {


    static void main(String[] args) {

        new Combate();

    }



    public Combate() {

        Magos Gandalf = new Magos("Gandalf", "Humano", 10, 20, 56);

        Magos Saruman = new Magos("Saruman", "Humano", 15, 17, 74);



        Clerigos Lancelot = new Clerigos("Lancelot", "Humano", 18, 12, 76, "Dios");


        Gandalf.aprendeHechizo("Lanza de luz");
        Gandalf.aprendeHechizo("Bola de fuego");

        Saruman.aprendeHechizo("Oscuridad");

        System.out.println(Saruman);

        System.out.println(Gandalf);



        Gandalf.lanzaHechizo(Saruman);

        Saruman.lanzaHechizo(Gandalf);

        Lancelot.curar(Saruman);

        Gandalf.lanzaHechizo(Saruman);

        System.out.println(Saruman);

        System.out.println(Gandalf);

        System.out.println(Lancelot);


    }


}
