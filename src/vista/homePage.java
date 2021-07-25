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
public class homePage extends javax.swing.JFrame {

    /**
     * Creates new form homePage
     */
    public homePage(String nombreUsuario,String tipoUsuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("Sistema de pedidos de inventarios");
        lblNombreUsuario.setText(nombreUsuario);
        lblTipoUsuario.setText(tipoUsuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblNombreUsuario = new javax.swing.JLabel();
        lblTipoUsuario = new javax.swing.JLabel();
        lblNombreUsuario1 = new javax.swing.JLabel();
        lblTipoUsuario1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnArchivo = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();
        btnMantenimiento = new javax.swing.JMenu();
        btnUsuarios = new javax.swing.JMenuItem();
        btnProveedores = new javax.swing.JMenuItem();
        btnSolicitarPedido = new javax.swing.JMenu();
        btnEnviarSolicitud = new javax.swing.JMenuItem();
        btnGestionarInventario = new javax.swing.JMenu();
        btnProductos = new javax.swing.JMenuItem();
        btnSolicitudes = new javax.swing.JMenuItem();
        btnAprobarSolicitudes = new javax.swing.JMenu();
        btnProcesarSolicitudes = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnDespachar = new javax.swing.JMenuItem();
        btnOrdenCompra = new javax.swing.JMenuItem();
        btnFactura = new javax.swing.JMenuItem();
        btnReportes = new javax.swing.JMenu();
        btnAyuda = new javax.swing.JMenu();
        btnInformacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombreUsuario.setText("Nombre Usuario");

        lblTipoUsuario.setText("Tipo Usuario:");

        lblNombreUsuario1.setText("Nombre Usuario:");

        lblTipoUsuario1.setText("Tipo Usuario:");

        jDesktopPane1.setLayer(lblNombreUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblTipoUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblNombreUsuario1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblTipoUsuario1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(lblNombreUsuario1)
                .addGap(18, 18, 18)
                .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(lblTipoUsuario1)
                .addGap(18, 18, 18)
                .addComponent(lblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 279, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUsuario)
                    .addComponent(lblNombreUsuario1)
                    .addComponent(lblTipoUsuario1)
                    .addComponent(lblTipoUsuario))
                .addContainerGap(481, Short.MAX_VALUE))
        );

        btnArchivo.setText("Archivo");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnArchivo.add(btnSalir);

        jMenuBar1.add(btnArchivo);

        btnMantenimiento.setText("Mantenimiento");

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        btnMantenimiento.add(btnUsuarios);

        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedor.png"))); // NOI18N
        btnProveedores.setText("Proveedores");
        btnMantenimiento.add(btnProveedores);

        jMenuBar1.add(btnMantenimiento);

        btnSolicitarPedido.setText("Solicitar pedido");

        btnEnviarSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviarSolicitud.png"))); // NOI18N
        btnEnviarSolicitud.setText("Enviar solicitud");
        btnEnviarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarSolicitudActionPerformed(evt);
            }
        });
        btnSolicitarPedido.add(btnEnviarSolicitud);

        jMenuBar1.add(btnSolicitarPedido);

        btnGestionarInventario.setText("Gestionar inventario ");

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos-cosmeticos.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        btnGestionarInventario.add(btnProductos);

        btnSolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        btnSolicitudes.setText("Solicitudes");
        btnGestionarInventario.add(btnSolicitudes);

        jMenuBar1.add(btnGestionarInventario);

        btnAprobarSolicitudes.setText("Gestionar orden");

        btnProcesarSolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proceso (1).png"))); // NOI18N
        btnProcesarSolicitudes.setText("Procesar solicitudes");
        btnAprobarSolicitudes.add(btnProcesarSolicitudes);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista-de-verificacion.png"))); // NOI18N
        jMenuItem2.setText("Aprobar solicitudes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        btnAprobarSolicitudes.add(jMenuItem2);

        btnDespachar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/orden (1).png"))); // NOI18N
        btnDespachar.setText("Despachar ordenes");
        btnAprobarSolicitudes.add(btnDespachar);

        btnOrdenCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista-de-la-compra.png"))); // NOI18N
        btnOrdenCompra.setText("Orden de compra");
        btnAprobarSolicitudes.add(btnOrdenCompra);

        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/factura (2).png"))); // NOI18N
        btnFactura.setText("Factura");
        btnAprobarSolicitudes.add(btnFactura);

        jMenuBar1.add(btnAprobarSolicitudes);

        btnReportes.setText("Reportes");
        jMenuBar1.add(btnReportes);

        btnAyuda.setText("Ayuda");

        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informacion.png"))); // NOI18N
        btnInformacion.setText("Información");
        btnAyuda.add(btnInformacion);

        jMenuBar1.add(btnAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnEnviarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarSolicitudActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new homePage(lblNombreUsuario.getText(),lblTipoUsuario.getText()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnAprobarSolicitudes;
    public javax.swing.JMenu btnArchivo;
    private javax.swing.JMenu btnAyuda;
    private javax.swing.JMenuItem btnDespachar;
    private javax.swing.JMenuItem btnEnviarSolicitud;
    private javax.swing.JMenuItem btnFactura;
    private javax.swing.JMenu btnGestionarInventario;
    private javax.swing.JMenuItem btnInformacion;
    private javax.swing.JMenu btnMantenimiento;
    private javax.swing.JMenuItem btnOrdenCompra;
    private javax.swing.JMenuItem btnProcesarSolicitudes;
    private javax.swing.JMenuItem btnProductos;
    private javax.swing.JMenuItem btnProveedores;
    private javax.swing.JMenu btnReportes;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenu btnSolicitarPedido;
    private javax.swing.JMenuItem btnSolicitudes;
    private javax.swing.JMenuItem btnUsuarios;
    private javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JLabel lblNombreUsuario;
    public static javax.swing.JLabel lblNombreUsuario1;
    public static javax.swing.JLabel lblTipoUsuario;
    public static javax.swing.JLabel lblTipoUsuario1;
    // End of variables declaration//GEN-END:variables
}
