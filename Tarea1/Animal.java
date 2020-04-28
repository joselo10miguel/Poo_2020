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
public class Animal {

    private String clase;
    private String tipo;
    private String alimentacion;
    private String nombre;
    private String aporta_ayuda;

    public String su_clase() {
        return clase;
    }

    public String su_tipo() {
        return tipo;
    }

    public String su_alimentacion() {
        return alimentacion;
    }

    public String su_nombre() {
        return nombre;
    }

    public String Aportacion_ayuda() {
        return aporta_ayuda;
    }

    public void determinar_clase(String determinarsu_clase) {
        clase = determinarsu_clase;
    }

    public void determinar_tipo(String determinarsu_tipo) {
        tipo = determinarsu_tipo;
    }

    public void determinar_alimentacion(String determinarsu_alimentacion) {
        alimentacion = determinarsu_alimentacion;
    }

    public void determinar_nombre(String determinarsu_nombre) {
        nombre = determinarsu_nombre;
    }

    public void determinar_aporte(String determinarsu_aporte) {

        aporta_ayuda = determinarsu_aporte;
    }

    public void informacion_animal() {
        String id_animal = "\nClase:" + clase + "\nTipo:" + tipo + "\nAlimentacion:"
                + alimentacion + "\nNombre:" + nombre + "\nAportes:" + aporta_ayuda;
        System.out.println("Caracteristas del Animal" + id_animal);
    }
}
