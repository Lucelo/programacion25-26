package R1_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

import static R1_4.Personaje.PersonajesCreados;

public class Menu_de_juego {

    Personaje[] personajes = new Personaje[100];
    Personaje[] listaordenada = new Personaje[100];

    void main(String[] args) {

        Menu();

    }

    private void Menu() {
        Scanner sc = new Scanner(System.in);

        boolean salir = false;

        personajes[PersonajesCreados] = new Magos("Gandalf", "Humano", 10, 20, 56);

        personajes[PersonajesCreados] = new Magos("Saruman", "Humano", 15, 17, 74);

        personajes[PersonajesCreados] = new Clerigos("Lancelot", "Humano", 18, 12, 76, "Dios");





        while (!salir) {

            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1 -> CrearPersonaje(sc);

                case 2 -> aprenderMagia(sc);

                case 3 -> lanzarMagia(sc);

                case 4 -> curar(sc);

                case 5 -> lista();

                case 6 -> listaordenada();

                case 7 -> salir = true;

                default -> throw new IllegalStateException("Unexpected value: " + opc);
            }
        }
    }

    private void lista() {
        for (Personaje personaje : personajes) {

            if (personaje != null) {
                System.out.println(personaje);

            }


        }
    }

    private void listaordenada() {
        for (int i = 0; i < personajes.length; i++) {

            if (personajes[i] != null) {

                listaordenada = personajes.clone();

                Arrays.sort(listaordenada, Comparator.comparingInt(p -> p.Vida_act));


                System.out.println(listaordenada[i].toString());

            }


        }
    }

    private void curar(Scanner sc) {
        String NC = sc.nextLine();

        String aliado = sc.nextLine();

        for (Personaje personaje : personajes) {
            if (Objects.equals(NC, personaje.Nombre)) {
                if (personaje instanceof Clerigos) {
                    for (Personaje value : personajes) {

                        if (Objects.equals(aliado, value.Nombre)) {
                            ((Clerigos) personaje).curar(value);

                        } else {
                            System.out.println("No se ha encontrado al aliado");
                        }

                    }

                } else {
                    System.out.println("No es un clerigo");
                }

            } else {
                System.out.println("No se a encontrado");
            }


        }
    }

    private void lanzarMagia(Scanner sc) {
        String NM = sc.nextLine();

        String enemigo = sc.nextLine();

        for (Personaje personaje : personajes) {
            if (Objects.equals(NM, personaje.Nombre)) {
                if (personaje instanceof Magos) for (Personaje value : personajes) {

                    if (Objects.equals(enemigo, value.Nombre)) {
                        ((Magos) personaje).lanzaHechizo(value);

                    } else {
                        System.out.println("No se ha encontrado al enemigo");
                    }

                }
                else {
                    System.out.println("No es un mago");
                }

            } else {
                System.out.println("No se a encontrado");
            }


        }
    }

    private void aprenderMagia(Scanner sc) {
        String NM = sc.nextLine();

        String hechizo = sc.nextLine();


        for (Personaje personaje : personajes) {

            if (Objects.equals(NM, personaje.Nombre)) {

                if (personaje instanceof Magos) {
                    ((Magos) personaje).aprendeHechizo(hechizo);
                } else {
                    System.out.println("No es un mago");
                }

            } else {
                System.out.println("No se a encontrado");
            }


        }
    }

    private void CrearPersonaje(Scanner sc) {
        System.out.println("Que se desea crear un mago o un clerigo");

        String opc2 = sc.nextLine();

        switch (opc2) {


            case "mago" -> {

                String NombreM = sc.nextLine();
                String RazaM = sc.nextLine();
                int FuerzaM = sc.nextInt();
                int InteligenciaM = sc.nextInt();
                int vida_maxM = sc.nextInt();


                personajes[PersonajesCreados] = new Magos(NombreM, RazaM, FuerzaM, InteligenciaM, vida_maxM);


            }
            case "clerigo" -> {

                String NombreC = sc.nextLine();
                String RazaC = sc.nextLine();
                int FuerzaC = sc.nextInt();
                int InteligenciaC = sc.nextInt();
                int vida_maxC = sc.nextInt();
                String DiosC = sc.nextLine();

                personajes[PersonajesCreados] = new Clerigos(NombreC, RazaC, FuerzaC, InteligenciaC, vida_maxC, DiosC);


            }
            default -> System.out.println("Ocpion invalida");

        }
    }


}
