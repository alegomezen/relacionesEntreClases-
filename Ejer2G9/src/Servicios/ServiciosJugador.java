
package Servicios;
import Entidad.Jugador;
import Entidad.Revolver;


public class ServiciosJugador {
    ServiciosRevolver serv1 = new ServiciosRevolver();
    
    public Jugador disparo(Revolver r){
        Jugador jugador1 = new Jugador();
        serv1.mojar(r);
        if(r.getPosicionActual()==r.getPosicionAgua()){
            jugador1.setMojado(true);
        }
        serv1.siguienteChorro(r);

        return jugador1;
    }    
}
