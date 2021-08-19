/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import mail.Mail;
import modelo.Conexion;
import modelo.Pedido;
import modelo.PedidoDAO;
import net.sf.jasperreports.engine.JRException;
import reporte.generarReporte;
import vista.frmDespacharOrden;
import vista.homePage;



public class ControllerDespacharOrden implements ActionListener {
    frmDespacharOrden vistaDespachar = new frmDespacharOrden();
    PedidoDAO dao = new PedidoDAO();
    Pedido pedido = new Pedido();
    generarReporte reporte = new generarReporte();
    Mail mail = new Mail();
    
    
    public ControllerDespacharOrden(frmDespacharOrden frm)  {
        this.vistaDespachar = frm;
        this.vistaDespachar.btnBuscar.addActionListener(this);
        this.vistaDespachar.btnDespachar.addActionListener(this);
        this.vistaDespachar.btnRefrescar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaDespachar.btnDespachar) {
            try {
                despacharPedido(1);
                generarFactura();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JRException ex) {
                Logger.getLogger(ControllerDespacharOrden.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(ControllerDespacharOrden.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MessagingException ex) {
                Logger.getLogger(ControllerDespacharOrden.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaDespachar.btnBuscar) {
            try {
                filtrarTalfiltrarTablaNumProductoDespachado(vistaDespachar.tblProductosDespacho, vistaDespachar.txtBuscar.getText());
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource()== vistaDespachar.btnRefrescar){
            try {
                iniciar();
                        } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerSolicitudesNegadas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void despacharPedido(int num) throws Conexion.DataBaseException {
        int numPedido = Integer.parseInt(vistaDespachar.txtNumPedido.getText());
        int dispatched = num;
        
        
        pedido.setNumPedido(numPedido);
        pedido.setdespachada(1);
        

        int r = dao.despacharPedido(pedido);

        if (r > 0) {
            JOptionPane.showMessageDialog(vistaDespachar, "Solicitud despachada correctamente");
            dao.iniciarDespacho(vistaDespachar.tblProductosDespacho, "");
        } else {
            JOptionPane.showMessageDialog(vistaDespachar, "Solicitud NO tramitada ");
        }
    }

    public void iniciar() throws Conexion.DataBaseException {
        dao.iniciarDespacho(vistaDespachar.tblProductosDespacho, "");

    }
    
    public void generarFactura() throws Conexion.DataBaseException, JRException, UnsupportedEncodingException, MessagingException{
        String num = vistaDespachar.txtNumPedido.getText();
        String correo = homePage.lblCorreo.getText();
        reporte.guardarPdf(num);
        mail.enviarFactura(correo, num);
    }

    public void filtrarTalfiltrarTablaNumProductoDespachado(JTable tabla, String filtro) throws Conexion.DataBaseException {
        dao.filtrarTablaDespacho(tabla, filtro);
    }
}

