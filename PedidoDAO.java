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
public class PedidoDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Pedido pedido = new Pedido();

    public void filtrarTablaNombre(JTable table, String filtro) throws Conexion.DataBaseException {

        String[] titulos = {"idProducto", "nombreProducto", "tipoProducto", "cantidad", "descripcion", "idProveedor", "precio"};
        String[] registros = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM Productos WHERE name LIKE '%" + filtro + "%'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("idProducto");
                registros[1] = rs.getString("name");
                registros[2] = rs.getString("type");
                registros[3] = rs.getString("quantity");
                registros[4] = rs.getString("description");
                registros[5] = rs.getString("idProveedor");

                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos" + e.getMessage());
        }
    }

    public int enviarSolicitud(Pedido order) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "INSERT INTO Pedidos (numPedido, dateActually, destiny, total, discount,id,idProducto,idCliente) VALUES (?, ?, ?, ?, ?, ?,?,?)";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, order.getNumPedido());
            ps.setString(2, order.getFechaVenta());
            ps.setString(3, order.getDestino());
            ps.setInt(4, order.getTotal());
            ps.setByte(5, order.getDescuento());
            ps.setInt(6, order.getUsuarios().getIdUsuario());
            ps.setInt(7, order.getProducto().getIdProducto());
            ps.setInt(8, order.getClientes().getIdCliente());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }
    
    
   }

  

   
 