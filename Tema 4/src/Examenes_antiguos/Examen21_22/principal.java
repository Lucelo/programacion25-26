package Examen21_22;

import java.util.Scanner;

public class principal {

    Peliculas[] biblioteca = new Peliculas[20];
    int numpelis = 0;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        principal m = new principal();
        m.iniciar();
    }

    public void iniciar() {

        System.out.println("1. Añadir una nueva película");
        System.out.println("2. Consultar la biblioteca");
        System.out.println("3. Buscar películas por etiquetas");
        System.out.println("4. Buscar película por título");
        System.out.println("5. Buscar películas con presupuesto máximo");
        System.out.println("6. Salir");

        pelisBasicas();

        menu();

    }

    //
    public void menu() {
        boolean salir = false;
        while (!salir) {
            System.out.print("elecion: ");

            int elec = sc.nextInt();
            sc.nextLine();


            switch (elec) {
                //
                case 1 -> nuevaPelicula();

                //
                case 2 -> mostrarBiblioteca();

                //
                case 3 -> buscarPorEtiquetas();

                //
                case 4 -> buscarPorNombre();

                //
                case 5 -> buscarPorPresupuesto();

                //
                case 6 -> salir = true;

                default -> System.out.println("La opción no es valida");

            }

        }
    }

    //
    public void pelisBasicas() {

        biblioteca[numpelis++] = new Peliculas(
                "El Viaje Estelar",
                "Christopher Nolan",
                2014,
                120000000,
                700000000,
                "Una misión espacial que cambia el destino de la humanidad.",
                new StringBuilder("ciencia ficción, espacio, aventura")
        );

        biblioteca[numpelis++] = new Peliculas(
                "Sombras en la Ciudad",
                "David Fincher",
                2020,
                20000000,
                85000000,
                "Un detective debe resolver una serie de crímenes misteriosos.",
                new StringBuilder("thriller, crimen, misterio")
        );

        biblioteca[numpelis++] = new Peliculas(
                "El Reino Perdido",
                "Peter Jackson",
                2018,
                200000000,
                950000000,
                "Una épica batalla en un mundo de fantasía antiguo.",
                new StringBuilder("fantasía, acción, épica")
        );

        biblioteca[numpelis++] = new Peliculas(
                "Corazones de Invierno",
                "Greta Gerwig",
                2012,
                15000000,
                40000000,
                "Una historia íntima sobre dos personas que se encuentran por destino.",
                new StringBuilder("romance, drama")
        );

        biblioteca[numpelis++] = new Peliculas(
                "El Último Hacker",
                "Denis Villeneuve",
                2023,
                8000000,
                50000000,
                "Un programador descubre una conspiración global detrás de la red.",
                new StringBuilder("tecnología, hacker, suspense")
        );

    }

    //
    public void nuevaPelicula() {
        if (numpelis < biblioteca.length) {
            anadirPelis();
            System.out.println("Película añadida añadida.");

        } else {
            System.out.println("No se pueden añadir más (máximo 20).");

        }
    }

    //
    public void anadirPelis() {
        sc.nextLine();

        System.out.println("titulo:");
        String titulo = sc.nextLine();

        System.out.println("anoDeEstreno:");
        int anoDeEstreno = sc.nextInt();
        sc.nextLine();

        System.out.println("director:");
        String director = sc.nextLine();

        System.out.println("presupuesto:");
        double presupuesto = sc.nextDouble();
        sc.nextLine();

        System.out.println("recaudacion:");
        double recaudacion = sc.nextDouble();
        sc.nextLine();

        System.out.println("sinopsis:");
        String sinopsis = sc.nextLine();

        System.out.println("Cantidad de etiquetas:");

        int canetiq = sc.nextInt();
        sc.nextLine();

        StringBuilder etiquetas = new StringBuilder();

        for (int i = 0; i < canetiq; i++) {
            System.out.println("Etiqueta " + i + ": ");

            String etiqueta = sc.nextLine();

            etiquetas.append(etiqueta).append(", ");

        }

        biblioteca[numpelis] = new Peliculas(titulo, director, anoDeEstreno, presupuesto, recaudacion, sinopsis, etiquetas);

        numpelis++;

    }

    //
    public void buscarPorPresupuesto() {
        double max = sc.nextDouble();

        for (int i = 0; i < numpelis; i++) {

            if (biblioteca[i].presupuesto < max) {

                System.out.println(biblioteca[i].titulo);

            }

        }
    }

    //
    public void buscarPorNombre() {
        System.out.print("Nombre de la pelicula: ");
        String busq = sc.nextLine();

        for (int i = 0; i < numpelis; i++) {

            if (biblioteca[i].titulo.contains(busq)) {
                datos(i);
            }

        }
    }

    //
    public void buscarPorEtiquetas() {
        etiquetas();

        System.out.print("Por que etiqueta desea buscar: ");
        String busq = sc.nextLine();

        for (int i = 0; i < numpelis; i++) {

            if (biblioteca[i].etiquetas.indexOf(busq) != -1) {
                System.out.println(biblioteca[i].titulo);

            }

        }
    }

    //
    public void etiquetas() {
        int salto = 0;

        System.out.println("Etiquetas");

        for (int i = 0; i < numpelis; i++) {

            if (biblioteca[i] != null) {


                System.out.print(biblioteca[i].etiquetas + ", ");

                if (salto == 2) {

                    System.out.println();

                    salto = 0;

                } else {


                    salto++;
                }

            }

        }

        System.out.println();

    }

    //
    public void datos(int i) {
        System.out.println("Su nombre es " + biblioteca[i].titulo + " se estreno en " + biblioteca[i].anoDeEstreno + " bajo el mando de " + biblioteca[i].director);
        System.out.println("Tuvo un presupuesto de " + biblioteca[i].presupuesto + " y una recaudacion de " + biblioteca[i].recaudacion);
        System.out.println("Su sinopsis es " + biblioteca[i].sinopsis + " bajo las etiquetas de " + biblioteca[i].etiquetas);
        System.out.println("Su valoracion es de " + biblioteca[i].valoracion);
    }

    //
    public void mostrarBiblioteca() {
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i] != null) {

                System.out.println((i + 1));
                datos(i);
                System.out.println("Su valoracion es de " + biblioteca[i].valoracion);

            }
        }
    }

}
