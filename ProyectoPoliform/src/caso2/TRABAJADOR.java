/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.util.Calendar;

/**
 *
 * @author JESUS
 */
public abstract class TRABAJADOR {

    private int codigo;
    private String nombre;
    private int añoIngreso;
    static int contador = 100;

    public TRABAJADOR(String nombre, int añoIngreso) {
        this.codigo = contador;
        this.nombre = nombre;
        this.añoIngreso = añoIngreso;
    }

    abstract double pagoBruto();

    abstract double bonificacion();

    public double pagoNeto() {
        return pagoBruto() + bonificacion();
    }

    public void print() {
        System.out.println("Codigo:\t" + codigo);
        System.out.println("Mombre:\t" + nombre);
        System.out.println("Año de Ingreso:\t" + añoIngreso);
        System.out.println("Pago Bruto:\t" + pagoBruto());
        System.out.println("Bonificacion:\t" + bonificacion());
        System.out.println("Pago Neto:\t" + pagoNeto());
    }

    int tiempoServicio() {
        Calendar t = Calendar.getInstance();
        return t.get(Calendar.YEAR) - añoIngreso;
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

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }
    
    

}
