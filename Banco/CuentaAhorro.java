/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author DELL
 */
public class CuentaAhorro extends Invercionista {
    private double capitalI;
    private double interesA;
    private int plazoI;
    private double interesG;

    public CuentaAhorro(double capitalI, double interesA, int plazoI, int nCuenta, String nCliente, int numeroC) {
        super(nCuenta, nCliente, numeroC);
        this.capitalI = capitalI;
        this.interesA = interesA;
        this.plazoI = plazoI;
    }

   
    

    public double getInteresG() {
        return interesG;
    }

    public void setInteresG(double interesG) {
        this.interesG = interesG;
    }
    

    public double getCapitalI() {
        return capitalI;
    }

    public void setCapitalI(double capitalI) {
        this.capitalI = capitalI;
    }

    public double getInteresA() {
        return interesA;
    }

    public void setInteresA(double interesA) {
        this.interesA = interesA;
    }

    public int getPlazoI() {
        return plazoI;
    }

    public void setPlazoI(int plazoI) {
        this.plazoI = plazoI;
    }
    public void Gnancias_P(){
    interesA=(interesA /100);
    interesG=capitalI+(capitalI*interesA);
    
    
    
    }
    
}
