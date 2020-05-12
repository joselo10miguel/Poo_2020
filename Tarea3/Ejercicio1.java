/*
 *Elaborar un algoritmo que calcule e imprima el costo de producción de un 
artículo, teniendo como datos la descripción y el número de unidades produ-
cidas. El costo se calcula multiplicando el número de unidades producidas por 
un factor de costo de materiales de 3.5 y sumándole al producto un costo fijo 
de 10 700
 */
package Tarea3;

/**
 *
 * @author DELL
 */
public class Ejercicio1 {
    private int narticulos;
    private String nombreA;
    private double costo;

    public Ejercicio1(String nombreA,int narticulos) {
         this.nombreA = nombreA;
        this.narticulos = narticulos;
       
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }
    
 
     public int getNarticulos() {
        return narticulos;
    }

    public void setNarticulos(int narticulos) {
        this.narticulos = narticulos;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

   

   
    
    
}
