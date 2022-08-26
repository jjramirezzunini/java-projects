/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

import java.util.Calendar;

/**
 *
 * @author JESUS
 */
public class Datos {

    private int añoNacimiento;
    private int mes;
    private int dia;
    Calendar c1 = Calendar.getInstance();

    public Datos(int añoNacimiento, int mes, int dia) {
        this.añoNacimiento = añoNacimiento;
        this.mes = mes;
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int edad() {
        int añoActual = c1.get(Calendar.YEAR);
        return añoActual - añoNacimiento;
    }

    public String signo() {
        if (dia >= 22 && dia <= 31 && mes == 12 || dia >= 1 && dia <= 20 && mes == 1) {
            return "CAPRICORNIO";
        } else if (dia >= 21 && dia <= 31 && mes == 1 || dia >= 1 && dia <= 19 && mes == 2) {
            return "ACUARIO";
        } else if (dia >= 20 && dia <= 29 && mes == 2 || dia >= 1 && dia <= 20 && mes == 3) {
            return "PISCIS";
        } else if (dia >= 21 && dia <= 31 && mes == 3 || dia >= 1 && dia <= 19 && mes == 4) {
            return "ARIES";
        } else if (dia >= 20 && dia <= 30 && mes == 4 || dia >= 1 && dia <= 20 && mes == 5) {
            return "TAURO";
        } else if (dia >= 21 && dia <= 31 && mes == 5 || dia >= 1 && dia <= 21 && mes == 6) {
            return "GEMINIS";
        } else if (dia >= 22 && dia <= 30 && mes == 6 || dia >= 1 && dia <= 21 && mes == 7) {
            return "CANCER";
        } else if (dia >= 22 && dia <= 31 && mes == 7 || dia >= 1 && dia <= 21 && mes == 8) {
            return "LEO";
        } else if (dia >= 22 && dia <= 31 && mes == 8 || dia >= 1 && dia <= 22 && mes == 9) {
            return "VIRGO";
        } else if (dia >= 23 && dia <= 30 && mes == 9 || dia >= 1 && dia <= 22 && mes == 10) {
            return "LIBRA";
        } else if (dia >= 23 && dia <= 31 && mes == 10 || dia >= 1 && dia <= 21 && mes == 11) {
            return "ESCORPIO";
        } else if (dia >= 22 && dia <= 30 && mes == 11 || dia >= 1 && dia <= 21 && mes == 12) {
            return "SAGITARIO";
        } else {
            return "FECHA INVALIDA";
        }
    }

}
