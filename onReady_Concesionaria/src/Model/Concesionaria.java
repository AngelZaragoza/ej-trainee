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

    public String vehiculoMasCaro() {
        String masCaro = "No hay Vehiculos cargados";
        if (listaVehiculos.size() > 0) {
            float mayor = 0;
            for (Vehiculo ve : listaVehiculos) {
                if (ve.getPrecio() > mayor) {
                    mayor = ve.getPrecio();
                    masCaro = ve.getMarcaYModelo();
                }
            }
        }

        return masCaro;
    }

    public String vehiculoMasBarato() {
        float menor;
        String masBarato = "No hay Vehiculos cargados";
        if (listaVehiculos.size() > 0) {
            menor = listaVehiculos.get(0).getPrecio();
            masBarato = listaVehiculos.get(0).getMarcaYModelo();
        } else {
            return masBarato;
        }

        for (Vehiculo ve : listaVehiculos) {
            if (ve.getPrecio() < menor) {
                menor = ve.getPrecio();
                masBarato = ve.getMarcaYModelo();
            }
        }

        return masBarato;
    }

    public int buscarCaracter(char buscar) {
        int item = -1;
        int elem = listaVehiculos.size();
        if (elem > 0) {
            //Buscar coincidencia de caracter y devolver posición en la lista
            for (int i = 0; i < elem; i++) {
                if (listaVehiculos.get(i).getModelo().indexOf(buscar + "") != -1) {
                    item = i;
                    break;
                }
            }            
        }

        return item;
    }
    
    public String modeloConLetra (char buscar) {
        String result = "No hay coincidencias";
        int pos = buscarCaracter(buscar);
        
        //Si se encuentra coincidencia, usa el indice obtenido para devolver datos
        if (pos != -1) {            
            result = listaVehiculos.get(pos).getMarcaYModelo() + " ";            
            result += listaVehiculos.get(pos).getPrecioConFormato();
        }
        
        return result;
    }
}
