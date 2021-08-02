/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dylan_p1fbiqx
 */
public class UsuarioDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    //Creo los objetos 
    Conexion conectar = new Conexion();
    Usuario u = new Usuario();

    public boolean login(Usuario user) throws Conexion.DataBaseException {
        String sql = "SELECT  * FROM usuarios WHERE userName=? and password = ? and typeUser = ? and act = 1";

        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUsuario());
            ps.setString(2, user.getContraseña());
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

    public int agregarUsuario(Usuario user) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "INSERT INTO usuarios (userName, password, typeUser, act, email) VALUES (?, ?, ?, ?, ?)";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUsuario());
            ps.setString(2, user.getContraseña());
            ps.setString(3, user.getTipoUsuario());
            ps.setBoolean(4, user.isActivo());
            ps.setString(5, user.getCorreo());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public int editarUsuario(Usuario user) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "UPDATE usuarios SET userName=?, password=?, typeUser=?, act=?,email=?  WHERE id=?";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUsuario());
            ps.setString(2, user.getContraseña());
            ps.setString(3, user.getTipoUsuario());
            ps.setBoolean(4, user.isActivo());
            ps.setString(5, user.getCorreo());
            ps.setInt(6, user.getIdUsuario());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public void filtrarTablaPorNombreDeUsuario(JTable table, String filtro) throws Conexion.DataBaseException {

        //Declararo los headers del table
        String[] titulos = {"IdUsuario", "NombreUsuario", "Contraseña", "TipoUsuario", "Activo", "Correo"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM usuarios WHERE userName LIKE '%" + filtro + "%'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("id"); //como se llama el campo en la base de datos
                registros[1] = rs.getString("userName");
                registros[2] = rs.getString("password");
                registros[3] = rs.getString("typeUser");
                registros[4] = rs.getString("act");
                registros[5] = rs.getString("email");
                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos: " + e.getMessage());
        }
    }

    public int eliminarUsuario(int id) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "DELETE FROM usuarios WHERE id= " + id;
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }
    public int cargarIdUsuario(String nombreUsuario)throws Conexion.DataBaseException {
        int idUsuario=0;
        String sql="SELECT id FROM Usuarios WHERE userName='" + nombreUsuario + "'";
        try{
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs= ps.executeQuery();
            rs.next();
            idUsuario = rs.getInt("id");
        }catch(SQLException e){
            
        }
        return idUsuario;
    }
}
