
package Service;
import java.util.Scanner;
import Entidad.Baraja;
import Entidad.Cartas;
import java.util.ArrayList;
import static java.util.Collections.shuffle;
import java.util.Iterator;

public class ServiciosBaraja {
    Scanner leer = new Scanner(System.in);
    ServiciosCarta serv1 = new ServiciosCarta();
    ArrayList<Cartas> mazo = new ArrayList();
    Iterator it = mazo.iterator();
    public Baraja llenarMazo(){       
        Baraja baraja = new Baraja();       
        for (int i = 0; i < 10; i++) {
            mazo.add(serv1.crearCarta());
            baraja.setMazo(mazo);
        }
        mazo.forEach((aux) -> {
            System.out.println(aux);
        });
        
        return baraja;        
    }
    public void barajar(){
        System.out.println("La baraja mezclada tiene el siguiente orden: ");
        shuffle(mazo);
        mazo.forEach((aux) -> {
            System.out.println(aux);
        });              
    }
    public void siguienteCarta(){
        while(it.hasNext()){
            System.out.println(it.next());
            if(it.hasNext()==false){
            System.out.println("No hay mas cartas para mostrar.");
        }
        }
        
    }
    public void cartasDisponibles(){
        darCartas();
        System.out.println("Aun quedan cartas para repartir.");
       
    }
    public void darCartas(){
        int cartas;
        System.out.println("Ingrese el numero de cartas a repartir: ");
        cartas=leer.nextInt();
        System.out.println("Cartas repartidas: ");
        for (int i = 0; i < cartas; i++) {
            System.out.println(mazo.get(i));
        }        
    }
    
    public void cartasMonton(){
        
        
    }
    public void mostrarBaraja(){
        
    }
            
    
}
