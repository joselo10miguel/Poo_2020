
package Figuras2_2B;


public class Cilindro extends Figura2{
    private double altura;
    private double radio;
    private double area;

    public Cilindro(double altura, double radio, String nombre) {
        super(nombre);
        this.altura = altura;
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
    
    public void calcular_area_cilindro(){
    area= (2 * Math.PI *( radio * altura));
    
    }
    
    
}
