/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras2_2B;


import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EjecutaFigura2 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1,para calcular el area del Cubo:");
        System.out.println("Digite 2,para calcular el area del Cilindro");
        System.out.println("Digite 3,para calcular el area del Cono");
        System.out.println("Digite 4,para calcular el area del Esfera");
        int opc=teclado.nextInt();
        String nombre="";
        teclado.nextLine();
        switch(opc){
            case 1:
                nombre="Cubo";
                System.out.println("Ingrese el valor de la arista");
                double arista =teclado.nextDouble();
                
               Cubo cubo=new  Cubo(arista,nombre);
                cubo.calcular_area_cubo();
                System.out.printf("Area para la Figura: "+cubo.getNombre()+"=%.2f \n",cubo.getArea());
               break;
            case 2:
                nombre="Cilindro";
                 System.out.println("Ingrese el valor del radio");
                double radio =teclado.nextDouble();
                System.out.println("Ingrese el valor de la altura");
                double alturac = teclado.nextDouble();
               Cilindro cili = new Cilindro(radio,alturac,nombre);
              cili.calcular_area_cilindro();
                System.out.printf("Area para la Figura: "+cili.getNombre()+"=%.2f \n",cili.getArea());
              break;
            case 3:
                 nombre="Cono";
                 System.out.println("Ingrese el valor del lado del radio");
               double radioc =teclado.nextDouble();
               System.out.println("Ingrese el valor del lado de la gerenatriz");
               double generatriz =teclado.nextDouble();
               
               
                Cono cua = new Cono(radioc,generatriz,nombre);
                cua.calcular_area_cono();
                System.out.printf("Area para la Figura: "+cua.getNombre()+"=%.2f \n",cua.getArea());
              break;
            case 4:
                nombre="Esfera";
                 System.out.println("Ingrese el valor del radio ");
              double radioe =teclado.nextDouble();
           Esfera esfe = new Esfera(radioe,nombre);
              esfe.calcular_area_esfera();
               System.out.printf("Area para la Figura: "+esfe.getNombre()+"= %.2f \n",esfe.getArea());
               
                
        }
    }
    
    
}
