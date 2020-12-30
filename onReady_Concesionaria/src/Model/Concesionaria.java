package Model;

import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class Concesionaria {
    private ArrayList<Vehiculo> listaVehiculos;

    //Constructor
    public Concesionaria() {
        listaVehiculos = new ArrayList<>();
    }
    
    //Métodos
    public void agregarVehiculo(Vehiculo nuevo) {
        listaVehiculos.add(nuevo);
        
    }
    
    public void imprimirVehiculos() {
        for (Vehiculo ve : listaVehiculos) {
            System.out.println(ve.toString());
        }
    }
}
