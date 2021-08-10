

package Clases;

import java.io.Serializable;

/**
 * 
 * @author ANDREW
 */
public class Producto implements Serializable{
    private String marca, nombre, ID;
    private double precio;
    private boolean verificar;
    private int cantidad;
    
    public Producto() {
    }

    public Producto(String marca, String nombre, String ID, double precio, int cantidad) {
        this.marca = marca;
        this.nombre = nombre;
        this.ID = ID;
        this.precio = precio;
        this.verificar = false;
        this.cantidad = cantidad;
    }

    public boolean isVerificar() {
        return verificar;
    }

    public void setVerificar(boolean verificar) {
        this.verificar = verificar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
