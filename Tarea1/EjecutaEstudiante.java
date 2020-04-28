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
public class EjecutaEstudiante {
      public static void main(String[] args) {
     
        Estudiante d_estudiante = new Estudiante();
        
        d_estudiante.determinar_genero("Masculino");
        d_estudiante.establecer_edad(18);
        d_estudiante.establecer_carrera("Computacion");
        d_estudiante.establecer_ciclo("Segudo");
        d_estudiante.establecer_curso("Programacion O.O");

       String ds =d_estudiante.obtener_curso();
        System.out.println("Curso actual del estudiante: "+ ds);
    
    
     d_estudiante.obtener_datos_estudiante();
     Estudiante da_estudiante = new Estudiante();
     
     
    }
    
}
