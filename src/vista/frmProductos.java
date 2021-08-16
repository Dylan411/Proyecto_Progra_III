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
public class frmProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Productos2
     */
    public frmProductos() {
        initComponents();
        txtIdProveedor.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionProducto = new javax.swing.JTextPane();
        txtIdProducto = new javax.swing.JTextField();
        btnRefrescar = new javax.swing.JButton();
        txtNombreProducto = new javax.swing.JTextField();
        lblProveedor = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        cbProveedorProducto = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        lblBusqueda = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        lblIngresarDatos = new javax.swing.JLabel();
        lblBusquedaPorNomUsuario = new javax.swing.JLabel();
        txtCantidadProducto4 = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        txtBusquedaPorNomProducto = new javax.swing.JTextField();
        lblIdProducto = new javax.swing.JLabel();
        btnBuscarPorNomProducto = new javax.swing.JButton();
        lblNombreProducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        lblTipo = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio4 = new javax.swing.JTextField();
        txtIdProveedor = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescripcion.setText("Descripción:");

        jScrollPane2.setViewportView(txtDescripcionProducto);

        txtIdProducto.setEditable(false);
        txtIdProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnRefrescar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRefrescar.setText("Refrescar");

        txtNombreProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });

        lblProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProveedor.setText("Proveedor:");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Información del producto");

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCantidad.setText("Cantidad");

        cbProveedorProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbProveedorProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el proveedor" }));
        cbProveedorProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedorProductoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lblBusqueda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBusqueda.setText("Búsqueda:");

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        lblIngresarDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIngresarDatos.setText("Ingresar datos: ");

        lblBusquedaPorNomUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBusquedaPorNomUsuario.setText("Búsqueda por nombre de producto: ");

        txtCantidadProducto4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCantidadProducto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadProducto4ActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");

        lblIdProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIdProducto.setText("Id del producto: ");

        btnBuscarPorNomProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscarPorNomProducto.setText("Buscar");

        lblNombreProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombreProducto.setText("Nombre de producto:");

        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Producto", "Nombre", "Tipo", "Cantidad", "Descripcion", "Proveedor", "Precio"
            }
        ));
        tableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProducto);

        lblTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipo.setText("Tipo:");

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPrecio.setText("Precio:");

        txtPrecio4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrecio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio4ActionPerformed(evt);
            }
        });

        txtIdProveedor.setEditable(false);
        txtIdProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIngresarDatos)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdProducto)
                                    .addComponent(lblNombreProducto)
                                    .addComponent(lblTipo)
                                    .addComponent(lblCantidad)
                                    .addComponent(lblDescripcion)
                                    .addComponent(lblProveedor)
                                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnGuardar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnEditar))
                                            .addComponent(txtIdProducto)
                                            .addComponent(txtNombreProducto)
                                            .addComponent(jScrollPane2)
                                            .addComponent(txtCantidadProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPrecio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPrecio4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                    .addComponent(jScrollPane1)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefrescar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreProducto)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidad)
                            .addComponent(txtCantidadProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescripcion)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProveedor)
                            .addComponent(cbProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnRefrescar)
                            .addComponent(btnGuardar)
                            .addComponent(btnEditar)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void cbProveedorProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedorProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProveedorProductoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtCantidadProducto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadProducto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadProducto4ActionPerformed

    private void tableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductoMouseClicked
        // TODO add your handling code here:
        try {
            int fila = tableProducto.getSelectedRow();
            txtIdProducto.setText(tableProducto.getValueAt(fila, 0).toString());
            txtNombreProducto.setText(tableProducto.getValueAt(fila, 1).toString());
            txtTipo.setText(tableProducto.getValueAt(fila, 2).toString());
            txtCantidadProducto4.setText(tableProducto.getValueAt(fila, 3).toString());
            txtDescripcionProducto.setText(tableProducto.getValueAt(fila, 4).toString());
            txtIdProveedor.setText(tableProducto.getValueAt(fila, 5).toString());
            txtPrecio4.setText(tableProducto.getValueAt(fila, 6).toString());

        } catch (Exception e) {
        }
    }//GEN-LAST:event_tableProductoMouseClicked

    private void txtPrecio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio4ActionPerformed

    private void txtIdProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProveedorActionPerformed


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
    public javax.swing.JLabel lblPrecio;
    public javax.swing.JLabel lblProveedor;
    public javax.swing.JLabel lblTipo;
    public javax.swing.JLabel lblTitle;
    public javax.swing.JTable tableProducto;
    public javax.swing.JTextField txtBusquedaPorNomProducto;
    public javax.swing.JTextField txtCantidadProducto4;
    public javax.swing.JTextPane txtDescripcionProducto;
    public javax.swing.JTextField txtIdProducto;
    public javax.swing.JTextField txtIdProveedor;
    public javax.swing.JTextField txtNombreProducto;
    public javax.swing.JTextField txtPrecio4;
    public javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
