
package Entidad;
import Entidad.Perro;

public class Persona {
    private int edad;
    private String nombre;
    private String apellido;
    private Perro perro;
    private int Dni;

    public Persona() {
    }
    
    public Persona(int edad, String nombre, String apellido, Perro perro, int Dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.perro = perro;
        this.Dni = Dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + ", perro=" + perro + ", Dni=" + Dni + '}';
    }
    
}
