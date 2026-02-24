package Herramienta_de_generacion_aleatoria.PartesCompartidas;

public abstract class LanzamientoDeDado {

    public static int d(int caras) {
        return (int) ((Math.random() * caras) + 1) - 1;
    }

}
