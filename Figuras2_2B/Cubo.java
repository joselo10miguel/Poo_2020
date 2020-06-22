/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras2_2B;

/**
 *
 * @author DELL
 */
public class Cubo extends Figura2{
   private double arista;
   private double area;

    public Cubo(double arista, String nombre) {
        super(nombre);
        this.arista = arista;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
    public void calcular_area_cubo(){
    
    area= 6 * Math.pow(arista, 2);
    };
    
   
    
}
