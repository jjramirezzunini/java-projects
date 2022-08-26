
package clases;


public class Transa {
  private Cuenta  ct;
  private String fecha;
  private int   tipo; //1=deposito 2=retiro
  private double importe;

    public Transa(Cuenta ct, String fecha, int tipo, double importe) {
        this.ct = ct;
        this.fecha = fecha;
        this.tipo = tipo;
        this.importe = importe;
        ct.adicion(this);//agregar la transaccion a una cuenta
    }
    public String cTipo(){
        if(tipo==1) return "Deposito"; else return "Retiro";
    }

    public Cuenta getCt() {
        return ct;
    }

    public void setCt(Cuenta ct) {
        this.ct = ct;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
  
}
