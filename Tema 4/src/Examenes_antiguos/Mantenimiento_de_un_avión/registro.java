package Mantenimiento_de_un_avión;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class registro {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

    LocalDate fecha;
    boolean estado;
    LocalDate periodoValido;

    registro(
            String  fecha,
            boolean estado,
            String  periodoValido
    ){
        this.fecha = LocalDate.parse(fecha,formatter);
        this.estado=estado;
        this.periodoValido=LocalDate.parse(periodoValido,formatter);


    }
}
