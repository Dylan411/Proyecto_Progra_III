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
import modelo.Clientes;
import modelo.ClientesDAO;
import modelo.Conexion;
import vista.frmClientes;

/**
 *
 * @author Janda
 */
public class ControllerClientes implements ActionListener {

    Clientes c = new Clientes();
    frmClientes vistaClientes = new frmClientes();
    ClientesDAO dao = new ClientesDAO();



    public  ControllerClientes(frmClientes frm) {

        this.vistaClientes = frm;
        this.vistaClientes.btnGuardar.addActionListener(this);
        this.vistaClientes.btnEditar.addActionListener(this);
        this.vistaClientes.btnRefrescar.addActionListener(this);
        this.vistaClientes.btnEliminar.addActionListener(this);
        this.vistaClientes.btnBuscarPorNomProducto.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaClientes.btnGuardar) {
            try {
                agregarCliente();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (e.getSource() == vistaClientes.btnEditar) {
            try {
                editarCliente();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaClientes.btnRefrescar) {
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaClientes.btnEliminar) {
            try {
                eliminarCliente();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaClientes.btnBuscarPorNomProducto) {
            try {
                filtrarTablaNomProducto(vistaClientes.tblClientes, vistaClientes.txtBusquedadCliente.getText());
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void agregarCliente() throws Conexion.DataBaseException {

        String nombreCliente = vistaClientes.txtNombreCliente.getText();
        String nombreCompañia = vistaClientes.txtNombreCompañia.getText();
        String direccion = vistaClientes.txtDireccion.getText();
        String cuidad = vistaClientes.txtCuidad.getText();
        String region = vistaClientes.txtRegion.getText();
        int telefono = Integer.parseInt(vistaClientes.txtTelefono.getText());

        c.setNombreCliente(nombreCliente);
        c.setNombreCompañia(nombreCompañia);
        c.setDireccion(direccion);
        c.setCuidad(cuidad);
        c.setRegion(region);
        c.setTelefono(telefono);
        int r = dao.agregarCliente(c);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaClientes, "Cliente agregado correctamente");
        } else {
            JOptionPane.showMessageDialog(vistaClientes, "El Cliente NO fue agregado");
        }
    }

    public void editarCliente() throws Conexion.DataBaseException {

        int idCliente = Integer.parseInt(vistaClientes.txtIdCliente.getText());
        String nombreCliente = vistaClientes.txtNombreCliente.getText();
        String nombreCompañia = vistaClientes.txtNombreCompañia.getText();
        String direccion = vistaClientes.txtDireccion.getText();
        String cuidad = vistaClientes.txtCuidad.getText();
        String region = vistaClientes.txtRegion.getText();
        int telefono = Integer.parseInt(vistaClientes.txtTelefono.getText());
        c.setIdCliente(idCliente);
        c.setNombreCliente(nombreCliente);
        c.setNombreCompañia(nombreCompañia);
        c.setDireccion(direccion);
        c.setCuidad(cuidad);
        c.setRegion(region);
        c.setTelefono(telefono);

        int r = dao.editarCliente(c);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaClientes, "Cliente actualizado con exito");
        } else {
            JOptionPane.showMessageDialog(vistaClientes, "Cliente NO actualizado");
        }
    }

    public void filtrarTablaNomProducto(JTable tabla, String filtro) throws Conexion.DataBaseException {
        dao.filtrarTablaNomCliente(tabla, filtro);
    }

    public void eliminarCliente() throws Conexion.DataBaseException {

        int r = 0;
        int fila = vistaClientes.tblClientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaClientes, "Para eliminar un registro debe de seleccionar un usuario en la tabla");
        } else {
            int id = Integer.parseInt(vistaClientes.tblClientes.getValueAt(fila, 0).toString());
            r = dao.eliminarCliente(id);
            if (r == 1) {
                filtrarTablaNomProducto(vistaClientes.tblClientes, "");
                limpiarCampos();
                JOptionPane.showMessageDialog(vistaClientes, "Cliente eliminado con exito");
            } else {
                JOptionPane.showMessageDialog(vistaClientes, "Cliente NO eliminado");
            }
        }
    }

    public void limpiarCampos() throws Conexion.DataBaseException {
        filtrarTablaNomProducto(vistaClientes.tblClientes, "");
        vistaClientes.txtIdCliente.setText("");
        vistaClientes.txtNombreCliente.setText("");
        vistaClientes.txtNombreCompañia.setText("");
        vistaClientes.txtDireccion.setText("");
        vistaClientes.txtCuidad.setText("");
        vistaClientes.txtRegion.setText("");
        vistaClientes.txtTelefono.setText("");

    }

    public void iniciar() throws Conexion.DataBaseException {
        filtrarTablaNomProducto(vistaClientes.tblClientes, "");
        limpiarCampos();
    }
}
