package R2_1;

public class main {

    static void main() {

        Persona persona = new Persona();

        persona.rellenar();

        System.out.println("Su nombre es " + persona.nombre);
        System.out.println("Nacio en " + persona.fechaDeNacimiento);
        System.out.println("Su DNI es " + persona.dni + persona.letraDni);
        System.out.println("De genero " + persona.sexo);
        System.out.println("Con un indice de masa corporal de " + persona.getIMC());

    }


}
