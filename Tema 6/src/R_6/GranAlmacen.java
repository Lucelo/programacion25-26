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

        if (numeroCaja <= 0 || numeroCaja > MAXIMO_DE_CAJAS) {
            throw new CajaException("Número de caja inválido");
        }

        cajas[numeroCaja - 1].abrirCaja();
    }

    public void cerrarCaja(int numeroCaja) throws CajaException {

        if (numeroCaja <= 0 || numeroCaja > MAXIMO_DE_CAJAS) {
            throw new CajaException("Número de caja inválido");
        }

        cajas[numeroCaja - 1].cerrarCaja();
    }

    public String nuevoCliente() throws CajaException {

        int numeroCaja = cajaMenosCliente();

        numeroDeClientes++;

        cajas[numeroCaja - 1].agregarNuevoClienteCaja(numeroDeClientes);

        return "Cliente " + numeroDeClientes + " añadido a la caja " + numeroCaja;
    }

    public int atenderCliente(int numeroCaja) throws CajaException {

        if (numeroCaja <= 0 || numeroCaja > MAXIMO_DE_CAJAS) {
            throw new CajaException("Número de caja inválido");
        }

        return cajas[numeroCaja - 1].atenderCliente();
    }

    public String toString() {

        String resultado = "";

        for (int i = 0; i < cajas.length; i++) {
            resultado += cajas[i].toString() + "\n";
        }

        return resultado;
    }

    /**
     *
     * @return Devuelve el número de caja que tiene menos clientes
     * @throws CajaException Si todas las cajas están cerradas
     */

    private int cajaMenosCliente() throws CajaException {

        int minClientes = Integer.MAX_VALUE;
        int numeroCaja = -1;

        for (int i = 0; i < cajas.length; i++) {

            if (cajas[i].isEstaAbierta()) {

                if (cajas[i].tamannoColaCliente() < minClientes) {
                    minClientes = cajas[i].tamannoColaCliente();
                    numeroCaja = i + 1;
                }
            }
        }

        if (numeroCaja == -1) {
            throw new CajaException("No hay cajas abiertas");
        }

        return numeroCaja;
    }


}
