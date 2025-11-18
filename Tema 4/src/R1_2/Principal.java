package R1_2;
import java.util.Scanner;

public class Principal {

    static void main() {
        Scanner sc=new Scanner(System.in);
        boolean salir=false;

        int reintegros;
        int ingresos;



        while (salir){

            System.out.println("1. Hacer un reintegro, se pedirá la cantidad a retirar.");
            System.out.println("2. Hacer un ingreso, se pedirá la cantidad a ingresar.\n");
            System.out.println("3. Consultar el saldo y el número de reintegros e ingresos\n" +
                    "realizados.");
            System.out.println("4. Finalizar las operaciones. Debe confirmar si realmente desea\n" +
                    "salir e informar del saldo al final de todas las operaciones.");

            int elección=sc.nextInt();

            if(elección == 1){

            } else if (elección == 2) {

            }else if(elección == 3){

            }else if (elección == 4){
                System.out.println("Esta seguro de irse si/no");
                String salirse= sc.nextLine();
                if (Boolean.parseBoolean(salirse="si")){
                    salir=true;
                }
            }
        }

    }


}
