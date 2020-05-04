
package Tarea2;

import java.util.Scanner;


public class EjecutaBanco {
    
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        Banco nBanco = new Banco();
        System.out.println("***CUENTA BANCARIA Nro 1***");
        System.out.println("Ingrese el numero de la cuenta:");
        nBanco.setnCuenta(teclado.nextInt());
        System.out.println("Ingrese el valor del Saldo de la cuenta");
        nBanco.vSaldo(teclado.nextDouble());
        System.out.println("Ingrese el nombre del propietario de la cuenta");
        nBanco.nombreCliente(teclado.nextLine());
        nBanco.nombreCliente(teclado.nextLine());
       
        Banco n2Banco = new Banco();
        System.out.println("CUENTA BANCARIA Nro 2");
        System.out.println("Ingrese el numero de la cuenta:");
        n2Banco.setnCuenta(teclado.nextInt());
        System.out.println("Ingrese el valor del Saldo de la cuenta");
        n2Banco.vSaldo(teclado.nextDouble());
        System.out.println("Ingrese el nombre del propietario de la cuenta");
        n2Banco.nombreCliente(teclado.nextLine());
        n2Banco.nombreCliente(teclado.nextLine());
        
        System.out.println(" ----FICHAS  DE CUENTAS BANCARIAS----");
        System.out.println(" Numero de cuenta:\n"+nBanco.getnCuenta());
        System.out.println("Valor de Saldo:\n"+nBanco.getvSaldo()+"$");
        System.out.println("Nombre del Cliente:\n"+nBanco.getnombreCliente());
        
         
        System.out.println(" Numero de cuenta:\n"+n2Banco.getnCuenta());
        System.out.println("Valor de Saldo:\n"+n2Banco.getvSaldo()+"$");
        System.out.println("Nombre del Cliente:\n"+n2Banco.getnombreCliente());
    }
    
}
