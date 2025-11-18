package Ejemplos;

public class Cuenta {
    // Atributos de la clase
    private double saldo;
    /* Primer Método constructor.
    Si no se indica el saldo se considera saldo 0*/
    public Cuenta (){
        saldo = 0;
    }
    /* Otro Método constructor.
    El objeto Cuenta se crea con un saldo inicial indicado*/
    public Cuenta (double saldoinicial){
        saldo = saldoinicial;
    }
    public double ingresarCantidad (double cantidad){
        System.out.println();
        return cantidad;
    }
}