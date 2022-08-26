/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso1;

/**
 *
 * @author JESUS
 */
public class DOCENTE extends PERSONA{
    int hora;
    double tarifa;

    public DOCENTE(String nombre, String apellido, int edad, int hora, double tarifa) {
        super(nombre, apellido, edad);
        this.hora = hora;
        this.tarifa = tarifa;
    }
    
    public double pago(){
        return hora * tarifa;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Pago total: " + pago());
        
        
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}


