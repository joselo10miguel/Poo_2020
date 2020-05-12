
package Tarea3;

import java.util.Scanner;


public class Ejecuta2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ejercicio2 Ejercicio_2 =new Ejercicio2();
        System.out.println("Ingrese cuantos metros tiene de ancho el terreno");
        Ejercicio_2.setAncho(entrada.nextDouble());
        System.out.println("Ingrese cuantos metros ");
        Ejercicio_2.setLargo(entrada.nextDouble());
        System.out.println("Ingresar el precio por metro del terreno");
        Ejercicio_2.setCosto(entrada.nextDouble());
        
        Ejercicio_2.setCostoTotal((Ejercicio_2.getAncho()*Ejercicio_2.getLargo())*Ejercicio_2.getCosto());
        
        System.out.println("___INFORMACION DE PRECIO TOTAL DEL TERRENO__");
        System.out.println("El costo total del terreno es: "+Ejercicio_2.getCostoTotal()+"$");
    }
   
}
