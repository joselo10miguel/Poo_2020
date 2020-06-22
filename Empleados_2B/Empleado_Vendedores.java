
package Empleados_2B;


public class Empleado_Vendedores extends S_Empleado {
    private double ganacias ;
    private double sueldoE;

    public Empleado_Vendedores(double ganacias) {
        this.ganacias = ganacias;
    }

    public double getGanacias() {
        return ganacias;
    }

    public void setGanacias(double ganacias) {
        this.ganacias = ganacias;
    }

    public double getSueldoE() {
        return sueldoE;
    }

    public void setSueldoE(double sueldoE) {
        this.sueldoE = sueldoE;
    }
    public void sueldo_vendedor(){
       
    sueldoE=0.2*(ganacias);
    
    }
    
    
    
    
}
