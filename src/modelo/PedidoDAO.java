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

        String[] titulos = {"idProducto", "nombreProducto", "tipoProducto", "cantidad en stock", "descripcion", "idProveedor", "precio"};
        String[] registros = new String[7];
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
        String sql = "INSERT INTO Pedidos (numPedido, date, destiny, total, discount, id, idProducto, idCliente, accepted, dispatched, quantity) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";
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
            ps.setInt(10, order.getdespachada());
            ps.setInt(11, order.getCantidad());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public int tramitarSolicitud(Pedido order) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "UPDATE Pedidos SET accepted=?  WHERE numPedido=?";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, order.getCheck());
            ps.setInt(2, order.getNumPedido());

            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public void filtrarTablaTramitar(JTable table, String filtro) throws Conexion.DataBaseException {

        String[] titulos = {"Id Cliente ", "Id Pedido", "Numero Pedido", "Cantidad", "Fecha", "Destino", "Total", "Estado"};
        String[] registros = new String[8];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM pedidos WHERE accepted = 0 and numPedido  LIKE '%" + filtro + "%'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                registros[0] = rs.getString("idCliente");
                registros[1] = rs.getString("idPedidos");
                registros[2] = rs.getString("numPedido");
                registros[3] = rs.getString("quantity");
                registros[4] = rs.getString("date");
                registros[5] = rs.getString("destiny");
                registros[6] = rs.getString("total");
                registros[7] = rs.getString("accepted");

                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos" + e.getMessage());
        }
    }

    public void filtrarTablaNegada(JTable table, String filtro) throws Conexion.DataBaseException {

        String[] titulos = {"Id Cliente ", "Id Pedido", "Numero Pedido", "Cantidad", "Fecha", "Destino", "Total", "Estado"};
        String[] registros = new String[8];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM pedidos WHERE  numPedido LIKE '%" + filtro + "%'";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                registros[0] = rs.getString("idCliente");
                registros[1] = rs.getString("idPedidos");
                registros[2] = rs.getString("numPedido");
                registros[3] = rs.getString("quantity");
                registros[4] = rs.getString("date");
                registros[5] = rs.getString("destiny");
                registros[6] = rs.getString("total");
                registros[7] = rs.getString("accepted");

                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos" + e.getMessage());
        }
    }

    public void iniciar(JTable table, String filtro) throws Conexion.DataBaseException {

        String[] titulos = {"Id Cliente ", "Id Pedido", "Numero Pedido", "Cantidad", "Fecha", "Destino", "Total", "Estado"};
        String[] registros = new String[8];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM pedidos WHERE  accepted=2";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                registros[0] = rs.getString("idCliente");
                registros[1] = rs.getString("idPedidos");
                registros[2] = rs.getString("numPedido");
                registros[3] = rs.getString("quantity");
                registros[4] = rs.getString("date");
                registros[5] = rs.getString("destiny");
                registros[6] = rs.getString("total");
                registros[7] = rs.getString("accepted");

                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos" + e.getMessage());
        }
    }

    public int despacharPedido(Pedido order) throws Conexion.DataBaseException {
        int r = 0;
        String sql = "UPDATE Pedidos SET dispatched=?  WHERE numPedido=?";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, order.getdespachada());
            ps.setInt(2, order.getNumPedido());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public void iniciarDespacho(JTable table, String filtro) throws Conexion.DataBaseException {

        String[] titulos = {"Id Cliente ", "Id Pedido", "Numero Pedido", "Cantidad", "Fecha", "Destino", "Total", "Estado"};
        String[] registros = new String[8];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM pedidos WHERE  dispatched=0 and accepted=1";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                registros[0] = rs.getString("idCliente");
                registros[1] = rs.getString("idPedidos");
                registros[2] = rs.getString("numPedido");
                registros[3] = rs.getString("quantity");
                registros[4] = rs.getString("date");
                registros[5] = rs.getString("destiny");
                registros[6] = rs.getString("total");
                registros[7] = rs.getString("accepted");
                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos" + e.getMessage());
        }

    }
    public void filtrarTablaDespacho(JTable table, String filtro) throws Conexion.DataBaseException {

        String[] titulos = {"Id Cliente ", "Id Pedido", "Numero Pedido", "Cantidad", "Fecha", "Destino", "Total", "Estado"};
        String[] registros = new String[8];
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM pedidos WHERE  numPedido LIKE '%" + filtro + "%' and dispatched=0 and accepted=1";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                registros[0] = rs.getString("idCliente");
                registros[1] = rs.getString("idPedidos");
                registros[2] = rs.getString("numPedido");
                registros[3] = rs.getString("quantity");
                registros[4] = rs.getString("date");
                registros[5] = rs.getString("destiny");
                registros[6] = rs.getString("total");
                registros[7] = rs.getString("accepted");

                model.addRow(registros);
            }
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos" + e.getMessage());
        }
    }
    
    public void ultimoPedido(JTextField txt) throws Conexion.DataBaseException {
        String sql = "SELECT * FROM pedidos ORDER BY ID DESC LIMIT 1";
        try {
            con = conectar.getConnexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                txt.setText(String.valueOf(rs.getInt("numPedido")+1));
            }
        } catch (SQLException e) {
        }
    }
}
