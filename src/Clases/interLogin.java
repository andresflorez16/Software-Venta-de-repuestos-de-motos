/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ANDREW
 */
public class interLogin extends javax.swing.JFrame {

    /**
     * Creates new form interLogin
     */
    FondoPanel fondo = new FondoPanel();
    FondoMarcas marca = new FondoMarcas();
    Registro registro;
    public interLogin() {
        this.setContentPane(fondo);
        this.setContentPane(marca);
        initComponents();
        backgrounds();
        setLocationRelativeTo(null);   
        registro = new Registro();
        userInco.setOpaque(true);
        contraInco.setOpaque(true);
        userInco.setVisible(false);
        contraInco.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jPanel2 = new FondoMarcas();
        title1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreUser = new javax.swing.JTextField();
        contraLabel = new javax.swing.JPasswordField();
        Iniciar = new javax.swing.JButton();
        tipoUser = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Registrarse = new javax.swing.JLabel();
        userInco = new javax.swing.JLabel();
        contraInco = new javax.swing.JLabel();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(260, 100));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));

        title1.setBackground(new java.awt.Color(255, 0, 0));
        title1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("BIENVENIDO");
        title1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE DE USUARIO");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTRASEÑA");

        nombreUser.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        nombreUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        contraLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        contraLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        contraLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraLabelActionPerformed(evt);
            }
        });

        Iniciar.setBackground(new java.awt.Color(255, 255, 255));
        Iniciar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Iniciar.setForeground(new java.awt.Color(0, 0, 0));
        Iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar-sesion.png"))); // NOI18N
        Iniciar.setText("Iniciar sesión");
        Iniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IniciarMouseExited(evt);
            }
        });
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        tipoUser.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        tipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Proveedor", "Administrador" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TIPO DE USUARIO");

        Registrarse.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(255, 255, 255));
        Registrarse.setText("Registrarse");
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarseMouseExited(evt);
            }
        });

        userInco.setBackground(new java.awt.Color(255, 0, 0));
        userInco.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        userInco.setForeground(new java.awt.Color(255, 255, 255));
        userInco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userInco.setText("Usuario incorrecto");
        userInco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        contraInco.setBackground(new java.awt.Color(255, 0, 0));
        contraInco.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        contraInco.setForeground(new java.awt.Color(255, 255, 255));
        contraInco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contraInco.setText("Contraseña incorrecta");
        contraInco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Registrarse)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(contraInco, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Iniciar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userInco, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userInco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraInco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrarse)
                    .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        salir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        salir.setText("Volver");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 562, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salir)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void backgrounds(){
        title1.setOpaque(true);
    }
    
    private void contraLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraLabelActionPerformed

    public void setColor(JLabel p){
        p.setForeground(new Color(50, 168, 164));
    }
    public void setColorB(JButton b){
        b.setBackground(new Color(50, 168, 164));
    }
    public void resetColorB(JButton b){
        b.setBackground(new Color(255, 255, 255));
    }
    public void setColorB2(JButton b){
        b.setBackground(new Color(255, 0, 0));
        b.setForeground(Color.WHITE);
    }
    public void resetColorB2(JButton b){
        b.setBackground(new Color(255, 255, 255));
        b.setForeground(Color.BLACK);
    }
    public void resetColor(JLabel p){
        p.setForeground(new Color(255, 255, 255));
    }
    
    private void RegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseEntered
        // TODO add your handling code here:
        setColor(Registrarse);
    }//GEN-LAST:event_RegistrarseMouseEntered

    private void RegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseExited
        // TODO add your handling code here:
        resetColor(Registrarse);
    }//GEN-LAST:event_RegistrarseMouseExited

    private void IniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseEntered
        // TODO add your handling code here:
        setColorB(Iniciar);
    }//GEN-LAST:event_IniciarMouseEntered

    private void IniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseExited
        // TODO add your handling code here:
        resetColorB(Iniciar);
    }//GEN-LAST:event_IniciarMouseExited

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new interRegistro().setVisible(true);
    }//GEN-LAST:event_RegistrarseMouseClicked

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        // TODO add your handling code here:
        String contra = "";
        char [] contraChar = contraLabel.getPassword();
        for(int i = 0; i < contraChar.length; i++){
            contra += contraChar[i];
        }
        
        try{
            if(tipoUser.getSelectedItem().toString().equals("Cliente")){
                if(!nombreUser.getText().equals("") && !contra.equals("")){
                    int pos = registro.buscarCliente(nombreUser.getText());
                    int pos2 = registro.buscarClienteC(contra);
                    if(pos != -1 && pos2 != -1){
                        userInco.setVisible(false);
                        contraInco.setVisible(false);
                        this.dispose();
                        new interCliente().setVisible(true);
                        interCliente.iniSesion.setVisible(false);
                        interCliente.cerrar.setVisible(true);
                        interCliente.hola.setVisible(true);
                        interCliente.user.setText(nombreUser.getText());
//                        interCliente.chart.setVisible(true);
                    }else if(pos == -1 && pos2 != -1){
                        contraInco.setVisible(false);
                        userInco.setVisible(true);
                    }else if(pos != -1 && pos2 == -1){
                        userInco.setVisible(false);
                        contraInco.setVisible(true);
                    }else{
                        userInco.setVisible(true);
                        contraInco.setVisible(true);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Faltan datos");
                }
            }else if(tipoUser.getSelectedItem().toString().equals("Proveedor")){
                if(!nombreUser.getText().equals("") && !contra.equals("")){
                    int pos = registro.buscarProveedor(nombreUser.getText()); 
                    int pos2 = registro.buscarProveedorC(contra);
                    if(pos != -1 && pos2 != -1){
                        userInco.setVisible(false);
                        contraInco.setVisible(false);
                        JOptionPane.showMessageDialog(this, "Bienvenido proveedor");
                        this.dispose();
                        new interMenuProveedor().setVisible(true);
                    }else if(pos == -1 && pos2 != -1){
                        contraInco.setVisible(false);
                        userInco.setVisible(true);
                    }else if(pos != -1 && pos2 == -1){
                        userInco.setVisible(false);
                        contraInco.setVisible(true);
                    }else{
                        userInco.setVisible(true);
                        contraInco.setVisible(true);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Faltan datos");
                }
            }else{
                if(nombreUser.getText().equals("Admin") && contra.equals("admin1")){
                    userInco.setVisible(false);
                    contraInco.setVisible(false);
                    JOptionPane.showMessageDialog(this, "Bienvenido otra vez Andrew");
                    this.dispose();
                    new interAdmin().setVisible(true);
                }else if(!nombreUser.getText().equals("Admin") && contra.equals("admin1")){
                    contraInco.setVisible(false);
                    userInco.setVisible(true);
                }else if(nombreUser.getText().equals("Admin") && !contra.equals("admin1")){
                    userInco.setVisible(false);
                    contraInco.setVisible(true);
                }else{
                    userInco.setVisible(true);
                    contraInco.setVisible(true);
                }
            }
        } catch(HeadlessException e){
            System.out.println("Algo salió mal");
        }
        
    }//GEN-LAST:event_IniciarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new interCliente().setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        // TODO add your handling code here:
        setColorB2(salir);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        // TODO add your handling code here:
        resetColorB2(salir);
    }//GEN-LAST:event_salirMouseExited

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
            java.util.logging.Logger.getLogger(interLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JLabel Registrarse;
    private javax.swing.JLabel contraInco;
    private javax.swing.JPasswordField contraLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreUser;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox<String> tipoUser;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel userInco;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/img/moto.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
            
        }
    }
    class FondoMarcas extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/img/marcas.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
            
        }
    }
}
