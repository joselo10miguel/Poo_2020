
package Tarea4;

import java.util.Scanner;


public class Ejecuta8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para saber a que triangulo pernece el angulo ingresado");
        Ejercicio8 ejercicio8 = new Ejercicio8();
        System.out.println("Ingrese el angulo del triangulo");
        ejercicio8.setTriangulo(entrada.nextInt());
        
        ejercicio8.NombreTriangulos();
        System.out.println("---El angulo del triangulo---");
        System.out.println("El angulo ingresado pertenece al : "+ejercicio8.getnTriangulo());
       
        
    }
}
