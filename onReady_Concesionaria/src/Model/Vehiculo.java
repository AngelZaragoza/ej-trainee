package Model;

/**
 *
 * @author Angel
 */
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;

    //Constructores
    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
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

    public float getPrecio() {
        return precio;        
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public String getMarcaYModelo() {
        return marca + " " + modelo;
    }
    
    public String getPrecioConFormato() {
        return "$" + String.format("%.2f", precio);
    }

    @Override
    public String toString() {
        String info = "";
        info += "Marca: " + marca + " // ";
        info += "Modelo: " + modelo + " // ";
        return info;
    }
    
    
}
