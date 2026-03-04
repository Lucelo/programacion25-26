public class Personaje {


    private String nombre;

    private TRaza raza;

    private int vidaMax;
    private int vidaActual;

    private int KiMax;
    private int kiActual;

    public Personaje(String nombre, TRaza raza, int vidaMax, int vidaActual, int KiMax, int kiActual) {
        this.nombre = nombre;
        this.raza = raza;
        this.vidaMax = vidaMax;
        this.vidaActual = vidaActual;
        this.KiMax = KiMax;
        this.kiActual = kiActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TRaza getRaza() {
        return raza;
    }

    public void setRaza(TRaza raza) {
        this.raza = raza;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getKiMax() {
        return KiMax;
    }

    public void setKiMax(int kiMax) {
        KiMax = kiMax;
    }

    public int getKiActual() {
        return kiActual;
    }

    public void setKiActual(int kiActual) {
        this.kiActual = kiActual;
    }

    public void addAtaque(Ataque Ataque) {
    }


}
