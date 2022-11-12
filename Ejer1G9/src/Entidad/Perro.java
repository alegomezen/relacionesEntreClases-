
package Entidad;


public class Perro {
    private int edad;
    private String nombre;
    private String raza;
    private String tamanio;

    public Perro() {
    }

    public Perro(int edad, String nombre, String raza, String tamanio) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "edad=" + edad + ", nombre=" + nombre + ", raza=" + raza + ", tamanio=" + tamanio + '}';
    }
    
}
