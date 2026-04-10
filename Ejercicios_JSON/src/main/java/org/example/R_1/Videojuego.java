package org.example.R_1;

public class Videojuego {

    private String titulo ;
    private String desarrolladora;
    private int anioLanzamiento;

    public Videojuego(String titulo, String desarrolladora, int anioLanzamiento) {
        this.titulo = titulo;
        this.desarrolladora = desarrolladora;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    @Override
    public String toString() {
        return "Ejercicio_1.Videojuego {" +
                "titulo='" + titulo + '\'' +
                ", desarrolladora='" + desarrolladora + '\'' +
                ", año de lanzamiento=" + anioLanzamiento +
                '}';
    }
}
