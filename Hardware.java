import java.util.ArrayList;
public class Hardware extends Producto {
    private String modelo;
    private Double peso;
    private ArrayList<Caracteristica> caracteristicas = new ArrayList<>();

    public Hardware(){}

    public Hardware(String idProducto, String nombre, String especificaciones, Double precio, String modelo, Double peso)
    {
        super(idProducto, nombre, especificaciones, precio);
        this.modelo = modelo;
        this.peso = peso;
    }

    public String getModelo(){ return modelo;}

    public void setModelo(String modelo){ this.modelo = modelo;}

    public Double getPeso(){ return peso;}
    
    public void setPeso(Double peso){ this.peso = peso;}

    public void addCaracteristica(Caracteristica ca){
        caracteristicas.add(ca);
    }

    public String toString(){
        String salida = "";
            for(Caracteristica e: caracteristicas){ salida += e.toString();}
        return salida;
    }


}
