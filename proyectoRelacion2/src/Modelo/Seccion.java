/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;

/**
 *
 * @author JESUS
 */
public class Seccion {

    private String nombreSeccion;
    private double tarifa;
    private List<Empleado> lista;

    public Seccion(String nombreSeccion, double tarifa) {
        this.nombreSeccion = nombreSeccion;
        this.tarifa = tarifa;
        this.lista = new ArrayList();//Cuando se crea la seccion se crea el arraylist
    }

    void adicion(Empleado empleado) {
        this.lista.add(empleado);
    }

    public void print(JTextArea atArea) {
        atArea.setText("Tarifa: " + tarifa);
        atArea.append("\nCodTrabajador\tNombre\tHoras\tPago\n");
        double pago, smpg = 0;
        for (Empleado x : lista) {
            pago = x.getHoras() * tarifa;
            smpg += pago;
            atArea.append("\n" + x.getCodigo() + "\t" + x.getNombre() + "\t" + x.getHoras() + "\t" + pago);
        }
        atArea.append("\n Total pagos:\t" + smpg);
    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public List<Empleado> getLista() {
        return lista;
    }

    public void setLista(List<Empleado> lista) {
        this.lista = lista;
    }
    
    
    
    

}
