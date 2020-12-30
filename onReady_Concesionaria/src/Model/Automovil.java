package Model;

/**
 *
 * @author Angel
 */
public class Automovil extends Vehiculo {
    private int puertas;

    //Constructores
    public Automovil() {
        super();
    }

    public Automovil(String marca, String modelo, int puertas, float precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    //Getters y Setters
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        String info = super.toString();        
        info += "Puertas: " + puertas + " // ";
        info += "Precio: " + super.getPrecioConFormato();
        return info;
    }   
    
}
