/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EjecutaParesfor {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int i =0;
    SumaParesfor suma = new SumaParesfor();
        System.out.println("Ingrese el limite de numeros a Ingresar ");
        suma.setLimite(entrada.nextInt());
       
        for (suma.setI(i); i <suma.getLimite(); i++) {
            System.out.println("Ingrese el numero " + (i + 1));
         suma.setNumero(entrada.nextInt());
        
        }
       suma.SumaT();
       
        System.out.println("_______Presentar Suma Pares______");
         System.out.println(suma.getMensaje());
         System.out.println("Suma de numeros Pares es igual a: "+suma.getSumaP());
         
         
        
    }

    
}
