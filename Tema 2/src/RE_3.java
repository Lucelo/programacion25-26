public class RE_3 {


    public void main() {

        final int I = 1;
        final int V = 5;
        final int X = 10;
        final int L = 50;
        final int C = 100;
        final int D = 500;
        final int M = 1000;

        String numromano = "MMXIX";

        int valoractual = 0;
        int valorantiguo = 0;
        int numfinal = 0;

        int cantnum = numromano.length();

        for (int i = 0; i < cantnum; i++) {

            valoractual = numromano.charAt(i);

            if (valoractual < valorantiguo) {
                numfinal += valoractual;

            } else {
                numfinal -= valoractual;
            }
            valorantiguo = valoractual;

        }

        System.out.println("Es " + numfinal);


    }

}
