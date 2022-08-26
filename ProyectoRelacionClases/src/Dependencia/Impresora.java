/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependencia;

/**
 *
 * @author JESUS
 */
public class Impresora {
    private String tipo;

    public Impresora(String tipo) {
        this.tipo = tipo;
    }
    
    public void print(Documento documento){
        System.out.println("Tipo de impresora: " + tipo);
        System.out.println("Documento: " + documento.getNombreDoc() + "\t Cantidad de paginas:" + documento.getCantidadPaginas());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
