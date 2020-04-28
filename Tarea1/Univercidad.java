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
public class Univercidad {

    private String nombre;
    private String ubicacion;
    private String infrestructura;
    private String tecnologia;
    private String calidad;

    public String su_nombre() {
        return nombre;
    }

    public String su_ubicacion() {
        return ubicacion;
    }

    public String su_infrestuctura() {
        return infrestructura;
    }

    public String su_tecnologia() {
        return tecnologia;
    }

    public String su_calidad() {
        return calidad;
    }

    public void determinar_nombre(String determinarsu_nombre) {
        nombre = determinarsu_nombre;
    }

    public void determinar_ubicacion(String determinarsu_ubicacion) {
        ubicacion = determinarsu_ubicacion;
    }

    public void determinar_infrestructura(String determinarsu_infrestructura) {
       infrestructura = determinarsu_infrestructura;
    }

    public void determinar_tecnologia(String determinarsu_tecnologia) {
        tecnologia = determinarsu_tecnologia;
    }

    public void determinar_calidad(String determinarsu_calidad) {

        calidad = determinarsu_calidad;
    }

    public void informacion_univercidad() {
        String id_univercidad = "\nNombre:" + nombre + "\nUbicacion:" + ubicacion + "\nInfrestructura:"
                + infrestructura + "\nTecnologia:" + tecnologia + "\nCalidad:" + calidad;
        System.out.println("Caracteristas de la Univercidad" + id_univercidad);
    }

}
