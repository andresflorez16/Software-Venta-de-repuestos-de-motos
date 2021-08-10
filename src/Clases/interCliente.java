/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANDREW
 */
public class interCliente extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    
    public static DefaultTableModel modelo;
    FondoP fondo = new FondoP();
    Registro registro = new Registro();
    public interCliente() {
        this.setContentPane(fondo);
        initComponents();
        modelo = (DefaultTableModel) Tabla.getModel();
        load();
        setLocationRelativeTo(null);
        backgroundLabels();
        chart.setVisible(false);
        cerrar.setVisible(false);
        hola.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new FondoP();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        iniSesion = new javax.swing.JButton();
        filtrar = new javax.swing.JButton();
        title2 = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        hola = new javax.swing.JLabel();
        chart = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        marcas = new javax.swing.JComboBox<>();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MARCA", "TIPO", "ID", "PRECIO", "CANTIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setRowHeight(30);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        title.setBackground(new java.awt.Color(255, 0, 0));
        title.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Productos");
        title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        title1.setBackground(new java.awt.Color(255, 0, 0));
        title1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("MOTOS S.A.S");
        title1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        iniSesion.setBackground(new java.awt.Color(255, 255, 255));
        iniSesion.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        iniSesion.setForeground(new java.awt.Color(0, 255, 0));
        iniSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar-sesion.png"))); // NOI18N
        iniSesion.setText("Iniciar sesión");
        iniSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniSesionActionPerformed(evt);
            }
        });

        filtrar.setBackground(new java.awt.Color(255, 255, 255));
        filtrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        filtrar.setForeground(new java.awt.Color(0, 0, 0));
        filtrar.setText("Filtrar");
        filtrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarActionPerformed(evt);
            }
        });

        title2.setBackground(new java.awt.Color(255, 0, 0));
        title2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 255, 255));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Filtrar búsqueda");
        title2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 0, 0));
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        cerrar.setText("Salir");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        user.setForeground(new java.awt.Color(255, 0, 0));

        hola.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        hola.setForeground(new java.awt.Color(255, 0, 0));
        hola.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hola.setText("Hola");

        chart.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        chart.setForeground(new java.awt.Color(0, 153, 255));
        chart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito-de-compras.png"))); // NOI18N
        chart.setText("Carrito");
        chart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MARCAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setName(""); // NOI18N

        marcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODO", "YAMAHA", "SUZUKI", "HARLEY", "AKT", "KAWASAKI", "HONDA" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(marcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(marcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(chart))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(hola, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)))
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iniSesion)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iniSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hola, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chart)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniSesionActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new interLogin().setVisible(true);
        iniSesion.setVisible(false);
    }//GEN-LAST:event_iniSesionActionPerformed

    public void backgroundLabels(){
        title.setOpaque(true);
        title1.setOpaque(true);
        title2.setOpaque(true);
    }    
    
    private void filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarActionPerformed
        // TODO add your handling code here:
       if(marcas.getSelectedItem().toString().equals("TODO")){
           load();
       }else if(marcas.getSelectedItem().toString().equals("YAMAHA")){
           filtrarMarca("YAMAHA");
       }else if(marcas.getSelectedItem().toString().equals("SUZUKI")){
           filtrarMarca("SUZUKI");
       }else if(marcas.getSelectedItem().toString().equals("HARLEY")){
           filtrarMarca("HARLEY");
       }else if(marcas.getSelectedItem().toString().equals("AKT")){
           filtrarMarca("AKT");
       }else if(marcas.getSelectedItem().toString().equals("KAWASAKI")){
           filtrarMarca("KAWASAKI");
       }else if(marcas.getSelectedItem().toString().equals("HONDA")){
           filtrarMarca("HONDA");
       }
    }//GEN-LAST:event_filtrarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        int selection =  Tabla.rowAtPoint(evt.getPoint());
        new interItem().setVisible(true);
        interItem.MARCA.setText(String.valueOf(Tabla.getValueAt(selection, 0)));
        interItem.TIPO.setText(String.valueOf(Tabla.getValueAt(selection, 1)));
        interItem.REFE.setText(String.valueOf(Tabla.getValueAt(selection, 2)));
        interItem.PRECIO.setText(String.valueOf(Tabla.getValueAt(selection, 3)));
        interItem.DISPONIBLE.setText("DISPONIBLES: "+String.valueOf(Tabla.getValueAt(selection, 4)));
        if(interItem.TIPO.getText().equals("RUEDA")){
            ImageIcon rueda = new ImageIcon(getClass().getResource("/img/rueda.png"));
            ImageIcon icono = new ImageIcon(rueda.getImage().getScaledInstance(interItem.item.getWidth(), interItem.item.getHeight(), Image.SCALE_DEFAULT));
            interItem.item.setIcon(icono);
        }else if(interItem.TIPO.getText().equals("RIN")){
            ImageIcon rueda = new ImageIcon(getClass().getResource("/img/rin.jpg"));
            ImageIcon icono = new ImageIcon(rueda.getImage().getScaledInstance(interItem.item.getWidth(), interItem.item.getHeight(), Image.SCALE_DEFAULT));
            interItem.item.setIcon(icono);
        }else if(interItem.TIPO.getText().equals("CADENA")){
            ImageIcon rueda = new ImageIcon(getClass().getResource("/img/cadena.jpg"));
            ImageIcon icono = new ImageIcon(rueda.getImage().getScaledInstance(interItem.item.getWidth(), interItem.item.getHeight(), Image.SCALE_DEFAULT));
            interItem.item.setIcon(icono);
        }else if(interItem.TIPO.getText().equals("BUJÍA")){
            ImageIcon rueda = new ImageIcon(getClass().getResource("/img/bujia.jpg"));
            ImageIcon icono = new ImageIcon(rueda.getImage().getScaledInstance(interItem.item.getWidth(), interItem.item.getHeight(), Image.SCALE_DEFAULT));
            interItem.item.setIcon(icono);
        }else if(interItem.TIPO.getText().equals("CHASIS")){
            ImageIcon rueda = new ImageIcon(getClass().getResource("/img/chasis.jpg"));
            ImageIcon icono = new ImageIcon(rueda.getImage().getScaledInstance(interItem.item.getWidth(), interItem.item.getHeight(), Image.SCALE_DEFAULT));
            interItem.item.setIcon(icono);
        }else if(interItem.TIPO.getText().equals("FAROL")){
            ImageIcon rueda = new ImageIcon(getClass().getResource("/img/farol.jpeg"));
            ImageIcon icono = new ImageIcon(rueda.getImage().getScaledInstance(interItem.item.getWidth(), interItem.item.getHeight(), Image.SCALE_DEFAULT));
            interItem.item.setIcon(icono);
        }
        ImageIcon rueda = new ImageIcon(getClass().getResource("/img/cart.png"));
        ImageIcon icono = new ImageIcon(rueda.getImage().getScaledInstance(interItem.iconoCarrito.getWidth(), interItem.iconoCarrito.getHeight(), Image.SCALE_DEFAULT));
        interItem.iconoCarrito.setIcon(icono);
        
    }//GEN-LAST:event_TablaMouseClicked

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        interCarrito.list.removeAll(interCarrito.list);
        this.dispose();
        new interCliente().setVisible(true);
    }//GEN-LAST:event_cerrarActionPerformed

    private void chartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new interCarrito().setVisible(true);
    }//GEN-LAST:event_chartActionPerformed
    
    public void filtrarMarca(String mar){
        int j = 0;
        if(modelo.getRowCount() != 0){
            while(j != -1){
                try{
                    modelo.removeRow(modelo.getRowCount() - 1);
                }catch(Exception e){
                    j = -1;
                }
            }
        }
        try{
            for(int i = 0; i < registro.listaProducto.size(); i++){
                if(registro.listaProducto.get(i).getMarca().equals(mar) && registro.listaProducto.get(i).isVerificar() && registro.listaProducto.get(i).getCantidad() > 0){
                    String marca = registro.listaProducto.get(i).getMarca();
                    String nombre = registro.listaProducto.get(i).getNombre();
                    String ID = registro.listaProducto.get(i).getID();
                    String precio = String.valueOf(registro.listaProducto.get(i).getPrecio());
                    String cantidad = String.valueOf(registro.listaProducto.get(i).getCantidad());
                    String [] obj = {marca, nombre, ID, precio, cantidad};

                    modelo.addRow(obj);
                    
                }
                //System.out.println(registro.listaProducto.get(i).getMarca());
            }
        }catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }
    
    public void load(){
//        Producto p = new Producto("AKT", "CHASIS", "CH123",  1561, 2);
        //registro.addProducto(p);
        int j = 0;
        if(modelo.getRowCount() != 0){
            while(j != -1){
                try{
                    modelo.removeRow(modelo.getRowCount() - 1);
                }catch(Exception e){
                    j = -1;
                }
            }
        }
        try{
            for(int i = 0; i < registro.listaProducto.size(); i++){
                if(registro.listaProducto.get(i).isVerificar() && registro.listaProducto.get(i).getCantidad() > 0){
                    String marca = registro.listaProducto.get(i).getMarca();
                    String nombre = registro.listaProducto.get(i).getNombre();
                    String ID = registro.listaProducto.get(i).getID();
                    String precio = String.valueOf(registro.listaProducto.get(i).getPrecio());
                    String cantidad = String.valueOf(registro.listaProducto.get(i).getCantidad());
                    String [] obj = {marca, nombre, ID, precio, cantidad};

                    modelo.addRow(obj);
                }
                //System.out.println(registro.listaProducto.get(i).getMarca());
            }
        }catch(Exception e){
            System.out.println("Error: "+ e);
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JButton cerrar;
    public static javax.swing.JButton chart;
    private javax.swing.JButton filtrar;
    public static javax.swing.JLabel hola;
    public static javax.swing.JButton iniSesion;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> marcas;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    public static javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
    class FondoP extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/img/motota.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
            
        }
    }
}