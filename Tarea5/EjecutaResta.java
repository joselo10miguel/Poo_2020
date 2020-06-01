
package Tarea5;

import java.util.Scanner;


public class EjecutaResta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       RestaRepetitiva resta = new  RestaRepetitiva();
       
        System.out.println("Ingrese el dividendo");
       resta.setValor1(entrada.nextInt());
         System.out.println("Ingrese el divisor");
        resta.setValor2(entrada.nextInt());
       resta.Dividir();
        System.out.println("La Divicion por restas repetitivas es: "+resta.getResta());
        
        
    }
    
}
