/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author Janda
 */
public class Helpers {
    
    public java.sql.Date convert(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    /**
     *
     * @return @throws ParseException
     */
    public Date fechaActual() throws ParseException {
        //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = Calendar.getInstance(TimeZone.getDefault());
        String dia = String.valueOf(fecha.get(Calendar.DAY_OF_MONTH));
        String mes = String.valueOf(fecha.get(Calendar.MONTH) + 1);
        String año = String.valueOf(fecha.get(Calendar.YEAR));
        String fechaActual = año + "-" + mes + "-" + dia;
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd"); // New Pattern
        java.util.Date date = format.parse(fechaActual); // Returns a Date format object with the pattern
        java.sql.Date sqlfechaActual = new java.sql.Date(date.getTime());
        return sqlfechaActual;
    }
    /**
     * 
     * @return
     * @throws ParseException 
     */
    public Date horaActual() throws ParseException {
        //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = Calendar.getInstance();
        String hora = String.valueOf(fecha.get(Calendar.HOUR_OF_DAY));
        String minuto = String.valueOf(fecha.get(Calendar.MINUTE));
        String horaActual = hora + ":" + minuto;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm", Locale.getDefault()); // New Pattern
        java.util.Date date = format.parse(horaActual); // Returns a Date format object with the pattern
        java.sql.Date sqlhoraActual = new java.sql.Date(date.getTime());
        return sqlhoraActual;
    }
}


