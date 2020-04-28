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
public class Estudiante {

  
    private String genero;
    private int edad;
    private String carrera;
    private String ciclo;
    private String curso;

    public String obtener_genero() {
        return genero;
    }

    public int obtener_edad() {
        return edad;
    }

    public String obtener_carrera() {
        return carrera;
    }

    public String obtener_ciclo() {
        return ciclo;
    }

    public String obtener_curso() {
        return curso;
    }

    public void determinar_genero(String su_genero) {
        genero = su_genero;
    }

    public void establecer_edad(int su_edad) {
        edad = su_edad;
    }

    public void establecer_carrera(String su_carrera) {
        carrera = su_carrera;
    }
    
    public void establecer_ciclo(String su_ciclo) {
        ciclo = su_ciclo;
    }
    public void establecer_curso(String su_curso) {
        curso = su_curso;
    }

   
    public void obtener_datos_estudiante() {
        String datos_estudiante = "\nGenero: "+genero + "\nEdad: " + edad +
                "\nCarrera: " + carrera+"\nCiclo:"+ciclo+"\nCurso:"+curso;
        System.out.println("Datos del Estudiante " + datos_estudiante);
    }

}
