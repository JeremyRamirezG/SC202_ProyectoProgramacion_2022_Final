/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sc202.proyectofinal_sistemadeventadeverduleria;

import CRUD.ManejoFacturas;
import CRUD.ManejoProductos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jrg71
 */
public class frm_Clientes_AgregarOtros extends javax.swing.JFrame {

    /**
     * Creates new form frm_Clientes_AgregarVerduras
     */
    public frm_Clientes_AgregarOtros() {
        initComponents();
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
        lblOtros = new javax.swing.JLabel();
        lblImagenOtros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOtros = new javax.swing.JTable();
        lblIDProducto = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblIDResultado = new javax.swing.JLabel();
        lblNombreResultado = new javax.swing.JLabel();
        txtCantidadResultado = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnVolverMenu = new javax.swing.JButton();
        lblPrecio = new javax.swing.JLabel();
        lblPrecioResultado = new javax.swing.JLabel();
        lblMoneda = new javax.swing.JLabel();
        lblCantidadDisponible = new javax.swing.JLabel();
        lblCantidadDisponibleResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblOtros.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblOtros.setForeground(new java.awt.Color(26, 77, 46));
        lblOtros.setText("Sección de Otros");

        lblImagenOtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contents/snacks.png"))); // NOI18N

        tblOtros.setBackground(new java.awt.Color(26, 77, 46));
        tblOtros.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        tblOtros.setForeground(new java.awt.Color(0, 0, 0));
        tblOtros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "ID Producto", "Precio", "Cantidad"
            }
        ));
        tblOtros.setGridColor(new java.awt.Color(26, 77, 46));
        tblOtros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOtrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOtros);

        lblIDProducto.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        lblIDProducto.setForeground(new java.awt.Color(26, 77, 46));
        lblIDProducto.setText("ID:");

        lblNombre.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(26, 77, 46));
        lblNombre.setText("Nombre:");

        lblCantidad.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(26, 77, 46));
        lblCantidad.setText("Cantidad:");

        lblIDResultado.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        lblIDResultado.setForeground(new java.awt.Color(26, 77, 46));
        lblIDResultado.setText("N/A");

        lblNombreResultado.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        lblNombreResultado.setForeground(new java.awt.Color(26, 77, 46));
        lblNombreResultado.setText("N/A");

        txtCantidadResultado.setBackground(new java.awt.Color(26, 77, 46));
        txtCantidadResultado.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        txtCantidadResultado.setForeground(new java.awt.Color(0, 0, 0));

        btnAgregar.setBackground(new java.awt.Color(26, 77, 46));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnVolverMenu.setBackground(new java.awt.Color(26, 77, 46));
        btnVolverMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverMenu.setText("Volver");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        lblPrecio.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(26, 77, 46));
        lblPrecio.setText("Precio:");

        lblPrecioResultado.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        lblPrecioResultado.setForeground(new java.awt.Color(26, 77, 46));
        lblPrecioResultado.setText("N/A");

        lblMoneda.setForeground(new java.awt.Color(26, 77, 46));
        lblMoneda.setText("₡");

        lblCantidadDisponible.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        lblCantidadDisponible.setForeground(new java.awt.Color(26, 77, 46));
        lblCantidadDisponible.setText("Disponible: ");

        lblCantidadDisponibleResultado.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        lblCantidadDisponibleResultado.setForeground(new java.awt.Color(26, 77, 46));
        lblCantidadDisponibleResultado.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImagenOtros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOtros))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolverMenu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIDProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIDResultado)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreResultado)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrecioResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMoneda)
                        .addGap(18, 18, 18)
                        .addComponent(lblCantidadDisponible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidadDisponibleResultado)
                        .addGap(18, 18, 18)
                        .addComponent(lblCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidadResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagenOtros)
                    .addComponent(lblOtros))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCantidad)
                        .addComponent(txtCantidadResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCantidadDisponible)
                        .addComponent(lblCantidadDisponibleResultado))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIDProducto)
                        .addComponent(lblIDResultado)
                        .addComponent(lblNombre)
                        .addComponent(lblNombreResultado)
                        .addComponent(lblPrecio)
                        .addComponent(lblPrecioResultado)
                        .addComponent(lblMoneda)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnVolverMenu))
                .addContainerGap(58, Short.MAX_VALUE))
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

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void tblOtrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOtrosMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = tblOtros.rowAtPoint(evt.getPoint());
        
        lblNombreResultado.setText(tblOtros.getValueAt(filaSeleccionada, 0).toString());
        lblIDResultado.setText(tblOtros.getValueAt(filaSeleccionada, 1).toString());
        lblPrecioResultado.setText(tblOtros.getValueAt(filaSeleccionada, 2).toString());
        lblCantidadDisponibleResultado.setText(tblOtros.getValueAt(filaSeleccionada, 3).toString());
    }//GEN-LAST:event_tblOtrosMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String idBuscar = lblIDResultado.getText();
        String cantidadAgregada = txtCantidadResultado.getText();
        String cantidadDisponible = lblCantidadDisponibleResultado.getText();
        String precio = lblPrecioResultado.getText();
        String nombre = lblNombreResultado.getText();
        
        if((isNumeric(cantidadAgregada)&&isNumeric(cantidadDisponible)&&isDouble(precio))){
            int nuevaCantidad = (Integer.parseInt(cantidadDisponible))-(Integer.parseInt(cantidadAgregada));
            double precioTotalSinIVA = ((Double.parseDouble(cantidadAgregada))*(Double.parseDouble(precio)));
     
            if((nuevaCantidad >= 0) && (idBuscar.contains("OTR-")) && !(nombre.equals("N/A")) && !(precio.equals("N/A"))){
                //Hacer archivo temporal
                ManejoFacturas objManejoFacturas = new ManejoFacturas();
                Productos objProductos = new Productos();

                objProductos.setNombreProducto(nombre);
                objProductos.setCantidadProducto(Integer.parseInt(cantidadAgregada));
                objManejoFacturas.setSubTotal(precioTotalSinIVA);
                
                objManejoFacturas.crearOrdenTemporal(objProductos);
                
                //Modificar cantidad existente
                ManejoProductos objManejoProductos = new ManejoProductos();
                objManejoProductos.setTipoProducto("Otros");
                objManejoProductos.setIdProductoManejoArchivos(idBuscar);
                
                objManejoProductos.setNuevoNombre(nombre);
                objManejoProductos.setNuevaCantidad(nuevaCantidad);

                objManejoProductos.actualizarCantidadOtros();
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null,"Ingrese un ID de producto y/o o cantidad válida");
                limpiarCajas();
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese los datos númericos o dígitos según corresponda");
            limpiaCajaDeNumeros();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
                vector[0] = listaOtros.get(i).getNombreProducto();
                vector[1] = listaOtros.get(i).getIdProducto();
                vector[2] = listaOtros.get(i).getPrecioProducto();
                vector[3] = listaOtros.get(i).getCantidadProducto();
                
                modelo.addRow(vector);
            }
        }
        
    }
    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
    private static boolean isDouble(String cadena){
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
    private void limpiaCajaDeNumeros(){
        txtCantidadResultado.setText("");
    }
    private void limpiarCajas(){
        lblNombreResultado.setText("N/A");
        lblIDResultado.setText("N/A");
        lblPrecioResultado.setText("N/A");
        lblCantidadDisponibleResultado.setText("0");
        txtCantidadResultado.setText("");
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
            java.util.logging.Logger.getLogger(frm_Clientes_AgregarOtros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Clientes_AgregarOtros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Clientes_AgregarOtros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Clientes_AgregarOtros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Clientes_AgregarOtros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidadDisponible;
    private javax.swing.JLabel lblCantidadDisponibleResultado;
    private javax.swing.JLabel lblIDProducto;
    private javax.swing.JLabel lblIDResultado;
    private javax.swing.JLabel lblImagenOtros;
    private javax.swing.JLabel lblMoneda;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreResultado;
    private javax.swing.JLabel lblOtros;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecioResultado;
    private javax.swing.JTable tblOtros;
    private javax.swing.JTextField txtCantidadResultado;
    // End of variables declaration//GEN-END:variables
}
