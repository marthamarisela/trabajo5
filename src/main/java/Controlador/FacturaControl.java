/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Factura;
import Modelo.Producto;
import Servicio.ClienteServicio;
import Servicio.FacturaServicio;
import Servicio.ProductoServicio;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public class FacturaControl {
     private FacturaServicio facturaServicio = new FacturaServicio();
    private ClienteServicio clienteServicio = new ClienteServicio();
    private ProductoServicio productoServicio = new ProductoServicio();
    
    public Factura crearFactura(String [] args){
        Cliente cliente = this.clienteServicio.buscarPorCodigo(Integer.valueOf(args[5]));
        Producto producto = this.productoServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        Factura factura = new Factura(Integer.valueOf(args[0]),args[1], Integer.valueOf(args [2]), Integer.valueOf(args[3]),Integer.valueOf(args[4]),cliente, producto);
        this.facturaServicio.crear(factura);
        return factura;
        
    }
    
    public Factura buscarFactura(String arg){
        return this.facturaServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Factura eliminar(String arg){
        return this.facturaServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Factura modificar(String [] args){
        Cliente cliente = this.clienteServicio.buscarPorCodigo(Integer.valueOf(args[5]));
        Producto producto = this.productoServicio.buscarPorCodigo(Integer.valueOf(args[4]));
            Factura facturaNuevo = new Factura(Integer.valueOf(args[0]),args[1], Integer.valueOf(args [2]), Integer.valueOf(args[3]),Integer.valueOf(args[4]),cliente, producto);
            this.facturaServicio.modificar(Integer.valueOf(args[0]), facturaNuevo);
           return facturaNuevo;
}
    
    public List<Factura> listar(){
        return this.facturaServicio.listar();
                
    }
}
