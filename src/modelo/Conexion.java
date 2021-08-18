/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dylan_p1fbiqx
 */
public class Conexion {

    private Connection conexion = null;
    private final static String IP = "localhost";
    private final static String PUERTO = "3306";
    private final static String USUARIO = "root";
    private final static String CLAVE = "root"
            + ""
            + ""
            + ""
            + "";
    private final static String SID = "sistemapedidos?serverTimezone=UTC";

    public Connection conectar() throws DataBaseException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://" + IP + ":" + PUERTO + "/" + SID + "",
                    USUARIO, CLAVE);
        } catch (ClassNotFoundException e) {
            throw new DataBaseException("Driver Incorrecto.");
        } catch (SQLException e) {
            throw new DataBaseException("Error al conectarse a la BBDD.");
        }
        
        return conexion;
    }

//    public void cerrar(Connection conn, ResultSet res, Statement stmt) throws DataBaseException {
//        try {
//            if (!res.isClosed()) {
//                res.close();
//            } else if (!stmt.isClosed()) {
//                stmt.close();
//            } else if (!conn.isClosed()) {
//                conn.close();
//            }
//        } catch (SQLException e) {
//            throw new DataBaseException("Error al cerrar");
//        } finally {
//            System.out.println("Closing connection with database...");
//        }
//    }
//
//    public void cerrar(Connection conn, ResultSet res, PreparedStatement pstmt) throws DataBaseException {
//        try {
//            if (!res.isClosed()) {
//                res.close();
//            } else if (!pstmt.isClosed()) {
//                pstmt.close();
//            } else if (!conn.isClosed()) {
//                conn.close();
//            }
//        } catch (SQLException e) {
//            throw new DataBaseException("Error al cerrar");
//        } finally {
//            System.out.println("Closing connection with database...");
//        }
//    }
//
//    public void cerrar(Connection conn, PreparedStatement pstmt) throws DataBaseException {
//        try {
//            if (!pstmt.isClosed()) {
//                pstmt.close();
//            } else if (!conn.isClosed()) {
//                conn.close();
//            }
//        } catch (SQLException e) {
//            throw new DataBaseException("Error al cerrar");
//        } finally {
//            System.out.println("Closing connection with database...");
//        }
//    }

    public Connection getConnexion() throws DataBaseException {
        System.out.println("Conxion establecida");
        return this.conectar();
    }

    public static class DataBaseException extends Exception {

        public DataBaseException() {
        }

        private DataBaseException(String error_al_cerrar) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}