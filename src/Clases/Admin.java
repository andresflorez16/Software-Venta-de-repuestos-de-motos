
package Clases;

import java.io.Serializable;

/**
 * 
 * @author ANDREW
 */
public class Admin extends Persona implements Serializable{

    public Admin(String nombre, String apellido, String correo, String contraseña, String nombreUsuario) {
        super(nombre, apellido, correo, contraseña, nombreUsuario);
    }
    
}
