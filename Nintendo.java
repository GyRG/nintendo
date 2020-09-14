import java.util.Scanner;

/**
 *
 * @author felip
 */

public class Nintendo {

    /**
     * @param args the command line arguments
     */

 
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //

        int nivel = 1;
        int opcion = 1;

while ( nivel != 0 ){
    System.out.println( "Escriba el numero correspondiente"+ 
    " a la accion que desee ejecutar.");
    switch(nivel){
        case  1:
        System.out.println(
            "\n 0 Cerrar"+
            "\n 1 Dar de alta un producto"+
            "\n 2 Listar productos");
        case 2:
        System.out.println(
            "\n 0 Regresar"+
            "\n 1 Consola"+
            "\n 2 Accesorio"+
            "\n 3 Juego");
        case 3:

        Consola consola = new Consola();
        
        System.out.println("SKU");
            consola.setIdProducto(sc.nextInt());
        System.out.println("Nombre");
            consola.setNombre(sc.nextLine());
        System.out.println("Especificaciones");
            consola.setEpecificaciones(sc.nextLine());
        System.out.println("Precio");        
            consola.setPrecio(sc.nextDouble());
        System.out.println("Peso");
            consola.setPeso(sc.nextDouble());
        System.out.println("Modelo");
            consola.setModelo(sc.nextLine());
        System.out.println("Edición");
            consola.setEdicion(sc.nextLine());
/*        System.out.println("SKU");
            consola.addAccesorio();
  */      System.out.println(consola);
        case 4:
        

    }
    opcion = sc.nextInt();
    switch(opcion){
        case 0: nivel = (nivel == 1)? 0: (nivel == 2)? 1 : 1;
        case 1: nivel = (nivel == 1)? 2: (nivel == 2)? 3 : 4;
        case 2: nivel = (nivel == 1)? 0: (nivel == 2)? 3 : 1;
        case 3: nivel = (nivel == 1)? 0: (nivel == 2)? 3 : 1;
    }
};


        Fecha fechaEjemplo = new Fecha(7,9,1993);

        Juego mario64 = new Juego();
            mario64.setIdProducto(1600);
            mario64.setNombre("Mario 64");
            mario64.setEpecificaciones("es un juego muy chido");
            mario64.setFechaSalida(fechaEjemplo);
            mario64.setPrecio(999.99);
            mario64.setSubTitulo("Remastered Edition");
        System.out.println(mario64);
        
        Accesorio controlPistola = new Accesorio();
                controlPistola.setAlimentacion("Cable directo");
                controlPistola.setConexion("Infrarojo");

        
        sc.close();
     //   Hardware 
    }
}
