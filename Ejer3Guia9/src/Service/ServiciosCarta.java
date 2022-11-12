
package Service;
import Entidad.Cartas;
import java.util.Scanner;

public class ServiciosCarta {
    Scanner leer = new Scanner(System.in);
    
    public Cartas crearCarta(){
        Cartas carta1 = new Cartas();
        System.out.println("Seleccione el palo de la carta: ");
        carta1.setPalo(leer.next());
        System.out.println("Ahora seleccione el numero de la carta: ");
        carta1.setNumero(leer.nextInt());
        return carta1;
    }
}
