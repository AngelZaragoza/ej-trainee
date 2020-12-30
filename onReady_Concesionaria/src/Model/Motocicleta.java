package Model;

/**
 *
 * @author Angel
 */
public class Motocicleta extends Vehiculo {
    private int cilindrada;
    
    //Constructores

    public Motocicleta() {
        super();
    }

    public Motocicleta(String marca, String modelo, int cilindrada, float precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    
    //Getters y Setters

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        String info = super.toString();        
        info += "Cilindrada: " + cilindrada + "cc // ";
        info += "Precio: $" +  String.format("%.2f", super.getPrecio());
        return info;        
    }
    
    
}
