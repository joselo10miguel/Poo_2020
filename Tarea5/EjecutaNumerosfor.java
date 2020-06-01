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
public class EjecutaNumerosfor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int i =1,limite;
        Numerosfor numero = new Numerosfor();
        System.out.println("Ingrese el limite de numeros a Ingresar ");
        limite=entrada.nextInt();
       
        for (numero.setLimite(i); i <= limite; i++) {
            System.out.println("Ingrese el numeros " + (i + 1));
         numero.setNumero(entrada.nextInt());
          numero.numerosPN();
        }
        
        
        System.out.println("_______Presntar Numeros______");
        System.out.println("El numero Positivo es : "+numero.getPositivo());
        System.out.println("El numero Negativo es: "+numero.getNegativo());
    }

}
