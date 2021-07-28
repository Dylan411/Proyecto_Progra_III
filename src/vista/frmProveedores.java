/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author isabe
 */
public class frmProveedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmProveedores
     */
    public frmProveedores() {
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
        lblIngresarDatos = new javax.swing.JLabel();
        lblNombreContacto = new javax.swing.JLabel();
        lblNombreCompañia = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtNombreContacto = new javax.swing.JTextField();
        txtNombreCompañia = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblBusqueda = new javax.swing.JLabel();
        lblBusquedaPorNomCompañia = new javax.swing.JLabel();
        txtBusquedaPorNomCompañia = new javax.swing.JTextField();
        lblIdProveedor = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProveedores = new javax.swing.JTable();
        btnBuscarPorNomCompañia = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Crear y modificar proveedores");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Información del proveedor ");

        lblIngresarDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIngresarDatos.setText("Ingresar datos: ");

        lblNombreContacto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombreContacto.setText("Nombre de contacto:");

        lblNombreCompañia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombreCompañia.setText("Nombre de la compañia:");

        lblCiudad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCiudad.setText("Ciudad: ");

        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTelefono.setText("Teléfono: ");

        lblBusqueda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBusqueda.setText("Búsqueda:");

        lblBusquedaPorNomCompañia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBusquedaPorNomCompañia.setText("Búsqueda por nombre de la compañia:");

        lblIdProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIdProveedor.setText("Id del proveedor:");

        txtIdProveedor.setEditable(false);

        tableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProveedores);

        btnBuscarPorNomCompañia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscarPorNomCompañia.setText("Buscar");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRefrescar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRefrescar.setText("Refrescar");

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");

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
                                    .addComponent(lblNombreContacto)
                                    .addComponent(lblNombreCompañia)
                                    .addComponent(lblCiudad)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblIdProveedor))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNombreContacto)
                                    .addComponent(txtNombreCompañia)
                                    .addComponent(txtCiudad)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtIdProveedor))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBusqueda)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBusquedaPorNomCompañia)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusquedaPorNomCompañia)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarPorNomCompañia, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRefrescar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitle)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresarDatos)
                    .addComponent(lblBusqueda))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusquedaPorNomCompañia)
                    .addComponent(txtBusquedaPorNomCompañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdProveedor)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPorNomCompañia))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombreContacto)
                                    .addComponent(txtNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombreCompañia)
                                    .addComponent(txtNombreCompañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(lblCiudad))
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnEditar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnRefrescar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProveedoresMouseClicked
        // TODO add your handling code here:
        try {
            int fila = tableProveedores.getSelectedRow();
            txtIdProveedor.setText(tableProveedores.getValueAt(fila, 0).toString());
            txtNombreContacto.setText(tableProveedores.getValueAt(fila, 1).toString());
            txtNombreCompañia.setText(tableProveedores.getValueAt(fila, 2).toString());
            txtCiudad.setText(tableProveedores.getValueAt(fila, 3).toString());
            txtTelefono.setText(tableProveedores.getValueAt(fila, 4).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tableProveedoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarPorNomCompañia;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnRefrescar;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblBusqueda;
    public javax.swing.JLabel lblBusquedaPorNomCompañia;
    public javax.swing.JLabel lblCiudad;
    public javax.swing.JLabel lblIdProveedor;
    public javax.swing.JLabel lblIngresarDatos;
    public javax.swing.JLabel lblNombreCompañia;
    public javax.swing.JLabel lblNombreContacto;
    public javax.swing.JLabel lblTelefono;
    public javax.swing.JLabel lblTitle;
    public javax.swing.JTable tableProveedores;
    public javax.swing.JTextField txtBusquedaPorNomCompañia;
    public javax.swing.JTextField txtCiudad;
    public javax.swing.JTextField txtIdProveedor;
    public javax.swing.JTextField txtNombreCompañia;
    public javax.swing.JTextField txtNombreContacto;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
