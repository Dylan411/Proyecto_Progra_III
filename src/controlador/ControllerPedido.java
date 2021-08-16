/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Helpers.Helpers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Clientes;
import modelo.ClientesDAO;
import modelo.Conexion;
import modelo.Pedido;
import modelo.PedidoDAO;
import modelo.Productos;
import modelo.Usuario;
import vista.frmSolicitarPedido;
import vista.homePage;

/**
 *
 * @author Janda
 */
public class ControllerPedido implements ActionListener {

    PedidoDAO dao = new PedidoDAO();
    ClientesDAO clieDAO = new ClientesDAO();
    frmSolicitarPedido vistaPedido = new frmSolicitarPedido();
    Productos productos = new Productos();
    Clientes clientes = new Clientes();
    Usuario usuarios = new Usuario();
    Pedido pedido = new Pedido();
    Helpers Helpers = new Helpers();

    public ControllerPedido(frmSolicitarPedido frm) {
        this.vistaPedido = frm;
        this.vistaPedido.btnEnviar.addActionListener(this);
        this.vistaPedido.btnCancelar.addActionListener(this);
        this.vistaPedido.btnAgregar.addActionListener(this);
        this.vistaPedido.btnEliminar.addActionListener(this);
        this.vistaPedido.btnBuscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaPedido.btnEnviar) {
            try {
                enviarSolicitud();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerPedido.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (e.getSource() == vistaPedido.btnCancelar) {
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerPedido.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (e.getSource() == vistaPedido.btnBuscar) {
            try {
                filtrarTablaNombre(vistaPedido.tblProductos, vistaPedido.txtBuscar.getText());
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void enviarSolicitud() throws Conexion.DataBaseException {
        Integer idCliente = Integer.parseInt(vistaPedido.cbClientes.getSelectedItem().toString());
        Integer idProducto = Integer.parseInt(vistaPedido.txtIdProducto.getText());
        Integer idUsuario = Integer.parseInt(homePage.lblId2.getText());
        int numPedido = Integer.parseInt(vistaPedido.txtNumPedido.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaVenta = sdf.format(vistaPedido.txtFecha.getText());
        String destino = vistaPedido.txtDestino.getText();
        int total = Integer.parseInt(vistaPedido.txtTotal.getText());

        productos.setIdProducto(idProducto);
        clientes.setIdCliente(idCliente);
        usuarios.setIdUsuario(idUsuario);
       
        pedido.setUsuarios(usuarios); 
        pedido.setProducto(productos);
        pedido.setClientes(clientes);
        pedido.setNumPedido(numPedido);
        pedido.setFechaVenta(fechaVenta);
        pedido.setDestino(destino);
        pedido.setTotal(total);
        int condicion = total;
        if (condicion > 10) {
            pedido.setDescuento(true);

        } else {
            pedido.setDescuento(false);
        }

        pedido.setCheck(0);

        int r = dao.enviarSolicitud(pedido);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaPedido, "Solicitud enviada correctamente");
        } else {
            JOptionPane.showMessageDialog(vistaPedido, "La solicitud NO fue enviada");
        }
    }

    public void iniciar() throws Conexion.DataBaseException {
        filtrarTablaNombre(vistaPedido.tblProductos, "");
        cargarComboClientes();
    }

    public void filtrarTablaNombre(JTable table, String filtro) throws Conexion.DataBaseException {
        dao.filtrarTablaNombre(table, filtro);
    }

    public void limpiarCampos() throws Conexion.DataBaseException {
        vistaPedido.txtBuscar.setText("");
        vistaPedido.txtCantidadProduc.setText("");
        vistaPedido.txtNumPedido.setText("");
        vistaPedido.txtFecha.setText("");
        vistaPedido.txtDestino.setText("");
        vistaPedido.txtTotal.setText("");
    }

    public void cargarComboClientes() throws Conexion.DataBaseException {
        clieDAO.cargarComboCliente(vistaPedido.cbClientes);
    }
}
