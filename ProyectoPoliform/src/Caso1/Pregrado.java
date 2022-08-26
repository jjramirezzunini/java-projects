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
public class Pregrado extends Alumno {

    public Pregrado(String nombre, int examParcial, int examFinal) {
        super(nombre, examParcial, examFinal);
    }

    @Override
    double promedio() {
        return 0.3 * super.getExamParcial() + 0.7 * super.getExamFinal();
    }

}
