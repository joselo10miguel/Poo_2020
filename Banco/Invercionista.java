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
public class Invercionista {
    private  int nCuenta;
    private String nCliente;
    private int numeroC;
public Invercionista(int nCuenta, String nCliente, int numeroC) {
        this.nCuenta = nCuenta;
        this.nCliente = nCliente;
        this.numeroC = numeroC;
    }
    
    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public String getnCliente() {
        return nCliente;
    }

    public void setnCliente(String nCliente) {
        this.nCliente = nCliente;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }
    

    
    
}
