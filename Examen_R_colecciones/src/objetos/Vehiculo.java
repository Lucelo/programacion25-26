package objetos;

import exception.AlquilerDuplicadoException;

import java.util.HashSet;
import java.util.Set;

public class Vehiculo {

    // Atributos de la clase Vehículo

    private String matricula;
    private String modelo;
    private CategoriaVehiculo categoria;
    private int bateriaRestante;

    // Registra los coches alquilados para evitar los duplicados

    private final Set<Alquiler> historialAlquileres;

    // Constructor de la clase Vehículo

    public Vehiculo(String matricula, String modelo, CategoriaVehiculo categoria, int bateriaRestante) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.categoria = categoria;
        this.bateriaRestante = bateriaRestante;
        this.historialAlquileres = new HashSet<>();
    }

    //Método que comprueba si ya se ha introducido un coche y si se ha hecho lo debería negar

    public void agregarAlquiler(Alquiler alquiler) throws AlquilerDuplicadoException {

        if (!historialAlquileres.add(alquiler)) {

            throw new AlquilerDuplicadoException("El alquiler con ID " + alquiler.getIdAlquiler() + " ya está registrado en este vehículo.");

        }

    }

    //Método que recorre historialAlquileres por el tiempo de trayecto
    //y te devuelve la suma total de minutos de todos los alquileres del vehículo

    public long obtenerDuracionTotalMinutos() {
        return historialAlquileres.stream().mapToLong(Alquiler::getMinutosDuracion).sum();
    }

    //Método que recorre historialAlquileres por los importes cobrados
    //y que debería devolver el importe total acumulado de todos los
    //alquileres del vehículo

    public double obtenerFacturacionTotal() {
        return historialAlquileres.stream().mapToDouble(Alquiler::getCosteTotal).sum();
    }

    // getter y setter de Vehículo

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CategoriaVehiculo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVehiculo categoria) {
        this.categoria = categoria;
    }

    public int getBateriaRestante() {
        return bateriaRestante;
    }

    public void setBateriaRestante(int bateriaRestante) {
        this.bateriaRestante = bateriaRestante;
    }

    public Set<Alquiler> getHistorialAlquileres() {
        return historialAlquileres;
    }
}
