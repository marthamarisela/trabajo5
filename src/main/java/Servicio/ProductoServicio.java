/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;


import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public class ProductoServicio implements IProductoServicio {
  private static List<Producto> productoList= new ArrayList<>();
    @Override
    public Producto crear(Producto producto) {
        this.productoList.add(producto);
      return producto;
    }

    @Override
    public Producto modificar(int codigoNuevo, Producto productoNuevo) {
   var posicion = this.buscarPosicion(this.buscarPorCodigo(codigoNuevo));
     this.listar().get(posicion).setNombre(productoNuevo.getNombre());
     this.listar().get(posicion).setTipo(productoNuevo.getTipo());
     this.listar().get(posicion).setPrecio(productoNuevo.getPrecio());
     this.listar().get(posicion).setProductoStok(productoNuevo.getProductoStok());
     return productoNuevo;
    }

    @Override
    public Producto eliminar(int codigo) {
     Producto producto = this.buscarPorCodigo(codigo);
        var posicion= this.buscarPosicion(producto);
        this.listar().remove(posicion);
        return producto;
    }

    @Override
    public Producto buscarPorCodigo(int codigo) {
        Producto producto= null;
        for(var p:this.listar()){
            if(codigo==p.getCodigo()){
                producto = p;
                break;
            }
        }
        return producto;        
    
    }

    @Override
    public int buscarPosicion(Producto producto) {
         int posicion =-1;
        for(var p:this.productoList){
            posicion++;
            if(p.getCodigo()==producto.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    

    @Override
    public List<Producto> listar() {
         return this.productoList;
    }


    

  
   
}
