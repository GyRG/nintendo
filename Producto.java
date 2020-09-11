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
    private double precio;
    public Fecha fechaSalida;
    
    public Producto (){
        
    }

    public Producto(int idProducto, String nombre, String especificaciones, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.especificaciones = especificaciones;
        this.precio = precio;
        //this.fechaSalida = fechaSalida;
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

    public String getespecificaciones() {
        return especificaciones;
    }

    public void setespecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Fecha getFecha() {
        return fechaSalida;
    }

    public void setFecha(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", especificaciones=" + especificaciones + ", precio=" + precio + ", fechaSalida=" + fechaSalida + '}';
    }

    
}
