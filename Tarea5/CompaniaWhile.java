/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5;

/**
 *
 * @author Claudio
 */
public class CompaniaWhile {
    private String nombre;
    private double precio_auto;
    private double total_ventas;

    public CompaniaWhile(String nombre, double total_ventas) {
        this.nombre = nombre;
        this.total_ventas = total_ventas;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio_auto() {
        return precio_auto;
    }

    public void setPrecio_auto(double precio_auto) {
        this.precio_auto = precio_auto;
    }

    public double getTotal_ventas() {
        return total_ventas;
    }

    public void setTotal_ventas(double total_ventas) {
        this.total_ventas = total_ventas;
    }
    
    
}
