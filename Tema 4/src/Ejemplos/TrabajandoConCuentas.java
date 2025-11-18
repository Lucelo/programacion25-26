package Ejemplos;

public class TrabajandoConCuentas {
    public static void main(String[] args) {

        Cuenta cuenta1; // declarar la la referencia al objeto cuenta1
        cuenta1 = new Cuenta(); // crear el objeto cuenta1. LLamará a
//constructor de la clase cuenta

        Cuenta cuenta2 = new Cuenta();
        // en un solo paso hace lo mismo con una nueva referencia cuenta2

        cuenta1.ingresarCantidad(100);
        cuenta2.ingresarCantidad(200);
        cuenta1.sacarCantidad(50);
    }
}