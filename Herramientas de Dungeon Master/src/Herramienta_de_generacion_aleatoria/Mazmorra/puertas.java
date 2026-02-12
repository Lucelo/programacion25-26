package Herramienta_de_generacion_aleatoria.Mazmorra;

import static Herramienta_de_generacion_aleatoria.PartesCompartidas.LanzamientoDeDado.d;

public class puertas {
    //PUERTAS
    public String Puerta;

    public puertas() {
        Puerta = tipoDePuerta[d(tipoDePuerta.length)];
    }

    String[] tipoDePuerta = new String[]{
            "De madera",
            "De madera",
            "De madera",
            "De madera",
            "De madera",
            "De madera",
            "De madera",
            "De madera",
            "De madera",
            "De madera",
            "De madera, cerrada con llave o bloqueada",
            "De madera, cerrada con llave o bloqueada",
            "De piedra ",
            "De piedra, cerrada con llave o bloqueada",
            "De hierro ",
            "De hierro, cerrada con llave o bloqueada",
            "Rastrillo",
            "Rastrillo cerrado",
            "secreta",
            "secreta, cerrada o bloqueada"
    };


    @Override
    public String toString() {
        return  Puerta;

    }
}
