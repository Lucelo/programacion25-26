import java.util.*

class Arraylist {
    fun EjemploArrayList() {
        //Crear lista
        val lista = ArrayList<String>()

        //Añadir elementos
        lista.add("Juan")
        lista.add("Ana")

        //Recorrer lista
        for (nombre in lista) {
            println(nombre)
        }

        //Acceder a un elemento
        lista[0] // primer elemento

        //Tamaño
        lista.size

        //Eliminar
        lista.remove("Juan") // por valor
        lista.removeAt(0) // por posición

        //Ejemplo típico
        val numeros = ArrayList<Int>()

        numeros.add(5)
        numeros.add(10)
        numeros.add(15)

        for (n in numeros) {
            println(n)
        }
    }

    fun add(i: Int) {
    }
}
