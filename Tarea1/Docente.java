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
public class Docente {
    
    private String nombre;
    private String genero;
    private String especializacion;
    private int edad;
    private String ciclos_enseñar;

    public String obtener_nombre() {
        return nombre;
    }

    public String obtener_genero() {
        return genero;
    }

    public String obtener_especializacion() {
        return especializacion;
    }

    public int obtener_edad() {
        return edad;
    }

    public String obtener_ciclos_enseñar() {
        return ciclos_enseñar;
    }

    public void determinar_nombre(String su_nombre) {
        nombre = su_nombre;
    }

    public void establecer_genero(String su_genero) {
        genero = su_genero;
    }

    public void establecer_carrera(String su_especializacion) {
        especializacion = su_especializacion;
    }
    
    public void establecer_edad(int su_edad) {
        edad = su_edad;
    }
    public void establecer_ciclos(String ciclos_enseña) {
        ciclos_enseñar = ciclos_enseña;
    }

   
    public void obtener_datos_docente() {
        String datos_estudiante = "\nNombre: "+nombre + "\nGenero: " + genero +
                "\nEspecializacion: " + especializacion+"\nEdad:"+edad+"\nCiclos que enseña:"+ciclos_enseñar;
        System.out.println("Datos del Docente " + datos_estudiante);
    }

    
    
}
