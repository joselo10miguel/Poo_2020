package Banco;

import java.util.Scanner;

public class EjecutaInvercionista {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char opc = 's';
        int opcE = 0,invercionistas=0;
        double invercionesT = 0;
        do {
            System.out.println("Ingrese el tipo de Cuenta que desea");
            System.out.println("Digite 1 ,para Cuenta Ahorro");
            System.out.println("Digite 2, para Pagare");
            System.out.println("Ingrese 3, para Cuenta Maestra");
            opcE = teclado.nextInt();

            if (opcE == 1) {

                System.out.println("Ingrese el nombre del Cliente");
                teclado.nextLine();
                String nombre = teclado.nextLine();
                System.out.println("Ingrese el numero de cuenta");
                int cuenta = teclado.nextInt();
                System.out.println("Ingrese el numero de cliente");
                int nC = teclado.nextInt();
                System.out.println("Ingrese el  capital a ingresar");
                double cap = teclado.nextDouble();
                System.out.println("Ingrese el  valor del Interes");
                double interes = teclado.nextDouble();
                System.out.println("Ingrese el tiempo de Invercion");
                int plazo = teclado.nextInt();
                CuentaAhorro cA = new CuentaAhorro(cap, interes, plazo, cuenta, nombre, nC);
                cA.setnCliente(nombre);
                cA.setnCuenta(cuenta);
                cA.setNumeroC(nC);
                cA.setCapitalI(cap);
                cA.setInteresA(interes);
                cA.setPlazoI(plazo);
                invercionesT = invercionesT + cap;
                cA.Gnancias_P();
                invercionistas++;
                System.out.println("_____________________________________________________________");
                System.out.println("                      Pagare");
                System.out.println("Nro Cliente   Nombre      Nro Cuenta   Interes Ganado");
                System.out.println(cA.getNumeroC() + "      \t  " + cA.getnCliente()
                        + "      \t " + cA.getnCuenta() + "   \t" + cA.getInteresG());

            } else {
                if (opcE == 2) {

                    System.out.println("Ingrese el nombre del Cliente");
                    teclado.nextLine();
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el numero de cuenta");
                    int cuenta = teclado.nextInt();
                    System.out.println("Ingrese el numero de cliente");
                    int nC = teclado.nextInt();
                    System.out.println("Ingrese el  capital a ingresar");
                    double cap = teclado.nextDouble();
                    System.out.println("Ingrese el  valor del Interes");
                    double interes = teclado.nextDouble();
                    System.out.println("Ingrese el tiempo de Invercion");
                    int plazo = teclado.nextInt();
                    Pagare pa = new Pagare(cap, interes, plazo, cuenta, nombre, nC);
                    pa.setnCliente(nombre);
                    pa.setnCuenta(cuenta);
                    pa.setNumeroC(nC);
                    pa.setCapitalI(cap);
                    pa.setInteresA(interes);
                    pa.setPlazoI(plazo);
                    invercionesT = invercionesT + cap;
                    pa.Pagare();
                     invercionistas++;
                    System.out.println("_____________________________________________________________");
                    System.out.println("                      Cuenta Maestra");
                    System.out.println("Nro Cliente   Nombre      Nro Cuenta   Interes Ganado");
                    System.out.println(pa.getNumeroC() + "     \t  " + pa.getnCliente()
                            + "     \t" + pa.getnCuenta() + "   \t " + pa.getInteresGa());

                } else {

                    System.out.println("Ingrese el nombre del Cliente");
                    teclado.nextLine();
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el numero de cuenta");
                    int cuenta = teclado.nextInt();
                    System.out.println("Ingrese el numero de cliente");
                    int nC = teclado.nextInt();
                    System.out.println("Ingrese el  capital a ingresar");
                    double cap = teclado.nextDouble();
                    System.out.println("Ingrese el  valor del Interes");
                    double interes = teclado.nextDouble();
                    System.out.println("Ingrese el tiempo de Invercion");
                    int plazo = teclado.nextInt();
                    CuentaMaestra cM = new CuentaMaestra(cap, interes, plazo, cuenta, nombre, nC);
                    cM.setnCliente(nombre);
                    cM.setnCuenta(cuenta);
                    cM.setNumeroC(nC);
                    cM.setCapitalI(cap);
                    cM.setInteresA(interes);
                    cM.setPlazoI(plazo);
                    invercionesT = invercionesT + cap;
                    cM.G_Cmaestra();
                     invercionistas++;
                    
                System.out.println("_____________________________________________________________");
                System.out.println("                Cuenta de Ahorro");
                System.out.println("Nro Cliente   Nombre      Nro Cuenta   Interes Ganado");
                System.out.println(cM.getNumeroC() + "     \t" + cM.getnCliente()
                        + "     \t" + cM.getnCuenta() +"    \t" + cM.getInteresG());

                }

            }
            System.out.println("Deses ingresar mas clientes  SI/No");
            opc = teclado.next().charAt(0);

        } while (opc == 's');
        System.out.println("Numero de Invercionistas: "+invercionistas);
        System.out.println("Total de Inverciones :"+invercionesT);
    }

}
