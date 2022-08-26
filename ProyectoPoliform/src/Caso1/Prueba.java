/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1;
import java.util.*;

/**
 *
 * @author JESUS
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Alumno> lista = new ArrayList();
        lista.add(new Pregrado("Reyes", 14, 10));
        lista.add(new Posgrado("Vasquez", 14, 10));
        lista.add(new Pregrado("Rios", 8, 14));
        lista.add(new Posgrado("Robles", 8, 14));
        
        for(Alumno x:lista){
            x.print();
            System.out.println("======================");
        }
    }
    
}
