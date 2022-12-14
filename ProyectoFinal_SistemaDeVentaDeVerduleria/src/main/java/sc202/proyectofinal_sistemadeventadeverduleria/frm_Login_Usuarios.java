/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sc202.proyectofinal_sistemadeventadeverduleria;

import javax.swing.JOptionPane;
import sc202.proyectofinal_sistemadeventadeverduleria.Cliente;
import sc202.proyectofinal_sistemadeventadeverduleria.Empleado;
import CRUD.ManejoPersonas;

/**
 *
 * @author jrg71
 */
public class frm_Login_Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form frm_Login_Usuarios
     */
    public frm_Login_Usuarios() {
        initComponents();
        this.getRootPane().setDefaultButton(btnIngresar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        imgUsuario = new javax.swing.JLabel();
        imgContraseña = new javax.swing.JLabel();
        imgVerduras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblLogin.setBackground(new java.awt.Color(57, 62, 70));
        lblLogin.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(26, 77, 46));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Iniciar Sesión");

        txtUsuario.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(57, 62, 70));

        txtContraseña.setForeground(new java.awt.Color(57, 62, 70));

        btnIngresar.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(57, 62, 70));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(57, 62, 70));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(57, 62, 70));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contents/user.png"))); // NOI18N

        imgContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contents/password.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIngresar)
                            .addComponent(imgUsuario)
                            .addComponent(imgContraseña))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSalir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegistrar))
                            .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblLogin)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgContraseña, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnSalir)
                    .addComponent(btnRegistrar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        imgVerduras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contents/verdurasLogin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgVerduras)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imgVerduras)
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        String usuario = txtUsuario.getText();
        String contraseña = String.valueOf(txtContraseña.getPassword());
        
        Empleado objEmpleado = new Empleado();
        Cliente objCliente = new Cliente();
        ManejoPersonas objManejoPersonas = new ManejoPersonas();

        if (!(usuario.isEmpty() || contraseña.isEmpty())) {
            if ((usuario.contains("@LaFinca.com"))){
                objEmpleado.setCorreoElectronicoPersona(usuario);
                objManejoPersonas.setContraseñaSesion(contraseña);
                int usuarioExistente = objManejoPersonas.loginEmpleado(objEmpleado);
                
                if ((usuarioExistente >= 1) && (usuario.equals("administrador@LaFinca.com"))){
                    frm_MenuPrincipal_Admin formulario = new frm_MenuPrincipal_Admin();
                    formulario.setLocationRelativeTo(null);
                    formulario.setVisible(true);

                    this.dispose();
                } else if ((usuarioExistente >= 1) && !(usuario.equals("administrador@LaFinca.com"))){
                    frm_MenuPrincipal_Vendedores formulario = new frm_MenuPrincipal_Vendedores();
                    formulario.setLocationRelativeTo(null);
                    formulario.setVisible(true);

                    this.dispose();
                } else {
                  JOptionPane.showMessageDialog(null, "Ingreso no exitoso, asegurese de ingresar su correo y contraseña correctamente e intente de nuevo");
                  limpiaCajasDeArchivos();
                }
            } else {
                objCliente.setCorreoElectronicoPersona(usuario);
                objManejoPersonas.setContraseñaSesion(contraseña);
                int usuarioExistente = objManejoPersonas.loginCliente(objCliente);
                
                if (usuarioExistente >= 1){
                    frm_MenuPrincipal_Clientes formulario = new frm_MenuPrincipal_Clientes();
                    formulario.setLocationRelativeTo(null);
                    formulario.setVisible(true);

                    this.dispose();
                } else {
                  JOptionPane.showMessageDialog(null, "Ingreso no exitoso, asegurese de ingresar su correo y contraseña correctamente e intente de nuevo");
                  limpiaCajasDeArchivos();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos para iniciar sesión");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void limpiaCajasDeArchivos() {
        txtUsuario.setText("");
        txtContraseña.setText("");
    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        frm_Clientes_RegistrarUsuario formulario = new frm_Clientes_RegistrarUsuario();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Login_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Login_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Login_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Login_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Login_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel imgContraseña;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JLabel imgVerduras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
