package objetos;

import exception.EcoVoltException;
import exception.VehiculoDuplicadoException;

import java.util.*;
import java.util.stream.Collectors;

public class PlataformaEcoVolt {

    // Mapa que almacena los vehículos de la flota organizados por su categoría
    private final Map<CategoriaVehiculo, Set<Vehiculo>> flota;

    //Constructor de la clase PlataformaEcoVolt
    public PlataformaEcoVolt() {

        this.flota = new HashMap<>();

    }

    // Registra un nuevo vehículo en la flota o lanza una excepción si la matrícula ya existe
    public void registrarVehiculo(Vehiculo vehiculo) throws VehiculoDuplicadoException {

        if (buscarVehiculoPorMatricula(vehiculo.getMatricula()).isPresent()) {

            System.out.println("Advertencia: El vehículo con matrícula " + vehiculo.getMatricula() + " ya está registrado.");

            throw new VehiculoDuplicadoException("El vehiculo duplicado: " + vehiculo.getMatricula());

        }

        flota.computeIfAbsent(vehiculo.getCategoria(), k -> new HashSet<>()).add(vehiculo);
    }

    // Busca un vehículo en toda la flota utilizando su matrícula de forma insensible a mayúsculas
    public Optional<Vehiculo> buscarVehiculoPorMatricula(String matricula) {

        return flota.values().stream().flatMap(Collection::stream).filter(v -> v.getMatricula().equalsIgnoreCase(matricula)).findFirst();

    }

    // Devuelve un conjunto con los vehículos cuyo nivel de batería es inferior al umbral indicado
    public Set<Vehiculo> obtenerVehiculosBajosDeBateria(int umbralBateria) {

        return flota.values().stream().flatMap(Collection::stream).filter(v -> v.getBateriaRestante() < umbralBateria).collect(Collectors.toSet());

    }

    // Calcula el promedio de ingresos de una categoría de vehículo validando que exista y tenga datos
    public double obtenerFacturacionMediaPorCategoria(String categoriaString) throws EcoVoltException {

        CategoriaVehiculo categoria;

        try {

            categoria = CategoriaVehiculo.valueOf(categoriaString.toUpperCase());

        } catch (IllegalArgumentException e) {

            throw new EcoVoltException("La categoría indicada no existe: " + categoriaString);

        }

        Set<Vehiculo> vehiculosCategoria = flota.get(categoria);


        if (vehiculosCategoria == null || vehiculosCategoria.isEmpty()) {

            throw new EcoVoltException("No hay vehículos registrados para la categoría: " + categoriaString);

        }

        return vehiculosCategoria.stream().mapToDouble(Vehiculo::obtenerFacturacionTotal).average().orElseThrow(() -> new EcoVoltException("Error al calcular la facturación media."));

    }

    // Devuelve una lista de todos los vehículos de la flota ordenados de mayor a menor facturación
    public List<Vehiculo> obtenerVehiculosOrdenadosPorFacturacionDescendente() {

        return flota.values().stream().flatMap(Collection::stream).sorted(Comparator.comparingDouble(Vehiculo::obtenerFacturacionTotal).reversed()).collect(Collectors.toList());

    }

}