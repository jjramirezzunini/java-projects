package clases;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Cuenta {
private int nro;
private String cliente;
private double saldo;
static int con=1000;
private List<Transa> lista;

    public Cuenta(String cliente, double saldo) {
        this.nro = con++;
        this.cliente = cliente;
        this.saldo = saldo;
        this.lista = new ArrayList();//crear la lista
    }
  public void adicion(Transa t) {//va recibir un objeto transaccion
  //t=representa una transaccion
  if(t.getTipo()==2){//retiro
      if(t.getImporte()>saldo){
          JOptionPane.showMessageDialog(null, "saldo no disponible");
       return;//salir del metodo    
      }
     saldo=saldo-t.getImporte();
  }else{ //es deposito
      saldo=saldo+t.getImporte();
  }
  lista.add(t);//agregar la transaccion a la lista
   }
 //imprimir en textarea la transaccion de una cuenta
  public void print(JTextArea at){
     at.setText("cuenta nro :"+nro+"\t saldo:"+saldo);
     at.append("\n Cliente  :"+cliente);
     at.append("\nFecha\timporte\tTipo");
     double smd=0, smr=0;
     for(Transa x:lista){
      at.append("\n"+x.getFecha()+"\t"+x.getImporte()+"\t"+x.cTipo());
      if(x.getTipo()==1) 
          smd=smd+x.getImporte();
      else
          smr=smr+x.getImporte();
     }
     at.append("\n Total Deposito  "+smd);
     at.append("\n Total Retiro o  "+smr);
  }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transa> getLista() {
        return lista;
    }

    public void setLista(List<Transa> lista) {
        this.lista = lista;
    }
  
  
}
