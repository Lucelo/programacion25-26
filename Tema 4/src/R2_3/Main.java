package src.R2_3;

public class Main {

    public static void main(String[] args) {

        videojuego videojuego1 = new videojuego("Halo", "Microsoft", 2013);
        videojuego1.requisitos(4, 2500, 40, 2, 4);

        videojuego videojuego2 = new videojuego("Minecraft", "Mojang", 2011);
        videojuego2.requisitos(2, 1800, 2, 1, 1);

        videojuego videojuego3 = new videojuego("Cyberpunk 2077", "CDPR", 2020);
        videojuego3.requisitos(6, 3500, 70, 6, 8);


        ordenador ordenadorA = new ordenador("ordenadorA", 2, 2000, 500, 1, 2);
        ordenador ordenadorB = new ordenador("ordenadorB", 4, 3000, 1000, 4, 6);
        ordenador ordenadorC = new ordenador("ordenadorC", 8, 4200, 2000, 8, 12);

        //
        System.out.println("----------------------");
        ejecutar(ordenadorA, videojuego1);
        ejecutar(ordenadorB, videojuego1);
        ejecutar(ordenadorC, videojuego1);


        //
        System.out.println("----------------------");
        ejecutar(ordenadorA, videojuego2);
        ejecutar(ordenadorB, videojuego2);
        ejecutar(ordenadorC, videojuego2);


        //
        System.out.println("----------------------");
        ejecutar(ordenadorA, videojuego3);
        ejecutar(ordenadorB, videojuego3);
        ejecutar(ordenadorC, videojuego3);



    }

    // Tiene que ver los requisitos de estos juegos y compararlos con cada ordenador
    public static void ejecutar(ordenador ordenador, videojuego videojuego) {

        boolean ejecutar =
                ordenador.cpuCores >= videojuego.cpuCores &&
                        ordenador.cpuSpeed >= videojuego.cpuSpeed &&
                        ordenador.diskSpace >= videojuego.diskSpace &&
                        ordenador.gpuCores >= videojuego.gpuCores &&
                        ordenador.gpuMemory >= videojuego.gpuMemory;


        if (ejecutar) {
            System.out.println("El videojuego " + videojuego.nombre + " se a ejecutado en el " + ordenador.nombre);
        } else {
            System.out.println("El " + ordenador.nombre + " no puede ejecutar el juego " + videojuego.nombre);
        }
    }

}
