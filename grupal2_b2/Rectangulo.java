
package grupal2_b2;

public class Rectangulo extends Figura {
   
    private double baseRec;
    private double alturaRec;

    
      
    public double getBaseRec() {
        return baseRec;
    }

    public void setBaseRec(double baseRec) {
        this.baseRec = baseRec;
    }

    public double getAlturaRec() {
        return alturaRec;
    }

    public void setAlturaRec(double alturaRec) {
        this.alturaRec = alturaRec;
    }

    @Override
    public void calcularArea() {
        area = baseRec * alturaRec;
    }
   
}
