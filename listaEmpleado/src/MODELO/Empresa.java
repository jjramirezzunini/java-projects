/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.util.*;

/**
 *
 * @author JESUS
 */
public class Empresa {

    private List<Empleado> lis = new ArrayList();

    public Empresa() {
        lis.add(new Empleado("Garcia", 2500));
        lis.add(new Empleado("Perez", 2400));
        lis.add(new Empleado("Avila", 2900));
        lis.add(new Empleado("Cuenca", 3100));
    }

    public void adicion(Empleado ep) {
        lis.add(ep);
    }
//lee los empleados de la lista

    public List<Empleado> getLis() {
        return lis;
    }

    public void setLis(List<Empleado> lis) {
        this.lis = lis;
    }

    //buscar empleado por codigo
    public Empleado busca(int cod) {
        for (Empleado x : lis) {
            if (x.getCodigo() == cod) {
                return x;
            }
        }
        return null; //no encontro codigo
    }
    
    //anulacion de registro
    
    public void borrar(Empleado ep){
        lis.remove(ep);
    }

}
