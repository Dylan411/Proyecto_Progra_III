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
 * @author Janda
 */
public class ClientesDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    //Creo los objetos 
    Conexion conectar = new Conexion();
    Clientes c = new Clientes();

    public int agregarCliente(Clientes client) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "INSERT INTO Clientes (contactName, companyName, adress, city, region,phone) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, client.getNombreCliente());
            ps.setString(2, client.getNombreCompañia());
            ps.setString(3, client.getDireccion());
            ps.setString(4, client.getCuidad());
            ps.setString(5, client.getRegion());
            ps.setInt(6, client.getTelefono());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public int editarCliente(Clientes client) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "UPDATE Clientes SET contactName=?, companyName=?, adress=?, city=?,region=?, phone=?  WHERE id=?";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, client.getNombreCliente());
            ps.setString(2, client.getNombreCompañia());
            ps.setString(3, client.getDireccion());
            ps.setString(4, client.getCuidad());
            ps.setString(5, client.getRegion());
            ps.setInt(6, client.getTelefono());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public void filtrarTablaNomCliente(JTable table, String filtro) throws Conexion.DataBaseException {

        //Declararo los headers del table
        String[] titulos = {"Id Cliente", "Nombre", "Nombre Compañia", "Direccion ", "Cuidad", "Region", "Telefono"};
        String[] registros = new String[7];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM Clientes WHERE contactName LIKE '%" + filtro + "%'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("idCliente"); //como se llama el campo en la base de datos
                registros[1] = rs.getString("contactName");
                registros[2] = rs.getString("companyName");
                registros[3] = rs.getString("adress");
                registros[4] = rs.getString("city");
                registros[5] = rs.getString("region");
                registros[6] = rs.getString("phone");
                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos: " + e.getMessage());
        }
    }

    public int eliminarCliente(int id) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "DELETE FROM Clientes WHERE id= " + id;
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public void cargarComboCliente(JComboBox combo) throws Conexion.DataBaseException {
        combo.removeAllItems();
        combo.addItem("SELECCIONAR CLIENTES");
        String sql = "SELECT * FROM Clientes";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                combo.addItem(rs.getString("contactName"));
            }

        } catch (SQLException e) {
        }
    }

    public void cargarIdCliente(JComboBox combo, JTextField textField)throws Conexion.DataBaseException {
        String sql = "SELECT idCliente FROM Clientes WHERE contactName= '" + combo.getSelectedItem() + "'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            textField.setText(String.valueOf(rs.getInt("idCliente")));
        } catch (SQLException e) {
        }
    }
}
