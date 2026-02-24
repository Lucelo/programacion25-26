package R_1;

import java.util.HashSet;

public class Equipo {

    private String equipo;

    private HashSet<Alumno> conjuntoAlumnos;


    public Equipo(String equipo) {
        getEquipo(equipo);
        conjuntoAlumnos = new HashSet<Alumno>();
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public HashSet<Alumno> getConjuntoAlumnos() {
        return conjuntoAlumnos;
    }

    public void setConjuntoAlumnos(HashSet<Alumno> conjuntoAlumnos) {
        this.conjuntoAlumnos = conjuntoAlumnos;
    }

    public void insertarAlumno(Alumno nuevoAlumno) {
        for (int i = 0; i < conjuntoAlumnos; i++) {
            if (conjuntoAlumnos[i] == null) {
                conjuntoAlumnos[i] = nuevoAlumno;
            }
        }

    }

    public void borrarAlumno(Alumno cualquiera) {

        for (int i = 0; i < conjuntoAlumnos.length; i++) {
            if (conjuntoAlumnos[i] == cualquiera) {
                conjuntoAlumnos[i] = null;
            }
        }

    }

    public Equipo fusionDeEquipos(Equipo equipo2, String s) {


        return equipo2;
    }

    public Equipo intersecionDeEquipos(Equipo equipo2, String s) {


        return equipo2;
    }

}

