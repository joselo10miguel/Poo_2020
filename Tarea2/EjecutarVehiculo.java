package Tarea2;

import java.util.Scanner;

public class EjecutarVehiculo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vehiculo nVehiculo = new Vehiculo();
        System.out.println("*** Registro de Venta del Vehiculo Nro 1***");
        System.out.println("Ingrese el nombre del comprador:");
        nVehiculo.nombreDueño(teclado.nextLine());
        System.out.println("Ingrese la Marca");
        nVehiculo.marca(teclado.nextLine());
        System.out.println("Ingrese la placa");
       nVehiculo.placa(teclado.nextLine());
        System.out.println("Ingrese el Kilometraje");
        nVehiculo.kilometraje(teclado.nextDouble());
        System.out.println("Ingrese el precio");
        nVehiculo.precio(teclado.nextDouble());

        Vehiculo n2Vehiculo = new Vehiculo();
         System.out.println("*** Registro de Venta del Vehiculo Nro 2***");
        System.out.println("Ingrese el nombre del comprador:");
        n2Vehiculo.nombreDueño(teclado.nextLine());
        System.out.println("Ingrese la Marca");
        n2Vehiculo.marca(teclado.nextLine());
        System.out.println("Ingrese la placa");
        n2Vehiculo.placa(teclado.nextLine());
        System.out.println("Ingrese el Kilometraje");
        n2Vehiculo.kilometraje(teclado.nextDouble());
        System.out.println("Ingrese el precio");
        n2Vehiculo.precio(teclado.nextDouble());

        System.out.println(" ----REGISTRO DE VENTAS DE VEHICULO----");
        System.out.println("Vehiculo Nro1");
        System.out.println("Nombre del comprador:"+nVehiculo.getnombreDueño());
        System.out.println("Marca:"+nVehiculo.getmarca());
        System.out.println("Placa:"+nVehiculo.getplaca());
        System.out.println("Kilometrje:"+nVehiculo.getkilometraje());
        System.out.println("Precio:"+nVehiculo.getprecio());
         
        System.out.println("Vehiculo Nro2");
        System.out.println("Nombre del comprador:"+nVehiculo.getnombreDueño());
        System.out.println("Marca:"+n2Vehiculo.getmarca());
        System.out.println("Placa:"+n2Vehiculo.getplaca());
        System.out.println("Kilometrje:"+n2Vehiculo.getkilometraje());
        System.out.println("Precio:"+n2Vehiculo.getprecio());
        
        
    }

}
