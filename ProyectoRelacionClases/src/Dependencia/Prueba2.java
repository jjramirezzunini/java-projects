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
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Documento documento1 = new Documento("Tesis 1", 85);
        Documento documento2 = new Documento("Informe de Proyecto", 35);
        Impresora impresora1 = new Impresora("Color");
        Impresora impresora2 = new Impresora("Blanco Negro");

        impresora1.print(documento1);
        System.out.println("=======");
        impresora2.print(documento2);
    }

}
