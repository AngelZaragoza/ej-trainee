package Main;

import Model.*;
/**
 *
 * @author Angel
 */
public class OnReady_Concesionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Inicializar Concesionaria y cargar Vehiculos
        Concesionaria conc = new Concesionaria();
        conc.agregarVehiculo(new Automovil("Peugeot","206",4,200000f));
        conc.agregarVehiculo(new Motocicleta("Honda","Titan",125,60000f));
        conc.agregarVehiculo(new Automovil("Peugeot","208",5,250000f));
        conc.agregarVehiculo(new Motocicleta("Yamaha","YBR",160,80500.5f));
        
        conc.imprimirVehiculos();

    }
    
}
