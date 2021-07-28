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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC-Soma
 */
public class ProductosDAO {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    //Creo los objetos 
    Conexion conectar = new Conexion();
    Productos p = new Productos();
    
    public int agregarProducto(Productos product) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "INSERT INTO productos (name, type, quantity, description, idProveedor, price) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, product.getNombreProducto());
            ps.setString(2, product.getTipoProducto());
            ps.setInt(3, product.getCantidad());
            ps.setString(4, product.getDescripcion());
            ps.setInt(5, product.getIdProveedor() );
            ps.setInt(6, product.getPrecio());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }
    
    public int editarProducto(Productos product) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "UPDATE usuarios SET name=?, type=?, quantity=?, description=?, idProveedor=?, price=?  WHERE idProducto=?";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, product.getNombreProducto());
            ps.setString(2, product.getTipoProducto());
            ps.setInt(3, product.getCantidad());
            ps.setString(4, product.getDescripcion());
            ps.setInt(5, product.getIdProveedor());
            ps.setInt(6, product.getPrecio());
            ps.setInt(7, product.getIdProducto());
            
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public void filtrarTablaNomProducto(JTable table, String filtro) throws Conexion.DataBaseException {

        //Declararo los headers del table
        String[] titulos = {"Id Producto", "Nombre Producto", "Tipo", "Cantidad", "Descripción", "Proveedor", "Precio"};
        String[] registros = new String[7];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM productos WHERE name LIKE '%" + filtro + "%'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("idProducto"); //como se llama el campo en la base de datos
                registros[1] = rs.getString("name");
                registros[2] = rs.getString("type");
                registros[3] = rs.getString("quantity");
                registros[4] = rs.getString("description");
                registros[5] = rs.getString("idProveedor");
                registros[6] = rs.getString("price");
                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos: " + e.getMessage());
        }
    }

    public int eliminarProducto(int idProducto) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "DELETE FROM productos WHERE idProducto= " + idProducto ;
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    
}
