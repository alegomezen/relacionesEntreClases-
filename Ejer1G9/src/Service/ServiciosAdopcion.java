
package Service;
import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

public class ServiciosAdopcion {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        Persona persona1 = new Persona();
        System.out.println("Ingrese su nombre: ");
        persona1.setNombre(leer.next());
        System.out.println("Ingrese su apellido: ");
        persona1.setApellido(leer.next());
        System.out.println("Ingrese su edad: ");
        persona1.setEdad(leer.nextInt());
        System.out.println("Ingrese su numero de DNI: ");
        persona1.setDni(leer.nextInt());
        return persona1;
    }
    public Perro crearPerro(){
        Perro perro1 = new Perro();
        System.out.println("Ingrese el nombre del perro: ");
        perro1.setNombre(leer.next());
        System.out.println("Ingrese la edad del perro: ");
        perro1.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro: ");
        perro1.setTamanio(leer.next());
        System.out.println("Ingrese la raza del perro: ");
        perro1.setRaza(leer.next());
        return perro1;
    }
    public void asignacionPerros(){
        
    }
}
