/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_factura;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EjecutaFactura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del producto");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el valor");
        double valor = teclado.nextDouble();
        System.out.println("Ingrese la Cantidad");
        int cantidad = teclado.nextInt();
        System.out.println("Ingrese el valor de descuento");
        double descuento = teclado.nextInt();
        Factura fa = new Factura(nombre,cantidad,valor,descuento);
        fa.Total_Descuento();
        fa.Total_Iva();
        fa.Subtotal_t();
        System.out.println("Nombre: "+fa.getNombre());
        System.out.println("Valor: "+fa.getValor());
        System.out.println("Cantidad: "+fa.getCantidad());
        System.out.println("Subtotal :"+fa.getSubtotal());
        System.out.println("Total con Iva 12%: "+fa.getTo_Iva_12());
        System.out.println("Total con descuento: "+fa.getT_Descuento());
                
    }
  
   
    
    
}
