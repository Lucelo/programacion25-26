package R1_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

import static R1_4.Personaje.PersonajesCreados;

public class Menu_de_juego {

    Personaje[] personajes = new Personaje[100];
    Personaje[] listaordenada = new Personaje[100];

    public void main(String[] args) {

        Menu();

    }

    private void Menu() {
        Scanner sc = new Scanner(System.in);

        boolean salir = false;


        while (!salir) {

            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1 -> {
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

                case 2 -> {

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

                case 3 -> {

                    String NM = sc.nextLine();

                    String enemigo = sc.nextLine();

                    for (int i = 0; i < personajes.length; i++) {
                        if (Objects.equals(NM, personajes[i].Nombre)) {
                            if (personajes[i] instanceof Magos) {
                                for (int j = 0; j < personajes.length; j++) {

                                    if (Objects.equals(enemigo, personajes[j].Nombre)) {
                                        ((Magos) personajes[i]).lanzaHechizo(personajes[j]);

                                    } else {
                                        System.out.println("No se ha encontrado al enemigo");
                                    }

                                }

                            } else {
                                System.out.println("No es un mago");
                            }

                        } else {
                            System.out.println("No se a encontrado");
                        }


                    }

                }

                case 4 -> {

                    String NC = sc.nextLine();

                    String aliado = sc.nextLine();

                    for (int i = 0; i < personajes.length; i++) {
                        if (Objects.equals(NC, personajes[i].Nombre)) {
                            if (personajes[i] instanceof Clerigos) {
                                for (int j = 0; j < personajes.length; j++) {

                                    if (Objects.equals(aliado, personajes[j].Nombre)) {
                                        ((Clerigos) personajes[i]).curar(personajes[j]);

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

                case 5 -> {

                    for (int i = 0; i < personajes.length; i++) {

                        if (personajes[i] != null) {
                            System.out.println(personajes[i].toString());

                        }


                    }

                }

                case 6 -> {
                    for (int i = 0; i < personajes.length; i++) {

                        if (personajes[i] != null) {

                            listaordenada = personajes.clone();

                            Arrays.sort(listaordenada, new Comparator<Personaje>() {
                                @Override
                                public int compare(Personaje p1, Personaje p2) {
                                    return Integer.compare(p1.Vida_act,p2.Vida_act);
                                }
                            });



                            System.out.println(listaordenada[i].toString());

                        }


                    }

                }

                case 7 -> {
                    salir = true;
                }


                default -> throw new IllegalStateException("Unexpected value: " + opc);
            }
        }
    }


}
