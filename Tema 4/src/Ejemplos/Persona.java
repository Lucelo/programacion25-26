package Ejemplos;

public class Persona{
    private String nombre;
    private int edad;
    public Persona(){} //Constructor
    public void setNombre(String nombre){ //Asignar un valor
        this.nombre = nombre;
    }
    public String getNombre(){ //Devolver el valor
        return this.nombre;
    }
    public void setEdad(int edad){
        if (edad >= 0)
            this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
}