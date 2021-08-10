/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Conexion;
import modelo.Pedido;
import modelo.PedidoDAO;
import vista.frmTramitarSolicitudPedido;

/**
 *
 * @author PC-Soma
 */
public class ControllerTramitarSolicitudPedido implements ActionListener{
    
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
        
        if (e.getSource()== vistaTramitar.btnAceptar) {
            try {
               
            } catch (Conexion.DataBaseException ex) {
                
            }
        }
        if (e.getSource()== vistaTramitar.btnRechazar) {
            try {
               
            } catch (Conexion.DataBaseException ex) {
                
            }
        }
        if (e.getSource()== vistaTramitar.btnBuscar) {
            try {
               
            } catch (Conexion.DataBaseException ex) {
                
            }
        }
        if (e.getSource()== vistaTramitar.btnRefrescar) {
            try {
               
            } catch (Conexion.DataBaseException ex) {
                
            }
        }
        if (e.getSource()== vistaTramitar.btnCancelar) {
            try {
               
            } catch (Conexion.DataBaseException ex) {
                
            }
        }
        
        public void tramitarSolicitud(int num) throws Conexion.DataBaseException {

        int idProducto = Integer.parseInt(vistaTramitar.txtNumPedido.getText());
        int check = num;
        
        
        String nombreProducto = vistaProductos.txtNombreProducto.getText();
        String tipo = vistaProductos.txtTipo.getText();
        int cantidad = Integer.parseInt(vistaProductos.txtCantidadProducto4.getText());
        String descripcion = vistaProductos.txtDescripcionProducto.getText();
        int proveedor = Integer.parseInt(vistaProductos.txtIdProveedor.getText());
        int precio = Integer.valueOf(vistaProductos.txtPrecio4.getText());

        pedido.setNumPedido(idProducto);
        p.setNombreProducto(nombreProducto);
        p.setTipoProducto(tipo);
        p.setCantidad(cantidad);
        p.setDescripcion(descripcion);
        prov.setIdProveedor(proveedor);
        p.setProveedor(prov);
        p.setPrecio(precio);

        int r = dao.editarProducto(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaProductos, "Usuario actualizado con exito");
        } else {
            JOptionPane.showMessageDialog(vistaProductos, "Usuario NO actualizado");
        }
    } 
        
        
        
        
        
        
        
        
        
        
    }
    
}
