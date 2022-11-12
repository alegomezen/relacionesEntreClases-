
package Servicios;
import Entidad.Juego;
import java.util.ArrayList;
import Entidad.Jugador;
import Entidad.Revolver;


public class ServiciosJuego {
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
      Juego juego1 = new Juego();
      juego1.setJugadores(jugadores);
      juego1.setRevolver(r);
      
    }
    public void ronda(){
        //Tengo que hacer un bucle do while y que juegen hasta que mojar devuelva true 
        
    }
}
