

public class Aventurero {

    public Mision[] mision;

    public Aventurero() {
        this.mision = new Mision[4];
    }

    public void agregarMision(Mision m) {

        try {
            for (int i = 0; i < mision.length; i++) {
                if (mision[i] == null) {
                    mision[i] = m;
                }

            }

            System.out.println("La mision "+m.id +" ha sido añadida");

        } catch (Exception e) {
            System.out.println("Error al agregar la mision");
        }



    }

    public double calcularDificultadTotal() {

        double dificultad = 0;

        for (Mision value : mision) {

            if (value != null) {

                dificultad += value.getDificultad();

            }

        }

        return dificultad;

    }

    public double calcularRecompensaTotal() {
        double recompensa = 0;

        for (Mision value : mision) {
            if (value != null) {

                recompensa += value.getRecompensa();

            }
        }

        return recompensa;

    }

    public int contarMisionesDeTipo(TipoMision tipo) {
        int RESCATE = 0;
        int CAZA = 0;
        int EXPLORACION = 0;

        for (Mision value : mision) {
            if (value != null) {
                if (value.getTipoMision() == TipoMision.RESCATE) {

                    RESCATE++;
                }

                if (value.getTipoMision() == TipoMision.CAZA) {
                    CAZA++;
                }

                if (value.getTipoMision() == TipoMision.EXPLORACION) {
                    EXPLORACION++;
                }

            }

        }

        return RESCATE + CAZA + EXPLORACION;

    }

    public double calcularRecompensaMisionTipo(TipoMision tipo) {
        double R_RESCATE = 0;
        double R_CAZA = 0;
        double R_EXPLORACION = 0;

        for (Mision value : mision) {
            if (value != null) {

                if (value.getTipoMision() == TipoMision.RESCATE) {

                    R_RESCATE = value.getRecompensa();
                }

                if (value.getTipoMision() == TipoMision.CAZA) {
                    R_CAZA = value.getRecompensa();
                }

                if (value.getTipoMision() == TipoMision.EXPLORACION) {
                    R_EXPLORACION = value.getRecompensa();
                }

            }

        }

        return R_RESCATE + R_CAZA + R_EXPLORACION;

    }

}
