/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author dylan_p1fbiqx
 */
public class UsuarioDAO {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    Conexion conectar = new Conexion();
    
    public boolean login(Usuario user) throws Conexion.DataBaseException {

        String sql = "SELECT  * FROM usuarios WHERE userName=? and password = ? and typeUser = ? and act = 1";

        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUsuario());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getTipoUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                return false;
            }

        } catch (SQLException e) {
            return false;
        }
    }
}