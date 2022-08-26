
package clases;
import java.util.*;
public class Negocio {
    private List<Cuenta> lista=new ArrayList();

    public Negocio() {
    lista.add(new Cuenta("Diaz", 500));
    lista.add(new Cuenta("Avila", 700));
    lista.add(new Cuenta("Castro", 600));
    }
   public void adicion(Cuenta ct){
       lista.add(ct);
   } 
   //pasando una cuenta si existe devuelve su clase y sino null
   public Cuenta busca(int nro){
    Cuenta bus=null;   
    for(Cuenta x:lista){
        if(x.getNro()==nro){
            bus=x;break;
        }
    }   
    return bus;   
   }

    public List<Cuenta> getLista() {
        return lista;
    }

    public void setLista(List<Cuenta> lista) {
        this.lista = lista;
    }
   
   
}
