/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author felip
 */
public class Nintendo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fecha fechaEjemplo = new Fecha(7,9,1993);

        Juego gow = new Juego();
            gow.setIdProducto(1600);
            gow.setNombre("God Of War");
            gow.setespecificaciones("es un juego muy chido");
            gow.setFechaSalida(fechaEjemplo);
            gow.setPrecio(999.99);
            gow.setSubTitulo("chains of olimpus");
        System.out.println(gow);
        
        Consola nintendo64 = new Consola();
            nintendo64.setIdProducto(2666);
            nintendo64.setNombre("Nintendo 64");
            nintendo64.setespecificaciones("Producto increible");
            nintendo64.setPrecio(6008.35);
        System.out.println(nintendo64);

     //   Hardware 
    }
}
