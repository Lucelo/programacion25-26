import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ejerciciosBasicos {

    public static void main(String[] args) {
        bloque1();

        bloque4();



    }

    private static void bloque1() {
        //Crear un ArrayList<Integer> y añadir 5 números
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        //Mostrar todos los elementos del ArrayList

        System.out.println(numeros);

        //Calcular la suma de todos los números

        int sumaDeTodos = 0;

        for (Integer numero : numeros) {
            sumaDeTodos += numero;

        }
        System.out.println("sumaDeTodos " + sumaDeTodos);

        //Calcular la media de los elementos
        sumaDeTodos = 0;
        for (Integer numero : numeros) {
            sumaDeTodos += numero;

        }

        System.out.println("media de los elementos");
        System.out.println(sumaDeTodos / numeros.size());


        //Encontrar el número mayor
        int numMay = 0;

        for (Integer numero : numeros) {
            if (numero > numMay) {
                numMay = numero;
            }
        }
        System.out.println("número mayor " + numMay);

        //Encontrar el número menor
        int numMen = numeros.getFirst();

        for (Integer numero : numeros) {
            if (numero < numMen) {
                numMen = numero;
            }
        }
        System.out.println("número menor " + numMen);

        //Contar cuántos números son pares

        int ContarNum = 0;

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                ContarNum++;
            }
        }
        System.out.println("pares" + ContarNum);

        //Eliminar todos los números menores que 10

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < 10) {
                numeros.remove(i);
                i--;
            }
        }
        System.out.println("menores que 10");
        System.out.println(numeros);
        //Comprobar si un número existe en la lista

        boolean númeroexiste = numeros.contains(20);
        System.out.println("número existe" + númeroexiste);

        //Contar cuántas veces aparece un número

        int aparece = 0;

        for (Integer numero : numeros) {
            if (numero == 20) {
                aparece++;
            }
        }
        System.out.println("aparece un número" + aparece);
        //Crear una copia de un ArrayList
        ArrayList<Integer> copianum = new ArrayList<>(numeros);

        System.out.println("copia de un ArrayList" + copianum);

        //Vaciar un ArrayList

        copianum.clear();

        //Comprobar si un ArrayList está vacío

        System.out.println(copianum);
    }

    private static void bloque4() {
        ArrayList<Integer> numerosfluidos = new ArrayList<>();

        numerosfluidos.add(534);
        numerosfluidos.add(342);
        numerosfluidos.add(234);
        numerosfluidos.add(543);
        numerosfluidos.add(564);
        numerosfluidos.add(259);
        numerosfluidos.add(543);
        numerosfluidos.add(654);
        numerosfluidos.add(234);
        numerosfluidos.add(567);
        numerosfluidos.add(213);


        //Mostrar todos los elementos con forEach
        numerosfluidos.forEach(System.out::println);

        //Filtrar números mayores que 10
        numerosfluidos.stream().filter(n -> n > 10).forEach(n -> System.out.println(n));

        //Filtrar números menor que 10
        numerosfluidos.stream().filter(n -> n < 10).forEach(n -> System.out.println(n));

        //Filtrar números pares
        numerosfluidos.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

        //Obtener la suma usando streams
        int suma = numerosfluidos.stream().mapToInt(n -> n).sum();

        //Obtener el mínimo con streams
        int minimo = numerosfluidos.stream()
                .min(Integer::compare)
                .orElse(0);

        //Obtener el maximo con streams
        int maximo = numerosfluidos.stream()
                .max(Integer::compare)
                .orElse(0);

        //Contar elementos que cumplen una condición
        long Contar = numerosfluidos.stream().filter(n -> n < 200).count();

        //Convertir lista de enteros a lista de strings.
        List<String> listaDeStrings = numerosfluidos.stream()
                .map(String::valueOf)
                .toList();

        //Ordenar una lista con streams
        List<Integer> ordenados = numerosfluidos.stream()
                .sorted()
                .toList();
    }

}
