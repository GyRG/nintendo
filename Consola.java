
import java.util.ArrayList;
/**
 *
 * @author luism
 */
public class Consola extends Hardware {
    private String edicion;
    private ArrayList<Accesorio> accesorios = new ArrayList<>(); 

    
    public Consola()
    {
    }

    public Consola(String modelo, double peso,String edicion)
    {   
        
        this.edicion = edicion;
    }
    
    public String getEdicion(){
        return edicion;
    }
    
    public void setEdicion(String edicion){
        this.edicion = edicion;
    }
    
    public void addAccesorio(Accesorio ac){
        accesorios.add(ac);
    }
    
    @Override
    public String toString(){
        String salida =" \n \t";
            for(Accesorio a: accesorios){ salida += a.toString();}
        return "Consola\n"+super.toString()+"\n \t Incluye: \t \t"+salida;
    }
}//fin class
