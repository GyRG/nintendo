import java.util.ArrayList;

public class Juego extends Producto{
    
    private String subTitulo;
    private ArrayList<Clasificacion> clasificacion = new ArrayList<>();
    private ArrayList<Sinopsis> sinopsis = new ArrayList<>();
    private ArrayList<Categoria> categoria = new ArrayList<>();

    public Juego(){}

    public Juego(int idProducto, String nombre, String especificaciones, Double precio, Fecha fechaSalida,String subTitulo)
        {
        super(idProducto, nombre, especificaciones, precio, fechaSalida);
        this.subTitulo = subTitulo;
        
        }

        public String getSubTitulo()
        {
            return subTitulo;
        }

        public void setSubTitulo(String subTitulo){
            this.subTitulo = subTitulo;
        }
        
        public void addClasificacion(Clasificacion cl){clasificacion.add(cl);}
        
        public void addSinopsis(Sinopsis si){sinopsis.add(si);}
        
        public void addCategoria(Categoria ct){categoria.add(ct);}

        @Override
        public String toString(){
            String salida = "";

            for(Clasificacion e: clasificacion){salida += e.toString();}
            for(Sinopsis e: sinopsis){salida += e.toString();}
            for(Categoria e: categoria){salida += e.toString();}   
        
            return super.toString()+
                    "\n \t Subtitulo: "+subTitulo+
                    "\n \t "+salida;
        }
}