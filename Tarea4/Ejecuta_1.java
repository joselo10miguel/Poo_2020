
package Tarea4;

import java.util.Scanner;


public class Ejecuta_1 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         System.out.println("Programa  para determinar el precio del terreno");
         Ejercicio1  Ejercicio_1 = new Ejercicio1();
         System.out.println("Ingrse el ancho del terreno");
        Ejercicio_1.setAncho(entrada.nextDouble());
         System.out.println("Ingrese el largo del terreno");
        Ejercicio_1.setLargo(entrada.nextDouble());
         System.out.println("Ingrese el precio por metro cuadrado");
         Ejercicio_1.setCosto(entrada.nextDouble());
         Ejercicio_1.calcularCostoTotal();
        
        System.out.println("___INFORMACION DE PRECIO TOTAL DEL TERRENO__");
        System.out.println("El costo total del terreno es: "+Ejercicio_1.getPrecio()+"$");
    }
   
    
}
