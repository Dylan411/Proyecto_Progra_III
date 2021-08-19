/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mail.Mail;

/**
 *
 * @author dylan_p1fbiqx
 */
public class UsuarioDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    StringBuilder generatedString = new StringBuilder();
    //Creo los objetos 
    Conexion conectar = new Conexion();
    Usuario u = new Usuario();
    Mail mail = new Mail();

    public StringBuilder getGeneratedString() {
        return generatedString;
    }

    public void setGeneratedString(StringBuilder generatedString) {
        this.generatedString = generatedString;
    }

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

    public int cambioPassword(Usuario user) throws Conexion.DataBaseException {
        String sql = "SELECT  * FROM usuarios WHERE userName=? and email = ? and act = 1";

        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUsuario());
            ps.setString(2, user.getCorreo());
            rs = ps.executeQuery();

            if (rs.next()) {
                return 1;
            } else {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                return 0;
            }

        } catch (SQLException e) {
            return 0;
        }
    }

    public void generarCodigoRamdom() {
        SecureRandom secureRandom = new SecureRandom();
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789$@!$%^&*";
        for (int i = 0; i < 8; i++) {
            int randonSequence = secureRandom.nextInt(CHARACTERS.length());
            generatedString.append(CHARACTERS.charAt(randonSequence));
        }
        setGeneratedString(generatedString);
    }

    public int insertarCodigo(Usuario user) throws Conexion.DataBaseException, UnsupportedEncodingException, MessagingException {
        int r = 0;
        String sql = "UPDATE usuarios SET cod=?  WHERE email=?";
        generarCodigoRamdom();
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, getGeneratedString().toString());
            ps.setString(2, user.getCorreo());
            r = ps.executeUpdate();
            mail.enviarMail(user.getCorreo(), getGeneratedString().toString());
        } catch (SQLException e) {
        }
        return r;
    }

    public int insertarPassword(Usuario user) throws Conexion.DataBaseException, UnsupportedEncodingException, MessagingException {
        int r = 0;
        String sql = "UPDATE usuarios SET password=?  WHERE email=?";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getContraseña());
            ps.setString(2, user.getCorreo());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public int compararCodigo(Usuario user) throws Conexion.DataBaseException {
        String sql = "SELECT  * FROM usuarios WHERE userName=? and cod= ? ";

        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUsuario());
            ps.setString(2, user.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                return 1;
            } else {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                return 0;
            }

        } catch (SQLException e) {
            return 0;
        }
    }

    public int cargarIdUsuario(String nombreUsuario) throws Conexion.DataBaseException {
        int idUsuario = 0;
        String sql = "SELECT id FROM usuarios WHERE userName='" + nombreUsuario + "'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            idUsuario = rs.getInt("id");
        } catch (SQLException e) {

        }
        return idUsuario;
    }
    
    public String cargarCorreo(String nombreUsuario) throws Conexion.DataBaseException {
        String correo = "";
        String sql = "SELECT email FROM usuarios WHERE userName='" + nombreUsuario + "'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            correo = rs.getString("email");
        } catch (SQLException e) {

        }
        return correo;
    }
}
