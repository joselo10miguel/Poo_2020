/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deudores;

import java.util.Scanner;

/**
 *
 * @author DELLr 
 */
public class EjecutaCliente_Deudor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opc=0,nC=0;
        char opcE='s';
        System.out.println("Ingrese la aopcion del tipo de Prestamo");
        System.out.println("Digite 1 , Para prestamo Personal");
        System.out.println("Digite 2 , Para Prestamo Auto");
        System.out.println("Digite 3, Para Prestamo Hipotecario");
        opc=teclado.nextInt();
        do{
            if (opc==1) {
               nC= nC+1;
                System.out.println("Ingrese el nombre del usuario");
                teclado.nextLine();
                String nombre = teclado.nextLine();
                System.out.println("Ingrese el numero de Cuenta");
                int numeroC=teclado.nextInt();
                System.out.println("Ingrese el capital prestado ");
               double cPrestado=teclado.nextDouble();
                System.out.println("Ingrese el Interes Anual");
                int iA=teclado.nextInt();
                System.out.println("Ingrese el Tiempo de Plazo");
                int tPlazo=teclado.nextInt();
                PrestamoPersonal pp =new PrestamoPersonal(cPrestado,iA,tPlazo,nC,nombre,numeroC);
                pp.setNombreC(nombre);
                pp.setnCliente(nC);
                pp.setnCuenta(numeroC);
                pp.setcPrestado(cPrestado);
                pp.setiAnual(cPrestado);
                pp.setpInvercion(tPlazo);
                pp.P_Personal();
                System.out.println("_____________________________________________________");
                System.out.println("                   Prestamo Personal");
                System.out.println("#Cliente    Nombre      #Cuenta    Interes a Pagar");
                System.out.println(pp.getnCliente()+"     \t "+pp.getNombreC()+"    \t"+
                        pp.getnCuenta()+"    \t"+pp.getInteres_Pagar());
                
                
                
            }else{
                if (opc==2) {
                   nC=nC+1;
                System.out.println("Ingrese el nombre del usuario");
                String nombre = teclado.nextLine();
                System.out.println("Ingrese el numero de Cuenta");
                int numeroC=teclado.nextInt();
                System.out.println("Ingrese el capital prestado ");
               double cPrestado=teclado.nextDouble();
                System.out.println("Ingrese el Interes Anual");
                int iA=teclado.nextInt();
                System.out.println("Ingrese el Tiempo de Plazo");
                int tPlazo=teclado.nextInt();
                 PrestamoAuto pa =new PrestamoAuto(cPrestado,iA,tPlazo,nC,nombre,numeroC);
                pa.setNombreC(nombre);
                pa.setnCliente(nC);
                pa.setnCuenta(numeroC);
                pa.setcPrestado(cPrestado);
                pa.setiAnual(cPrestado);
                pa.setpInvercion(tPlazo);
                pa.P_Auto();
                System.out.println("_____________________________________________________");
                System.out.println("                   Prestamo Auto");
                System.out.println("#Cliente    Nombre      #Cuenta    Interes a Pagar");
                System.out.println(pa.getnCliente()+"     \t "+pa.getNombreC()+"    \t"+
                        pa.getnCuenta()+"    \t"+pa.getInteresP());
                
                
                    
                    
                }else{
                nC=nC+1;
                System.out.println("Ingrese el nombre del usuario");
                String nombre = teclado.nextLine();
                System.out.println("Ingrese el numero de Cuenta");
                int numeroC=teclado.nextInt();
                System.out.println("Ingrese el capital prestado ");
               double cPrestado=teclado.nextDouble();
                System.out.println("Ingrese el Interes Anual");
                int iA=teclado.nextInt();
                System.out.println("Ingrese el Tiempo de Plazo");
                int tPlazo=teclado.nextInt();
                 PrestamoHipotecario ph =new PrestamoHipotecario(cPrestado,iA,tPlazo,nC,nombre,numeroC);
                ph.setNombreC(nombre);
                ph.setnCliente(nC);
                ph.setnCuenta(numeroC);
                ph.setcPrestado(cPrestado);
                ph.setiAnual(cPrestado);
                ph.setpInvercion(tPlazo);
                ph.P_Hipotecario();
                System.out.println("_____________________________________________________");
                System.out.println("                   Prestamo Hipotecario");
                System.out.println("#Cliente    Nombre      #Cuenta    Interes a Pagar");
                System.out.println(ph.getnCliente()+"     \t "+ph.getNombreC()+"    \t"+
                        ph.getnCuenta()+"    \t"+ph.getIPagar());
                
                
                }
            }
            System.out.println("Desea Ingresar Nuevos Usuarios si/no");
            opcE=teclado.next().charAt(0);
            
        }while(opc=='s');
        System.out.println("Total Clientes:                    \t"+nC);
        
        
        
    }
    
}
