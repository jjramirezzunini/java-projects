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
public class Prueba3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente1 = new Cliente("Felix");
        Cliente cliente2 = new Cliente("Laura");
        Factura factura1 = new Factura("10-04-22", 200, cliente1);
        new Factura("11-04-22", 150, cliente2);
        new Factura("13-04-22", 300, cliente1);
        new Factura("15-04-22", 90, cliente1);
        new Factura("16-04-22", 260, cliente2);

        cliente1.print();
        System.out.println("====================");
        cliente2.print();

    }

}
