

package Clases;

import java.io.Serializable;

/**
 * 
 * @author ANDREW
 */
public class Proveedor extends Persona implements Serializable{
    private String marca, tipo;
    private int cantidad;
    private double precio;

    public Proveedor(String marca, String tipo, int cantidad, double precio, String nombre, String apellido, String correo, String contraseña, String nombreUsuario) {
        super(nombre, apellido, correo, contraseña, nombreUsuario);
        this.marca = marca;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Proveedor(String nombre, String apellido, String correo, String contraseña, String nombreUsuario) {
        super(nombre, apellido, correo, contraseña, nombreUsuario);
    }
    
}
