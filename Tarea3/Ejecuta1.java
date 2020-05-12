
package Tarea3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejecuta1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ejercicio1 Ejercicio_1 = new Ejercicio1();
        System.out.println("Ingrese el nombre del Producto");
        Ejercicio_1.setNombreA(entrada.nextLine());
        System.out.println("Ingrese la cantidad del producto Elegido");
        Ejercicio_1.setNarticulos(entrada.nextInt());
        Ejercicio_1.setCosto((Ejercicio_1.getNarticulos()*3.5)+10700);
        
        System.out.println("**Registro de datos del Articulo**");
        System.out.println("Nombre del Articulo: "+Ejercicio_1.getNombreA());
        System.out.println("Costo Total: "+Ejercicio_1.getCosto()+"$");
        
    }
    
}
