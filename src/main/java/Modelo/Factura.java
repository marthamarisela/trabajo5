/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Gus-Gus
 */
public class Factura {
    private int codigo;
    private String direccion;
    private int fecha;
    private int total;
    private int cantidad;
      private Cliente cliente;
      private Producto producto;

    public Factura(int codigo, String direccion, int fecha, int total, int cantidad, Cliente cliente, Producto producto) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.fecha = fecha;
        this.total = total;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.producto = producto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", direccion=" + direccion + ", fecha=" + fecha + ", total=" + total + ", cantidad=" + cantidad + ", cliente=" + cliente + ", producto=" + producto + '}';
    }

    
}
