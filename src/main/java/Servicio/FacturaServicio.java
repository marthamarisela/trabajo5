/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Factura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public class FacturaServicio implements IFacturaServicio {
 private static List<Factura> facturaList = new ArrayList<>();
    @Override
    public Factura crear(Factura factura) {
        this.facturaList.add(factura);
        return factura;
    }

    @Override
    public Factura modificar(int codigoNuevo, Factura facturaNuevo) {
            var posicion = this.buscarPosicion(this.buscarPorCodigo(codigoNuevo));
       this.listar().get(posicion).setDireccion(facturaNuevo.getDireccion());
       this.listar().get(posicion).setFecha(facturaNuevo.getFecha());
       this.listar().get(posicion).setTotal(facturaNuevo.getTotal());
       this.listar().get(posicion).setCantidad(facturaNuevo.getCantidad());
       this.listar().get(posicion).setCliente(facturaNuevo.getCliente());
       this.listar().get(posicion).setProducto(facturaNuevo.getProducto());
       return facturaNuevo;
    }

    @Override
    public Factura eliminar(int codigo) {
          Factura factura = this.buscarPorCodigo(codigo);
       var posicion = this.buscarPosicion(factura);
       this.listar().remove(posicion);
       return factura;
    }

    @Override
    public Factura buscarPorCodigo(int codigo) {
          Factura factura = null;
        for(var f:this.listar()){
            if(codigo==f.getCodigo()){
                factura = f;
                break;
            }
        }
       return factura;
    }

    @Override
    public int buscarPosicion(Factura factura) {
        int posicion = -1;
        for(var f:this.facturaList){
        posicion++;
        if(f.getCodigo()==factura.getCodigo()){
            break;
        }
    }
        return posicion;
    }

    @Override
    public List<Factura> listar() {
          return this.facturaList;
    }
    
}
