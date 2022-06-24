/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Cliente;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public interface IClienteServicio {
    
    public Cliente crear(Cliente cliente);
    public Cliente modificar(int codigoNuevo, Cliente clienteNuevo);
    public Cliente eliminar(int codigo);
    public Cliente buscarPorCodigo(int codigo);
    public int buscarPosicion(Cliente cliente);
    public List<Cliente> listar();
}
