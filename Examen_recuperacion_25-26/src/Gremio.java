public class Gremio {

    Aventurero[] Aventureros = new Aventurero[3];

    public Gremio() {


        this.Aventureros[0] = new Aventurero();
        this.Aventureros[1] = new Aventurero();
        this.Aventureros[2] = new Aventurero();


    }

    public void asignarMision(int Aventurero, Mision mision) {

        if (Aventurero >= 0 && Aventurero < Aventureros.length) {

            if (Aventureros[Aventurero] != null) {

                Aventureros[Aventurero].agregarMision(mision);

            }

        } else {
            System.out.println("No existe el Aventurero");
        }


    }

    public String iniciarExpedicionGlobal() {
        calcularDificultadTotal();

        String respuesta = "";

        if (calcularDificultadTotal()) {
            if (!hayUnaCazaPorAventurero()) {
                respuesta = "ERROR CRÍTICO: ¡RIESGO DE MUERTE INMINENTE!";
            } else if (!checkRiesgoCaza()) {
                respuesta = "FALLO: Estrategia del gremio desequilibrada";
            } else {
                respuesta = "EXPEDICIÓN GLOBAL INICIADA... BUENA SUERTE";
            }
        } else {
            respuesta = "FALLO: Dificultad insuficiente para una expedición global";
        }
        return respuesta;
    }

    public boolean calcularDificultadTotal() {
        boolean cumple;
        double dificultadTotal = 0;
        for (Aventurero aventurero : Aventureros) {
            dificultadTotal += aventurero.calcularDificultadTotal();
        }
        cumple = dificultadTotal > 1000;
        return cumple;
    }

    public boolean checkRiesgoCaza() {


        int totalCazas = 0;

        for (Aventurero aventurero : Aventureros) {
            if (aventurero != null) {

                if (aventurero.contarMisionesDeTipo(TipoMision.CAZA) > 1){
                    totalCazas++;
                }



            }
        }

        return totalCazas >= 1;

    }

    public boolean hayUnaCazaPorAventurero() {

        for (Aventurero aventurero : Aventureros) {

            if (aventurero != null) {
                aventurero.contarMisionesDeTipo(TipoMision.CAZA);

                if (aventurero.contarMisionesDeTipo(TipoMision.CAZA) == 1) {
                    return true;
                }

            }

        }
        return false;

    }


}

