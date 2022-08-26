/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

/**
 *
 * @author JESUS
 */
public class EMPLEADO extends TRABAJADOR {

    private double pagoDia;
    private int diasTrabajados;

    public EMPLEADO(String nombre, int añoIngreso, double pagoDia, int diasTrabajados) {
        super(nombre, añoIngreso);
        this.pagoDia = pagoDia;
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    double pagoBruto() {
        return pagoDia * diasTrabajados;
    }

    @Override
    double bonificacion() {
        return (tiempoServicio() / 6) * 0.1;
    }

    public double getPagoDia() {
        return pagoDia;
    }

    public void setPagoDia(double pagoDia) {
        this.pagoDia = pagoDia;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

}
