/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados_2B;

/**
 *
 * @author DELL
 */
public class Empleado_Administrativo extends S_Empleado{
    private double sueldo_mensual;
    private double sueldo;

    public Empleado_Administrativo(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

   

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void saldo_administrativo(){
    sueldo=sueldo_mensual/2;
    }
    
    
    
    
    
}
