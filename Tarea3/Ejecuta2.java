
package Tarea3;

import java.util.Scanner;


public class Ejecuta2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Ingrese cuantos metros tiene de ancho ,el largo y el costo por metro del terreno");
         Ejercicio2 Ejercicio_2 =new Ejercicio2(entrada.nextDouble(),entrada.nextDouble(),entrada.nextDouble());
        Ejercicio_2.setCostoTotal((Ejercicio_2.getAncho()*Ejercicio_2.getLargo())*Ejercicio_2.getCosto());
        
        System.out.println("___INFORMACION DE PRECIO TOTAL DEL TERRENO__");
        System.out.println("El costo total del terreno es: "+Ejercicio_2.getCostoTotal()+"$");
    }
   
}
