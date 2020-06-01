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
public class EjecutaMultiplicacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MultiplicacionEnteros enteros = new MultiplicacionEnteros();
       
        System.out.println("Ingrese el valor   1");
        enteros.setValor1(entrada.nextInt());
         System.out.println("Ingrese el valor   2");
        enteros.setValor2(entrada.nextInt());
        enteros.Multiplicar();
        System.out.println("El producto por sumas repetitivas es: "+enteros.getProducto());
        
        
    }
    
}
