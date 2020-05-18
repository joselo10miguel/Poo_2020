/*
 *  Elaborar un algoritmo que imprima el costo de un pedido de un  artículo
del cual se tiene la descripción, la cantidad pedida y el precio unitario. 
Si la cantidad pe-dida excede de 50 unidades, se hace un descuento de 15%.
 */
package Tarea4;


public class Ejercicio4 {
    private int cantidad;
    private double precio;
    private  double costoT;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Double getCostoT() {
        return costoT;
    }

    public void setCostoT(double costoT) {
        this.costoT = costoT;
        
    }
    public void costoTotal(){
        if (cantidad<=50) {
            costoT=precio*cantidad;
            
        }else{
            costoT=((precio*cantidad)-((precio*cantidad)*0.15));
        }
    
    }
    
}
