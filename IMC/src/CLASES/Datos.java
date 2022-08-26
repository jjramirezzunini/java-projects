/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

/**
 *
 * @author JESUS
 */
public class Datos {

    private double peso;
    private double estatura;
    String complexion;

    public Datos(double peso, double estatura) {
        this.peso = peso;
        this.estatura = estatura;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double imc() {
        return peso / (estatura * estatura);
    }

    public String contextura() {
        if (imc() <= 0) {
            return "INGRESE DATOS VALIDOS";
        } else if (imc() <= 16 && imc() > 0) {
            return "DELGADO";
        } else if (imc() <= 24 && imc() > 16) {
            return "NORMAL";
        } else if (imc() <= 30 && imc() > 24) {
            return "SOBREPESO";
        } else {
            return "OBESO";
        }
    }
}
