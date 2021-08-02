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
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isabel
 */
public class ProveedoresDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    //Creo los objetos 
    Conexion conectar = new Conexion();
    Proveedores p = new Proveedores();

    public int agregarProveedor(Proveedores provider) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "INSERT INTO proveedores (contactName, companyName, city, phone) VALUES (?, ?, ?, ?)";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, provider.getNombreContacto());
            ps.setString(2, provider.getNombreCompañia());
            ps.setString(3, provider.getCiudad());
            ps.setInt(4, provider.getTelefono());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public int editarProveedor(Proveedores provider) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "UPDATE proveedores SET contactName=?, companyName=?, city=?, phone=?  WHERE idProveedor=?";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, provider.getNombreContacto());
            ps.setString(2, provider.getNombreCompañia());
            ps.setString(3, provider.getCiudad());
            ps.setInt(4, provider.getTelefono());
            ps.setInt(5, provider.getIdProveedor());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public void filtrarTablaPorNombreCompañia(JTable table, String filtro) throws Conexion.DataBaseException {

        //Declararo los headers del table
        String[] titulos = {"IdProveedor", "NombreContacto", "NombreCompañia", "Ciudad", "Teléfono"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM proveedores WHERE companyName LIKE '%" + filtro + "%'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("idProveedor"); //como se llama el campo en la base de datos
                registros[1] = rs.getString("contactName");
                registros[2] = rs.getString("companyName");
                registros[3] = rs.getString("city");
                registros[4] = rs.getString("phone");
                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos: " + e.getMessage());
        }
    }

    public int eliminarProveedor(int id) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "DELETE FROM proveedores WHERE idProveedor= " + id;
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public void cargarIdProveedor(JComboBox combo, JTextField textField) throws Conexion.DataBaseException {
        String sql = "SELECT idProveedor FROM proveedores WHERE companyName = '" + combo.getSelectedItem() + "'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            textField.setText(String.valueOf(rs.getInt("idProveedor")));

        } catch (SQLException e) {
        }
    }

    public void cargarComboDueños(JComboBox combo) throws Conexion.DataBaseException {
        combo.removeAllItems();
        combo.addItem("Seleccionar un proveedor");
        String sql = "SELECT * FROM proveedores";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); //le da play al query
            while (rs.next()) {
                combo.addItem(rs.getString("companyName"));
            }
        } catch (SQLException e) {
        }
    }
}
