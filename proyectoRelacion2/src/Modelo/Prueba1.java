/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

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
        Seccion s1= new Seccion("Ventas", 25);
        Seccion s2= new Seccion("Almacen", 23);
        new Empleado("Juan", 30, s2);
        new Empleado("Luis", 35, s1);
        new Empleado("Rosa", 28, s2);
        new Empleado("Maria", 38, s1);
        new Empleado("Jose", 34, s2);
            JTextArea res = new JTextArea();
            s2.print(res);
            JOptionPane.showMessageDialog(null, res);
    }
    
}
