/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupal1_bim2;

/**
 *
 * @author DELL
 */
public class Paralelogramo  extends FigurasGeometricas{

    private double base;
    private double altura;
    private double area;

    public Paralelogramo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
   public void area_Paralelogramo(){
   area=base*altura;
   
   }
}
