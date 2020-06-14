
package deber1_b2;

import java.util.Scanner;


public class EjecutaSMatriz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matA[][] = new int[3][3];
        int matB[][] = new int[3][3];
        System.out.println("INGRESO DE DATOS DE LA MATRIZ A");
        for (int f = 0; f < matA.length; f++) {
            for (int c = 0; c < matA[0].length; c++) {
                System.out.println("Ingrese un valor para la posicion [" + f + "][" + c + "]");
                matA[f][c] = teclado.nextInt();

            }
        }
        System.out.println("INGRESO DE DATOS DE LA MATRIZ B");
        for (int f = 0; f < matB.length; f++) {
            for (int c = 0; c < matB[0].length; c++) {
                System.out.println("Ingrese un valor para la posicion [" + f + "][" + c + "]");
                matB[f][c] = teclado.nextInt();

            }
        }

        SMatriz obj = new SMatriz();
        obj.setMatrizA(matA);
        obj.setMatrizB(matB);

        obj.sumar();
        obj.promedio();

        int matC[][] = obj.getMatrizC();
        int mA[][] = obj.getMatrizA();
        int mB[][] = obj.getMatrizB();
        System.out.println("_________________________________________________");
        System.out.println("MATRIZ A");
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA.length; j++) {
                System.out.print(mA[i][j]+"\t");
            }
            System.out.println("");
        }
         System.out.println("_________________________________________________");
        System.out.println("MATRIZ B");
        for (int i = 0; i < mB.length; i++) {
            for (int j = 0; j < mB.length; j++) {
                System.out.print(mB[i][j]+"\t");
            }
            System.out.println(""); 
        }
        
        System.out.println("_________________________________________________");
        System.out.println("MATRIZ RESULTANTE DE LA SUMA DE LA MATRIZ A y B");
        for (int f = 0; f < matA.length; f++) {
            for (int c = 0; c < matA[0].length; c++) {
                System.out.print(matC[f][c] + "\t");
            }
            System.out.println("");
        }
        System.out.println("El promedio de las dos matrices es: " + obj.getPromedio());
    }
}
