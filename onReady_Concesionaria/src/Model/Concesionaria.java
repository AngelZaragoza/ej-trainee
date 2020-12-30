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
}
