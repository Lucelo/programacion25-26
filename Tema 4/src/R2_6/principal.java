package R2_6;

import java.util.Scanner;

import static R2_6.Producto.Venta;
import static R2_6.Producto.consulta;

public class principal {

    public static void main(String[] args) {

        //
        Producto p1 = new Producto("Tomates", 1.80);

        Producto p2 = new Producto("limones", 1.50);

        Producto p3 = new Producto("melones", 2.70);

        Scanner sc = new Scanner(System.in);


        System.out.println("Que desea hacer consulta, modificación o precio de venta");
        String menu = sc.nextLine();


//luego lo relleno solo has consulta
switch (menu){
    case "consulta"->{

        consulta(p1);
        consulta(p2);
        consulta(p3);

    }case "modificación"->{

    } case "precio de venta"->{
        Venta(p1);
        Venta(p2);
        Venta(p3);

    }
}


    }




}
