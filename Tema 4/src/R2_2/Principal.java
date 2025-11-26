package R2_2;

public class Principal {


    static void main() {

        placaBase placaBase = new placaBase("a","b","c");

        microprocesador microprocesador= new microprocesador("a","c",4,16,"c");

        disco_duro discoDuro = new disco_duro("","",1);

        Tarjeta_gráfica tarjetaGráfica =new Tarjeta_gráfica("","",1,2,3);


    }

    public Boolean Compatibilidad (){
        return Boolean.parseBoolean((placaBase.socket=microprocesador.socket));

    }

}
