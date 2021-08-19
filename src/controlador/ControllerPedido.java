/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Helpers.Helpers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Clientes;
import modelo.ClientesDAO;
import modelo.Conexion;
import modelo.Pedido;
import modelo.PedidoDAO;
import modelo.Productos;
import modelo.ProductosDAO;
import modelo.Usuario;
import vista.frmSolicitarPedido;
import vista.homePage;

/**
 *
 * @author Janda
 */
public class ControllerPedido implements ActionListener {

    Connection con;
    DefaultTableModel modelo;
    PedidoDAO dao = new PedidoDAO();
    ClientesDAO clieDAO = new ClientesDAO();
    ProductosDAO prodDAO = new ProductosDAO();
    frmSolicitarPedido vistaPedido = new frmSolicitarPedido();
    Productos productos = new Productos();
    Clientes clientes = new Clientes();
    Usuario usuarios = new Usuario();
    Pedido pedido = new Pedido();
    Helpers Helpers = new Helpers();
    Conexion conectar = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public ControllerPedido(frmSolicitarPedido frm) {
        this.vistaPedido = frm;
        this.vistaPedido.btnEnviar.addActionListener(this);
        this.vistaPedido.btnCancelar.addActionListener(this);
        this.vistaPedido.btnAgregar.addActionListener(this);
        this.vistaPedido.btnEliminar.addActionListener(this);
        this.vistaPedido.btnEditar.addActionListener(this);
        this.vistaPedido.btnCalcular.addActionListener(this);
        this.vistaPedido.cbClientes.addActionListener(this);
        this.vistaPedido.cbProductos.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaPedido.btnEnviar) {
            try {
                enviarSolicitud();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerPedido.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(ControllerPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                limpiarCampos();
                cargarUltimoPedido();
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
        if (e.getSource() == vistaPedido.btnAgregar) {
            try {
                agregarProductosCarrito(vistaPedido.cbProductos, vistaPedido.tblSolicitud);
                vistaPedido.txtTotal.setText("");
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaPedido.btnEditar) {
            try {
                actualizarProductosCarrito(vistaPedido.cbProductos, vistaPedido.tblSolicitud);
                vistaPedido.txtTotal.setText("");
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaPedido.btnEliminar) {
            eliminarProductosCarrito();
            vistaPedido.txtTotal.setText("");
        }
        if (e.getSource() == vistaPedido.btnCalcular) {
            calcularTotal();
        }
        if (e.getSource() == vistaPedido.cbClientes) {
            try {
                clieDAO.cargarIdCliente(vistaPedido.cbClientes, vistaPedido.txtIdCliente);
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaPedido.cbProductos) {
            try {
                prodDAO.cargarIdProducto(vistaPedido.cbProductos, vistaPedido.txtIdProducto);
                prodDAO.cargarPrecioProducto(vistaPedido.cbProductos, vistaPedido.txtPrecio);
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void enviarSolicitud() throws Conexion.DataBaseException, ParseException {
        Integer idCliente = Integer.parseInt(vistaPedido.txtIdCliente.getText());
        Integer idProducto = Integer.parseInt(vistaPedido.txtIdProducto.getText());
        Integer idUsuario = Integer.parseInt(homePage.lblId2.getText());
        int numPedido = Integer.parseInt(vistaPedido.txtNumPedido.getText());
        String destino = vistaPedido.txtDestino.getText();
        int total = Integer.parseInt(vistaPedido.txtTotal.getText());

        productos.setIdProducto(idProducto);
        clientes.setIdCliente(idCliente);
        usuarios.setIdUsuario(idUsuario);

        pedido.setUsuarios(usuarios);
        pedido.setProducto(productos);
        pedido.setClientes(clientes);
        pedido.setNumPedido(numPedido);
        pedido.setFechaVenta(Helpers.fechaActual().toString());
        pedido.setDestino(destino);
        pedido.setTotal(total);
        int condicion = total;
        if (condicion > 10) {
            pedido.setDescuento(true);

        } else {
            pedido.setDescuento(false);
        }

        pedido.setCheck(0);
        pedido.setdespachada(0);
        int r = dao.enviarSolicitud(pedido);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaPedido, "Solicitud enviada correctamente");
        } else {
            JOptionPane.showMessageDialog(vistaPedido, "La solicitud NO fue enviada");
        }
    }

    public void iniciar() throws Conexion.DataBaseException, ParseException {
        cargarComboProductos();
        cargarComboClientes();
        vistaPedido.txtFecha.setText(Helpers.fechaActual().toString());
        cargarUltimoPedido();
        crearTable();
        limpiarTableCarrito();
        limpiarCampos();
    }

    public void limpiarCampos() throws Conexion.DataBaseException {
        vistaPedido.txtPrecio.setText("");
        vistaPedido.txtCantidadProduc.setText("");
        vistaPedido.txtDestino.setText("");
        vistaPedido.txtTotal.setText("");
        vistaPedido.txtIdProducto.setText("");
        clieDAO.cargarComboCliente(vistaPedido.cbClientes);
        prodDAO.cargarComboProducto(vistaPedido.cbProductos);
        limpiarTableCarrito();
    }

    public void cargarComboClientes() throws Conexion.DataBaseException {
        clieDAO.cargarComboCliente(vistaPedido.cbClientes);
    }
    
    public void cargarComboProductos() throws Conexion.DataBaseException {
        prodDAO.cargarComboProducto(vistaPedido.cbProductos);
    }
    
    public void cargarUltimoPedido() throws Conexion.DataBaseException {
        dao.ultimoPedido(vistaPedido.txtNumPedido);
    }
    
    public void crearTable() {
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        vistaPedido.tblSolicitud.setModel(modelo);
        
        int filaSeleccionada = vistaPedido.tblSolicitud.getSelectedRow();

        if (filaSeleccionada >= 0) {
            String datos[] = new String[5];
            datos[0] = vistaPedido.tblSolicitud.getValueAt(filaSeleccionada, 0).toString();
            datos[1] = vistaPedido.tblSolicitud.getValueAt(filaSeleccionada, 1).toString();
            datos[2] = vistaPedido.tblSolicitud.getValueAt(filaSeleccionada, 2).toString();
            datos[3] = vistaPedido.tblSolicitud.getValueAt(filaSeleccionada, 3).toString();
            datos[4] = vistaPedido.tblSolicitud.getValueAt(filaSeleccionada, 4).toString();
        }
    }
    
    public void agregarProductosCarrito(JComboBox combo, JTable table) throws Conexion.DataBaseException {
        
        String cant = vistaPedido.txtCantidadProduc.getText();
        String sql = "SELECT name, type, description, price FROM Productos WHERE name= '" + combo.getSelectedItem() + "'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                String datos1 = rs.getString("name");
                String datos2 = rs.getString("type");
                String datos3 = rs.getString("description");
                String datos4 = rs.getString("price");
                String datos5 = cant;
                
                String datos[]={datos1,datos2,datos3,datos4,datos5};
                
                modelo.addRow(datos);
            }
            table.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("Error al agregar producto" + e.getMessage());
        }
    }
    
    public void actualizarProductosCarrito(JComboBox combo, JTable table) throws Conexion.DataBaseException {
        
        int filaSeleccionada = vistaPedido.tblSolicitud.getSelectedRow();
        String cant = vistaPedido.txtCantidadProduc.getText();
        String sql = "SELECT name, type, description, price FROM Productos WHERE name= '" + combo.getSelectedItem() + "'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                String datos1 = rs.getString("name");
                String datos2 = rs.getString("type");
                String datos3 = rs.getString("description");
                String datos4 = rs.getString("price");
                String datos5 = cant;
               
                modelo.setValueAt(datos1, filaSeleccionada, 0);
                modelo.setValueAt(datos2, filaSeleccionada, 1);
                modelo.setValueAt(datos3, filaSeleccionada, 2);
                modelo.setValueAt(datos4, filaSeleccionada, 3);
                modelo.setValueAt(datos5, filaSeleccionada, 4);
            }
            
        } catch (SQLException e) {
            System.out.println("Error al editar producto" + e.getMessage());
        }
    }
    
    public void eliminarProductosCarrito() {

        try {
            int filaSeleccionada = vistaPedido.tblSolicitud.getSelectedRow();
            modelo.removeRow(filaSeleccionada);
        } catch (Exception e) {
            System.out.println("Error al eliminar producto" + e.getMessage());
        }
    }
    
    public void limpiarTableCarrito() {

        for (int i = 0; i < vistaPedido.tblSolicitud.getRowCount(); i++) {
            String datos1 = vistaPedido.tblSolicitud.getValueAt(i, 0).toString();
            String datos2 = vistaPedido.tblSolicitud.getValueAt(i, 1).toString();
            String datos3 = vistaPedido.tblSolicitud.getValueAt(i, 2).toString();
            String datos4 = vistaPedido.tblSolicitud.getValueAt(i, 3).toString();
            String datos5 = vistaPedido.tblSolicitud.getValueAt(i, 4).toString();

            modelo.removeRow(i);
        }
    }
    
    public void calcularTotal() {

        int t = 0;
        int p = 0;
        int s = 0;
        if (vistaPedido.tblSolicitud.getRowCount() > 0) {
            for (int i = 0; i < vistaPedido.tblSolicitud.getRowCount(); i++) {
                s = Integer.parseInt(vistaPedido.tblSolicitud.getValueAt(i, 3).toString());
                p = Integer.parseInt(vistaPedido.tblSolicitud.getValueAt(i, 4).toString());
                t += s * p;
            }
        }
        vistaPedido.txtTotal.setText(String.valueOf(t));
    }
}
