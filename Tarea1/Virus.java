/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea1;

/**
 *
 * @author DELL
 */
public class Virus {
     private String nombre;
    private String tipo ;
    private String utilidad;
   

    public String su_nombre() {
        return nombre;
    }

    public String su_tipo() {
        return tipo;
    }

    public String su_utilidad() {
        return utilidad;
    }

   

    public void determinar_nombre(String determinarsu_nombre) {
        nombre = determinarsu_nombre;
    }

    public void determinar_tipo(String determinarsu_tipo) {
        tipo = determinarsu_tipo;
    }

    public void determinar_utilidad(String determinarsu_utilidad) {
       utilidad = determinarsu_utilidad;
    }

   

    public void informacion_virus() {
        String id_virus= "\nNombre:" + nombre + "\nTipo:"+ tipo + "\nUtilidad:"
                + utilidad;
        System.out.println("Caracteristas del Virus" + id_virus);
    }

    
}
