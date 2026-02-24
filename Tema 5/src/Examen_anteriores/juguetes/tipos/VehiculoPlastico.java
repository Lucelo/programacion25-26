package Examen_anteriores.juguetes.tipos;

import Examen_anteriores.juguetes.plástico;
import Examen_anteriores.juguetes.tipoDePlástico;


public class VehiculoPlastico extends plástico {

    int númeroDeRuedas;

    tipoDePlástico tipoDePlástico;

    public VehiculoPlastico(String nombre, String marca, int númeroDeRuedas) {
        super(nombre, marca);
        this.númeroDeRuedas = númeroDeRuedas;
        tipoDePlástico = Examen_anteriores.juguetes.tipoDePlástico.PVC;
    }
}
