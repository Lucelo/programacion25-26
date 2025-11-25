package R2_1;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Persona {
    Scanner sc =new Scanner(System.in);

    public String Nombre;

    public LocalDate fechadenacimiento;

    public int DNI;

    public char letraDni;

    public String letraDelDNI= "TRWAGMYFPDXBNJZSQVHLCKE";

    public char Sexo;

    //float
    //double
    public float Altura;

    public float Peso;

    public void rellenar(){

        System.out.println("¿Cual es su nombre?");
        this.Nombre= sc.nextLine();

        System.out.println("Por favor use este formato dd/MM/yy para declarar cuando nació");
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yy");
        String dateString = sc.next();
        this.fechadenacimiento = LocalDate.parse(dateString, formatter);

        System.out.println("Diga su DNI sin la letra");
        this.DNI=sc.nextInt();

        this.letraDni = getLetraDni();

        System.out.println("Escriba su caracter Hombre(H), Mujer(M) o No Especifico(N)");
        this.Sexo=sc.next().charAt(0);

        System.out.println("Diga su altura");
        this.Altura= sc.nextFloat();

        System.out.println("Cual es su peso");
        this.Peso= sc.nextFloat();

    }

    public char getLetraDni(){
        int resto = DNI % 23;

        return letraDelDNI.charAt(resto);
    }

   public double getIMC(){

       return (Peso/(Altura*Altura));
    }
}
