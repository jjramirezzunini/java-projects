/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generalizacion;

/**
 *
 * @author JESUS
 */
public class Factura {
    private int numFactura;
    private String fecha;
    private double importe;
    private Cliente cliente;
    static int contador = 100;

    public Factura(String fecha, double importe, Cliente cliente) {
        this.numFactura = contador;
        this.fecha = fecha;
        this.importe = importe;
        this.cliente = cliente;
        cliente.adicion(this);//adiciona la factura a un cliente
        contador++;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
}
