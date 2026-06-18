public interface Presurizable {

    static boolean comprobarFugaAire(double EnergiaDisponible) {

        if (EnergiaDisponible >= 20){
            return true;
        }else {
            return false;
        }

    }

    static void despresurizar() {

    }

}
