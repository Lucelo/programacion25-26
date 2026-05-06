package JSON.explesiones_regulares;

public class Split {

    public static void main(String[] args) {
        String str = "esto es un ejemplo de cómo funciona split";
        String[] cadenas = str.split("(e[s|m])|(pl)");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
        }

    }

}
