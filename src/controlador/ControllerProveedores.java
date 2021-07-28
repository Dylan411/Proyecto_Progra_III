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
import modelo.Proveedores;
import modelo.ProveedoresDAO;
import vista.frmProveedores;
/**
 *
 * @author isabel
 */
public class ControllerProveedores implements ActionListener{
    
    
    Proveedores p = new Proveedores();
    ProveedoresDAO dao = new ProveedoresDAO();
    frmProveedores vistaProveedores = new frmProveedores();

    public ControllerProveedores(frmProveedores frm) {
        
        this.vistaProveedores = frm;
        this.vistaProveedores.btnGuardar.addActionListener(this);
        this.vistaProveedores.btnEditar.addActionListener(this);
        this.vistaProveedores.btnRefrescar.addActionListener(this);
        this.vistaProveedores.btnEliminar.addActionListener(this);
        this.vistaProveedores.btnBuscarPorNomCompañia.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vistaProveedores.btnGuardar) {
            try {
                agregarProveedor();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaProveedores.btnEditar) {
            try {
                editarProveedor();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaProveedores.btnRefrescar) {
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaProveedores.btnEliminar) {
            try {
                eliminarProveedor();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaProveedores.btnBuscarPorNomCompañia) {
            try {
                filtrarTablaPorNombreDeCompañia(vistaProveedores.tableProveedores, vistaProveedores.txtBusquedaPorNomCompañia.getText());
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
     public void agregarProveedor() throws Conexion.DataBaseException {

        String nombreContacto = vistaProveedores.txtNombreContacto.getText();
        String nombreCompañia = vistaProveedores.txtNombreCompañia.getText();
        String ciudad = vistaProveedores.txtCiudad.getText();
        int telefono = Integer.parseInt(vistaProveedores.txtTelefono.getText());

        p.setNombreContacto(nombreContacto);
        p.setNombreCompañia(nombreCompañia);
        p.setCiudad(ciudad);
        p.setTelefono(telefono);

        int r = dao.agregarProveedor(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaProveedores, "Proveedor agregado correctamente");
        } else {
            JOptionPane.showMessageDialog(vistaProveedores, "El proveedor NO fue agregado");
        }
    }
    
     public void editarProveedor() throws Conexion.DataBaseException {

        int idProveedor = Integer.parseInt(vistaProveedores.txtIdProveedor.getText());
        String nombreContacto = vistaProveedores.txtNombreContacto.getText();
        String nombreCompañia = vistaProveedores.txtNombreCompañia.getText();
        String ciudad = vistaProveedores.txtCiudad.getText();
        int telefono = Integer.parseInt(vistaProveedores.txtTelefono.getText());

        p.setIdProveedor(idProveedor);
        p.setNombreContacto(nombreContacto);
        p.setNombreCompañia(nombreCompañia);
        p.setCiudad(ciudad);
        p.setTelefono(telefono);

        int r = dao.editarProveedor(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaProveedores, "Proveedor actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(vistaProveedores, "El proveedor NO fue actualizado");
        }
    }
     
     public void filtrarTablaPorNombreDeCompañia(JTable tabla, String filtro) throws Conexion.DataBaseException {
        dao.filtrarTablaPorNombreCompañia(tabla, filtro);
    }
     
        public void eliminarProveedor() throws Conexion.DataBaseException {

        int r = 0;
        int fila = vistaProveedores.tableProveedores.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaProveedores, "Para eliminar un registro debe de seleccionar un proveedor en la tabla");
        } else {
            int id = Integer.parseInt(vistaProveedores.tableProveedores.getValueAt(fila, 0).toString());
            r = dao.eliminarProveedor(id);
            if (r == 1) {
                filtrarTablaPorNombreDeCompañia(vistaProveedores.tableProveedores, "");
                limpiarCampos();
                JOptionPane.showMessageDialog(vistaProveedores, "Proveedor eliminado con exito");
            } else {
                JOptionPane.showMessageDialog(vistaProveedores, "Proveedor NO eliminado");
            }
        }
    }
        
         public void limpiarCampos() throws Conexion.DataBaseException {
        filtrarTablaPorNombreDeCompañia(vistaProveedores.tableProveedores, "");
        vistaProveedores.txtBusquedaPorNomCompañia.setText("");
        vistaProveedores.txtCiudad.setText("");
        vistaProveedores.txtIdProveedor.setText("");
        vistaProveedores.txtNombreCompañia.setText("");
        vistaProveedores.txtNombreContacto.setText("");
        vistaProveedores.txtTelefono.setText("");
    }

    public void iniciar() throws Conexion.DataBaseException {
        filtrarTablaPorNombreDeCompañia(vistaProveedores.tableProveedores, "");
        limpiarCampos();
    }
}
