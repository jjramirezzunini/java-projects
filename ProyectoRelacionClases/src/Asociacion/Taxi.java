/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asociacion;

/**
 *
 * @author JESUS
 */
public class Taxi {
    private String placa;
    private String modelo;
    private Chofer chofer;

    public Taxi(String placa, String modelo, Chofer chofer) {
        this.placa = placa;
        this.modelo = modelo;
        this.chofer = chofer;
    }
    
    public void print(){
        System.out.println("Placa: " + placa + "\t Modelo: " + modelo);
        System.out.println("Chofer: " + chofer.getNombre() + "\t con brevete: " + chofer.getBrevete());
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }
    
    
}
