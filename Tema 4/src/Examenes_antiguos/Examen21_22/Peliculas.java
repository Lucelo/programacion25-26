package Examen21_22;

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
        this.director = director;
        this.anoDeEstreno = anoDeEstreno;
        this.presupuesto = Presupuesto;
        this.recaudacion = Recaudacion;
        this.sinopsis = sinopsis;
        this.etiquetas = etiquetas;
        this.valoracion = valoracion();

    }


    double valoracion() {

        double valor;

        if (presupuesto < recaudacion) {
            valor = valoracion = 10;

        } else if (presupuesto > recaudacion) {

            valor = valoracion = 0;

        } else {
            valor = valoracion = 5;

        }

        return valor;

    }


}
