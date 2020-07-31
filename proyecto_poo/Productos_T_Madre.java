/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

/**
 *
 * @author DELL
 */
public class Productos_T_Madre {
    private String tipo;
    private String nombre;
    private String id;
    private double precio;
  
    private String caducidad;
    private double subtotal;
    private double Total;

    public Productos_T_Madre(String tipo, String nombre, String id, double precio, String caducidad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        
        this.caducidad = caducidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }
    
    
    
}
