package Creador_de_mazmorras_aleatorias.exterior;

public abstract class LanzamientoDeDado {


    public static int d(int caras) {
        return (int) (Math.random() * caras) + 1;
    }





}
