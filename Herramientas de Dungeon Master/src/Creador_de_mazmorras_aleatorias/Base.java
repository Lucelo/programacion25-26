package Creador_de_mazmorras_aleatorias;

public class Base {

    int X = (int) (Math.random() * (10 - 1 + 1)) + 1;

    //ZONA INICIAL
    int zonaInicial = (int) (Math.random() * (10 - 1 + 1)) + 1;

    //PASILLOS
    int pasillos = (int) (Math.random() * (20 - 1 + 1)) + 1;
    int anchoDelPasillo = (int) (Math.random() * (20 - 1 + 1)) + 1;


    //SALIDAS
    int salidasDeLaSala = (int) (Math.random() * (10 - 1 + 1)) + 1;
    int ubicaciónDeLaSalida = (int) (Math.random() * (10 - 1 + 1)) + 1;


    //PUERTAS
    String[] tipoDePuerta = new String[]{};
    String[] trasLaPuerta = new String[]{};


    //ESCALERAS
    String[] escaleras = new String[]{};


    //SALAS
    String[] salas = new String[]{};
    String[] tipoDeSalida = new String[]{};


    //ESTADO ACTUAL DE LA SALA
    String[] ESTADO_ACTUAL_DE_LA_SALA = new String[]{};


    //CONTENIDOS DE UNA SALA
    String[] contenidosDeUnaSala = new String[]{};


    //OBSTÁCULOS ALEATORIOS
    String[] obstáculos = new String[]{};


    //TRAMPAS ALEATORIAS
    String[] activadorDeUnaTrampa = new String[]{};
    String[] gravedadDelDañoDeUnaTrampa = new String[]{};
    String[] efectoDeUnaTrampa = new String[]{};

    //DETALLES DE UNA MAZMORRA
    String[] RUIDOS = new String[]{};
    String[] AIRE = new String[]{};
    String[] AROMAS = new String[]{};
    String[] DETALLES_GENERALES = new String[]{};


}
