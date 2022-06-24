/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import Servicio.ProductoServicio;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public class ProductoControl {
        private ProductoServicio productoServicio = new ProductoServicio();
    
    public Producto crearProducto(String [] args){
        Producto producto = new Producto(Integer.valueOf(args[0]), args[1], args[2], Integer.valueOf(args[3]), Integer.valueOf(args[4]));
        this.productoServicio.crear(producto);
        return producto;
    }
    public Producto buscarProducto(String arg){
        return this.productoServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    public Producto eliminar(String arg){
        return this.productoServicio.eliminar(Integer.valueOf(arg));
    }
    public Producto modificar(String [] args){
        Producto productoNuevo = new Producto(Integer.valueOf(args[0]), args[1], args[2], Integer.valueOf(args[3]), Integer.valueOf(args[4]));
        this.productoServicio.modificar(Integer.valueOf(args[0]), productoNuevo);
        return productoNuevo;
    }
    public List<Producto> Listar(){
        return this.productoServicio.listar();
    }
}
