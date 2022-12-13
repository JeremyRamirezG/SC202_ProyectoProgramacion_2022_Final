/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sc202.proyectofinal_sistemadeventadeverduleria;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import CRUD.ManejoPersonas;
import sc202.proyectofinal_sistemadeventadeverduleria.Empleado;
import sc202.proyectofinal_sistemadeventadeverduleria.Cliente;

/**
 *
 * @author jrg71
 */
public class frm_Admin_ListarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form frm_Admin_ListarProductos
     */
    public frm_Admin_ListarUsuarios() {
        initComponents();
        poblarTablaEmpleados();
        poblarTablaClientes();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        lblListaProductos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "ID", "Edad", "Correo", "Cédula", "Número", "Dirección", "Método de Pago"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        btnSalir.setBackground(new java.awt.Color(57, 62, 70));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblListaProductos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListaProductos.setForeground(new java.awt.Color(255, 255, 255));
        lblListaProductos.setText("Listas de usuarios");

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empleado", "ID", "Edad", "Correo", "Cédula", "Número", "Salario", "Años Contratado", "Sigue en la empresa?"
            }
        ));
        jScrollPane2.setViewportView(tblEmpleados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(lblListaProductos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListaProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void poblarTablaEmpleados(){
        ManejoPersonas objManejoPersonas = new ManejoPersonas();
        
        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados= objManejoPersonas.listarEmpleados();
        
        //Enlazar la tabla que hicimos con la de la interfaz
        DefaultTableModel modelo = (DefaultTableModel) tblEmpleados.getModel();
        
        Object vector[] = new Object[9];
        
        if (listaEmpleados!=null){
            for (int i = 0; i <listaEmpleados.size(); i++){
                vector[0]= listaEmpleados.get(i).getNombrePersona();
                vector[1]= listaEmpleados.get(i).getIdEmpleado();
                vector[2]= listaEmpleados.get(i).getEdadPersona();
                vector[3]= listaEmpleados.get(i).getCorreoElectronicoPersona();
                vector[4]= listaEmpleados.get(i).getCedulaPersona();
                vector[5]= listaEmpleados.get(i).getNumeroTelefonicoPersona();
                vector[6]= listaEmpleados.get(i).getSalarioBrutoEmpleado();
                vector[7]= listaEmpleados.get(i).getAñosContratadoEmpleado();
                vector[8]= listaEmpleados.get(i).getEstadoEmpleado();
                
                modelo.addRow(vector);
            }
        }
        
    }
    private void poblarTablaClientes(){
        ManejoPersonas objManejoPersonas = new ManejoPersonas();
        
        ArrayList <Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes= objManejoPersonas.listarClientes();
        
        //Enlazar la tabla que hicimos con la de la interfaz
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        
        Object vector[] = new Object[8];
        
        if (listaClientes!=null){
            for (int i = 0; i <listaClientes.size(); i++){
                vector[0]= listaClientes.get(i).getNombrePersona();
                vector[1]= listaClientes.get(i).getIdCliente();
                vector[2]= listaClientes.get(i).getEdadPersona();
                vector[3]= listaClientes.get(i).getCorreoElectronicoPersona();
                vector[4]= listaClientes.get(i).getCedulaPersona();
                vector[5]= listaClientes.get(i).getNumeroTelefonicoPersona();
                vector[6]= listaClientes.get(i).getDireccionCliente();
                vector[7]= listaClientes.get(i).getMetodoPagoCliente();
                
                modelo.addRow(vector);
            }
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
            java.util.logging.Logger.getLogger(frm_Admin_ListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Admin_ListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Admin_ListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Admin_ListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Admin_ListarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblListaProductos;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblEmpleados;
    // End of variables declaration//GEN-END:variables
}
