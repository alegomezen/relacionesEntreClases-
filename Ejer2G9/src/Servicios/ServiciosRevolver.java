
package Servicios;
import Entidad.Revolver;

public class ServiciosRevolver {
    public Revolver llenarRevolver(){
        Revolver revolver = new Revolver();
        revolver.setPosicionActual((int)(Math.random()*6));
        revolver.setPosicionAgua((int)(Math.random()*6));
        return revolver;
    }
    public boolean mojar(Revolver revolver){
        boolean prueba=false;
        if (revolver.getPosicionActual()==revolver.getPosicionAgua()){
            prueba=true;           
        }
        return prueba;
    }
    public void siguienteChorro(Revolver revolver){
        int nuevaPosicion;
        nuevaPosicion=revolver.getPosicionActual()+1;
        revolver.setPosicionActual(nuevaPosicion);
    }
    public void mostrar(Revolver revolver){
        revolver.toString();
    }
}
