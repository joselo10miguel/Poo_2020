/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class EjecutaCompaniaWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char nuevo = 's';
        String vendedorMaxVentas = "";
        String vendedorMinVentas = "";
        double ventaMax = 0;
        double ventaMin = 0;
        while (nuevo == 's') {
            System.out.println("Ingrese el nombre del vendedor");
            teclado.nextLine();
            String nombre = teclado.nextLine();
            char autoVendido = 's';
            double totalVentas = 0;
            int cont = 0;
            while (autoVendido == 's') {
                System.out.println("Ingrese el valor del auto vendido");
                double valorAuto = teclado.nextDouble();
                totalVentas = totalVentas + valorAuto;
                System.out.println("Desea Ingresar otro auto vendido para el mismo vendedor? s/n");
                autoVendido = teclado.next().charAt(0);
            }
            CompaniaWhile objCompañia = new CompaniaWhile(nombre, totalVentas);
            if (cont == 0){
                ventaMin = totalVentas;
                vendedorMinVentas = objCompañia.getNombre();
            }
            if (totalVentas > ventaMax) {
                vendedorMaxVentas = objCompañia.getNombre();
            }
            if(totalVentas < ventaMin){
                vendedorMinVentas = objCompañia.getNombre();
            }
            System.out.println("Desea Ingresar un nuevo vendedor? s/n");
            nuevo = teclado.next().charAt(0);
            cont++;
            
        }
        System.out.println("Vendedor Mayor: " + vendedorMaxVentas);
        System.out.println("Vendedor Menor: " + vendedorMinVentas);
    }
}
