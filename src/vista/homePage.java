/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControllerDespacharOrden;
import controlador.ControllerPedido;
import controlador.ControllerProducto;
import controlador.ControllerProveedores;
import controlador.ControllerSolicitudesNegadas;
import controlador.ControllerTramitarSolicitudPedido;
import controlador.ControllerUsuario;
import controlador.controllerClientes;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Conexion;
import reporte.generarReporte;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *

 */
public class homePage extends javax.swing.JFrame {

    /**
     * Creates new form homePage
     */
    public homePage(String nombreUsuario, String tipoUsuario, String idUsuario, String correo) {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("Sistema de pedidos de inventarios");
        lblNombreUsuario.setText(nombreUsuario);
        lblTipoUsuario.setText(tipoUsuario);
        lblId2.setText(idUsuario);
        lblCorreo.setText(correo);
        lblCorreo.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondoHomePage.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        lblNombreUsuario = new javax.swing.JLabel();
        lblTipoUsuario = new javax.swing.JLabel();
        lblNombreUsuario1 = new javax.swing.JLabel();
        lblTipoUsuario1 = new javax.swing.JLabel();
        lblId1 = new javax.swing.JLabel();
        lblId2 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnArchivo = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();
        btnMantenimiento = new javax.swing.JMenu();
        btnUsuarios = new javax.swing.JMenuItem();
        btnProveedores = new javax.swing.JMenuItem();
        btnClientes = new javax.swing.JMenuItem();
        btnSolicitarPedido = new javax.swing.JMenu();
        btnEnviarSolicitud = new javax.swing.JMenuItem();
        btnGestionarInventario = new javax.swing.JMenu();
        btnProductos = new javax.swing.JMenuItem();
        btnSolicitudes = new javax.swing.JMenuItem();
        btnGestionarOrden = new javax.swing.JMenu();
        btnAprobarSolicitudes = new javax.swing.JMenuItem();
        btnDespachar = new javax.swing.JMenuItem();
        btnFactura = new javax.swing.JMenuItem();
        btnNegadas = new javax.swing.JMenuItem();
        btnReportes = new javax.swing.JMenu();
        btnReporteClientes = new javax.swing.JMenuItem();
        btnReportePedidos = new javax.swing.JMenuItem();
        btnReporteInventario = new javax.swing.JMenuItem();
        btnAyuda = new javax.swing.JMenu();
        btnInformacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombreUsuario.setText("Nombre Usuario");

        lblTipoUsuario.setText("Tipo Usuario:");

        lblNombreUsuario1.setText("Nombre Usuario:");

        lblTipoUsuario1.setText("Tipo Usuario:");

        lblId1.setText("Id Usuario:");

        lblId2.setText("Id Usuario:");

        lblCorreo.setText("Id Usuario:");

        jDesktopPane1.setLayer(lblNombreUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblTipoUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblNombreUsuario1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblTipoUsuario1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblId1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblId2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblCorreo, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
                .addComponent(lblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblId2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUsuario)
                    .addComponent(lblNombreUsuario1)
                    .addComponent(lblTipoUsuario1)
                    .addComponent(lblTipoUsuario)
                    .addComponent(lblId1)
                    .addComponent(lblId2)
                    .addComponent(lblCorreo))
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
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        btnMantenimiento.add(btnProveedores);

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        btnMantenimiento.add(btnClientes);

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
        btnSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudesActionPerformed(evt);
            }
        });
        btnGestionarInventario.add(btnSolicitudes);

        jMenuBar1.add(btnGestionarInventario);

        btnGestionarOrden.setText("Gestionar orden");

        btnAprobarSolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista-de-verificacion.png"))); // NOI18N
        btnAprobarSolicitudes.setText("Aprobar solicitudes");
        btnAprobarSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprobarSolicitudesActionPerformed(evt);
            }
        });
        btnGestionarOrden.add(btnAprobarSolicitudes);

        btnDespachar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/orden (1).png"))); // NOI18N
        btnDespachar.setText("Despachar ordenes");
        btnDespachar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespacharActionPerformed(evt);
            }
        });
        btnGestionarOrden.add(btnDespachar);

        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/factura (2).png"))); // NOI18N
        btnFactura.setText("Factura");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        btnGestionarOrden.add(btnFactura);

        btnNegadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista-de-verificacion.png"))); // NOI18N
        btnNegadas.setText("Solicitudes negadas");
        btnNegadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegadasActionPerformed(evt);
            }
        });
        btnGestionarOrden.add(btnNegadas);

        jMenuBar1.add(btnGestionarOrden);

        btnReportes.setText("Reportes");

        btnReporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        btnReporteClientes.setText("Clientes");
        btnReporteClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteClientesActionPerformed(evt);
            }
        });
        btnReportes.add(btnReporteClientes);

        btnReportePedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista-de-la-compra.png"))); // NOI18N
        btnReportePedidos.setText("Pedidos");
        btnReportePedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportePedidosActionPerformed(evt);
            }
        });
        btnReportes.add(btnReportePedidos);

        btnReporteInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        btnReporteInventario.setText("Inventario");
        btnReporteInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteInventarioActionPerformed(evt);
            }
        });
        btnReportes.add(btnReporteInventario);

        jMenuBar1.add(btnReportes);

        btnAyuda.setText("Ayuda");

        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informacion.png"))); // NOI18N
        btnInformacion.setText("Información");
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });
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
        frmUsuarios obj = new frmUsuarios();
        jDesktopPane1.add(obj);
        ControllerUsuario con = new ControllerUsuario(obj);
        try {
            con.iniciar();
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnEnviarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarSolicitudActionPerformed
        frmSolicitarPedido obj = new frmSolicitarPedido();
        jDesktopPane1.add(obj);
        ControllerPedido con = new ControllerPedido(obj);
        try {
            con.iniciar();
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);

    }//GEN-LAST:event_btnEnviarSolicitudActionPerformed

    private void btnAprobarSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprobarSolicitudesActionPerformed
        frmTramitarSolicitudPedido obj = new frmTramitarSolicitudPedido();
        jDesktopPane1.add(obj);
        ControllerTramitarSolicitudPedido con = new ControllerTramitarSolicitudPedido(obj);
        try {
            con.iniciar();
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);   
    }//GEN-LAST:event_btnAprobarSolicitudesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        frmProductos obj = new frmProductos();
        jDesktopPane1.add(obj);
        ControllerProducto con = new ControllerProducto(obj);
        try {
            con.iniciar();
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);    
               
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        /*mail.Mail m = new mail.Mail();
        try {
            m.enviarFactura("dylanfvm@gmail.com","0");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        JOptionPane.showMessageDialog(null, "*****GRACIAS POR UTILIZAR ESTA APLICACION*****" + "\n\n"
                                            + "Programadores: " + "\n"
                                            + "-Jan Chris Solís Díaz" + "\n"
                                            + "-Adrián Somarribas Brenes" + "\n"
                                            + "-Isabel Uribe Álvarez" + "\n"
                                            + "-Dylan Fabian Vargas Martínez" + "\n"
                                            + "-Kevin Alberto Barquero Brenes" + "\n\n"
                                            + "Elaborado el 16 de Agosto del 2021" + "\n\n"
                                            + "Esta aplicacion fue elaborada con lucros" + "\n"
                                            + "educativos para el curso de Programacion III");
    }//GEN-LAST:event_btnInformacionActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        reporte.generarReporte r = new generarReporte();
        try {
            r.abrirReporte();
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnDespacharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespacharActionPerformed
        // TODO add your handling code here:
        frmDespacharOrden obj = new frmDespacharOrden();
        jDesktopPane1.add(obj);
        ControllerDespacharOrden con = new ControllerDespacharOrden(obj);
        try {
            con.iniciar();
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    }//GEN-LAST:event_btnDespacharActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
        frmProveedores obj = new frmProveedores();
        jDesktopPane1.add(obj);
        ControllerProveedores con = new ControllerProveedores(obj);
        try {
            con.iniciar();
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
       frmClientes obj = new frmClientes();
        jDesktopPane1.add(obj);
        controllerClientes con = new controllerClientes(obj);
        try {
            con.iniciar();
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);
    
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnReporteClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteClientesActionPerformed
        // TODO add your handling code here:
        reporte.generarReporte r = new generarReporte();
        try {
            r.abrirReporteClientes(JOptionPane.showInputDialog(null, "Digite el nombre de la compañia"));
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnReporteClientesActionPerformed

    private void btnReportePedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportePedidosActionPerformed
        // TODO add your handling code here:
        reporte.generarReporte r = new generarReporte();
        try {   
            r.abrirReportePedidos();
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReportePedidosActionPerformed

    private void btnReporteInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteInventarioActionPerformed
        // TODO add your handling code here:
        reporte.generarReporte r = new generarReporte();
        try {
            r.abrirReporteInventario();
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteInventarioActionPerformed

    private void btnNegadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegadasActionPerformed
        frmSolicitudesNegadas obj = new frmSolicitudesNegadas();
        jDesktopPane1.add(obj);
        ControllerSolicitudesNegadas con = new ControllerSolicitudesNegadas(obj);
        try {
            con.iniciar();
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);   
                                           

    }//GEN-LAST:event_btnNegadasActionPerformed

    private void btnSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudesActionPerformed
        // TODO add your handling code here:
        frmSolicitudes obj = new frmSolicitudes();
        jDesktopPane1.add(obj);
        ControllerTramitarSolicitudPedido con = new ControllerTramitarSolicitudPedido(obj);
        try {
            con.iniciarSolicitud();
        } catch (Conexion.DataBaseException ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        obj.setVisible(true);  
    }//GEN-LAST:event_btnSolicitudesActionPerformed

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
            @Override
            public void run() {
                new homePage(lblNombreUsuario.getText(), lblTipoUsuario.getText(), lblId2.getText(), lblCorreo.getText());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAprobarSolicitudes;
    public javax.swing.JMenu btnArchivo;
    private javax.swing.JMenu btnAyuda;
    public javax.swing.JMenuItem btnClientes;
    private javax.swing.JMenuItem btnDespachar;
    private javax.swing.JMenuItem btnEnviarSolicitud;
    private javax.swing.JMenuItem btnFactura;
    public javax.swing.JMenu btnGestionarInventario;
    private javax.swing.JMenu btnGestionarOrden;
    private javax.swing.JMenuItem btnInformacion;
    private javax.swing.JMenu btnMantenimiento;
    private javax.swing.JMenuItem btnNegadas;
    private javax.swing.JMenuItem btnProductos;
    private javax.swing.JMenuItem btnProveedores;
    private javax.swing.JMenuItem btnReporteClientes;
    private javax.swing.JMenuItem btnReporteInventario;
    private javax.swing.JMenuItem btnReportePedidos;
    private javax.swing.JMenu btnReportes;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenu btnSolicitarPedido;
    private javax.swing.JMenuItem btnSolicitudes;
    private javax.swing.JMenuItem btnUsuarios;
    private javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JLabel lblCorreo;
    public javax.swing.JLabel lblId1;
    public static javax.swing.JLabel lblId2;
    public static javax.swing.JLabel lblNombreUsuario;
    public static javax.swing.JLabel lblNombreUsuario1;
    public static javax.swing.JLabel lblTipoUsuario;
    public static javax.swing.JLabel lblTipoUsuario1;
    // End of variables declaration//GEN-END:variables
}
