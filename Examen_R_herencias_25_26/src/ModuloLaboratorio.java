public class ModuloLaboratorio extends ModuloEstacion {

    private int experimentosActivos;

    public ModuloLaboratorio(String nombre, double consumoBase, int experimentosActivos) {
        super(nombre, consumoBase);
        this.experimentosActivos = experimentosActivos;
    }

    public int getExperimentosActivos() {
        return experimentosActivos;
    }

    public void setExperimentosActivos(int experimentosActivos) {
        this.experimentosActivos = experimentosActivos;
    }



    @Override
    public double enegiagastada(double v) {

        if (experimentosActivos >= 4) {

            return getConsumoBase()*(v*2);


        }else if (experimentosActivos <= 3) {
            return getConsumoBase()*v;

        }else {
            return v;
        }


    }
}
