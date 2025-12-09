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

    Peliculas(String titulo,
              String director,
              int anoDeEstreno,
              double Presupuesto,
              double Recaudacion,
              String sinopsis,
              StringBuilder etiquetas
    ) {

        this.titulo = titulo;
        this.director=director;
        this.anoDeEstreno = anoDeEstreno;
        this.presupuesto = Presupuesto;
        this.recaudacion = Recaudacion;
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
