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
public class ALUMNO extends PERSONA{
    int nota1;
    int nota2;
    int nota3;

    public ALUMNO( String nombre, String apellido, int edad, int nota1, int nota2, int nota3) {
        super(nombre, apellido, edad);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

public double promedio(){
    return (nota1 + nota2 + nota3) / 3;
}

    @Override
    public void print(){
    super.print();
    System.out.println("nota1: " + nota1 + "\tnota2: " + nota2 + "\tnota3: " + nota3);
    System.out.println("Promedio: " + promedio());
}

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
    

}
