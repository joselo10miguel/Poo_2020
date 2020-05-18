/*
 * Elaborar  un  algoritmo  que  permita  hacer  conversiones  de  temperaturas 
entre  grados Fahrenheit, Celsius, Kelvin y Rankine. Primero debe preguntar qué
tipo de  grados  quiere  convertir.  Por  ejemplo:  si  se  le  indica  que  se  
desea  convertir  una temperatura en grados Fahrenheit, debe leer la cantidad de
grados y luego calcular e imprimir su equivalente en grados Celsius, Kelvin y
Rankine, y así debe hacer lo mismo para cada uno de los otros tipos. Para 
convertir a Celsius a la temperatura Fahrenheit se le resta 32 y se multiplica 
por 5/9. Para convertir a Kel-vin, se le suma 273 a los grados Celsius. Para
convertir a Rankine a los grados Fahrenheit se le suma 460.
 */
package Tarea4;

public class Ejercicio16 {

    private String tGrado;
    private double grados;
    private double cGrados1;
    private double cGrados2;
    private double cGrados3;
    private String nGrados1;
    private String nGrados2;
    private String nGrados3;

    public String getnGrados1() {
        return nGrados1;
    }

    public void setnGrados1(String nGrados1) {
        this.nGrados1 = nGrados1;
    }

    public String getnGrados2() {
        return nGrados2;
    }

    public void setnGrados2(String nGrados2) {
        this.nGrados2 = nGrados2;
    }

    public String getnGrados3() {
        return nGrados3;
    }

    public void setnGrados3(String nGrados3) {
        this.nGrados3 = nGrados3;
    }

    public String gettGrado() {
        return tGrado;
    }

    public void settGrado(String tGrado) {
        this.tGrado = tGrado;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double getcGrados1() {
        return cGrados1;
    }

    public void setcGrados1(double cGrados1) {
        this.cGrados1 = cGrados1;
    }

    public double getcGrados2() {
        return cGrados2;
    }

    public void setcGrados2(double cGrados2) {
        this.cGrados2 = cGrados2;
    }

    public double getcGrados3() {
        return cGrados3;
    }

    public void setcGrados3(double cGrados3) {
        this.cGrados3 = cGrados3;
    }

    public void CalcuarGrados() {
        if (tGrado.equals("Fharenheit")) {
            nGrados1 = ("Celcius: ");
            cGrados1 = (grados - 32 * (1 / 9));
            nGrados2 = ("Kelvin: ");
            cGrados2 = (cGrados1 + 273);
            nGrados3 = ("Rankine: ");
            cGrados3 = (cGrados1 + 460);

        } else {

            if (tGrado.equals("Celcius")) {
                nGrados1 = ("Fharenheit: ");
                cGrados1 = (grados * (9 / 5) + 32);
                nGrados2 = ("Kelvin: ");
                cGrados2 = (grados + 273.15);
                nGrados3 = ("Rankine: ");
                cGrados3 = (grados * (9 / 5) + 491.67);

            } else {
                if (tGrado.equals("Kelvin")) {
                    nGrados1 = ("Fharenheit: ");
                    cGrados1 = ((grados - 273.15) * (9 / 5) + 32);
                    nGrados2 = ("Celcius: ");
                    cGrados2 = (grados - 273.15);
                    nGrados3 = ("Rankine: ");
                    cGrados3 = (grados * 1.8);

                } else {

                    if (tGrado.equals("Rankine ")) {
                        nGrados1 = ("Fharenheit: ");
                        cGrados1 = (grados - 459.7);
                        nGrados2 = ("Celcius: ");
                        cGrados2 = (cGrados1 - 491.67) * (5 / 9);
                        nGrados3 = ("Kelvin: ");
                        cGrados3 = (cGrados1 * 5 / 9);

                    } else {
                        System.out.println("Ese tipo de grado no existe");
                    }

                }

            }

        }
    }

}
