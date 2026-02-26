package R_8.vehiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FlotaVehiculos {

    private HashMap<String, Vehiculo> vehiculos;

    /**
     *  Variable que guarda donde se insertará el siguiente vehiculo
     *  Empieza con 0 y si vale vehiculos.length el almacen esta lleno
     */

    /**
     * Constructor
     **/
    public FlotaVehiculos() throws VehiculoException {
        vehiculos = new HashMap<String, Vehiculo>();

    }

    /**
     *
     * @param vehiculo
     * @throws VehiculoException cuando la matr�cula ya est� en la flota
     */
    public void introducirVehiculo(Vehiculo vehiculo) throws VehiculoException {

        //if (  vehiculos.get(vehiculo.getMatricula())! = null )

        if (vehiculos.containsKey(vehiculo.getMatricula())) {
            throw new VehiculoException("Ya existe un vehiculo con la matricula " + vehiculo.getMatricula() +
                    " en la flota");
        }


        vehiculos.put(vehiculo.getMatricula(), vehiculo);
    }


    public double precioAlquiler(String matricula, int dias) throws VehiculoException {

        double precio;
        Vehiculo vehiculoEncontrado;

        vehiculoEncontrado = vehiculos.get(matricula);

        //Si no existe la matricula, error
        if (vehiculoEncontrado == null) {
            throw new VehiculoException("No existe el vehiculo con matricula " + matricula);
        }

        //Si dias es <=0
        if (dias <= 0) {
            throw new VehiculoException("Dias de alquier incorrecto");
        }

        //Calcular el alquiler
        precio = vehiculoEncontrado.calcularAlquiler(dias);


        return precio;
    }

    /**
     *
     */
    public String toString() {

        StringBuilder sb = new StringBuilder();
        ArrayList<Vehiculo> coleccion = (ArrayList<Vehiculo>) vehiculos.values();
        Collections.sort(coleccion);


        for (Vehiculo veh : coleccion) {
            sb.append(veh + "\n");
        }

        return sb.toString();


    }

    public String listadoFurgonetasPorPMA() {

        StringBuilder sb = new StringBuilder();
        ArrayList<Furgoneta> furgonetasOrdenadas = new ArrayList<Furgoneta>();

        for (Vehiculo veh : vehiculos.values()) {

            if (veh instanceof Furgoneta) {
                furgonetasOrdenadas.add(((Furgoneta) veh));
            }
        }

        Collections.sort(furgonetasOrdenadas);

        for (Furgoneta f : furgonetasOrdenadas) {
            sb.append(f + "\n");
        }
        return sb.toString();

    }

    public String listadoVehiculosOrdenadosPorGama() {

        StringBuilder sb = new StringBuilder();
        ArrayList<Vehiculo> coleccion = (ArrayList<Vehiculo>) vehiculos.values();
        ComparadorPorGama comparador = new ComparadorPorGama();

        Collections.sort(coleccion, comparador);

        for (Vehiculo veh : coleccion) {
            sb.append(veh + "\n");
        }

        return sb.toString();


    }
}
