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
                registros[6] = rs.getString("price");

                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos" + e.getMessage());
        }
    }

    public int enviarSolicitud(Pedido order) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "INSERT INTO Pedidos (numPedido,date, destiny, total, discount,id,idProducto,idCliente,accepted) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, order.getNumPedido());
            ps.setString(2, order.getFechaVenta());
            ps.setString(3, order.getDestino());
            ps.setInt(4, order.getTotal());
            ps.setBoolean(5, order.isDescuento());
            ps.setInt(6, order.getUsuarios().getIdUsuario());
            ps.setInt(7, order.getProducto().getIdProducto());
            ps.setInt(8, order.getClientes().getIdCliente());
            ps.setInt(9, order.getCheck());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public int tramitarSolicitud(Pedido order) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "UPDATE Pedidos SET accepted=?,  WHERE idPedidos=?";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, order.getCheck());
            ps.setInt(2, order.getIdPedido());

            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public void filtrarTablaTramitar(JTable table, String filtro) throws Conexion.DataBaseException {

        String[] titulos = {"Numero Pedido", "Fecha", "Destino", "ID CLiente", "Total"};
        String[] registros = new String[5];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM pedidos WHERE numPedido LIKE '%" + filtro + "%'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                registros[0] = rs.getString("numPedido");
                registros[1] = rs.getString("date");
                registros[2] = rs.getString("destiny");
                registros[3] = rs.getString("idCliente");
                registros[4] = rs.getString("total");

                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos" + e.getMessage());
        }
    }
}
