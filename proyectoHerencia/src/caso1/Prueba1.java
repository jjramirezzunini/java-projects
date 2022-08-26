/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso1;
import java.util.*;

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
        ALUMNO a1 = new ALUMNO("Jesus", "Ramirez", 27, 19, 18, 17);
        a1.print();
        
        DOCENTE d1 = new DOCENTE("Mario", "Neta", 55, 20, 25);
        d1.print();
        
        ArrayList <PERSONA> lista = new ArrayList();
        lista.add(d1);
        lista.add(a1);
        lista.add(new ALUMNO("Armando", "Paredes", 19, 15, 16, 17));
        lista.add(new ALUMNO("Elsa", "Patito", 20, 17, 18, 19));
        lista.add(new DOCENTE("Mario", "Castañeda", 60, 25, 17));
        lista.add(new DOCENTE("Jose", "Wayne", 48, 23, 16));
        
        for (PERSONA x : lista) {
            x.print();
            System.out.println("===============");
        }
        
        System.out.println("Nombre\tApellido\tCorreo");
        for (PERSONA x : lista) {
            System.out.println(x.getNombre() +"\t" + x.getApellido() +"\t" + x.correo());
        }
    }
    
}
