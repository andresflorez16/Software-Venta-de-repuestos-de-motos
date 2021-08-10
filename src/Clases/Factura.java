

package Clases;

import java.io.Serializable;

/**
 * 
 * @author ANDREW
 */
public class Factura implements Serializable{
    private Producto p;
    private Cliente c;
    private Fecha f;
    private boolean confirmar;
    
    public Factura(String marca, String nombre, String ID, double precio, int cantidad, 
            String nombre2, String apellido, String correo, String contraseña, String nombreUsuario, String fecha) {
        this.p = new Producto(marca, nombre, ID, precio, cantidad);
        this.c = new Cliente (nombre2, apellido, correo, contraseña, nombreUsuario);
        this.f = new Fecha(fecha);
        this.confirmar = false;
    }

    public boolean isConfirmar() {
        return confirmar;
    }

    public void setConfirmar(boolean confirmar) {
        this.confirmar = confirmar;
    }
    
    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public Fecha getF() {
        return f;
    }

    public void setF(Fecha f) {
        this.f = f;
    }
    
    
}
