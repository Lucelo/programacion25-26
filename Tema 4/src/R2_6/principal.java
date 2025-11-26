package src.R2_6;

public class principal {

    public static void main(String[] args) {

        //
        Producto tomates = new Producto(2198712, "Tomates", 1.80);

        Producto limones = new Producto(6341425, "limones", 1.50);

        Producto melones = new Producto(5262125, "melones", 2.70);

        //
        System.out.println("Los " + tomates.descripción + " cuestan " + tomates.getCoste());

        System.out.println("Los " + limones.descripción + " cuestan " + limones.getCoste());

        System.out.println("Los " + melones.descripción + " cuestan " + melones.getCoste());


    }


}
