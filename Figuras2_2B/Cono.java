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
public class Cono extends Figura2{
    private double radio;
    private double gerenatriz;
    private double area;

    public Cono(double radio, double gerenatriz, String nombre) {
        super(nombre);
        this.radio = radio;
        this.gerenatriz = gerenatriz;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getGerenatriz() {
        return gerenatriz;
    }

    public void setGerenatriz(double gerenatriz) {
        this.gerenatriz = gerenatriz;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void calcular_area_cono(){
    area=Math.PI*radio*(radio+gerenatriz);
    }
    
}
