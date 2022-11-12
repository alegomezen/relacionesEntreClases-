
package Entidad;
import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> listaEquipo;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    public ArrayList<Jugador> getListaEquipo() {
        return listaEquipo;
    }

    public void setListaEquipo(ArrayList<Jugador> listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    @Override
    public String toString() {
        return "Equipo{" + "listaEquipo=" + listaEquipo + '}';
    }
    
}
