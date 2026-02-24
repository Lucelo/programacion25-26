package R_6;


public class GranAlmacen {

    private static final int MAXIMO_DE_CAJAS = 20;
    private static int numeroDeClientes = 0;
    private Caja cajas[];


    public GranAlmacen() {

        cajas = new Caja[MAXIMO_DE_CAJAS];


        inicializarCajas();
    }

    private void inicializarCajas() {

        int i;

        for (i = 0; i < cajas.length; i++) {
            cajas[i] = new Caja((i + 1));
        }
    }


    public void abrirCaja(int numeroCaja) throws CajaException {


    }

    public void cerrarCaja(int numeroCaja) throws CajaException {


    }

    public String nuevoCliente() throws CajaException {


    }

    public int atenderCliente(int numeroCaja) throws CajaException {


    }

    public String toString() {

    }

    /**
     *
     * @return Devuelve el número de caja que tiene menos clientes
     * @throws CajaException Si todas las cajas están cerradas
     */

    private int cajaMenosCliente() throws CajaException {

    }


}
