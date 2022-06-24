/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Factura;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public interface IFacturaServicio {
      public Factura crear(Factura factura);
    public Factura modificar(int codigoNuevo, Factura facturaNuevo);
    public Factura eliminar(int codigo);
    public Factura buscarPorCodigo(int codigo);
    public int buscarPosicion(Factura factura);
    public List<Factura> listar();
}
