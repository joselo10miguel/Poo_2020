package deber1_b2;

/**
 *
 * @author DELL
 */
public class SMatriz {

    private int matrizA[][] = new int[3][3];
    private int matrizB[][] = new int[3][3];
    private int matrizC[][] = new int[3][3];
    private int smA;
    private int smB;
    private double promedio;

    public void sumar() {
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[0].length; col++) {
                matrizC[fila][col] = matrizA[fila][col] + matrizB[fila][col];

            }
        }
    }

    public void promedio() {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j <matrizA.length; j++) {
                smA = smA + matrizA[i][j];
                smB = smB + matrizB[i][j];
            }

        }
        promedio = (smA + smB) / 2;

    }

    public int getSmA() {
        return smA;
    }

    public void setSmA(int smA) {
        this.smA = smA;
    }

    public int getSmB() {
        return smB;
    }

    public void setSmB(int smB) {
        this.smB = smB;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getMatrizC() {
        return matrizC;
    }

    public void setMatrizC(int[][] matrizC) {
        this.matrizC = matrizC;
    }

}
