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
import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.frmUsuarios;

/**
 *
 * @author isabel
 */
public class ControllerUsuario implements ActionListener {

    Usuario u = new Usuario();
    UsuarioDAO dao = new UsuarioDAO();
    frmUsuarios vistaUsuario = new frmUsuarios();

    public ControllerUsuario(frmUsuarios frm) {

        this.vistaUsuario = frm;
        this.vistaUsuario.btnGuardar.addActionListener(this);
        this.vistaUsuario.btnEditar.addActionListener(this);
        this.vistaUsuario.btnRefrescar.addActionListener(this);
        this.vistaUsuario.btnEliminar.addActionListener(this);
        this.vistaUsuario.btnBuscarPorNomUsuario.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaUsuario.btnGuardar) {
            if (!vistaUsuario.txtContraseña.getText().equals(vistaUsuario.txtConfirmarContraseña.getText())) {
                JOptionPane.showMessageDialog(vistaUsuario, "La contraseña no coincide con la confirmacion", "Corregir contraseña", JOptionPane.INFORMATION_MESSAGE);
                vistaUsuario.txtContraseña.requestFocus();
            } else {
                try {
                    agregarUsuario();
                } catch (Conexion.DataBaseException ex) {
                    Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    limpiarCampos();
                } catch (Conexion.DataBaseException ex) {
                    Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (e.getSource() == vistaUsuario.btnEditar) {
            try {
                editarUsuario();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaUsuario.btnRefrescar) {
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaUsuario.btnEliminar) {
            try {
                eliminarUsuario();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                limpiarCampos();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaUsuario.btnBuscarPorNomUsuario) {
            try {
                filtrarTablaPorNombreDeUsuario(vistaUsuario.tableUsuarios, vistaUsuario.txtBusquedaPorNomUsuario.getText());
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void agregarUsuario() throws Conexion.DataBaseException {

        String nombreUsuario = vistaUsuario.txtNombreUsuario.getText();
        String contraseña = vistaUsuario.txtContraseña.getText();
        String tipoUsuario = vistaUsuario.cbTipoUsuario.getSelectedItem().toString();
        boolean activo = vistaUsuario.cbActivo.isSelected();
        String correo = vistaUsuario.txtCorreo.getText();

        u.setNombreUsuario(nombreUsuario);
        u.setContraseña(contraseña);
        u.setTipoUsuario(tipoUsuario);
        u.setActivo(activo);
        u.setCorreo(correo);

        int r = dao.agregarUsuario(u);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaUsuario, "Usuario agregado correctamente");
        } else {
            JOptionPane.showMessageDialog(vistaUsuario, "El usuario NO fue agregado");
        }
    }

    public void editarUsuario() throws Conexion.DataBaseException {

        int idUsuario = Integer.parseInt(vistaUsuario.txtIdUsuario.getText());
        String nombreUsuario = vistaUsuario.txtNombreUsuario.getText();
        String contraseña = vistaUsuario.txtContraseña.getText();
        String tipoUsuario = vistaUsuario.cbTipoUsuario.getSelectedItem().toString();
        boolean activo = vistaUsuario.cbActivo.isSelected();
        String correo = vistaUsuario.txtCorreo.getText();

        u.setIdUsuario(idUsuario);
        u.setNombreUsuario(nombreUsuario);
        u.setContraseña(contraseña);
        u.setTipoUsuario(tipoUsuario);
        u.setActivo(activo);
        u.setCorreo(correo);

        int r = dao.editarUsuario(u);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaUsuario, "Usuario actualizado con exito");
        } else {
            JOptionPane.showMessageDialog(vistaUsuario, "Usuario NO actualizado");
        }
    }

    public void filtrarTablaPorNombreDeUsuario(JTable tabla, String filtro) throws Conexion.DataBaseException {
        dao.filtrarTablaPorNombreDeUsuario(tabla, filtro);
    }

    public void eliminarUsuario() throws Conexion.DataBaseException {

        int r = 0;
        int fila = vistaUsuario.tableUsuarios.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaUsuario, "Para eliminar un registro debe de seleccionar un usuario en la tabla");
        } else {
            int id = Integer.parseInt(vistaUsuario.tableUsuarios.getValueAt(fila, 0).toString());
            r = dao.eliminarUsuario(id);
            if (r == 1) {
                filtrarTablaPorNombreDeUsuario(vistaUsuario.tableUsuarios, "");
                limpiarCampos();
                JOptionPane.showMessageDialog(vistaUsuario, "Usuario eliminado con exito");
            } else {
                JOptionPane.showMessageDialog(vistaUsuario, "Usuario NO eliminado");
            }
        }
    }

    public void limpiarCampos() throws Conexion.DataBaseException {
        filtrarTablaPorNombreDeUsuario(vistaUsuario.tableUsuarios, "");
        vistaUsuario.txtIdUsuario.setText("");
        vistaUsuario.txtNombreUsuario.setText("");
        vistaUsuario.txtContraseña.setText("");
        vistaUsuario.txtConfirmarContraseña.setText("");
        vistaUsuario.cbTipoUsuario.setSelectedIndex(0);
        vistaUsuario.txtCorreo.setText("");
        vistaUsuario.cbActivo.setSelected(false);
    }

    public void iniciar() throws Conexion.DataBaseException {
        filtrarTablaPorNombreDeUsuario(vistaUsuario.tableUsuarios, "");
        limpiarCampos();
    }
}
