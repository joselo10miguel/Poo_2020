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
public class PrestamoPersonal extends ClienteDeudor {
    private double interes_Pagar;

    private double cPrestado;
   private  double iAnual;
    private int pInvercion;

    public PrestamoPersonal(double cPrestado, double iAnual, int pInvercion, int nCliente, String nombreC, int nCuenta) {
        super(nCliente, nombreC, nCuenta);
        this.cPrestado = cPrestado;
        this.iAnual = iAnual;
        this.pInvercion = pInvercion;
    }

   

    public double getInteres_Pagar() {
        return interes_Pagar;
    }

    public void setInteres_Pagar(double interes_Pagar) {
        this.interes_Pagar = interes_Pagar;
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
    public void P_Personal(){
    iAnual=(iAnual/100);
    interes_Pagar=(cPrestado*iAnual)*12;
    
    }
   

}
