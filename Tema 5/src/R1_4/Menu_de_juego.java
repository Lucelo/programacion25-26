package R1_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

import static R1_4.Personaje.PersonajesCreados;

public class Menu_de_juego {

    Personaje[] personajes = new Personaje[100];
    Personaje[] listaordenada = new Personaje[100];


    public static void main(String[] args) {
        new Menu_de_juego();
    }

    public Menu_de_juego() {
        Menu();
    }

    public void Menu() {
        Scanner sc = new Scanner(System.in);

        boolean salir = false;

        personajesBase();

        System.out.println("1.crear");
        System.out.println("2.aprender magia");
        System.out.println("3.lanzar magia");
        System.out.println("4.curar");
        System.out.println("5.lista de personajes");
        System.out.println("6.lista de personajes ordenado por vida actual");
        System.out.println("7.salir");

        while (!salir) {

            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1 -> crearPersonaje(sc);

                case 2 -> aprenderMagia(sc);

                case 3 -> lanzarMagia(sc);

                case 4 -> curar(sc);

                case 5 -> lista();

                case 6 -> listaOrdenada();

                case 7 -> salir = true;

                default -> throw new IllegalStateException("La opcion " + opc + " no es valida");
            }
        }
    }

    private void personajesBase() {

        personajes[PersonajesCreados] = new Magos("Saruman", "Humano", 15, 17, 74);

        personajes[PersonajesCreados] = new Magos("Gandalf", "Humano", 10, 20, 56);

        personajes[PersonajesCreados] = new Clerigos("Lancelot", "Humano", 18, 12, 76, "Dios");

    }

    private void lista() {
        for (Personaje personaje : personajes) {

            if (personaje != null) {
                System.out.println(personaje);

            }


        }
    }

    private void listaOrdenada() {

        listaordenada = Arrays.stream(personajes).filter(Objects::nonNull)
                .sorted(Comparator.comparingInt(p -> p.vidaAct)).toArray(Personaje[]::new);

        for (Personaje p : listaordenada) {
            System.out.println(p);
        }

    }

    private void curar(Scanner sc) {
        System.out.println("Nombre del clérigo");
        String NC = sc.nextLine();

        System.out.println("Nombre del aliado");
        String aliado = sc.nextLine();

        boolean PE = false;
        boolean CE = false;
        boolean AE = false;

        for (Personaje personaje : personajes) {
            if (personaje != null) {
                if (Objects.equals(NC, personaje.nombre)) {
                    PE = true;
                    if (personaje instanceof Clerigos) {
                        CE = true;
                        for (Personaje value : personajes) {

                            if (Objects.equals(aliado, value.nombre)) {
                                AE = true;
                                ((Clerigos) personaje).curar(value);

                            }

                        }

                    }

                }
            }


        }

        if (!PE) {
            System.out.println("No se a encontrado al personaje");
        } else if (!CE) {
            System.out.println("No era un clerigo");
        } else if (!AE) {
            System.out.println("No se a encontrado al aliado");
        }

    }

    private void lanzarMagia(Scanner sc) {

        System.out.println("Nombre del mago");
        String NM = sc.nextLine();

        System.out.println("Nombre del enemigo");
        String enemigo = sc.nextLine();

        boolean ME = false;
        boolean PE = false;
        boolean EE = false;

        for (Personaje personaje : personajes) {
            if (personaje != null) {
                if (Objects.equals(personaje.nombre, NM)) {

                    PE = true;

                    if (personaje instanceof Magos) {

                        ME = true;

                        for (Personaje value : personajes) {

                            if (Objects.equals(enemigo, value.nombre)) {
                                EE = true;

                                ((Magos) personaje).lanzaHechizo(value);

                            }


                        }


                    }

                }
            }

        }

        if (!PE) {
            System.out.println("No se a encontrado al personaje");
        } else if (!ME) {
            System.out.println("No hera un mago");
        } else if (!EE) {
            System.out.println("No se a encontrado al enemigo");
        }

    }

    private void aprenderMagia(Scanner sc) {
        System.out.println("Nombre del mago");
        String NM = sc.nextLine();

        System.out.println("Nombre del hechizo");
        String hechizo = sc.nextLine();

        boolean ME = false;
        boolean PE = false;

        for (Personaje personaje : personajes) {
            if (personaje != null) {
                if (NM.equals(personaje.nombre)) {

                    PE = true;

                    if (personaje instanceof Magos) {
                        ME = true;

                        ((Magos) personaje).aprendeHechizo(hechizo);
                    }

                }

            }

        }

        if (!PE) {
            System.out.println("No se a encontrado al personaje");

        } else if (!ME) {
            System.out.println("No hera un mago");
        }


    }

    private void crearPersonaje(Scanner sc) {
        System.out.println("Que se desea crear un mago o un clérigo");

        String opc2 = sc.nextLine();

        switch (opc2) {

            case "mago" -> {

                System.out.println("Nombre del mago");
                String NombreM = sc.nextLine();

                System.out.println("Raza del mago");
                String RazaM = sc.nextLine();

                System.out.println("Fuerza del mago");
                int FuerzaM = sc.nextInt();

                System.out.println("Inteligencia del mago");
                int InteligenciaM = sc.nextInt();

                System.out.println("vida maxima del mago");
                int vida_maxM = sc.nextInt();
                sc.nextLine();

                personajes[PersonajesCreados] = new Magos(NombreM, RazaM, FuerzaM, InteligenciaM, vida_maxM);

            }
            case "clérigo" -> {

                System.out.println("Nombre del clérigo");
                String NombreC = sc.nextLine();

                System.out.println("Raza del clérigo");
                String RazaC = sc.nextLine();

                System.out.println("Fuerza del clérigo");
                int FuerzaC = sc.nextInt();

                System.out.println("Inteligencia del clérigo");
                int InteligenciaC = sc.nextInt();

                System.out.println("vida maxima del clérigo");
                int vida_maxC = sc.nextInt();
                sc.nextLine();

                System.out.println("Dios del clérigo");
                String DiosC = sc.nextLine();

                personajes[PersonajesCreados] = new Clerigos(NombreC, RazaC, FuerzaC, InteligenciaC, vida_maxC, DiosC);

            }

            default -> System.out.println("La opción es invalida diga solo mago o clérigo");

        }
    }
}