/*
 * Elaborar un algoritmo para calcular e imprimir el precio  de  un  terreno
del  cual  se tienen los siguientes datos: largo, ancho y precio por metro
cuadrado. Si el terreno tiene más de 400 metros cuadrados se hace un descuento
de 10 %.
 */
package Tarea4;

public class Ejercicio1 {

    private double ancho;
    private double costo;
    private double tamaño;
    private double largo;
    private double precio;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   
    public void calcularCostoTotal() {
      
             tamaño= ancho*largo;
        if (tamaño <= 400) {
            precio = tamaño * costo;

        } else {
            precio = (tamaño * costo) - ((tamaño * costo) * 0.1);
        }

    }

}
