/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Janda
 */
public class Clientes {
    private int idCliente;
    private String nombreCliente;
    private String nombreCompañia;
    private String direccion;
    private String cuidad;
    private String region;
    private int telefono;

    public Clientes() {
    }

    public Clientes(int idCliente, String nombreCliente, String nombreCompañia, String direccion, String cuidad, String region, int telefono) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.nombreCompañia = nombreCompañia;
        this.direccion = direccion;
        this.cuidad = cuidad;
        this.region = region;
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCompañia() {
        return nombreCompañia;
    }

    public void setNombreCompañia(String nombreCompañia) {
        this.nombreCompañia = nombreCompañia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
