/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asociacion;

/**
 *
 * @author JESUS
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chofer chofer1 = new Chofer("93945", "Carlos");
        Chofer chofer2 = new Chofer("33333", "Luis");
        Taxi taxi1 = new Taxi("MQ8794", "Toyota Yaris", chofer2);
        Taxi taxi2 = new Taxi("BM4565", "Elantra", chofer1);
        
        taxi1.print();
        System.out.println("============");
        taxi2.print();
    }
    
}
