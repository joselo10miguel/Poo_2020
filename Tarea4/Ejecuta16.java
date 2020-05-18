package Tarea4;

import java.util.Scanner;

public class Ejecuta16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("PROGRAMA PARA PRESENTAR TRANSFORMACIONES DE UN TIPO DE GRADO");
        Ejercicio16 ejercicio16 = new Ejercicio16();
        System.out.println("Ingresar el nombre del tipo de Grado La primera letra en mayuscula");
        ejercicio16.settGrado(entrada.nextLine());
        System.out.println("Ingrese el numero de grados");
        ejercicio16.setGrados(entrada.nextDouble());

        ejercicio16.CalcuarGrados();

        System.out.println("EL TIPO DE GRADO INGRESADO EN SU TRANSFORMACION ES IGUAL A :");
        System.out.println(ejercicio16.getnGrados1() + ejercicio16.getcGrados1() + "°");
        System.out.println(ejercicio16.getnGrados2() + ejercicio16.getcGrados2() + "°");
        System.out.println(ejercicio16.getnGrados2() + ejercicio16.getcGrados3() + "°");

    }

}
