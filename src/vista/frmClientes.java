/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Janda
 */
public class frmClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmClientes
     */
    public frmClientes() {
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

        lblTitle = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        lblBusqueda = new javax.swing.JLabel();
        txtNombreCompañia = new javax.swing.JTextField();
        lblIngresarDatos = new javax.swing.JLabel();
        lblBusquedaPorNomUsuario = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtBusquedadCliente = new javax.swing.JTextField();
        lblIdProducto = new javax.swing.JLabel();
        btnBuscarPorNomProducto = new javax.swing.JButton();
        lblNombreProducto = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCuidad = new javax.swing.JTextPane();
        lblTipo = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtRegion = new javax.swing.JTextField();
        btnRefrescar = new javax.swing.JButton();
        txtNombreCliente = new javax.swing.JTextField();
        lblProveedor = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Información del cliente");

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCantidad.setText("Direccion:");

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lblBusqueda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBusqueda.setText("Búsqueda:");

        txtNombreCompañia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreCompañia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCompañiaActionPerformed(evt);
            }
        });

        lblIngresarDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIngresarDatos.setText("Ingresar datos: ");

        lblBusquedaPorNomUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBusquedaPorNomUsuario.setText("Búsqueda por nombre del cliente: ");

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");

        lblIdProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIdProducto.setText("Id del cliente: ");

        btnBuscarPorNomProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscarPorNomProducto.setText("Buscar");

        lblNombreProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombreProducto.setText("Nombre de cliente:");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Cliente", "Nombre", "Compañia", "Direccion", "Cuidad", "Region", "Telefono"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescripcion.setText("Cuidad:");

        jScrollPane2.setViewportView(txtCuidad);

        lblTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipo.setText("Nombre de compañia:");

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPrecio.setText("Region: ");

        txtIdCliente.setEditable(false);
        txtIdCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtRegion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegionActionPerformed(evt);
            }
        });

        btnRefrescar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRefrescar.setText("Refrescar");

        txtNombreCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        lblProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProveedor.setText("Telefono: ");

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane3.setViewportView(txtDireccion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblIdProducto)
                                                .addComponent(lblNombreProducto)
                                                .addComponent(lblTipo)
                                                .addComponent(lblCantidad)
                                                .addComponent(lblProveedor))
                                            .addGap(25, 25, 25))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblDescripcion)
                                            .addGap(99, 99, 99)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPrecio)
                                        .addGap(99, 99, 99)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRegion)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEditar))
                                    .addComponent(txtIdCliente)
                                    .addComponent(txtNombreCliente)
                                    .addComponent(jScrollPane2)
                                    .addComponent(txtNombreCompañia)
                                    .addComponent(txtTelefono)
                                    .addComponent(jScrollPane3))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBusqueda)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBusquedaPorNomUsuario)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtBusquedadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBusquedaPorNomUsuario)
                    .addComponent(txtBusquedadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPorNomProducto))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreProducto)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(txtNombreCompañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidad)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProveedor)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnRefrescar)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNombreCompañiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCompañiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCompañiaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        // TODO add your handling code here:
        try {
            int fila = tblClientes.getSelectedRow();
            txtIdCliente.setText(tblClientes.getValueAt(fila, 0).toString());
            txtNombreCliente.setText(tblClientes.getValueAt(fila, 1).toString());
            txtNombreCompañia.setText(tblClientes.getValueAt(fila, 2).toString());
            txtDireccion.setText(tblClientes.getValueAt(fila, 3).toString());
            txtCuidad.setText(tblClientes.getValueAt(fila, 4).toString());
            txtRegion.setText(tblClientes.getValueAt(fila, 5).toString());
            txtTelefono.setText(tblClientes.getValueAt(fila, 6).toString());

        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblClientesMouseClicked

    private void txtRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegionActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarPorNomProducto;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnRefrescar;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
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
    public javax.swing.JTable tblClientes;
    public javax.swing.JTextField txtBusquedadCliente;
    public javax.swing.JTextPane txtCuidad;
    public javax.swing.JTextArea txtDireccion;
    public javax.swing.JTextField txtIdCliente;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtNombreCompañia;
    public javax.swing.JTextField txtRegion;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
