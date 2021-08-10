/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Janda
 */
public class Pedido {
    private int idPedido;
    private int numPedido;
    private String fechaVenta;
    private String destino;
    private int total;
    private boolean descuento;
    private Usuario usuarios;
    private Clientes clientes;
    private Productos producto;
    private int check;
    

    public Pedido() {
        
    }

    public Pedido(int idPedido, int numPedido, String fechaVenta, String destino, int total, boolean descuento, Usuario usuarios, Clientes clientes, Productos producto, int check) {
        this.idPedido = idPedido;
        this.numPedido = numPedido;
        this.fechaVenta = fechaVenta;
        this.destino = destino;
        this.total = total;
        this.descuento = descuento;
        this.usuarios = usuarios;
        this.clientes = clientes;
        this.producto = producto;
        this.check = check;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

   

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }
    
    }

    