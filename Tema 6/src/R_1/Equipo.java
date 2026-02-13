package R_1;

public class Equipo {

    public String equipo;

    public Alumno[] conjuntoDeAlumnos;


    public Equipo(String equipo) {
        this.equipo = equipo;
        Alumno[] conjuntoDeAlumnos =new Alumno[10] ;
    }

    public void insertarAlumno(Alumno nuevoAlumno) {
        for (int i = 0; i < conjuntoDeAlumnos.length; i++) {
            if (conjuntoDeAlumnos[i]==null){
                conjuntoDeAlumnos[i]=nuevoAlumno;
            }
        }

    }

    public void borrarAlumno(Alumno cualquiera) {

        for (int i = 0; i < conjuntoDeAlumnos.length; i++) {
            if (conjuntoDeAlumnos[i]==cualquiera){
                conjuntoDeAlumnos[i]=null;
            }
        }

    }

    public Equipo fusionDeEquipos(Equipo equipo2, String s) {
    }

    public Equipo intersecionDeEquipos(Equipo equipo2, String s) {
    }

}

