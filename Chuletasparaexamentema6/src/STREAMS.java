import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STREAMS {

    public void ejemploSTREAMS() {

        //Estructura base
        Arrays lista;
        lista.stream()
                .operacion()
                .operacion()
                .collect(...);


        //FILTRAR (filter)
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);

        List<Integer> mayores = numeros.stream()
                .filter(n -> n > 10)
                .toList();

        //TRANSFORMAR (map)
        List<Integer> dobles = numeros.stream()
                .map(n -> n * 2)
                .toList();

        //RECORRER (forEach)
        numeros.stream()
                .forEach(n -> System.out.println(n));

        //CONTAR
        long cantidad = numeros.stream()
                .filter(n -> n > 10)
                .count();

        //SUMAR
        int suma = numeros.stream()
                .mapToInt(n -> n)
                .sum();


        //Ejemplo completo
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Pedro");

        // nombres con más de 4 letras
        List<String> resultado = nombres.stream()
                .filter(n -> n.length() > 4)
                .toList();

        System.out.println(resultado);



    }


}
