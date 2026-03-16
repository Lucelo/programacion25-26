package R_8.vehiculos;

public abstract class Vehiculo implements Comparable<Vehiculo> {

    private String matricula;
    private TipoGama gama;

    public static final double PRECIO_ALTA = 50;
    public static final double PRECIO_MEDIA = 40;
    public static final double PRECIO_BAJA = 30;

    public Vehiculo(String matricula, TipoGama gama) {
        this.matricula = matricula;
        this.gama = gama;

    }

    // M�todos gets y sets

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoGama getGama() {
        return gama;
    }

    public void setGama(TipoGama gama) {
        this.gama = gama;
    }

    // m�todos alquiler
    public abstract double calcularAlquiler(int dias) throws VehiculoException;

    // M�todos calcular base

    protected double calcularAlquilerBase(int dias) {
        double precio;

        precio = dias * gama.getPrecioBasePorGama();
        return precio;

    }

    @Override
    public String toString() {
        return " Matricula=" + matricula + ", gama=" + gama + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehiculo other = (Vehiculo) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

    public int compareTo(Vehiculo otro) {

        return this.getMatricula().compareTo(otro.getMatricula());
    }


}
