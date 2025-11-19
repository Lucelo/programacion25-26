package R1_3;


public class Maquina {

    public static int MAX_CAFE = 50;
    public static int MAX_LECHE = 50;
    public static int MAX_VASOS = 80;

    private int cafe;
    private int leche;
    private int vasos;

    public double DINERO_ALMACENADO = 5.0;
    public double COSTE_DE_CAFE = 1;
    public double COSTE_DE_LECHE = 0.80;
    public double COSTE_DE_CAFE_CON_LECHE = 1.5;


    public void Rellenar() {
        int cafe = MAX_CAFE;
        int leche = MAX_LECHE;
        int vasos = MAX_VASOS;
        System.out.println("Depósitos rellenados.");
    }


    public static void Llenar_depositos() {
        Rellenar();


    }

    public void Ganancia() {
        System.out.println("Dinero total acumulado: " + (DINERO_ALMACENADO - 5));


    }

    public void Estado_de_maquina() {
        System.out.println("Café: " + cafe);
        System.out.println("Leche: " + leche);
        System.out.println("Vasos: " + vasos);
        System.out.println("Dinero: " + DINERO_ALMACENADO);
    }

    public void Servir_cafe() {
        if (cafe > 0 && vasos > 0) {
            cafe--;
            vasos--;
            DINERO_ALMACENADO += COSTE_DE_CAFE;
            System.out.println("Has servido un vaso de cafe.");
        } else {
            System.out.println("No hay suficientes recursos.");
        }
    }

    public void Servir_leche() {

        DINERO_ALMACENADO += COSTE_DE_LECHE;
        if (leche > 0 && vasos > 0) {
            leche--;
            vasos--;
            DINERO_ALMACENADO += COSTE_DE_LECHE;
            System.out.println("Has servido un vaso de leche.");
        } else {
            System.out.println("No hay suficientes recursos.");
        }
    }

    public void Servir_cafe_con_leche() {

        DINERO_ALMACENADO += COSTE_DE_CAFE_CON_LECHE;
        if (cafe > 0 && leche > 0 && vasos > 0) {
            cafe--;
            leche--;
            vasos--;
            DINERO_ALMACENADO += COSTE_DE_CAFE_CON_LECHE;
            System.out.println("Has servido un vaso de cafe con leche.");
        } else {
            System.out.println("No hay suficientes recursos.");
        }

    }
}
