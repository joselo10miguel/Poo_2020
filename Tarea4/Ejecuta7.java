
package Tarea4;

import java.util.Scanner;


public class Ejecuta7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ejercicio7 ejercicio7 = new Ejercicio7();
        
        System.out.println("Programa Para presentar notas");
        System.out.println("Ingrese su nombre");
        ejercicio7.setNombre(entrada.next());
        System.out.println("Ingrese la Nota 1");
        ejercicio7.setNota1(entrada.nextDouble());
         System.out.println("Ingrese la Nota 2");
        ejercicio7.setNota2(entrada.nextDouble());
         System.out.println("Ingrese la Nota 3");
        ejercicio7.setNota3(entrada.nextDouble());
        
        ejercicio7.NotaTotal();
        System.out.println("----Presentar Notas----");
        System.out.println("Nombre: "+ejercicio7.getNombre());
        System.out.println(ejercicio7.getMensaje());
        System.out.println(ejercicio7.getNotaT());
    }
    
}
