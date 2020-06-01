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
public class MultiplicacionEnteros {
    
 private int valor1;
 private int valor2;
 private int producto;

  

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

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }
  public void Multiplicar(){
      for (int i = 1; i <=valor2; i++) {
          producto = producto +valor1;
      }
  
  }
         
    
}
