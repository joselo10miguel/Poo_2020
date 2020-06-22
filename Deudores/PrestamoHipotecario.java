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
public class PrestamoHipotecario extends ClienteDeudor{
        private double cPrestado;
   private  double iAnual;
    private int pInvercion;
    private double IPagar;

    public PrestamoHipotecario(double cPrestado, double iAnual, int pInvercion,
            int nCliente, String nombreC, int nCuenta) {
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

    public double getIPagar() {
        return IPagar;
    }

    public void setIPagar(double IPagar) {
        this.IPagar = IPagar;
    }
    public void P_Hipotecario(){
    iAnual=(iAnual/100);
    IPagar=(cPrestado*iAnual)*12;
    
    }
    
    
}
