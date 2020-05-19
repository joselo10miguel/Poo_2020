/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoExtraclase;

/**
 *
 * @author DELL
 */
public class EmpleadoWhile {
     private String empleado;
    private int horas;
    private double cuota;
    private double sueldo;

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }
    
    public EmpleadoWhile(){
    }

    public EmpleadoWhile(String empleado, int horas, double cuota) {
        this.empleado = empleado;
        this.horas = horas;
        this.cuota = cuota;
    }

    public String getEmpleado() {
        return empleado;
    }

    

  

  

    public double getSueldo() {
        return sueldo;
    }

    public void calcularSueldo() {
        if (horas <= 40) {
            sueldo=horas*cuota;
        }else{
            sueldo = ((40*cuota+horas-40)*(cuota*2));
            
        }
    }
    
    
}
