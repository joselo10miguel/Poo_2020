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
public class ClienteDeudor {

    private int nCliente;
    private String nombreC;
    private int nCuenta;

    public ClienteDeudor(int nCliente, String nombreC, int nCuenta) {
        this.nCliente = nCliente;
        this.nombreC = nombreC;
        this.nCuenta = nCuenta;

    }

    public int getnCliente() {
        return nCliente;
    }

    public void setnCliente(int nCliente) {
        this.nCliente = nCliente;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

   

}
