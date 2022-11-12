
package ejerjugadorguia9;
import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;

public class EjerJugadorGuia9 {

   
    public static void main(String[] args) {
       Jugador jugador1 = new Jugador();
       Jugador jugador2 = new Jugador();
       Jugador jugador3 = new Jugador();
       Jugador jugador4 = new Jugador();
       Equipo listaEquipo = new Equipo();
       jugador1.setNombre("Ale");
       jugador1.setApellido("G.E");
       jugador1.setPosicion(4);
       jugador2.setNombre("Juan");
       jugador2.setApellido("Perez");
       jugador2.setPosicion(3);
       jugador3.setNombre("Rocky");
       jugador3.setApellido("G.E");
       jugador3.setPosicion(2);
       jugador4.setNombre("Jose");
       jugador4.setApellido("Mc");
       jugador4.setPosicion(1);
       ArrayList<Jugador> lista = new ArrayList();
       lista.add(jugador1);
       lista.add(jugador2);
       lista.add(jugador3);
       lista.add(jugador4);
      // lista.forEach((jugador) -> {
       //    System.out.println(jugador);
       // });
       listaEquipo.setListaEquipo(lista);
       // for (Jugador aux : lista) {
       //     System.out.println(aux);
      //  }
        System.out.println(listaEquipo.getListaEquipo());
    }
    
}
