
package Clases;

import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * 
 * @author ANDREW
 */
public class Compra implements Serializable{
    ArrayList<Factura> lista;
    Producto p;
    File facturas;
    Registro r;

    public Compra() {
        lista = new ArrayList<>();
        facturas = new File("facturas.txt");
        
        if(!facturas.exists()){
            try{
                facturas.createNewFile();
            } catch(IOException ex){
                Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(facturas.length() != 0){
            loadFactura(facturas);
        }
    }
    public void saveFactura(File facturas){
        try{    
        FileOutputStream fos = new FileOutputStream(facturas);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(lista);
            out.close();
            fos.close();
        } catch(FileNotFoundException ex){System.out.println("FileNotFoundException");}
           catch(IOException ex){System.out.println("InputException");}  
    }
    public void loadFactura(File facturas){
        try{
            FileInputStream fis = new FileInputStream(facturas);
                ObjectInputStream in = new ObjectInputStream(fis);
                lista = (ArrayList<Factura>)in.readObject();
                in.close();
                fis.close();
            } catch(FileNotFoundException ex){ System.out.println("FileNotFoundException"); }
               catch(IOException ex){System.out.println("OutputException");} 
                catch(ClassNotFoundException ex){System.out.println("ClassNotFoundException");} 
    }
    
    public void addFactura(Factura f){
        lista.add(f);
        saveFactura(facturas);
    }
    
    public int buscarCompra(String id){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getP().getID().equals(id)){
                return i;
            }
        }
        return -1;
    }
    public int buscarCompra(String refe, String id){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getP().getID().equals(refe) && lista.get(i).getC().getNombreUsuario().equals(id)){
                return i;
            }
        }
        return -1;
    }
    public void actualizarProduct(){
        for(int i = 0; i < lista.size(); i++){
            String marca = lista.get(i).getP().getMarca();
            String tipo = lista.get(i).getP().getNombre();
            String refe = lista.get(i).getP().getID();
            Double precio = lista.get(i).getP().getPrecio();
            int canti = lista.get(i).getP().getCantidad();
            
            p = new Producto(marca, tipo, refe, precio, canti);
            p.setVerificar(true);
            r.editProduct(i, p); 
        }
    }
    public void editCompra(int pos, Factura f){
        lista.remove(pos);
        lista.add(pos, f);
        saveFactura(this.facturas);
    }
    public void eliminarCompra(int pos){
        lista.remove(pos);
        saveFactura(this.facturas);
    }
    
}
