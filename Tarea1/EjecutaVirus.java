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
public class EjecutaVirus {

    public static void main(String[] args) {
        Virus virus = new Virus();
        virus.determinar_nombre("Espartano");
        virus.determinar_tipo("dañino");
        virus.determinar_utilidad("Robar informacion");
        String virusd = virus.su_nombre();
        System.out.println("Nombre del Virus:" + virusd);
        virus.informacion_virus();
        Virus identificacion_V = new Virus();

    }

}
