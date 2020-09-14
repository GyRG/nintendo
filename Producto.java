/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private String especificaciones;
    private Double precio;
    private Fecha fechaSalida;
    
    public Producto (){
        
    }

    public Producto(int idProducto, String nombre, String especificaciones, Double precio, Fecha fechaSalida) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.especificaciones = especificaciones;
        this.precio = precio;
        this.fechaSalida = fechaSalida;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEpecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Fecha getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return
                    "SKU: " +idProducto+
                    "\n \t nombre: " +nombre+
                    "\n \t especificaciones: " +especificaciones+
                    "\n \t precio: " +precio+
                    "\n \t "+fechaSalida;
    }

    
}
