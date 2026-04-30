package JSON.PruebasJson;

public class Persona {
    private String nombre;
    private String dni;
    private String telefono;

    // Constructor
    public Persona(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
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


    // Setters (opcionales para este ejercicio, pero buena práctica)
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDni(String dni) { this.dni = dni; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}