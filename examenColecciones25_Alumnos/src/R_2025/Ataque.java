package R_2025;

public class Ataque {

    private String nombre;
    private int ki_necesario;
    private int nivelDePerfección;
    private int dañoQueProvoca;

    public Ataque(String nombre, int ki_necesario, int nivelDePerfección, int dañoQueProvoca) {
        this.nombre = nombre;
        this.ki_necesario = ki_necesario;
        this.nivelDePerfección = nivelDePerfección;
        this.dañoQueProvoca = dañoQueProvoca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getKi_necesario() {
        return ki_necesario;
    }

    public void setKi_necesario(int ki_necesario) {
        this.ki_necesario = ki_necesario;
    }

    public int getNivelDePerfección() {
        return nivelDePerfección;
    }

    public void setNivelDePerfección(int nivelDePerfección) {
        this.nivelDePerfección = nivelDePerfección;
    }

    public int getDañoQueProvoca() {
        return dañoQueProvoca;
    }

    public void setDañoQueProvoca(int dañoQueProvoca) {
        this.dañoQueProvoca = dañoQueProvoca;
    }
}
