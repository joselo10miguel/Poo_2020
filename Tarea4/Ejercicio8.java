/*
 *De acuerdo con la clase de sus ángulos, los triángulos se clasifican en:
Rectángulo tiene un ángulo recto (igual a 90°)
Obtusángulo     tiene un ángulo obtuso (mayor que 90° pero menor 180°)
Acutángulo       los tres ángulos son agudos (menor que 90°)
Elaborar un algoritmo que permita leer el tamaño de los tres ángulos (A,B,C) de
 un triángulo e imprima qué tipo es.
 */
package Tarea4;


public class Ejercicio8 {
    private int triangulo;
    private String nTriangulo;

    public int getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(int triangulo) {
        this.triangulo = triangulo;
    }

    public String getnTriangulo() {
        return nTriangulo;
    }

    public void setnTriangulo(String nTriangulo) {
        this.nTriangulo = nTriangulo;
    }
    
    public void NombreTriangulos(){
        if (triangulo==90) {
            nTriangulo=("Triangulo rectangulo");
            
        }else{
            if (triangulo>90&triangulo<180) {
                nTriangulo=(" Triangulo Obtusangulo");
                
            }
               nTriangulo=(" Triangulo Acutangulo");
                    
                
            
        
        }
        
    }
    
}
