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
public class EjecutaDocente {
     public static void main(String[] args) {
       
        Docente d_docente = new Docente();
        
        d_docente.determinar_nombre("Jose");
        d_docente.establecer_genero("Masculino");
        d_docente.establecer_carrera("Ingeniero en Sistemas");
        d_docente.establecer_edad(45);
        d_docente.establecer_ciclos("Primer ciclo,segundo ciclo y tercer ciclo de computacion");
      
       String dd =d_docente.obtener_nombre();
        System.out.println("Nombre del Docente: "+ dd);
    
 
     d_docente.obtener_datos_docente();
     Docente dd_docente = new Docente();
     
     
    }
    
    
}
