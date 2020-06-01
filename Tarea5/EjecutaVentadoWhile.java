/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5;

import java.util.Scanner;

public class EjecutaVentadoWhile {

    public static void main(String[] args) {
            String nombre;
            int i=0;
            double producto;
            char desea = 's';

            String texto = " Precios de  ventas  \n" + String.format
            ("%s%s%s%s%s", "Articulo|" , "Costo Produccion|","Utilidad|","Impuesto|"
                    ,"Precio de Venta") + "\n-------------------------------------------------------------\n";

            //Acumuladores
           
            do{
                i++;

                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese el nombre del producto");
                nombre = sc.nextLine();
                System.out.println("Ingrese el precio del producto ");
                producto = sc.nextDouble();
                
                VentadoWhile ventas = new VentadoWhile(nombre,producto);
              
          
             
           
                texto = texto + String.format("%s             %.2f     "
                        + " %.2f     %.2f    %.2f\n",ventas.getDescripcion(), ventas.getCostoProduccion()
                ,ventas.getUtilidad(),ventas.getImpuesto(),ventas.getCostoTotal()) ;

                System.out.println("¿Desea ingresar otro producto s/n?");
                desea = sc.next().toLowerCase().charAt(0);

              }while (desea == 's');

           
            System.out.println(texto);
        }
        
        
    

}
