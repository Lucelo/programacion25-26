package app;

import model.Empleado;
import model.Nomina;
import model.TDepartamento;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import static model.TDepartamento.*;

public class Principal {
    private List<Empleado> empleados;

    public Principal() {
        empleados = new ArrayList<>();
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.inicializarEmpleados();

        // Este empleado obviamente existe
        principal.buscarEmpleado(principal.empleados.getFirst().getDni());

        // Este empleado no existe
        principal.buscarEmpleado("12345678A");
        System.out.println();

        System.out.println("#############");
        System.out.println("Número de empleados por departamento:");
        principal.mostrarNumeroEmpleadosPorDepartamento();
        System.out.println();

        System.out.println("#############");
        System.out.printf("Porcentaje de retención para los trabajadores que llevan menos de 1 año trabajando: %.2f€%n",
                principal.porcentajeRetencionTrabajadoresNuevos());
        System.out.println();

        System.out.println("#############");
        principal.empleadosQueMasCobran();
        System.out.println();

        System.out.println("#############");
        System.out.println("Coste total en salarios");
        principal.costeTotalSalarios(YearMonth.of(2024, 12));
        System.out.println();

        System.out.println("#############");
        System.out.println("Todos los empleados ordenados por antigüedad");
        principal.mostrarTodosEmpleadosOrdenados();
        System.out.println();


    }

    //Cambiar el if por tronw como enseñar sus datos
    private void buscarEmpleado(String dni) {

        boolean b = empleados.stream().anyMatch(n -> n.dni == dni);

        if (b) {
            System.out.println("El empleado con los datos");

        } else {
            System.out.println("El empleado con los datos no existe");

        }

    }

    private void mostrarNumeroEmpleadosPorDepartamento() {

        int informaticos = 0;
        int contables = 0;
        int diseñadores = 0;


        for (Empleado n : empleados) {
            if (n.departamento == INFORMÁTICA) {
                informaticos++;
            } else if (n.departamento == CONTABILIDAD) {
                contables++;
            } else if (n.departamento == DISEÑO) {
                diseñadores++;
            }
        }

        System.out.println("Informaticos: " + informaticos);
        System.out.println("Contables: " + contables);
        System.out.println("Diseñadores: " + diseñadores);


    }

    private double porcentajeRetencionTrabajadoresNuevos() {
        //TODO



        return 0.0;
    }

    private void empleadosQueMasCobran() {



    }

    private void costeTotalSalarios(YearMonth fecha) {

    }


    private void mostrarTodosEmpleadosOrdenados() {

        empleados.sort(Comparator.comparing(n -> n.nombre));

        System.out.println("Empleados ordenados");

        System.out.println(empleados);

    }

    public void inicializarEmpleados() {
        Random random = new Random();

        // Configuración para generar 5 empleados por cada departamento
        for (TDepartamento dept : TDepartamento.values()) {
            // Los departamentos tendrán entre 3 y 7 empleados
            int numEmpleados = random.nextInt(5) + 3;
            for (int i = 1; i <= numEmpleados; i++) {
                String nombre = "Empleado " + i + "_" + dept.name().charAt(0);
                String apellido = "Apellido " + (random.nextInt(10) + i);
                String dni = (random.nextInt(90000000) + 10000000) + "X";

                Empleado emp = new Empleado(nombre, apellido, dni, dept);

                // Generamos entre 5 y 30 nóminas para cada uno
                // Algunos empezarán hace 30 meses, otros hace solo 5
                int numNominas = random.nextInt(26) + 5;
                YearMonth mesInicio = YearMonth.now().minusMonths(numNominas);

                for (int m = 0; m < numNominas; m++) {
                    YearMonth mesNomina = mesInicio.plusMonths(m);
                    // Salarios entre 1500 y 3500
                    double salarioBase = 1500 + (random.nextDouble() * 2000);
                    // Retenciones entre 10% y 22%
                    double retencion = 10 + (random.nextDouble() * 12);

                    emp.getNominas().add(new Nomina(mesNomina, salarioBase, retencion));
                }
                empleados.add(emp);
            }
        }
    }
}
