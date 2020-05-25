/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5;

import java.util.Scanner;

public class EjecutaVenta {

    public static void main(String[] args) {
            String nombre;
            int i=0;
            double producto;
            char desea = 's';

            String texto = " Precios de  ventas  \n" + String.format
            ("%s%s%s%s%s", "Articulo|" , "Costo Produccion|","Utilidad|","Impuesto|"
                    ,"Precio de Venta") + "\n-------------------------------------------------------------\n";

            //Acumuladores
           
            while (desea == 's') {
                i++;

                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese el nombre del producto");
                nombre = sc.nextLine();
                System.out.println("Ingrese el precio del producto ");
                producto = sc.nextDouble();
                
                Venta ventas = new Venta(nombre,producto);
              
             
             
           
                texto = texto + String.format("%s             %.2f     "
                        + " %.2f     %.2f    %.2f\n",ventas.getDescripcion(), ventas.getCostoProduccion()
                ,ventas.getUtilidad(),ventas.getImpuesto(),ventas.getCostoTotal()) ;

                System.out.println("¿Desea ingresar otro producto s/n?");
                desea = sc.next().toLowerCase().charAt(0);

            }

           
            System.out.println(texto);
        }
        
        
    

}
