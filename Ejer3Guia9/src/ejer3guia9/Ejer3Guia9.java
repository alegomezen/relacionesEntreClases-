
package ejer3guia9;
import Service.ServiciosBaraja;
import Service.ServiciosCarta;
import Entidad.Baraja;
import Entidad.Cartas;

public class Ejer3Guia9 {

    public static void main(String[] args) {
        ServiciosBaraja serv1 = new ServiciosBaraja();
        serv1.llenarMazo();
        serv1.barajar();       
        serv1.darCartas();
        serv1.siguienteCarta();
        
    }
    
}
