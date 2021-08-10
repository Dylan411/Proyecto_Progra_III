/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Conexion;
import modelo.Pedido;
import modelo.PedidoDAO;
import vista.frmTramitarSolicitudPedido;

/**
 *
 * @author PC-Soma
 */
public class ControllerTramitarSolicitudPedido implements ActionListener {

    Pedido pedido = new Pedido();
    PedidoDAO dao = new PedidoDAO();
    frmTramitarSolicitudPedido vistaTramitar = new frmTramitarSolicitudPedido();

    public ControllerTramitarSolicitudPedido(frmTramitarSolicitudPedido frm) {
        this.vistaTramitar = frm;
        this.vistaTramitar.btnAceptar.addActionListener(this);
        this.vistaTramitar.btnRechazar.addActionListener(this);
        this.vistaTramitar.btnRefrescar.addActionListener(this);
        this.vistaTramitar.btnCancelar.addActionListener(this);
        this.vistaTramitar.btnBuscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaTramitar.btnAceptar) {
            try {
                tramitarSolicitud(1);

            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaTramitar.btnRechazar) {
            try {
                tramitarSolicitud(2);

            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaTramitar.btnBuscar) {
            try {
                filtrarTablaNumProducto(vistaTramitar.tblProductos, Integer.parseInt(vistaTramitar.txtBuscar.getText()));
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaTramitar.btnRefrescar) {
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaTramitar.btnCancelar) {
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void tramitarSolicitud(int num) throws Conexion.DataBaseException {

        int idProducto = Integer.parseInt(vistaTramitar.txtNumPedido.getText());
        int check = num;

        pedido.setNumPedido(idProducto);
        pedido.setCheck(check);

        int r = dao.tramitarSolicitud(pedido);

        if (r == 1) {
            JOptionPane.showMessageDialog(vistaTramitar, "Usuario actualizado con exito");
        } else {
            JOptionPane.showMessageDialog(vistaTramitar, "Usuario NO actualizado");
        }
    }

    public void filtrarTablaNumProducto(JTable tabla, int filtro) throws Conexion.DataBaseException {
        dao.filtrarTablaTramitar(tabla, filtro);
    }
    
    public void limpiarCampos() throws Conexion.DataBaseException {
        filtrarTablaNumProducto(vistaTramitar.tblProductos, 0 );
        vistaTramitar.txtIdCliente.setText("");
        vistaTramitar.txtNumPedido.setText("");
        vistaTramitar.txtFecha.setText("");
        vistaTramitar.txtDestino.setText("");
        vistaTramitar.txtTotal.setText("");
        vistaTramitar.txtIdPedido.setText("");
        vistaTramitar.txtBuscar.setText("");
    }
    public void iniciar() throws Conexion.DataBaseException {
        filtrarTablaNumProducto(vistaTramitar.tblProductos , 0 );

    }

}


    

