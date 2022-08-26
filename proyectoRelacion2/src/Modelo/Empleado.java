/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JESUS
 */
public class Empleado {

    private int codigo;
    private String nombre;
    private int horas;
    private Seccion seccion;
    static int contador = 10;

    public Empleado(String nombre, int horas, Seccion seccion) {
        this.codigo = contador;
        this.nombre = nombre;
        this.horas = horas;
        this.seccion = seccion;
        seccion.adicion(this);
        contador++;
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

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

}
