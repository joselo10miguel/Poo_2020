package Tarea5;

/**
 *
 * @author DELL
 */
public class CuentaBancaria {

    private String usuario;
    private char desea;

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

    public CuentaBancaria(String usuario, char desea, double saldoInicial, double deposito, double retiro) {
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
       saldo=saldoInicial;
        if (desea == 'd') {
          saldo = saldo + deposito;

        }else{
            if (desea == 'r') {
             saldo = saldo-retiro;
        }  
            }
        
    }

}
