package objetos;

import java.time.LocalDate;

public class Alquiler {

    //Atributos de la clase Alquiler

    private String idAlquiler;
    private String dniUsuario;
    private int minutosDuracion;
    private double costeTotal;
    private LocalDate fechaServicio;

    //Constructor de la clase Alquiler

    public Alquiler(String idAlquiler, String dniUsuario, int minutosDuracion, double costeTotal, LocalDate fechaServicio) {
        this.idAlquiler = idAlquiler;
        this.dniUsuario = dniUsuario;
        this.minutosDuracion = minutosDuracion;
        this.costeTotal = costeTotal;
        this.fechaServicio = fechaServicio;
    }


    //getter y setter de Alquiler

    public String getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(String idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public int getMinutosDuracion() {
        return minutosDuracion;
    }

    public void setMinutosDuracion(int minutosDuracion) {
        this.minutosDuracion = minutosDuracion;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public void setCosteTotal(double costeTotal) {
        this.costeTotal = costeTotal;
    }

    public LocalDate getFechaServicio() {
        return fechaServicio;
    }

    public void setFechaServicio(LocalDate fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

}
