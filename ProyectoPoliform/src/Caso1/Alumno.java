/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1;

/**
 *
 * @author JESUS
 */
public abstract class Alumno {

    private int codigo;
    String nombre;
    private int examParcial;
    private int examFinal;
    static int contador = 100;

    public Alumno(String nombre, int examParcial, int examFinal) {
        this.codigo = contador;
        this.nombre = nombre;
        this.examParcial = examParcial;
        this.examFinal = examFinal;
        contador++;
    }

    abstract double promedio();

    public String observacion() {
        if (promedio() >= 11.5) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }

    public void print() {
        System.out.println("Codigo:\t" + codigo);
        System.out.println("Mombre:\t" + nombre);
        System.out.println("Parcial:\t" + examParcial);
        System.out.println("Final:\t" + examFinal);
        System.out.println("Promedio:\t" + promedio() + "\tObservación:" + observacion());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getExamParcial() {
        return examParcial;
    }

    public void setExamParcial(int examParcial) {
        this.examParcial = examParcial;
    }

    public int getExamFinal() {
        return examFinal;
    }

    public void setExamFinal(int examFinal) {
        this.examFinal = examFinal;
    }

}
