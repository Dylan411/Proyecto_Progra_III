/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author isabel
 */
public class Proveedores {

    private int idProveedor;
    private String nombreContacto;
    private String nombreCompañia;
    private String ciudad;
    private int telefono;

    public Proveedores() {
    }

    public Proveedores(int idProveedor, String nombreContacto, String nombreCompañia, String ciudad, int telefono) {
        this.idProveedor = idProveedor;
        this.nombreContacto = nombreContacto;
        this.nombreCompañia = nombreCompañia;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNombreCompañia() {
        return nombreCompañia;
    }

    public void setNombreCompañia(String nombreCompañia) {
        this.nombreCompañia = nombreCompañia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
