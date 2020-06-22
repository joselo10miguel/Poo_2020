/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras_2B;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1,para calcular el area del triangulo:");
        System.out.println("Digite 2,para calcular el area del rectangulo");
        System.out.println("Digite 3,para calcular el area del cuadrado");
        System.out.println("Digite 4,para calcular el area del triangulo");
        int opc=teclado.nextInt();
        String nombre="";
        teclado.nextLine();
        switch(opc){
            case 1:
                nombre="Triangulo";
                System.out.println("Ingrese el valor de la base");
                double base =teclado.nextDouble();
                System.out.println("Ingrese el valor de la altura");
                double altura = teclado.nextDouble();
                Triangulo tria=new  Triangulo(base,altura,nombre);
                tria.calcular_area_triangulo();
                System.out.println("Area para la Figura: "+tria.getNombre()+"="+tria.getArea());
               break;
            case 2:
                nombre="Rectangulo";
                 System.out.println("Ingrese el valor de la base");
                double baser =teclado.nextDouble();
                System.out.println("Ingrese el valor de la altura");
                double alturar = teclado.nextDouble();
                Rectangulo rec = new Rectangulo(baser,alturar,nombre);
                rec.calcular_area_rectangulo();
                System.out.println("Area para la Figura: "+rec.getNombre()+"="+rec.getArea());
              break;
            case 3:
                 nombre="Cuadrado";
                 System.out.println("Ingrese el valor del lado del cuadrado");
                int lado =teclado.nextInt();
               
                Cuadrado cua = new Cuadrado(lado,nombre);
                cua.clacular_area_cuadrado();
                System.out.println("Area para la Figura: "+cua.getNombre()+"="+cua.getArea());
              break;
            case 4:
                nombre="Ciculo";
                 System.out.println("Ingrese el valor del radio del Circulo");
              double radio =teclado.nextDouble();
              Circulo cir = new Circulo(radio,nombre);
              cir.calcular_area_circulo();
               System.out.printf("Area para la Figura: "+cir.getNombre()+"= %.2f \n",cir.getArea());
               
                
        }
    }
    
}
