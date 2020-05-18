/*
 *  Elaborar  un  algoritmo  que  lea  los  datos  de  un  estudiante  (nombre
y  tres  calificaciones  parciales)  e  imprima  el  nombre  y  la  calificación 
fi  nal  de  acuerdo  a  lo  siguiente:  para  aprobar  el  curso  debe  tener 
70  o  más  en  cada  una  de  las  tres  califi caciones, la califi cación final 
será el promedio. En caso de haber reprobado uno o más exámenes ordinarios, la
calificación final será NA (No Acreditado).
 */
package Tarea4;


public class Ejercicio7 {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double notaT;
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNotaT() {
        return notaT;
    }

    public void setNotaT(double notaT) {
        this.notaT = notaT;
    }
    public void NotaTotal(){
        if (nota1>70&&nota2>70&&nota3>70) {
            mensaje=("Acreditado");
            notaT=((nota1+nota2+nota3)/3);
            
        }else{
         mensaje=(" No Acreditado");
            notaT=((nota1+nota2+nota3)/3);
            
        
        }
        
    
    
    }
}
