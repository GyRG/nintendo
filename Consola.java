/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nintendo;
import java.util.ArrayList;
/**
 *
 * @author luism
 */
public class Consola extends Hardware {
  private String especificaciones;
  private ArrayList<Accesorio> accesorios = new ArrayList<>(); 
  
    
  public Consola()
  {
  }
  
  public Consola(String modelo, double peso,String especificaciones)
  {   
      
      this.especificaciones = especificaciones;
  }
  
  public String getEspecificaciones(){
      return especificaciones;
  }
  
  public void setEspecificaciones(String especificaciones){
      this.especificaciones = especificaciones;
  }
  
  public void addAccesorio(Accesorio ac){
      accesorios.add(ac);
  }
  
  @Override
  public String toString(){
      String salida ="";
        for(Accesorio a: accesorios){ salida += a.toString();}
        return salida;
  }
}//fin class
