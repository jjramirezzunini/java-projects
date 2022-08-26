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
public class Chofer {
    private String brevete;
    private String nombre;

    public Chofer(String brevete, String nombre) {
        this.brevete = brevete;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBrevete() {
        return brevete;
    }

    public void setBrevete(String brevete) {
        this.brevete = brevete;
    }
    
    
}
