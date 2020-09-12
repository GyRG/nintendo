package nintendo;


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
    
    public void setAlimentacion(){
        this.alimentacion = alimentacion;
    }
    
    public String getConexion(){
        return conexion;
    }
    
    public void setConexion(){
        this.conexion = conexion;
    }
    
    @Override
    public String toString(){
        return "Accesorio{" + "alimentacion=" + alimentacion + ", conexion=" + conexion;
    }
    
    
    
   
    
}//fin class

