/*La velocidad de la luz es de 300 000 kilómetros por segundo. Elaborar un algo-
ritmo que lea un tiempo en segundos e imprima la distancia que recorre la luz 
en dicho tiempo.
 * 
 */
package Tarea3;


public class Ejercicio5 {
    private int tiempo;
    private int distanciaRecorrida;

    public Ejercicio5(int tiempo) {
        this.tiempo = tiempo;
    }
    

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }
    
    
}
