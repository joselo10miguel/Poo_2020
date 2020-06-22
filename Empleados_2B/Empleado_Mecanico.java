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
public class Empleado_Mecanico extends S_Empleado {
   
    private double costo;
    private double saldo;

    public Empleado_Mecanico( double costo) {
     
        this.costo = costo;
        
    }

   

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void saldo_mecanico(){
    saldo=0.04*(costo);
    }
    
    
    
}
