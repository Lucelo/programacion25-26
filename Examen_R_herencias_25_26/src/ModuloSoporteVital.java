public class ModuloSoporteVital extends ModuloEstacion implements Presurizable {

    private int numeroTripulantes;
    private boolean estadoAtual;

    public ModuloSoporteVital(String nombre, double consumoBase, int numeroTripulantes) {
        super(nombre, consumoBase);
        this.numeroTripulantes = numeroTripulantes;
        estadoAtual = true;
    }

    public void EstadoAtmosférico() {

        if (estaOperativo()){
            estadoAtual = true;
        }

        else
            estadoAtual = false;


    }

    public void Operatividad() {


    }


    @Override
    public double enegiagastada(double v) {
        return (getConsumoBase() * v) + (numeroTripulantes * 2.5);

    }






    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }
}
