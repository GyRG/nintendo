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

        Juego mario64 = new Juego();
            mario64.setIdProducto(1600);
            mario64.setNombre("Mario 64");
            mario64.setespecificaciones("es un juego muy chido");
            mario64.setFechaSalida(fechaEjemplo);
            mario64.setPrecio(999.99);
            mario64.setSubTitulo("Remastered Edition");
        System.out.println(mario64);
        
        Accesorio controlPistola = new Accesorio();
                controlPistola.setAlimentacion("Cable directo");
                controlPistola.setConexion("Infrarojo");

        Consola nintendo64 = new Consola();
            nintendo64.setIdProducto(2666);
            nintendo64.setNombre("Nintendo 64");
            nintendo64.setespecificaciones("Producto increible");
            nintendo64.setPrecio(6008.35);
            nintendo64.setPeso(0.6);
            nintendo64.setModelo("2002");
            nintendo64.setEdicion("Turok");
            nintendo64.addAccesorio(controlPistola);
        System.out.println(nintendo64);

     //   Hardware 
    }
}
