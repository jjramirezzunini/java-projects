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
public class OBRERO extends TRABAJADOR {

    private int horasSemanales;
    private String seccionTrabajo;

    public OBRERO(String nombre, int añoIngreso, int horasSemanales, String seccionTrabajo) {
        super(nombre, añoIngreso);
        this.horasSemanales = horasSemanales;
        this.seccionTrabajo = seccionTrabajo;
    }
    
    public String seccion() {
        String seccion = "";
        switch (seccionTrabajo.toUpperCase()) {
            case "A":
                seccion = "Tintoreria";
                break;
            case "B":
                seccion = "Acabado";
                break;
            case "C":
                seccion = "Planchado";
                break;
        }
        return seccion;
    }

    @Override
    double pagoBruto() {
        double pago = 0;
        switch (seccionTrabajo.toUpperCase()) {
            case "A":
                pago = horasSemanales * 8.2;
                break;
            case "B":
                pago = horasSemanales * 9.2;
                break;
            case "C":
                pago = horasSemanales * 8.7;
                break;
        }
        return pago;
    }

    @Override
    double bonificacion() {
        return (tiempoServicio() / 4) * pagoBruto() * 0.8;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Seccion: " + seccion());
        System.out.println("Horas:\t" + horasSemanales);
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public String getSeccionTrabajo() {
        return seccionTrabajo;
    }

    public void setSeccionTrabajo(String seccionTrabajo) {
        this.seccionTrabajo = seccionTrabajo;
    }

}
