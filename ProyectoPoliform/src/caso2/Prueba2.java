/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.util.*;

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
        List<TRABAJADOR> lista = new ArrayList();
        lista.add(new EMPLEADO("Yataco", 2000, 34, 20));
        lista.add(new OBRERO("Jorge", 2000, 25, "a"));

        for (TRABAJADOR x : lista) {
            x.print();
            System.out.println("==============");
        }

    }

}
