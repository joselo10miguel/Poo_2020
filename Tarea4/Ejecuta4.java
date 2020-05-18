
package Tarea4;

import java.util.Scanner;


public class Ejecuta4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para saber el precio total por la cantidad de productos");
        Ejercicio4 ejercicio_4 = new Ejercicio4();
        System.out.println("Ingrese el numero de productos");
        ejercicio_4.setCantidad(entrada.nextInt());
        System.out.println("Ingrese el precio del producto por unidades");
        ejercicio_4.setPrecio(entrada.nextDouble());
        
        ejercicio_4.costoTotal();
        System.out.println("Precio total por los productos");
        System.out.println("El precio total es: "+ejercicio_4.getCostoT());
    }
    
}
