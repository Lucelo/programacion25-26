package R3_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    Scanner sc = new Scanner(System.in);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

    public void main(String[] args) {

        Persona[] personas = {
                new Persona("Andres"),
                new Persona("Antonio"),
                new Persona("Mario"),
                new Persona("Lucia"),
                new Persona("Luigi")
        };

        menu(personas);

    }

    public void menu(Persona[] personas) {
        boolean salir = false;


        System.out.println(" 1-Enviar mensaje ");
        System.out.println(" 2-Ver mensajes enviados");
        System.out.println(" 3-Ver mensajes recibidos");
        System.out.println(" 4-Borrar mensaje enviado más antiguo ");
        System.out.println(" 5-Borrar mensaje recibido más antiguo");
        System.out.println(" 6-salir ");
        while (!salir) {
            System.out.print("Opción: ");
            int opc = sc.nextInt();


            switch (opc) {

                case 1 -> {
                    //Enviar mensaje

                    mostrarPersonas(personas);

                    System.out.println("Quien eres (1-5):");
                    int opcion1 = sc.nextInt();
                    Persona p1 = personas[opcion1 - 1];

                    System.out.println("A quien le vas a entregar una carta (1-5):");
                    int opcion2 = sc.nextInt();
                    Persona p2 = personas[opcion2 - 1];

                    enviarMensaje(p1, p2);

                }

                case 2 -> {
                    //Ver mensajes enviados
                    mostrarPersonas(personas);
                    System.out.println("Quien eres (1-5):");
                    int opcion1 = sc.nextInt();
                    Persona p1 = personas[opcion1 - 1];

                    System.out.println("Mensajes enviados:");
                    for (Mensaje m : p1.mensajesEnviados) {
                        if (m != null) {
                            System.out.println(m);
                        }
                    }

                }

                case 3 -> {
                    //Ver mensajes recibidos
                    mostrarPersonas(personas);
                    System.out.println("Quien eres (1-5):");
                    int opcion1 = sc.nextInt();
                    Persona p1 = personas[opcion1 - 1];

                    System.out.println("Mensajes recibidos:");
                    for (Mensaje m : p1.mensajesRecibidos) {
                        if (m != null) {
                            System.out.println(m);
                        }
                    }

                }

                case 4 -> {
                    //Borrar mensaje enviado más antiguo
                    mostrarPersonas(personas);
                    System.out.println("Quien eres (1-5):");
                    int opcion1 = sc.nextInt();
                    Persona p1 = personas[opcion1 - 1];

                    p1.mensajesEnviados[0] = null;

                }

                case 5 -> {
                    //Borrar mensaje recibido más antiguo
                    mostrarPersonas(personas);
                    System.out.println("Quien eres (1-5):");
                    int opcion1 = sc.nextInt();
                    Persona p1 = personas[opcion1 - 1];

                    p1.mensajesRecibidos[0] = null;

                }

                //salir
                case 6 -> salir = true;

                default -> throw new IllegalStateException("La opción no es valida: " + opc);
            }
        }
    }

    void enviarMensaje(Persona p1, Persona p2) {
        sc.nextLine();

        System.out.println("Asunto:");
        String asunto = sc.nextLine();

        System.out.println("Cuerpo:");
        String cuerpo = sc.nextLine();

        System.out.println("Fecha (dd/MM/yy): ");
        LocalDate fechaEnvio = LocalDate.parse(sc.nextLine(), formatter);

        Mensaje mensaje = new Mensaje(
                asunto,
                cuerpo,
                fechaEnvio,
                p1.nombre,
                p2.nombre
        );

        p1.enviarMensaje(mensaje);
        p2.recibirMensaje(mensaje);

        System.out.println("Mensaje enviado correctamente de " + p1.nombre + " a " + p2.nombre);

    }

    public void mostrarPersonas(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println((i + 1) + " - " + personas[i].nombre);
        }
    }
}
