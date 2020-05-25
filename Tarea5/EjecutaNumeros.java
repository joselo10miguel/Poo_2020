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
public class EjecutaNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite = 0, positivos=0, negativos=0;
        System.out.println("Ingrese el limite de numeros a Ingresar ");
        limite = entrada.nextInt();
        int[] numeros = new int[limite];
        for (int i = 0; i < limite; i++) {
            System.out.println("Ingrese el numeros " + (i + 1));
            numeros[i] = entrada.nextInt();

        }
        positivos=negativos=numeros[0];
        for (int i = 0; i < limite; i++) {
            if (numeros[i] > positivos) {
                positivos = numeros[i];

            }else{
                if (numeros[i]<negativos) {
                    negativos=numeros[i];
                    
                }
            }

        }
        System.out.println("_______Presntar Numeros______");
        System.out.println("El numero Positivo es : "+positivos);
        System.out.println("El numero Negativo es: "+negativos);
    }

}
