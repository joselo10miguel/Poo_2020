package Empleados_2B;

import java.util.Scanner;

public class EjecutaS_Empleado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char opci = 's';
        do{
        System.out.println("Ingrese el tipo de Empleado que es:");
        System.out.println("Digite 1, Empleados Administrativo");
        System.out.println("Digite 2, Vendedor");
        System.out.println("Digite 3, Mecanico");
        int opc = teclado.nextInt();
       
            switch(opc){
                case 1:
                System.out.println("Ingrese el nombre del empleado");
                teclado.nextLine();
                String nombre = teclado.nextLine();
                System.out.println("Ingrese el departamento del empleado");
                String departamento = teclado.nextLine();
                System.out.println("Ingrese el puesto del empleado");
                String empleado = teclado.nextLine();

                System.out.println("Ingrese el sueldo Mensual ");
                double cuota = teclado.nextDouble();
                Empleado_Administrativo empA = new Empleado_Administrativo(cuota);
                empA.setNombre(nombre);
                empA.setDepartamento(departamento);
                empA.setPuesto(empleado);

                empA.setSueldo(cuota);
                empA.saldo_administrativo();
                System.out.println("Reporte de nomina Quincenal");
                System.out.println("RFC             Nombre    DPTO    Puesto   Sueldo quincenal");
                System.out.println("Administrativo " + empA.getNombre() + "      " + empA.getDepartamento()
                        + "      " + empA.getPuesto() + "     " + empA.getSueldo_mensual());
                break;
                case 2:
            
                    System.out.println("Ingrese el nombre del empleado");
                    teclado.nextLine();
                    String nombrec = teclado.nextLine();
                    System.out.println("Ingrese el departamento del empleado");
                    String departamentoc = teclado.nextLine();
                    System.out.println("Ingrese el puesto del empleado");
                    String empleadoc = teclado.nextLine();

                    System.out.println("Ingrese el numero de autos vendidos");
                    int vendidos = teclado.nextInt();
                    double ganancias = 0;
                    for (int i = 0; i < vendidos; i++) {
                        System.out.println("Ingrese el precio del auto vendido numero " + (i + 1));
                        double precio = teclado.nextDouble();
                        ganancias = ganancias + precio;
                    }
                    Empleado_Vendedores empV = new Empleado_Vendedores(ganancias);
                    empV.setNombre(nombrec);
                    empV.setDepartamento(departamentoc);
                    empV.setPuesto(empleadoc);

                    empV.sueldo_vendedor();
                    System.out.println("Reporte de nomina Quincenal");
                    System.out.println("RFC       Nombre    DPTO    Puesto   Sueldo quincenal");
                    System.out.println("Vendedor  " + empV.getNombre() + "        " + empV.getDepartamento()
                            + "         " + empV.getPuesto() + "         " + empV.getSueldoE());
                    break;
                case 3:
                        System.out.println("Ingrese el nombre del empleado");
                        teclado.nextLine();
                        String nombree = teclado.nextLine();
                        System.out.println("Ingrese el departamento del empleado");
                        String departamentoe = teclado.nextLine();
                        System.out.println("Ingrese el puesto del empleado");
                        String empleadoe = teclado.nextLine();
                        System.out.println("Ingrese el numero de trabajos realizados");
                        int trabajos = teclado.nextInt();
                        double gananciasp = 0;
                        for (int i = 0; i < trabajos; i++) {
                            System.out.println("Ingrese el precio del trabajo numero " + (i + 1));
                            double precio = teclado.nextDouble();
                            gananciasp = gananciasp + precio;
                        }
                        Empleado_Mecanico mec = new Empleado_Mecanico(gananciasp);
                        mec.setNombre(nombree);
                        mec.setDepartamento(departamentoe);
                        mec.setPuesto(empleadoe);
                        mec.saldo_mecanico();
                        System.out.println("Reporte de nomina Quincenal");
                        System.out.println("RFC       Nombre    DPTO    Puesto   Sueldo quincenal");
                        System.out.println("Mecanico  " + mec.getNombre() + "       " + mec.getDepartamento()
                                + "        " + mec.getPuesto() + "       " + mec.getSaldo());

                    }
                

            
            System.out.println("Desea ingresar otro empleado si / no");
            opci = teclado.next().charAt(0);

        } while (opci == 's');

    }
}
