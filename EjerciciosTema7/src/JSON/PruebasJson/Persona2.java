package JSON.PruebasJson;

import java.time.LocalDate;

public class Persona2 {
    private String nombre;
    private String dni;
    private String telefono;
    private LocalDate fechaNacimiento;

    // Constructor
    public Persona2(String nombre, String dni, String telefono, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Setters (opcionales para este ejercicio, pero buena práctica)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}