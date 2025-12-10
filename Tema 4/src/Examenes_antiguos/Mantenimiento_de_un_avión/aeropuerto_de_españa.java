package Mantenimiento_de_un_avión;

import java.util.Scanner;

public class aeropuerto_de_españa {

    Scanner sc=new Scanner(System.in);

    static void main(String[] args) {
        aeropuerto_de_españa aeropuerto=new aeropuerto_de_españa();
        aeropuerto.despegar();
    }

    public void despegar(){

        avión[] aviones = aviones();

        boolean salir=false;

        while (!salir){
            int elec=sc.nextInt();
            sc.nextLine();

            switch (elec){
                
                //
                case 1->{}
                //
                case 2->{}
                //
                case 3->{salir=true;}
                //
                default -> {
                    System.out.println("Elecion no valida");
                }
            }
        }




    }



    private static avión[] aviones() {
        avión[] aviones= new avión[]{

                new avión("Faren", "agata", 5, 40, 22),
                new avión("Granate", "zafiro", 5, 40, 22),
                new avión("Faren", "agata", 5, 40, 22),
                new avión("Faren", "agata", 5, 40, 22),
                new avión("Faren", "agata", 5, 40, 22),

        };

        regestros(aviones);

        return aviones;
        
        
        
    }

    private static void regestros(avión[] aviones) {

        //Avión 1
        aviones[0].registroDeRevisiones= new registro[]{
                new registro("12/04/12",true,"24/12/27")
        };

        //Avión 2


        //Avión 3


        //Avión 4


        //Avión 5


    }
}
