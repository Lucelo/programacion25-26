public class Mision {

    public String id;

    public TipoMision tipoMision;

    public double dificultad;

    public double recompensa;

    public Mision(String id, TipoMision tipoMision, double dificultad, double recompensa) {
        this.id = id;
        this.tipoMision = tipoMision;
        this.dificultad = dificultad;
        this.recompensa = recompensa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TipoMision getTipoMision() {
        return tipoMision;
    }

    public void setTipoMision(TipoMision tipoMision) {
        this.tipoMision = tipoMision;
    }

    public double getDificultad() {
        return dificultad;
    }

    public void setDificultad(double dificultad) {
        this.dificultad = dificultad;
    }

    public double getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
    }
}
