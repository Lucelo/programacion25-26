import Exception.SimuladorException;

public abstract class ModuloEstacion {

    private String nombre;

    private double consumoBase;

    private double EnergiaDisponible;

    // Debe inicializar el nombre y el consumo base. La Energía disponible
    //siempre se inicializa de forma automática al 100.0% al acoplarse
    public ModuloEstacion(String nombre, double consumoBase) {
        this.nombre = nombre;
        setConsumoBase(consumoBase);
        setEnergiaDisponible(EnergiaDisponible);
    }

    //Debe existir una forma de modificar la Energía garantizando
    //que nunca sea inferior a 0.0 ni supere el 100.0% (si se pasa de los límites, debe
    //ajustarse al tope correspondiente de forma silenciosa)

    public abstract double enegiagastada(double v);

    public void actualizarConsumo(double v) {


        EnergiaDisponible -= enegiagastada(v);
    }

    //El sistema debe prever que todo módulo disponga de un
    //método actualizarConsumo(double factorAlerta). El consumo dependerá de
    //cada tipo de módulo concreto.
    public void ConsumoAnteEmergencias() {

    }

    // Por defecto, un compartimento genérico está operativo si su Energía
    //disponible es estrictamente mayor al 15.0% (devolviendo un booleano).
    public boolean estaOperativo() {

        return EnergiaDisponible >= 15;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getConsumoBase() {

        return consumoBase;

    }

    public void setConsumoBase(double consumoBase) {
        if (consumoBase < 0) {
            throw new SimuladorException("El consumo base no puede ser negativo.");
        }
        this.consumoBase = consumoBase;
    }

    public double getEnergiaDisponible() {
        return EnergiaDisponible;
    }

    public void setEnergiaDisponible(double energiaDisponible) {
        EnergiaDisponible = 100;
    }


}
