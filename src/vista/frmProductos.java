/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author PC-Soma
 */
public class frmProductos extends javax.swing.JPanel {

    /**
     * Creates new form frmProducto
     */
    public frmProductos() {
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

        btnRefrescar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        lblIngresarDatos = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblIdProducto = new javax.swing.JLabel();
        lblNombreProducto = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblTipoUsuario = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        lblBusqueda = new javax.swing.JLabel();
        lblBusquedaPorNomUsuario = new javax.swing.JLabel();
        txtBusquedaPorNomProducto = new javax.swing.JTextField();
        btnBuscarPorNomProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionProducto = new javax.swing.JTextPane();
        lblProveedor = new javax.swing.JLabel();
        cbProveedorProducto = new javax.swing.JComboBox<>();
        txtTipo = new javax.swing.JTextField();
        txtCantidadProducto = new javax.swing.JTextField();

        btnRefrescar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRefrescar.setText("Refrescar");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Información del producto");

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lblIngresarDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIngresarDatos.setText("Ingresar datos: ");

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");

        lblIdProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIdProducto.setText("Id del producto: ");

        lblNombreProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombreProducto.setText("Nombre de producto:");

        lblTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipo.setText("Tipo:");

        lblTipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescripcion.setText("Descripción:");

        txtIdProducto.setEditable(false);
        txtIdProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtNombreProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCantidad.setText("Cantidad");

        lblBusqueda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBusqueda.setText("Búsqueda:");

        lblBusquedaPorNomUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBusquedaPorNomUsuario.setText("Búsqueda por nombre de producto: ");

        btnBuscarPorNomProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscarPorNomProducto.setText("Buscar");

        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Producto", "Nombre", "Tipo", "Cantidad", "Descripcion", "Proveedor"
            }
        ));
        tableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProducto);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtDescripcionProducto);

        lblProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProveedor.setText("Proveedor");

        cbProveedorProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbProveedorProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proveedor 1", "Proveedor 2", "Proveedor 3", "Proveedor 4", "Proveedor 5" }));
        cbProveedorProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedorProductoActionPerformed(evt);
            }
        });

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        txtCantidadProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIngresarDatos)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdProducto)
                                    .addComponent(lblNombreProducto)
                                    .addComponent(lblTipo)
                                    .addComponent(lblCantidad)
                                    .addComponent(lblTipoUsuario)
                                    .addComponent(lblDescripcion)
                                    .addComponent(lblProveedor))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                        .addComponent(btnEditar))
                                    .addComponent(txtIdProducto)
                                    .addComponent(txtNombreProducto)
                                    .addComponent(jScrollPane2)
                                    .addComponent(cbProveedorProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTipo)
                                    .addComponent(txtCantidadProducto))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBusqueda)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBusquedaPorNomUsuario)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtBusquedaPorNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscarPorNomProducto))
                                    .addComponent(jScrollPane1))
                                .addGap(0, 17, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefrescar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresarDatos)
                    .addComponent(lblBusqueda))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdProducto)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBusquedaPorNomUsuario)
                    .addComponent(txtBusquedaPorNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPorNomProducto))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreProducto)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidad)
                            .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(lblTipoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescripcion)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProveedor)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnRefrescar)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar))
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void tableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductoMouseClicked
        // TODO add your handling code here:
        try {
            int fila = tableProducto.getSelectedRow();
            txtIdProducto.setText(tableProducto.getValueAt(fila, 0).toString());
            txtNombreProducto.setText(tableProducto.getValueAt(fila, 1).toString());
            txtTipo.setText(tableProducto.getValueAt(fila, 2).toString());
            txtCantidadProducto.setText(tableProducto.getValueAt(fila, 3).toString());
            txtDescripcionProducto.setText(tableProducto.getValueAt(fila, 4).toString());
            cbProveedorProducto.setSelectedItem(tableProducto.getValueAt(fila, 5).toString());
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tableProductoMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbProveedorProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedorProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProveedorProductoActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtCantidadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarPorNomProducto;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnRefrescar;
    public javax.swing.JComboBox<String> cbProveedorProducto;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblBusqueda;
    public javax.swing.JLabel lblBusquedaPorNomUsuario;
    public javax.swing.JLabel lblCantidad;
    public javax.swing.JLabel lblDescripcion;
    public javax.swing.JLabel lblIdProducto;
    public javax.swing.JLabel lblIngresarDatos;
    public javax.swing.JLabel lblNombreProducto;
    public javax.swing.JLabel lblProveedor;
    public javax.swing.JLabel lblTipo;
    public javax.swing.JLabel lblTipoUsuario;
    public javax.swing.JLabel lblTitle;
    public javax.swing.JTable tableProducto;
    public javax.swing.JTextField txtBusquedaPorNomProducto;
    public javax.swing.JTextField txtCantidadProducto;
    public javax.swing.JTextPane txtDescripcionProducto;
    public javax.swing.JTextField txtIdProducto;
    public javax.swing.JTextField txtNombreProducto;
    public javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    void toFront() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
