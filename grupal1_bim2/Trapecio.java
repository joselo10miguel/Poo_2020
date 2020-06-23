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
public class Trapecio extends FigurasGeometricas {
     private double baseMayor;
      private double baseMenor;
      private double altura;
    private double area;

    public Trapecio(double baseMayor, double baseMenor, double altura, String nombre) {
        super(nombre);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
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
    public void area_Trapecio(){
    area=((baseMayor+baseMenor)*altura)/2;
    
    }
  
    
    
}
