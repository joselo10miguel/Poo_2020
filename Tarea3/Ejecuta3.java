
package Tarea3;

import java.util.Scanner;


public class Ejecuta3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Ejercicio3 Ejercicio_3 = new Ejercicio3();
        System.out.println("Ingrese el numero de horas");
        Ejercicio_3.setHoras(entrada.nextInt());
        Ejercicio_3.setSegundos(Ejercicio_3.getHoras()*3600);
        Ejercicio_3.setMinutos(Ejercicio_3.getHoras()*60);
        Ejercicio_3.setDias(Ejercicio_3.getHoras()/24);
        System.out.println("---TRANSFORMACION DE HORAS A SEGUNDOS,MINUTOS,DIAS---");
        System.out.println(Ejercicio_3.getHoras()+" Horas es igual a "+Ejercicio_3.getSegundos()+" Segundos");
        System.out.println(Ejercicio_3.getHoras()+" Horas es igual a "+Ejercicio_3.getMinutos()+" Minutos");
        System.out.println(Ejercicio_3.getHoras()+" Horas es igual a "+Ejercicio_3.getDias()+" Dias");
        
        
    }
    
}
