package Tarea5;

import java.util.Scanner;

public class EjecutaBanco {

    public static void main(String[] args) {

        String nombre;
        int movimiento = 0;
        double saldoInicial,depositar=0,retirar=0;
        char desea = 'd', opcion = 's';

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario");
        nombre = sc.nextLine();
        System.out.println("Ingrese el Saldo Inicial ");
        saldoInicial = sc.nextDouble();
        
        System.out.println("¿desea realizar movimienos en su cuenta Bancaria \n Dea depositar o Retirar/n?");
        desea = sc.next().toLowerCase().charAt(0);

       
        while (opcion == 's') {
            movimiento++;
            if (desea=='d') {

                System.out.println("Ingrese cuanto desea depositar");
                depositar=sc.nextDouble();
            }else  {
                System.out.println("Ingrese el monto a Retirar");
                retirar=sc.nextDouble();
            }
            
           
            
           
            System.out.println("¿desea realizar movimienos en su cuenta Bancaria /n?");
            opcion = sc.next().toLowerCase().charAt(0);
            
       
         CuentaBancaria cuenta = new CuentaBancaria(nombre, desea,saldoInicial,depositar,retirar);
        cuenta.saldoTotal();
        System.out.println("    Estado de cuenta  ");
        System.out.println("Cuenta Habiente:  "+cuenta.getUsuario());
        System.out.println("Saldo Incial: "+cuenta.getSaldoInicial());
        System.out.println("Movimiento    Deposito   Retiro    Saldo ");
        System.out.println("------------------------------------------------");
        System.out.println(  cuenta.getDeposito()+cuenta.getRetiro()+cuenta.getSaldo());

        }
        
       
    }
}
