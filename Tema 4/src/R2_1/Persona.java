package R2_1;

import java.time.LocalDate;

public class Persona {

    public String Nombre;

    public LocalDate fechadenacimiento;

    public int DNI;

    public char Sexo;

    public float Altura;

    public float Peso;



public getLetraDni(){
    DNI=435753457;
}


public getIMC(){
    int índice_de_masa_corporal= (int) (Peso/ (Altura*Altura));
}


}
