package Model;

import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class Concesionaria {
    private ArrayList<Vehiculo> listaVehiculos;

    //Constructor
    public Concesionaria(ArrayList<Vehiculo> listaVehiculos) {
        listaVehiculos = new ArrayList<>();
    }
    
    //Métodos
    public void agregarVehiculo(Vehiculo nuevo) {
        listaVehiculos.add(nuevo);
        
    }
}
