/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea1;

/**
 *
 * @author DELL
 */
public class EjecutaCelular {
    public static void main(String[] args) {
        Celular id_Celular= new Celular();
        id_Celular.determinar_marca("Samsung");
        id_Celular.determinar_modelo("A 10");
        id_Celular.determinar_capacidad("32 GB");
        id_Celular.determinar_SistemaO("Android");
        id_Celular.determinar_procesador("Exynos");
        String ide_celular=id_Celular.su_marca();
        System.out.println("Marca del celular:"+ide_celular);
        id_Celular.informacion_celular();
        Celular identi_celular=new Celular();
        
    }
    
}
