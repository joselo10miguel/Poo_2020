
package grupal2_b2;

import java.util.Scanner;


public class EjecutaFigura {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1,para calcular el area del triangulo:");
        System.out.println("Digite 2,para calcular el area del rectangulo");
        System.out.println("Digite 3,para calcular el area del cuadrado");
        System.out.println("Digite 4,para calcular el area del triangulo");
        int opc = teclado.nextInt();

        teclado.nextLine();
        switch (opc) {
            case 1:

                System.out.println("Ingrese el valor de la base");
                double base = teclado.nextDouble();
                System.out.println("Ingrese el valor de la altura");
                double altura = teclado.nextDouble();
                Triangulo tria = new Triangulo();
                tria.setBase(base);
                tria.setAltura(altura);
                tria.calcularArea();
                System.out.println("El área del Triangulo es: " + tria.getArea());
                break;
            case 2:

                System.out.println("Ingrese el valor de la base");
                double baser = teclado.nextDouble();
                System.out.println("Ingrese el valor de la altura");
                double alturar = teclado.nextDouble();
                Rectangulo rec = new Rectangulo();
                rec.setAlturaRec(alturar);
                rec.setBaseRec(baser);
                rec.calcularArea();
                
                System.out.println("El área del Rectangulo es: " + rec.getArea());
                break;
            case 3:

                System.out.println("Ingrese el valor del lado del cuadrado");
                double lado = teclado.nextDouble();
                Cuadrado cua = new Cuadrado();
                cua.setLadoCuad(lado);
                cua.calcularArea();
                
                System.out.println("El área del cuadrado es: " + cua.getArea());
                break;
            case 4:

                System.out.println("Ingrese el valor del radio del Circulo");
                double radio = teclado.nextDouble();
                Circulo cir = new Circulo();
                cir.setRadio(radio);
                cir.calcularArea();
                System.out.printf("El área del circulo es: %.2f \n", cir.getArea());

        }
    }
  }

