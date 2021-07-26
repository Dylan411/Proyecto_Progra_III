/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package reporte;

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
    
    public void guardarPdf() throws  Conexion.DataBaseException, JRException{
        reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jprint1 = (JasperPrint) JasperFillManager.fillReport(reporte, null, conn.getConnexion());
        JasperExportManager.exportReportToPdfFile(jprint1, path1);
        JasperViewer.viewReport(jprint1);
    }
    
}
