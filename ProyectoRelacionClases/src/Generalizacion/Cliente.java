/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generalizacion;

import java.util.*;

/**
 *
 * @author JESUS
 */
class Cliente {

    int codigoCliente;
    String nombreCliente;
    List<Factura> lista;
    static int contador = 10;

    public Cliente(String nombreCliente) {
        //La lista se crea despues de crear el cliente
        this.codigoCliente = contador;
        this.nombreCliente = nombreCliente;
        this.lista = new ArrayList();
        contador++;
    }

    public void adicion(Factura factura) {
        lista.add(factura);
    }

    public void print() {
        //Imprime la factura del cliente
        System.out.println("Codigo de cliente: " + codigoCliente);
        System.out.println("Nombre: " + nombreCliente);
        System.out.println("Numero de factura\tFecha\tImporte");
        double suma = 0;
        for (Factura x : lista) {
            System.out.println(x.getNumFactura() + "\t" + x.getFecha() + "\t" + x.getImporte());
            suma = suma + x.getImporte();
        }
        System.out.println("Total Facturas: " + suma);
    }

}
