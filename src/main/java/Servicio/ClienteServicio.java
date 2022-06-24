/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public class ClienteServicio implements IClienteServicio {
 private static List<Cliente> clienteList = new ArrayList<>();
    @Override
    public Cliente crear(Cliente cliente) {
          this.clienteList.add(cliente);
        return cliente;
    }

    @Override
    public Cliente modificar(int codigoNuevo, Cliente clienteNuevo) {
        var posicion = this.buscarPosicion(this.buscarPorCodigo(codigoNuevo));
        this.listar().get(posicion).setNumCedula(clienteNuevo.getNumCedula());
        this.listar().get(posicion).setNombreCliente(clienteNuevo.getNombreCliente());
        this.listar().get(posicion).setApellidoCliente(clienteNuevo.getApellidoCliente());
        this.listar().get(posicion).setDireccion(clienteNuevo.getDireccion());
        this.listar().get(posicion).setTelefono(clienteNuevo.getTelefono());
        return clienteNuevo;
    }

    @Override
    public Cliente eliminar(int codigo) {
        Cliente cliente = this.buscarPorCodigo(codigo) ;
      var posicion = this.buscarPosicion(cliente);
      this.listar().remove(posicion);
      return cliente;
    }

    @Override
    public Cliente buscarPorCodigo(int codigo) {
       Cliente cliente = null;
        for(var c:this.listar()){
            if(codigo==c.getCodigo()){
                cliente=c;
                break;
            }
        }
        return cliente;
    
    }

    @Override
    public int buscarPosicion(Cliente cliente) {
       int posicion = -1;
        for(var a:this.clienteList){
            posicion++;
            if(a.getCodigo()==cliente.getCodigo()){
                break;
            }
        }
        return posicion;
    
    }

    @Override
    public List<Cliente> listar() {
       return this.clienteList;
    }
    
    

}
