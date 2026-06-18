public class ModuloPropulsion extends ModuloEstacion implements BateriaRespaldo {

    private double empujeNewton;

    public ModuloPropulsion(String nombre, double consumoBase, double empujeNewton) {
        super(nombre, consumoBase);
        this.empujeNewton = empujeNewton;
    }

    public double getEmpujeNewton() {
        return empujeNewton;
    }

    public void setEmpujeNewton(double empujeNewton) {
        this.empujeNewton = empujeNewton;
    }



    @Override
    public double enegiagastada(double v) {
        return (getConsumoBase() * v) + (empujeNewton * 0.1);
    }
}
