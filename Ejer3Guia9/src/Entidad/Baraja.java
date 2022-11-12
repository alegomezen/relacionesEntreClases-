
package Entidad;
import java.util.ArrayList;
public class Baraja {
    private ArrayList<Cartas> mazo;

    public Baraja() {
    }

    public Baraja(ArrayList<Cartas> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Cartas> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Cartas> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + '}';
    }
    
    
}
