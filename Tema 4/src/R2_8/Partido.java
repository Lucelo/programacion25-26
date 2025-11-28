package R2_8;

public class Partido {

    public int Jornada;


    public String equipoLocal;
    public String equipoVisitante;

    public Integer golesLocal;
    public Integer golesVisitante;

    public Character quiniela;

    Partido(int Jornada, String equipoLocal, String equipoVisitante, Integer golesLocal,Integer golesVisitante, Character quiniela) {
        this.Jornada=++Jornada;

        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;

        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;

        this.quiniela = quiniela;

    }


}
