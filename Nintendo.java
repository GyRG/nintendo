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
        Juego gow = new Juego();

        gow.setIdProducto(1600);
        gow.setNombre("God Of War");
        gow.setespecificaciones("es un juego muy chido");
        gow.setFechaSalida(new Fecha(7,9,1993));
        gow.setPrecio(999.99);
        gow.setSubTitulo("chains of olimpus");
        System.out.println(gow);
    }
}
