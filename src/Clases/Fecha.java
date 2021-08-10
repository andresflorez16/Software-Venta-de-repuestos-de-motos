

package Clases;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 * 
 * @author ANDREW
 */
public class Fecha implements Serializable {
    private String fecha;

    public Fecha() {
    }

    public Fecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
