
/**
 *
 * @author luism
 */
public class Accesorio extends Hardware {

    private String alimentacion;
    private String conexion;
    
    public Accesorio(){
    }
    
    public Accesorio(String modelo, double peso, String alimentacion, String conexion){
        this.alimentacion = alimentacion;
        this.conexion = conexion;
    }
    
    public String getAlimentacion(){
        return alimentacion;
    }
    
    public void setAlimentacion(String alimentacion){
        this.alimentacion = alimentacion;
    }
    
    public String getConexion(){
        return conexion;
    }
    
    public void setConexion(String conexion){
        this.conexion = conexion;
    }
    
    @Override
    public String toString(){
        return "Accesorio:" + 
                "\n \t \t alimentacion: "+alimentacion+
                "\n\tconexion=" + conexion;
    }
    
    
    

    
}//fin class

