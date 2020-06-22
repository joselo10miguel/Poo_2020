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
public class Esfera extends Figura2{
    private double radio;
    private double area;

    public Esfera(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calcular_area_esfera(){
    area=4 * Math.PI * Math.pow(radio, 2) ;
    }
    
    
}
