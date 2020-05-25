/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5;

/**
 *
 * @author DELL
 */
public class Venta {

    private double costoProduccion;
    private String Descripcion;
    private double utilidad;
    private double impuesto;
    private double costoTotal;

    public Venta(String Descripcion, double costoProduccion) {
        this.costoProduccion = costoProduccion;
        this.Descripcion = Descripcion;
    }

    public double getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(double costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getUtilidad() {
        return utilidad=1.2 * costoProduccion;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    public double getImpuesto() {
        return impuesto= 0.15 * (costoProduccion + utilidad);
    }

    public void setImpuesto(double impuesto) {
        this.impuesto=impuesto ;
    }

    public double getCostoTotal() {
        return costoTotal=costoProduccion+utilidad+impuesto;
    }

    public void PrecioVenta(double costoTotal) {
        this.costoTotal =costoTotal;
    }

}
