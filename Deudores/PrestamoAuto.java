/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deudores;

/**
 *
 * @author DELL
 */
public class PrestamoAuto extends   ClienteDeudor {
        private double cPrestado;
   private  double iAnual;
    private int pInvercion;
    private double InteresP;

    public PrestamoAuto(double cPrestado, double iAnual, int pInvercion, int nCliente, String nombreC, int nCuenta) {
        super(nCliente, nombreC, nCuenta);
        this.cPrestado = cPrestado;
        this.iAnual = iAnual;
        this.pInvercion = pInvercion;
    }

    public double getcPrestado() {
        return cPrestado;
    }

    public void setcPrestado(double cPrestado) {
        this.cPrestado = cPrestado;
    }

    public double getiAnual() {
        return iAnual;
    }

    public void setiAnual(double iAnual) {
        this.iAnual = iAnual;
    }

    public int getpInvercion() {
        return pInvercion;
    }

    public void setpInvercion(int pInvercion) {
        this.pInvercion = pInvercion;
    }

    public double getInteresP() {
        return InteresP;
    }

    public void setInteresP(double InteresP) {
        this.InteresP = InteresP;
    }
    public void P_Auto(){
    iAnual=(iAnual/100);
        InteresP=(cPrestado*iAnual)*12;
    
    }
    
    
    
    
}
