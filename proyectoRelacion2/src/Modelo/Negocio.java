/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JESUS
 */
public class Negocio {

    private List<Seccion> lista = new ArrayList();

    public Negocio() {
        lista.add(new Seccion("Almacen", 25));
        lista.add(new Seccion("Ventas", 22));
    }

    public void adicion(Seccion sec) {
        lista.add(sec);
    }

    //consultando una seccion
    public Seccion busca(String sec) {
        for (Seccion x : lista) {
            if (x.getNombreSeccion().equalsIgnoreCase(sec)) {
                return x;
            }
        }
        return null;
    }

    public Empleado busquedaEmpleado(int codigo) {
        for (Seccion seccion : lista) {
            for (Empleado z : seccion.getLista()) {
                if (z.getCodigo() == codigo) {
                    return z;
                }
            }

        }
        return null;
    }

    public List<Seccion> getLista() {
        return lista;
    }

    public void setLista(List<Seccion> lista) {
        this.lista = lista;
    }
    
    
}
