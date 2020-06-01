/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5;

/**
 *
 * @author DELL
 */
public class Numerosfor {

    private int numero;
    private int limite;
    private int positivo;
    private int negativo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getPositivo() {
        return positivo;
    }

    public void setPositivo(int positivo) {
        this.positivo = positivo;
    }

    public int getNegativo() {
        return negativo;
    }

    public void setNegativo(int negativo) {
        this.negativo = negativo;
    }

    public void numerosPN() {
        negativo=numero;
        if (limite == 1) {
        
            if (numero > positivo) {
                positivo = numero;

            }
               
            if (numero < negativo) {
                negativo = numero;
            }

        }

    }
}
