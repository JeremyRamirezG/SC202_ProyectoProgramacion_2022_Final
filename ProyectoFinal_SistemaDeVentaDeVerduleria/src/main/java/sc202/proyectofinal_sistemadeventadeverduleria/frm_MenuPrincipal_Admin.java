/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sc202.proyectofinal_sistemadeventadeverduleria;

/**
 *
 * @author jrg71
 */
public class frm_MenuPrincipal_Admin extends javax.swing.JFrame {

    /**
     * Creates new form frm_MenuPrincipal_Admin
     */
    public frm_MenuPrincipal_Admin() {
        initComponents();
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
        imgLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCRUD = new javax.swing.JMenu();
        btnProductos = new javax.swing.JMenu();
        btnAgregarProducto = new javax.swing.JMenuItem();
        btnMostrarProductos = new javax.swing.JMenuItem();
        btnModificarProducto = new javax.swing.JMenuItem();
        btnBorrarProducto = new javax.swing.JMenuItem();
        btnUsuarios = new javax.swing.JMenu();
        btnAgregarPersona = new javax.swing.JMenuItem();
        btnListarPersonas = new javax.swing.JMenuItem();
        btnModificarPersona = new javax.swing.JMenuItem();
        btnBorrarPersona = new javax.swing.JMenuItem();
        mnuSesion = new javax.swing.JMenu();
        btnCerrarSesion = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAyudaProductos = new javax.swing.JMenuItem();
        mnuAyudaUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contents/logoVerduleria.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(imgLogo)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(imgLogo)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        mnuCRUD.setText("Opciones Administrador");

        btnProductos.setText("Productos");

        btnAgregarProducto.setText("Agregar");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        btnProductos.add(btnAgregarProducto);

        btnMostrarProductos.setText("Listar");
        btnMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosActionPerformed(evt);
            }
        });
        btnProductos.add(btnMostrarProductos);

        btnModificarProducto.setText("Modificar");
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });
        btnProductos.add(btnModificarProducto);

        btnBorrarProducto.setText("Borrar");
        btnBorrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarProductoActionPerformed(evt);
            }
        });
        btnProductos.add(btnBorrarProducto);

        mnuCRUD.add(btnProductos);

        btnUsuarios.setText("Usuarios");

        btnAgregarPersona.setText("Agregar");
        btnAgregarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPersonaActionPerformed(evt);
            }
        });
        btnUsuarios.add(btnAgregarPersona);

        btnListarPersonas.setText("Listar");
        btnListarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPersonasActionPerformed(evt);
            }
        });
        btnUsuarios.add(btnListarPersonas);

        btnModificarPersona.setText("Modifcar");
        btnModificarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPersonaActionPerformed(evt);
            }
        });
        btnUsuarios.add(btnModificarPersona);

        btnBorrarPersona.setText("Borrar");
        btnBorrarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPersonaActionPerformed(evt);
            }
        });
        btnUsuarios.add(btnBorrarPersona);

        mnuCRUD.add(btnUsuarios);

        jMenuBar1.add(mnuCRUD);

        mnuSesion.setText("Opciones Sesión");

        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        mnuSesion.add(btnCerrarSesion);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        mnuSesion.add(btnSalir);

        jMenuBar1.add(mnuSesion);

        mnuAyuda.setText("Ayuda");

        mnuAyudaProductos.setText("CRUD Productos");
        mnuAyudaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudaProductosActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAyudaProductos);

        mnuAyudaUsuarios.setText("CRUD Usuarios");
        mnuAyudaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudaUsuariosActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAyudaUsuarios);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

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

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        frm_Login_Usuarios formulario = new frm_Login_Usuarios();
        
        //Permite centrar un formulario en pantalla
        
        formulario.setLocationRelativeTo(null);
        //Mostrar el formulario en pantalla
        formulario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:
        frm_Admin_AgregarProductos formulario = new frm_Admin_AgregarProductos();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnBorrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarProductoActionPerformed
        // TODO add your handling code here:
        frm_Admin_BorrarProductos formulario = new frm_Admin_BorrarProductos();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnBorrarProductoActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        // TODO add your handling code here:
        frm_Admin_ModificarProductos formulario = new frm_Admin_ModificarProductos();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    private void btnMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProductosActionPerformed
        // TODO add your handling code here:
        frm_Admin_ListarProductos formulario = new frm_Admin_ListarProductos();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnMostrarProductosActionPerformed

    private void btnAgregarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPersonaActionPerformed
        // TODO add your handling code here:
        frm_Admin_AgregarUsuarios formulario = new frm_Admin_AgregarUsuarios();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnAgregarPersonaActionPerformed

    private void btnListarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPersonasActionPerformed
        // TODO add your handling code here:
        frm_Admin_ListarUsuarios formulario = new frm_Admin_ListarUsuarios();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnListarPersonasActionPerformed

    private void btnModificarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPersonaActionPerformed
        // TODO add your handling code here:
        frm_Admin_ModificarUsuarios formulario = new frm_Admin_ModificarUsuarios();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnModificarPersonaActionPerformed

    private void btnBorrarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPersonaActionPerformed
        // TODO add your handling code here:
        frm_Admin_BorrarUsuarios formulario = new frm_Admin_BorrarUsuarios();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnBorrarPersonaActionPerformed

    private void mnuAyudaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudaProductosActionPerformed
        // TODO add your handling code here:
        frm_Admin_AyudaProductos formulario = new frm_Admin_AyudaProductos();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }//GEN-LAST:event_mnuAyudaProductosActionPerformed

    private void mnuAyudaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudaUsuariosActionPerformed
        // TODO add your handling code here:
        frm_Admin_AyudaUsuarios formulario = new frm_Admin_AyudaUsuarios();
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }//GEN-LAST:event_mnuAyudaUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(frm_MenuPrincipal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_MenuPrincipal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_MenuPrincipal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_MenuPrincipal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_MenuPrincipal_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAgregarPersona;
    private javax.swing.JMenuItem btnAgregarProducto;
    private javax.swing.JMenuItem btnBorrarPersona;
    private javax.swing.JMenuItem btnBorrarProducto;
    private javax.swing.JMenuItem btnCerrarSesion;
    private javax.swing.JMenuItem btnListarPersonas;
    private javax.swing.JMenuItem btnModificarPersona;
    private javax.swing.JMenuItem btnModificarProducto;
    private javax.swing.JMenuItem btnMostrarProductos;
    private javax.swing.JMenu btnProductos;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenu btnUsuarios;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuAyudaProductos;
    private javax.swing.JMenuItem mnuAyudaUsuarios;
    private javax.swing.JMenu mnuCRUD;
    private javax.swing.JMenu mnuSesion;
    // End of variables declaration//GEN-END:variables
}
