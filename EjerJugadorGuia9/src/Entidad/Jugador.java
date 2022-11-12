
package Entidad;


public class Jugador {
    private String nombre;
    private String apellido;
    private Integer posicion;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, Integer posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
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

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + '}';
    }
    
}
