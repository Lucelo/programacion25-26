package R1_3;

import java.util.Scanner;


public class Maquina {
    static Scanner sc = new Scanner(System.in);

    public static final int MAX_CAFE = 50;
    public static final int MAX_LECHE = 50;
    public static final int MAX_CAFE_CON_LECHE = 80;

    public static final double DINERO_INICIAL = 5;

    private int cafe;
    private int leche;
    private int vasos;
    private double dinero;

    public static final double PRECIO_CAFE = 1;
    public static final double PRECIO_LECHE = 0.80;
    public static final double PRECIO_CAFE_CON_LECHE = 1.50;

    public void Rellenar() {
        this.cafe = MAX_CAFE;
        this.leche = MAX_LECHE;
        this.vasos = MAX_CAFE_CON_LECHE;
        System.out.println("Depósitos rellenados.");
    }

    public void llenarDepositos() {
        this.dinero = DINERO_INICIAL;
        Rellenar();
    }

    public void mostrar() {
        System.out.println("El dinero actual es " + dinero + " euros");
    }

    public void ganancia() {
        System.out.println("Las ganancias han sido: " + (dinero - DINERO_INICIAL));
    }

    public void estadoDeMaquina() {
        System.out.println("Café: " + cafe);
        System.out.println("Leche: " + leche);
        System.out.println("Vasos: " + vasos);
        System.out.println("Dinero: " + dinero);
    }

    public void servirCafe() {

        mostrar();
        System.out.println("El cafe cuesta " + PRECIO_CAFE + " euros");


        System.out.println("Introduzca el pago");
        double pago = sc.nextDouble();
        if (pago >= PRECIO_CAFE) {
            double cambio = pago - PRECIO_CAFE;

            if (cambio <= dinero) {
                if (cafe > 0 && vasos > 0) {
                    cafe--;
                    vasos--;
                    dinero += PRECIO_CAFE;


                    System.out.println("Se ha servido un vaso de cafe.");
                    System.out.println("Recoge tu cambio de " + cambio + " euros");
                } else {
                    System.out.println("No hay suficientes recursos.");
                }
            } else {
                System.out.println("La máquina no tiene suficiente dinero para darte el cambio.");
            }
        } else {
            System.out.println("Pago insuficiente.");
        }

    }

    public void servirLeche() {

        mostrar();
        System.out.println("La leche cuesta " + PRECIO_LECHE + " euros");


        System.out.println("Introduzca el pago");
        double pago = sc.nextDouble();
        if (pago >= PRECIO_LECHE) {
            double cambio = pago - PRECIO_LECHE;

            if (cambio <= dinero) {
                if (leche > 0 && vasos > 0) {
                    leche--;
                    vasos--;
                    dinero += PRECIO_LECHE;


                    System.out.println("Se a servido un vaso de leche.");
                    System.out.println("Recoge tu cambio de " + cambio + " euros");
                } else {
                    System.out.println("No hay suficientes recursos.");
                }
            } else {
                System.out.println("La máquina no tiene suficiente dinero para darte el cambio.");
            }
        } else {
            System.out.println("Pago insuficiente.");
        }
    }

    public void servirCafeConLeche() {

        mostrar();
        System.out.println("Un cafe con leche cuesta " + PRECIO_CAFE_CON_LECHE + " euros");


        System.out.println("Introduzca el pago");
        double pago = sc.nextDouble();
        if (pago >= PRECIO_CAFE_CON_LECHE) {
            double cambio = pago - PRECIO_CAFE_CON_LECHE;

            if (cambio <= dinero) {
                if (cafe > 0 && leche > 0 && vasos > 0) {
                    cafe--;
                    leche--;
                    vasos--;
                    dinero += PRECIO_CAFE_CON_LECHE;


                    System.out.println("Se a servido un vaso de cafe con leche.");
                    System.out.println("Recoge tu cambio de " + cambio + " euros");
                } else {
                    System.out.println("No hay suficientes recursos.");
                }
            } else {
                System.out.println("La máquina no tiene suficiente dinero para darte el cambio.");
            }
        } else {
            System.out.println("Pago insuficiente.");
        }
    }
}
