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
public class EjecutaComputadora {
    public static void main(String[] args) {
       Computadora i_computadora = new Computadora();
       i_computadora.determinar_marca("Dell");
       i_computadora.determinar_procesador("Corei5");
       i_computadora.determinar_tipo("Laptop");
       i_computadora.establecer_modelo("8th generation");
       i_computadora.establecer_dico_duro("1 TB");
       String idcomputadora=i_computadora.obtener_marca();
       System.out.println("\nMarca de la computadora: "+idcomputadora);
       i_computadora.obtener_datos_computadora();
       Computadora ie_computadora = new Computadora();
       
    }
}
