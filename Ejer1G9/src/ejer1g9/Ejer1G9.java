
package ejer1g9;
import Service.ServiciosAdopcion;
import java.util.ArrayList;
import java.util.Scanner;
import Entidad.Perro;
import Entidad.Persona;
public class Ejer1G9 {

    public static void main(String[] args) {
        //ServiciosAdopcion serv1 = new ServiciosAdopcion();
        //serv1.crearPersona();
        //serv1.crearPerro();
        Scanner leer = new Scanner(System.in);
        ArrayList<Persona> lista1 = new ArrayList();
        Persona persona1 = new Persona();
        System.out.println("Ingrese su nombre: ");
        persona1.setNombre(leer.next());
        System.out.println("Ingrese su apellido: ");
        persona1.setApellido(leer.next());
        System.out.println("Ingrese su edad: ");
        persona1.setEdad(leer.nextInt());
        System.out.println("Ingrese su numero de DNI: ");
        persona1.setDni(leer.nextInt());
        Persona persona2 = new Persona();
        System.out.println("Ingrese su nombre: ");
        persona2.setNombre(leer.next());
        System.out.println("Ingrese su apellido: ");
        persona2.setApellido(leer.next());
        System.out.println("Ingrese su edad: ");
        persona2.setEdad(leer.nextInt());
        System.out.println("Ingrese su numero de DNI: ");
        persona2.setDni(leer.nextInt());
        lista1.add(persona1);
        lista1.add(persona2);
        for (Persona aux : lista1) {
            System.out.println(aux);
        }
        ArrayList<Perro> listaPerros = new ArrayList();
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        System.out.println("Ingrese el nombre del perro: ");
        perro1.setNombre(leer.next());
        System.out.println("Ingrese la edad del perro: ");
        perro1.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro: ");
        perro1.setTamanio(leer.next());
        System.out.println("Ingrese la raza del perro: ");
        perro1.setRaza(leer.next());
        System.out.println("Ingrese el nombre del perro: ");
        perro2.setNombre(leer.next());
        System.out.println("Ingrese la edad del perro: ");
        perro2.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro: ");
        perro2.setTamanio(leer.next());
        System.out.println("Ingrese la raza del perro: ");
        perro2.setRaza(leer.next());
        listaPerros.add(perro1);
        listaPerros.add(perro2);
        for (Perro aux2 : listaPerros) {
            System.out.println(aux2);
        }
        System.out.println("Bienvenido!"+persona1.getNombre()+" Para evitar inconvenientes, la asignación de los perros será al azar.");
        System.out.println("Elija entre el numero 1 y el numero 2: ");
        int opcion = leer.nextInt();
        if(opcion==1){
            persona1.setPerro(perro1);
            persona2.setPerro(perro2);
        }else{
            persona1.setPerro(perro2);
            persona2.setPerro(perro1);
        }
        System.out.println("Felicitaciones a ambos!"+persona1.getNombre()+" se le ha asignado al perro numero 1");
        System.out.println("se llama "+perro1.getNombre()+" y tiene "+perro1.getEdad()+" años.");
        System.out.println("A usted, "+persona2.getNombre()+" se le asigno el perro numero 2 ");
        System.out.println("es un hermoso "+perro2.getRaza()+" y se llama "+perro2.getNombre()+".");
    }
    
}
