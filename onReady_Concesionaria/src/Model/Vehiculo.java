package Model;

/**
 *
 * @author Angel
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int puertas;
    private float precio;

    //Constructores
    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int puertas, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.precio = precio;
    }
    
    //Getters y Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String info = "";
        info += "Marca: " + marca + " // ";
        info += "Modelo: " + modelo + " // ";
        info += "Puertas: " + puertas + " // ";
        info += "Precio: " + precio;
        return info;
    }
    
    
}
