package Pruevas;

public class Armas {

    public String nombre;

    public int Cantidad;
    public int Tamaño;


    public Armas(String nombre, int cantidad, int tamaño) {
        this.nombre = nombre;
        Cantidad = cantidad;
        Tamaño = tamaño;
    }

    public void Ataque(Muñeco enemigo) {

        int golpe = 0;

        for (int i = 0; i < Cantidad; i++) {

            golpe += (int) (Math.random() * (Tamaño - 1 + 1)) + 1;

        }

        enemigo.vida -= golpe;

    }

}
