/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package reporte;

import static com.formdev.flatlaf.util.MultiResolutionImageSupport.map;
import java.util.HashMap;
import java.util.Map;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelo.Conexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author dylan_p1fbiqx
 */
public class generarReporte {
    JasperReport reporte = null;
    String path = "src\\reporte\\report.jasper";

    String pathClientes = "src\\reporte\\reporteClientes.jasper";
    String pathPedidos = "src\\reporte\\reportePedidos.jasper";
    String pathInventario = "src\\reporte\\reporteInventario.jasper";
    String pathUsuarios = "src\\reporte\\reporteUsuarios.jasper";
    String path1 = "src\\reporte\\report.pdf";

    Conexion conn = new Conexion();
    
    
    public void abrirReporte() throws Conexion.DataBaseException {
        try {
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint  = JasperFillManager.fillReport(reporte, null, conn.getConnexion());
            JasperViewer view =  new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            JasperExportManager.exportReportToPdfFile(jprint, "test.pdf");
        } catch (JRException ex) {
            System.out.println("Error");
        }
    }
    
    public void abrirReporteClientes(String compañia) throws Conexion.DataBaseException {
        try {
            reporte = (JasperReport) JRLoader.loadObjectFromFile(pathClientes);
            Map parametros = new HashMap();
            parametros.put("companyname", compañia);
            JasperPrint jprint  = JasperFillManager.fillReport(reporte, parametros, conn.getConnexion());
            JasperViewer view =  new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            JasperExportManager.exportReportToPdfFile(jprint, "test.pdf");
        } catch (JRException ex) {
            System.out.println("Error");
        }
    }
    
    public void abrirReportePedidos() throws Conexion.DataBaseException {
        try {
            reporte = (JasperReport) JRLoader.loadObjectFromFile(pathPedidos);
            JasperPrint jprint  = JasperFillManager.fillReport(reporte, null, conn.getConnexion());
            JasperViewer view =  new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            JasperExportManager.exportReportToPdfFile(jprint, "test.pdf");
        } catch (JRException ex) {
            System.out.println("Error");
        }
    }
    
    public void abrirReporteInventario() throws Conexion.DataBaseException {
        try {
            reporte = (JasperReport) JRLoader.loadObjectFromFile(pathInventario);
            JasperPrint jprint  = JasperFillManager.fillReport(reporte, null, conn.getConnexion());
            JasperViewer view =  new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            JasperExportManager.exportReportToPdfFile(jprint, "test.pdf");
        } catch (JRException ex) {
            System.out.println("Error");
        }
    }
    
    public void abrirReporteUsuarios() throws Conexion.DataBaseException {
        try {
            reporte = (JasperReport) JRLoader.loadObjectFromFile(pathUsuarios);
            JasperPrint jprint  = JasperFillManager.fillReport(reporte, null, conn.getConnexion());
            JasperViewer view =  new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            JasperExportManager.exportReportToPdfFile(jprint, "test.pdf");
        } catch (JRException ex) {
            System.out.println("Error");
        }
    }
     
    public void guardarPdf(String num) throws  Conexion.DataBaseException, JRException{
        String pathPDF = "src\\reporte\\report"+num+".pdf";
        String pathJ = "src\\reporte\\report.jasper";
        reporte = (JasperReport) JRLoader.loadObjectFromFile(pathJ);
        Map parametros = new HashMap();
        parametros.put("num", num);
        JasperPrint jprint1 = (JasperPrint) JasperFillManager.fillReport(reporte, parametros, conn.getConnexion());
        JasperExportManager.exportReportToPdfFile(jprint1, pathPDF);
    }
    
}
