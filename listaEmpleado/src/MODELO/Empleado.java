/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author JESUS
 */
public class Empleado {
    private int codigo;
    private String nombre;
    private double sueldo;
    
    static int cuenta = 100;

    public Empleado() {
    }

    public Empleado(String nombre, double sueldo) {
        this.codigo = cuenta;
        this.nombre = nombre;
        this.sueldo = sueldo;
        cuenta++;
    }
    
    public double impuesto(){
        if(sueldo > 2500)
            return (sueldo - 2500)*0.08;
        else
            return 0;
    }
    
    public double total(){
        return sueldo - impuesto();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
