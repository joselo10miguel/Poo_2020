package Tarea5;

public class RestaRepetitiva {

    private int valor1;
    private int valor2;
    private int resta;

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public void Dividir() {
        resta=0;
       while (valor1>=valor2){
       valor1=valor1-valor2;
       resta++;
       }
    }

}
