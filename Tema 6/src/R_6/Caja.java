package R_6;


import java.util.LinkedList;

public class Caja {

    private int numeroCaja;
    private boolean estaAbierta;
    private LinkedList<Integer> colaCliente;

    public Caja(int numeroCaja) {

        this.numeroCaja = numeroCaja;
        estaAbierta = false;
        colaCliente = new LinkedList<Integer>();
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public boolean isEstaAbierta() {
        return estaAbierta;
    }

    private void setEstaAbierta(boolean estaAbierta) {
        this.estaAbierta = estaAbierta;
    }

    public void abrirCaja() throws CajaException {

    }

    public void cerrarCaja() throws CajaException {

    }

    public int tamannoColaCliente() {

        return colaCliente.size();
    }

    public void agregarNuevoClienteCaja(Integer cliente) throws CajaException {


    }

    public Integer atenderCliente() throws CajaException {


    }

    public String toString() {

    }


}
