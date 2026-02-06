package Creador_de_mazmorras_aleatorias;

public class Base {

    int X = (int) (Math.random() * (10 - 1 + 1)) + 1;

    //ZONA INICIAL
    int zonaInicial = (int) (Math.random() * (10 - 1 + 1)) + 1;

    String[] decripcionZonaInicial = new String[]{};

    //PASILLOS
    int pasillos = (int) (Math.random() * (20 - 1 + 1)) + 1;
    int anchoDelPasillo = (int) (Math.random() * (20 - 1 + 1)) + 1;

    String[] decripcionpasillos = new String[]{};
    String[] decripcionanchoDelPasillo = new String[]{};


    //SALIDAS
    int salidasDeLaSala = (int) (Math.random() * (10 - 1 + 1)) + 1;
    int ubicaciónDeLaSalida = (int) (Math.random() * (10 - 1 + 1)) + 1;

    String[] decripcionsalidasDeLaSala = new String[]{};
    String[] decripcionubicaciónDeLaSalida = new String[]{};


    //PUERTAS
    int tipoDePuerta = (int) (Math.random() * (10 - 1 + 1)) + 1;
    int trasLaPuerta = (int) (Math.random() * (10 - 1 + 1)) + 1;

    String[] decripciontipoDePuerta = new String[]{};
    String[] decripciontrasLaPuerta = new String[]{};


    //ESCALERAS
    int escaleras = (int) (Math.random() * (10 - 1 + 1)) + 1;

    String[] decripcionescaleras = new String[]{};


    //SALAS
    int salas = (int) (Math.random() * (10 - 1 + 1)) + 1;
    int tipoDeSalida = (int) (Math.random() * (10 - 1 + 1)) + 1;


    String[] decripcionsalas = new String[]{};
    String[] decripciontipoDeSalida = new String[]{};


    //ESTADO ACTUAL DE LA SALA
    int ESTADO_ACTUAL_DE_LA_SALA = (int) (Math.random() * (10 - 1 + 1)) + 1;

    String[] decripcionESTADO_ACTUAL_DE_LA_SALA = new String[]{};


    //CONTENIDOS DE UNA SALA

    int contenidosDeUnaSala = (int) (Math.random() * (10 - 1 + 1)) + 1;

    String[] decripcioncontenidosDeUnaSala = new String[]{};


    //OBSTÁCULOS ALEATORIOS
    int obstáculos = (int) (Math.random() * (10 - 1 + 1)) + 1;
    String[] decripcionobstáculos = new String[]{};


    //TRAMPAS ALEATORIAS

    int activadorDeUnaTrampa = (int) (Math.random() * (10 - 1 + 1)) + 1;
    int gravedadDelDañoDeUnaTrampa = (int) (Math.random() * (10 - 1 + 1)) + 1;
    int efectoDeUnaTrampa = (int) (Math.random() * (10 - 1 + 1)) + 1;


    String[] decripcionactivadorDeUnaTrampa = new String[]{};
    String[] decripciongravedadDelDañoDeUnaTrampa = new String[]{};
    String[] decripcionefectoDeUnaTrampa = new String[]{};


    //DETALLES DE UNA MAZMORRA

    int RUIDOS = (int) (Math.random() * (10 - 1 + 1)) + 1;
    int AIRE = (int) (Math.random() * (10 - 1 + 1)) + 1;
    int AROMAS = (int) (Math.random() * (10 - 1 + 1)) + 1;
    int DETALLES_GENERALES = (int) (Math.random() * (10 - 1 + 1)) + 1;

    String[] decripcionRUIDOS = new String[]{};
    String[] decripcionAIRE = new String[]{};
    String[] decripcionAROMAS = new String[]{};
    String[] decripcionDETALLES_GENERALES = new String[]{};


}
