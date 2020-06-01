package Tarea5;

/**
 *
 * @author DELL
 */
public class CuentaBancariadoWhile {

    private String usuario;
    private char desea;
    private double sumaD;
    private double sumaR;
    private double sumaS;

    public double getSumaD() {
        return sumaD;
    }

    public void setSumaD(double sumaD) {
        this.sumaD = sumaD;
    }

    public double getSumaR() {
        return sumaR;
    }

    public void setSumaR(double sumaR) {
        this.sumaR = sumaR;
    }

    public double getSumaS() {
        return sumaS;
    }

    public void setSumaS(double sumaS) {
        this.sumaS = sumaS;
    }

    public char getDesea() {
        return desea;
    }

    public void setDesea(char desea) {
        this.desea = desea;
    }
    private double saldoInicial;
    private double deposito;
    private double retiro;
    private double saldo;
    private double totales;

    public CuentaBancariadoWhile(String usuario, char desea, double saldoInicial, double deposito, double retiro) {
        this.usuario = usuario;
        this.desea = desea;
        this.saldoInicial = saldoInicial;
        this.deposito = deposito;
        this.retiro = retiro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTotales() {
        return totales;
    }

    public void setTotales(double totales) {

        this.totales = totales;

    }

    public void saldoTotal() {
        saldo = saldoInicial;
        if (desea == 'd') {
            saldo = saldo + deposito;

        } else {
            if (desea == 'r') {
                saldo = saldo - retiro;
            }
        }
       sumaD=sumaD+deposito;
       sumaR=sumaR+retiro;
       sumaS=sumaS+saldo;
    }

}
