package Tarea3;

import java.util.Scanner;


public class Ejecuta5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Ejercicio5 Ejercicio_5= new Ejercicio5();
        System.out.println("Ingrese el tiempo en segundos a comprobar");
        Ejercicio_5.setTiempo(entrada.nextInt());
        Ejercicio_5.setDistanciaRecorrida(Ejercicio_5.getTiempo()*3000000);
        
        System.out.println("__Distancia Recorrida__");
        System.out.println("En "+Ejercicio_5.getTiempo()+" Segundos su distancia es de "+Ejercicio_5.getDistanciaRecorrida());
        
    }
    
}
