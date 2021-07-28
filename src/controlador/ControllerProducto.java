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
import modelo.Productos;
import modelo.ProductosDAO;
import vista.frmProductos;

/**
 *
 * @author PC-Soma
 */
public class ControllerProducto implements ActionListener{
    
    Productos p = new Productos();
    ProductosDAO dao = new ProductosDAO();
    frmProductos vistaProductos = new frmProductos();

    public ControllerProducto(frmProductos frm) {
        this.vistaProductos = frm;
        this.vistaProductos.btnGuardar.addActionListener(this);
        this.vistaProductos.btnEditar.addActionListener(this);
        this.vistaProductos.btnRefrescar.addActionListener(this);
        this.vistaProductos.btnEliminar.addActionListener(this);
        this.vistaProductos.btnBuscarPorNomProducto.addActionListener(this);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaProductos.btnGuardar) {
            try {
                    agregarProducto();
                } catch (Conexion.DataBaseException ex) {
                    Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            try {
                    limpiarCampos();
                } catch (Conexion.DataBaseException ex) {
                    Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
        if (e.getSource() == vistaProductos.btnEditar) {
            try {
                    editarProducto();
                } catch (Conexion.DataBaseException ex) {
                    Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            try {
                    limpiarCampos();
                } catch (Conexion.DataBaseException ex) {
                    Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        if (e.getSource() == vistaProductos.btnRefrescar) {
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaProductos.btnEliminar) {
            try {
                eliminarProducto();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaProductos.btnBuscarPorNomProducto) {
            try {
                filtrarTablaNomProducto(vistaProductos.tableProducto, vistaProductos.txtBusquedaPorNomProducto.getText());
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void agregarProducto() throws Conexion.DataBaseException {

        String nombreProducto = vistaProductos.txtNombreProducto.getText();
        String tipo = vistaProductos.txtTipo.getText(); 
        int cantidad = Integer.parseInt(vistaProductos.txtCantidadProducto.getText());
        String descripcion = vistaProductos.txtDescripcionProducto.getText();
        int proveedor = Integer.valueOf(vistaProductos.cbProveedorProducto.getSelectedItem().toString());
        int precio = Integer.valueOf(vistaProductos.txtPrecio.getText());
        
        p.setNombreProducto(nombreProducto);
        p.setTipoProducto(tipo);
        p.setCantidad(cantidad);
        p.setDescripcion(descripcion);
        p.setIdProveedor(proveedor);
        p.setPrecio(precio);

        int r = dao.agregarProducto(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaProductos, "Usuario agregado correctamente");
        } else {
            JOptionPane.showMessageDialog(vistaProductos, "El usuario NO fue agregado");
        }
    }

    public void editarProducto() throws Conexion.DataBaseException {

        int idProducto = Integer.parseInt(vistaProductos.txtIdProducto.getText());
        String nombreProducto = vistaProductos.txtNombreProducto.getText();
        String tipo = vistaProductos.txtTipo.getText(); 
        int cantidad = Integer.parseInt(vistaProductos.txtCantidadProducto.getText());
        String descripcion = vistaProductos.txtDescripcionProducto.getText();
        int proveedor = Integer.valueOf(vistaProductos.cbProveedorProducto.getSelectedItem().toString());
        int precio = Integer.valueOf(vistaProductos.txtPrecio.getText());

        p.setIdProducto(idProducto);
        p.setNombreProducto(nombreProducto);
        p.setTipoProducto(tipo);
        p.setCantidad(cantidad);
        p.setDescripcion(descripcion);
        p.setIdProducto(proveedor);
        p.setPrecio(precio);

        int r = dao.editarProducto(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaProductos, "Usuario actualizado con exito");
        } else {
            JOptionPane.showMessageDialog(vistaProductos, "Usuario NO actualizado");
        }
    }

    public void filtrarTablaNomProducto(JTable tabla, String filtro) throws Conexion.DataBaseException {
        dao.filtrarTablaNomProducto(tabla, filtro);
    }

    public void eliminarProducto() throws Conexion.DataBaseException {

        int r = 0;
        int fila = vistaProductos.tableProducto.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaProductos, "Para eliminar un registro debe de seleccionar un usuario en la tabla");
        } else {
            int id = Integer.parseInt(vistaProductos.tableProducto.getValueAt(fila, 0).toString());
            r = dao.eliminarProducto(id);
            if (r == 1) {
                filtrarTablaNomProducto(vistaProductos.tableProducto, "");
                limpiarCampos();
                JOptionPane.showMessageDialog(vistaProductos, "Usuario eliminado con exito");
            } else {
                JOptionPane.showMessageDialog(vistaProductos, "Usuario NO eliminado");
            }
        }
    }

    public void limpiarCampos() throws Conexion.DataBaseException {
        filtrarTablaNomProducto(vistaProductos.tableProducto, "");
        vistaProductos.txtIdProducto.setText("");
        vistaProductos.txtNombreProducto.setText("");
        vistaProductos.txtTipo.setText("");
        vistaProductos.txtCantidadProducto.setText("");
        vistaProductos.txtDescripcionProducto.setText("");
        vistaProductos.cbProveedorProducto.setSelectedIndex(0);
        vistaProductos.txtBusquedaPorNomProducto.setText("");
        vistaProductos.txtPrecio.setText("");
    }

    public void iniciar() throws Conexion.DataBaseException {
        filtrarTablaNomProducto(vistaProductos.tableProducto, "");
        limpiarCampos();
    }
}
