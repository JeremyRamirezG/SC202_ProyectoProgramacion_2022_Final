/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sc202.proyectofinal_sistemadeventadeverduleria;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import CRUD.ManejoProductos;

/**
 *
 * @author jrg71
 */
public class frm_Admin_ListarProductos extends javax.swing.JFrame {

    /**
     * Creates new form frm_Admin_ListarProductos
     */
    public frm_Admin_ListarProductos() {
        initComponents();
        poblarTablaFrutas();
        poblarTablaVerduras();
        poblarTablaOtros();
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
        tblFrutas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVerduras = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOtros = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        lblListaProductos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tblFrutas.setForeground(new java.awt.Color(0, 0, 0));
        tblFrutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fruta", "Precio", "Fecha Ingreso", "ID", "Cantidad", "Temporada"
            }
        ));
        jScrollPane1.setViewportView(tblFrutas);

        tblVerduras.setForeground(new java.awt.Color(0, 0, 0));
        tblVerduras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Verdura", "Precio", "Fecha Ingreso", "ID", "Cantidad", "Temporada"
            }
        ));
        jScrollPane2.setViewportView(tblVerduras);

        tblOtros.setForeground(new java.awt.Color(0, 0, 0));
        tblOtros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Fecha Ingreso", "ID", "Cantidad", "Tipo", "Marca", "Distribuidora"
            }
        ));
        jScrollPane3.setViewportView(tblOtros);

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
        lblListaProductos.setText("Listas de productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(lblListaProductos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(btnSalir)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblListaProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addGap(7, 7, 7))
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

    private void poblarTablaFrutas(){
        ManejoProductos objManejoProductos = new ManejoProductos();
        objManejoProductos.setTipoProducto("Frutas");
        
        ArrayList <Frutas> listaFrutas = new ArrayList<Frutas>();
        listaFrutas= objManejoProductos.obtenerListaFrutas();
        
        //Enlazar la tabla que hicimos con la de la interfaz
        DefaultTableModel modelo = (DefaultTableModel) tblFrutas.getModel();
        
        Object vector[] = new Object[6];
        
        if (listaFrutas!=null){
            for (int i = 0; i <listaFrutas.size(); i++){
                vector[0]= listaFrutas.get(i).getNombreProducto();
                vector[1]= listaFrutas.get(i).getPrecioProducto();
                vector[2]= listaFrutas.get(i).getFechaIngreso();
                vector[3]= listaFrutas.get(i).getIdProducto();
                vector[4]= listaFrutas.get(i).getCantidadProducto();
                vector[5]= listaFrutas.get(i).getTemporadaFrutas();
                
                modelo.addRow(vector);
            }
        }
        
    }
    private void poblarTablaVerduras(){
        ManejoProductos objManejoProductos = new ManejoProductos();
        objManejoProductos.setTipoProducto("Verduras");
        
        ArrayList <Verduras> listaVerduras = new ArrayList<Verduras>();
        listaVerduras= objManejoProductos.obtenerListaVerduras();
        
        //Enlazar la tabla que hicimos con la de la interfaz
        DefaultTableModel modelo = (DefaultTableModel) tblVerduras.getModel();
        
        Object vector[] = new Object[6];
        
        if (listaVerduras!=null){
            for (int i = 0; i <listaVerduras.size(); i++){
                vector[0]= listaVerduras.get(i).getNombreProducto();
                vector[1]= listaVerduras.get(i).getPrecioProducto();
                vector[2]= listaVerduras.get(i).getFechaIngreso();
                vector[3]= listaVerduras.get(i).getIdProducto();
                vector[4]= listaVerduras.get(i).getCantidadProducto();
                vector[5]= listaVerduras.get(i).getTemporadaVerduras();
                
                modelo.addRow(vector);
            }
        }
        
    }
    private void poblarTablaOtros(){
        ManejoProductos objManejoProductos = new ManejoProductos();
        objManejoProductos.setTipoProducto("Otros");
        
        ArrayList <Otros> listaOtros = new ArrayList<Otros>();
        listaOtros= objManejoProductos.obtenerListaOtros();
        
        //Enlazar la tabla que hicimos con la de la interfaz
        DefaultTableModel modelo = (DefaultTableModel) tblOtros.getModel();
        
        Object vector[] = new Object[8];
        
        if (listaOtros!=null){
            for (int i = 0; i <listaOtros.size(); i++){
                vector[0]= listaOtros.get(i).getNombreProducto();
                vector[1]= listaOtros.get(i).getPrecioProducto();
                vector[2]= listaOtros.get(i).getFechaIngreso();
                vector[3]= listaOtros.get(i).getIdProducto();
                vector[4]= listaOtros.get(i).getCantidadProducto();
                vector[5]= listaOtros.get(i).getTipoProducto();
                vector[6]= listaOtros.get(i).getMarcaProducto();
                vector[7]= listaOtros.get(i).getDistribuidorProducto();
                
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
            java.util.logging.Logger.getLogger(frm_Admin_ListarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Admin_ListarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Admin_ListarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Admin_ListarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Admin_ListarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblListaProductos;
    private javax.swing.JTable tblFrutas;
    private javax.swing.JTable tblOtros;
    private javax.swing.JTable tblVerduras;
    // End of variables declaration//GEN-END:variables
}
