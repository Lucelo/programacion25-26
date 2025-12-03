package R2_1;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Persona {
    Scanner sc =new Scanner(System.in);

    public String nombre;

    public LocalDate fechaDeNacimiento;

    public int dni;

    public char letraDni;

    public String letraDelDNI= "TRWAGMYFPDXBNJZSQVHLCKE";

    public char sexo;

    //float
    //double
    public float altura;

    public float peso;

    public void rellenar(){

        System.out.println("¿Cual es su nombre?");
        this.nombre = sc.nextLine();

        System.out.println("Por favor use este formato dd/MM/yy para declarar cuando nació");
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yy");
        String dateString = sc.next();
        this.fechaDeNacimiento = LocalDate.parse(dateString, formatter);

        System.out.println("Diga su DNI sin la letra");
        this.dni =sc.nextInt();

        this.letraDni = getLetraDni();

        System.out.println("Escriba su caracter Hombre(H), Mujer(M) o No Especifico(N)");
        this.sexo =sc.next().charAt(0);

        System.out.println("Diga su altura");
        this.altura = sc.nextFloat();

        System.out.println("Cual es su peso");
        this.peso = sc.nextFloat();

    }

    public char getLetraDni(){
        int resto = dni % 23;

        return letraDelDNI.charAt(resto);
    }

   public double getIMC(){

       return (peso /(altura * altura));
    }
}
