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
import javax.swing.JTable;
import modelo.Conexion;
import modelo.PedidoDAO;
import sun.java2d.Disposer;
import vista.frmSolicitudesNegadas;

/**
 *
 * @author Janda
 */
public class ControllerSolicitudesNegadas implements ActionListener {

    frmSolicitudesNegadas vistaNegadas = new frmSolicitudesNegadas();
    PedidoDAO dao = new PedidoDAO();

    public ControllerSolicitudesNegadas(frmSolicitudesNegadas frm) {
        this.vistaNegadas = frm;
        this.vistaNegadas.btnBuscar.addActionListener(this);
        this.vistaNegadas.btnOk.addActionListener(this);
        this.vistaNegadas.btnRefrescar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaNegadas.btnOk) {
            try {
                salir();
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vistaNegadas.btnBuscar) {
            try {
                filtrarTablaNumProductoNegada(vistaNegadas.tblProductos, vistaNegadas.txtBuscar.getText());
            } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource()== vistaNegadas.btnRefrescar){
            try {
                iniciar();
                        } catch (Conexion.DataBaseException ex) {
                Logger.getLogger(ControllerSolicitudesNegadas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void salir() throws Conexion.DataBaseException {
       vistaNegadas.setVisible(false);
    }

    public void iniciar() throws Conexion.DataBaseException {
        dao.iniciar(vistaNegadas.tblProductos, "");

    }

    public void filtrarTablaNumProductoNegada(JTable tabla, String filtro) throws Conexion.DataBaseException {
        dao.filtrarTablaNegada(tabla, filtro);
    }
}
