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

        if (estaAbierta) {
            throw new CajaException("La caja " + numeroCaja + " ya está abierta");
        }

        setEstaAbierta(true);
    }

    public void cerrarCaja() throws CajaException {

        if (!estaAbierta) {
            throw new CajaException("La caja " + numeroCaja + " ya está cerrada");
        }

        if (!colaCliente.isEmpty()) {
            throw new CajaException("No se puede cerrar la caja " + numeroCaja + " porque tiene clientes");
        }

        setEstaAbierta(false);
    }

    public int tamannoColaCliente() {

        return colaCliente.size();
    }

    public void agregarNuevoClienteCaja(Integer cliente) throws CajaException {

        if (!estaAbierta) {
            throw new CajaException("La caja " + numeroCaja + " está cerrada");
        }

        colaCliente.add(cliente);
    }

    public Integer atenderCliente() throws CajaException {

        if (!estaAbierta) {
            throw new CajaException("La caja " + numeroCaja + " está cerrada");
        }

        if (colaCliente.isEmpty()) {
            throw new CajaException("No hay clientes en la caja " + numeroCaja);
        }

        return colaCliente.removeFirst();
    }

    public String toString() {

        return "Caja " + numeroCaja +
                " | Abierta: " + estaAbierta +
                " | Clientes en cola: " + colaCliente.size();
    }


}
