
package Tarea3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejecuta1 {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del Producto y la cantidad");
         Ejercicio1 Ejercicio_1 = new Ejercicio1(entrada.nextLine(),entrada.nextInt());
        
        Ejercicio_1.setCosto((Ejercicio_1.getNarticulos()*3.5)+10700);
        
        System.out.println("**Registro de datos del Articulo**");
        System.out.println("Nombre del Articulo: "+Ejercicio_1.getNombreA());
        System.out.println("Costo Total: "+Ejercicio_1.getCosto()+"$");
        
    }
    
}
