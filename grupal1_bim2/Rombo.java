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
public class Rombo  extends FigurasGeometricas{
    private double diagonalMenor;
     private double diagonalMayor;
     private double area;

    public Rombo(double diagonalMenor, double diagonalMayor, String nombre) {
        super(nombre);
        this.diagonalMenor = diagonalMenor;
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void  CalcularArea_Rombo(){
    area=(diagonalMenor*diagonalMayor)/2;
    }
    
}
