

package Clases;

import java.io.Serializable;

/**
 * 
 * @author ANDREW
 */
public class Cliente extends Persona implements Serializable {
    private String direccion;
    private long telefono;

    public Cliente(String nombre, String apellido, String correo, String contraseña, String nombreUsuario) {
        super(nombre, apellido, correo, contraseña, nombreUsuario);
    }
    
    
    public Cliente(String direccion, long telefono, String nombre, String apellido, String correo, String contraseña, String nombreUsuario) {
        super(nombre, apellido, correo, contraseña, nombreUsuario);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    
    
    
    
    
}
