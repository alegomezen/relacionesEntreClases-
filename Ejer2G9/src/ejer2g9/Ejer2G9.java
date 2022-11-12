package ejer2g9;
import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.Scanner;
import Servicios.ServiciosJuego;
import Servicios.ServiciosRevolver;
public class Ejer2G9 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosJuego serv1 = new ServiciosJuego();
        ServiciosRevolver serv2 = new ServiciosRevolver();
        serv2.llenarRevolver();
        
        
    }
    
}
