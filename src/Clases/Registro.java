


package Clases;

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
import java.util.ArrayList;

/**
 * 
 * @author ANDREW
 */
public class Registro {
    ArrayList<Cliente> listaCliente;
    ArrayList<Admin> listaAdmin;
    ArrayList<Proveedor> listaProveedor;
    ArrayList<Producto> listaProducto;
    
    File fileCliente;
    File fileProveedor;
    File fileAdmin;
    File fileProducto;

    public Registro() {
        listaCliente = new ArrayList<>();
        listaAdmin = new ArrayList<>();
        listaProveedor = new ArrayList<>();
        listaProducto = new ArrayList<>();
        
        fileCliente = new File("infoCliente.txt");
        fileAdmin = new File("infoAdmin.txt");
        fileProveedor = new File("infoProveedor.txt");
        fileProducto = new File("infoProductos.txt");   
        
        if(!fileCliente.exists()){
            try{
                fileCliente.createNewFile();
            } catch(IOException ex){
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(fileCliente.length() != 0){
            loadCliente(fileCliente);
        }
        
        if(!fileProveedor.exists()){
            try{
                fileProveedor.createNewFile();
            } catch(IOException ex){
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(fileProveedor.length() != 0){
            loadProveedor(fileProveedor);
        }
        
        if(!fileAdmin.exists()){
            try{
                fileAdmin.createNewFile();
            } catch(IOException ex){
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(fileAdmin.length() != 0){
            loadAdmin(fileAdmin);
        }
        
        if(!fileProducto.exists()){
            try{
                fileProducto.createNewFile();
            } catch(IOException ex){
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(fileProducto.length() != 0){
            loadProducto(fileProducto);
        }
    }
    
    public void saveProducto(File fileProducto){
        try{    
        FileOutputStream fos = new FileOutputStream(fileProducto);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(listaProducto);
            out.close();
            fos.close();
        } catch(FileNotFoundException ex){System.out.println("FileNotFoundException");}
           catch(IOException ex){System.out.println("InputException");}  
    }
    
    public void loadProducto(File fileProducto){
        try{
            FileInputStream fis = new FileInputStream(fileProducto);
                ObjectInputStream in = new ObjectInputStream(fis);
                listaProducto = (ArrayList<Producto>)in.readObject();
                in.close();
                fis.close();
            } catch(FileNotFoundException ex){ System.out.println("FileNotFoundException"); }
               catch(IOException ex){System.out.println("OutputException");} 
                catch(ClassNotFoundException ex){System.out.println("ClassNotFoundException");}
    }
    
    public void saveCliente(File fileCliente){
        try{    
        FileOutputStream fos = new FileOutputStream(fileCliente);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(listaCliente);
            out.close();
            fos.close();
        } catch(FileNotFoundException ex){System.out.println("FileNotFoundException");}
           catch(IOException ex){System.out.println("InputException");}  
    }
    public void loadCliente(File fileCliente){
        try{

            FileInputStream fis = new FileInputStream(fileCliente);
                ObjectInputStream in = new ObjectInputStream(fis);
                listaCliente = (ArrayList<Cliente>)in.readObject();
                in.close();
                fis.close();
            } catch(FileNotFoundException ex){ System.out.println("FileNotFoundException"); }
               catch(IOException ex){System.out.println("OutputException");} 
                catch(ClassNotFoundException ex){System.out.println("ClassNotFoundException");}
    }
    public void saveProveedor(File fileProveedor){
        try{    
        FileOutputStream fos = new FileOutputStream(fileProveedor);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(listaProveedor);
            out.close();
            fos.close();
        } catch(FileNotFoundException ex){System.out.println("FileNotFoundException");}
           catch(IOException ex){System.out.println("InputException");}  
    }
    public void loadProveedor(File fileProveedor){
        try{

            FileInputStream fis = new FileInputStream(fileProveedor);
                ObjectInputStream in = new ObjectInputStream(fis);
                listaProveedor = (ArrayList<Proveedor>)in.readObject();
                in.close();
                fis.close();
            } catch(FileNotFoundException ex){ System.out.println("FileNotFoundException"); }
               catch(IOException ex){System.out.println("OutputException");} 
                catch(ClassNotFoundException ex){System.out.println("ClassNotFoundException");}
    }
    public void saveAdmin(File fileAdmin){
        try{    
        FileOutputStream fos = new FileOutputStream(fileAdmin);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(listaProveedor);
            out.close();
            fos.close();
        } catch(FileNotFoundException ex){System.out.println("FileNotFoundException");}
           catch(IOException ex){System.out.println("InputException");}  
    }
    public void loadAdmin(File fileAdmin){
        try{

            FileInputStream fis = new FileInputStream(fileAdmin);
                ObjectInputStream in = new ObjectInputStream(fis);
                listaAdmin = (ArrayList<Admin>)in.readObject();
                in.close();
                fis.close();
            } catch(FileNotFoundException ex){ System.out.println("FileNotFoundException"); }
               catch(IOException ex){System.out.println("OutputException");} 
                catch(ClassNotFoundException ex){System.out.println("ClassNotFoundException");}
    }
    //Método para añadir product
    public void addProducto(Producto pr){
        listaProducto.add(pr);
        saveProducto(fileProducto);
    }
    // buscar product
    public int buscarProduct(String id){
        for(int i = 0; i < listaProducto.size(); i++){
            if(listaProducto.get(i).getID().equals(id)){
                return i;
            }
        }
        return -1;
    }
    // modificar product
    public void editProduct(int pos, Producto p){
        listaProducto.remove(pos);
        listaProducto.add(pos, p);
        saveProducto(this.fileProducto);
    }
    //Eliminar product
    public void eliminarProduct(int pos){
        listaProducto.remove(pos);
        saveProducto(this.fileProducto);
    }
    
    //Métodos para añadir usuarios
    public void addCliente(Cliente c){
        int pos = buscarCliente(c.getNombreUsuario());
        int pos2 = buscarClienteCorreo(c.getCorreo());
        if(pos == -1 && pos2 == -1){
            listaCliente.add(c);
            saveCliente(fileCliente);
            for(int j = 0; j < listaCliente.size(); j++){
                System.out.println(listaCliente.get(j).getNombreUsuario());
            }
            JOptionPane.showMessageDialog(null, "Cliente registrado con éxito!");
        }else{
            JOptionPane.showMessageDialog(null, "El usuario ya existe");
        }
    }
    public void addProveedor(Proveedor p){
        int pos = buscarProveedor(p.getNombreUsuario());
        int pos2 = buscarProveedorCorreo(p.getCorreo());
        if(pos == -1 && pos2 == -1){
            listaProveedor.add(p);
            saveProveedor(fileProveedor);
            for(int j = 0; j < listaProveedor.size(); j++){
                System.out.println(listaProveedor.get(j).getNombreUsuario());
            }
            JOptionPane.showMessageDialog(null, "Proveedor registrado con éxito!");
        }else{
            JOptionPane.showMessageDialog(null, "El usuario ya existe");
        }
        
    }
    public void addAdmin(Admin a){
        listaAdmin.add(a);
        saveAdmin(fileAdmin);
    }
    //Métodos para buscar por nombreUsuario
    public int buscarCliente(String nombreUser){
        for(int i = 0; i < listaCliente.size(); i++){
            if(listaCliente.get(i).getNombreUsuario().equals(nombreUser)){
                return i;
            }
        }
        return -1;
    }
    public int buscarProveedor(String nombreUser){
        for(int i = 0; i < listaProveedor.size(); i++){
            if(listaProveedor.get(i).getNombreUsuario().equals(nombreUser)){
                return i;
            }
        }
        return -1;
    }
    //Método para buscar por contraseña
    public int buscarClienteC(String contra){
        for(int i = 0; i < listaCliente.size(); i++){
            if(listaCliente.get(i).getContraseña().equals(contra)){
                return i;
            }
        }
        return -1;
    }
    public int buscarProveedorC(String contra){
        for(int i = 0; i < listaProveedor.size(); i++){
            if(listaProveedor.get(i).getContraseña().equals(contra)){
                return i;
            }
        }
        return -1;
    }
    // Método para buscar por correo
    public int buscarClienteCorreo(String correo){
        for(int i = 0; i < listaCliente.size(); i++){
            if(listaCliente.get(i).getCorreo().equals(correo)){
                return i;
            }
        }
        return -1;
    }
    public int buscarProveedorCorreo(String correo){
        for(int i = 0; i < listaProveedor.size(); i++){
            if(listaProveedor.get(i).getCorreo().equals(correo)){
                return i;
            }
        }
        return -1;
    }
    
    
    
    
}
