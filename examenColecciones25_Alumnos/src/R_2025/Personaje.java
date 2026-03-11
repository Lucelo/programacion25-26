package R_2025;

import java.util.ArrayList;

public class Personaje {


    private String nombre;

    private TRaza raza;

    private int vidaMax;
    private int vidaActual;

    private int KiMax;
    private int kiActual;

    ArrayList<Ataque> ataques;

    public Personaje(String nombre, TRaza raza, int vidaMax, int vidaActual, int kiMax, int kiActual) {
        this.nombre = nombre;
        this.raza = raza;
        this.vidaMax = vidaMax;
        this.vidaActual = vidaActual;
        this.KiMax = kiMax;
        this.kiActual = kiActual;
        ataques = new ArrayList<>();
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

    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(ArrayList<Ataque> ataques) {
        this.ataques = ataques;
    }

    public void addAtaque(Ataque ataque) throws DBException {

        if (ataques.contains(ataque)) {

            throw new DBException("Ya existe el mismo ataque");

        }

        ataques.add(ataque);

    }


}
