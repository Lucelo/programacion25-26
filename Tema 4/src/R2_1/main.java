package R2_1;

public class main {

    static void main() {

        Persona persona = new Persona();

        persona.rellenar();

        System.out.println("Su nombre es " + persona.Nombre);
        System.out.println("Nacio en " + persona.fechadenacimiento);
        System.out.println("Su DNI es " + persona.DNI + persona.letraDni);
        System.out.println("De genero " + persona.Sexo);
        System.out.println("Con un indice de masa corporal de " + persona.getIMC());

    }


}
