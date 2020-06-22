/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras_2B;

/**
 *
 * @author DELL
 */
public class Cuadrado extends Figura {
    private int lado;
    private int area;

    public Cuadrado(int lado, String nombre) {
        super(nombre);
        this.lado = lado;
        
    }
    

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    public void clacular_area_cuadrado(){
    area=lado*lado;
    
    }
    
}
