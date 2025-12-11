package Mantenimiento_de_un_avión;

import java.time.LocalDate;

public class avión {

    private String marca;
    private String modelo;
    private int consumo; // litros por km
    private int capacidadMaxima;
    private int capacidadActual;

    registro[] registroDeRevisiones;

    public avión(String marca, String modelo, int consumo, int capacidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        if (capacidadActual < 0) return;
        if (capacidadActual > capacidadMaxima) return;
        this.capacidadActual = capacidadActual;
    }

    public registro[] getRegistroDeRevisiones() {
        return registroDeRevisiones;
    }

    public void setRegistroDeRevisiones(registro[] registroDeRevisiones) {
        this.registroDeRevisiones = registroDeRevisiones;
    }

    public void capacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public boolean estaListo() {
        if (registroDeRevisiones == null || registroDeRevisiones.length == 0) return false;

        registro ultima = registroDeRevisiones[registroDeRevisiones.length - 1];

        if (ultima == null) return false;
        if (!ultima.estado) return false;
        if (LocalDate.now().isAfter(ultima.periodoValido)) return false;

        return capacidadActual > 0;
    }

    public boolean puedeViajar(int distanciaKm) {
        int necesario = distanciaKm * consumo;
        return estaListo() && capacidadActual >= necesario;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nCapacidad: " + capacidadMaxima +
                "\ncantidad actual: " + capacidadActual +
                "\nListo para viajar: " + (estaListo() ? "Sí" : "No");
    }
}
