package Examen22_21;

public class Peliculas {

    public String titulo;

    public int anoDeEstreno;

    public String director;

    public double presupuesto;

    public double recaudacion;

    public String sinopsis;

    public StringBuilder etiquetas;

    public double valoracion;

    Peliculas(String título,
              String director,
              int añoDeEstreno,
              double Presupuesto,
              double Recaudación,
              String sinopsis,
              StringBuilder etiquetas
    ) {

        this.titulo = título;
        this.director=director;
        this.anoDeEstreno = añoDeEstreno;
        this.presupuesto = Presupuesto;
        this.recaudacion = Recaudación;
        this.sinopsis = sinopsis;
        this.etiquetas = etiquetas;

    }


    double valoracion() {

        if (presupuesto < recaudacion) {
            return valoracion = 10;

        } else if (presupuesto > recaudacion) {

            return valoracion = 0;

        } else {
            return valoracion = 5;

        }

    }


}
