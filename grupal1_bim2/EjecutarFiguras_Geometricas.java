/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupal1_bim2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EjecutarFiguras_Geometricas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char op = 's';
        int opc = 0;
        String nombre = "";
        do {
            System.out.println("Ingrese la opcion que desea");

            System.out.println("Digite 1, Para obtener el area del Trapecio");
            System.out.println("Digite 2, Para obtener el area del Rombo");
            System.out.println("Digite 3, Para obtener el area del Paralelogramo");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    nombre = "Trapecio";
                    System.out.println("Ingrese el valor de la Base Mayor");
                    double bMayor = teclado.nextDouble();
                    System.out.println("Ingrese el valor de la Base Menor");
                    double bMenor = teclado.nextDouble();
                    System.out.println("Ingrese el valor de la Altura");
                    double altura = teclado.nextDouble();
                    Trapecio tp = new Trapecio(bMayor, bMenor, altura, nombre);
                    tp.area_Trapecio();
                    System.out.println("__________________________________________________");
                    System.out.println("El area de la Figura: " + tp.getNombre() + " es: " + tp.getArea());
                    System.out.println("__________________________________________________");
                    break;
                case 2:

                    nombre = "Rombo";

                    System.out.println("Ingrese el valor de la Digonal Mayor");
                    double dMayor = teclado.nextDouble();
                    System.out.println("Ingrese el valor de la Digonal Menor");
                    double dMenor = teclado.nextDouble();

                    Rombo rb = new Rombo(dMayor, dMenor, nombre);
                    rb.CalcularArea_Rombo();
                    System.out.println("__________________________________________________");
                    System.out.println("El area de la Figura: " + rb.getNombre() + " es: " + rb.getArea());
                    System.out.println("__________________________________________________");
                    break;
                case 3:
                    nombre = "Paralelogramo";
                    System.out.println("Ingrese el valor de la base");
                    double base = teclado.nextDouble();
                    System.out.println("Ingrese el valor de altura");
                    double alturaP = teclado.nextDouble();
                    Paralelogramo pal = new Paralelogramo(base, alturaP, nombre);
                    pal.area_Paralelogramo();
                    System.out.println("__________________________________________________");
                    System.out.println("El area de la Figura: " + pal.getNombre() + " es: " + pal.getArea());
                    System.out.println("__________________________________________________");
                    break;
            }
            System.out.println("Desea ingrsear una nueva Figura Si/No");
            op = teclado.next().charAt(0);

        } while (op == 's');
    }

}
