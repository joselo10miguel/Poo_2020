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
public class EjecutaUnivercidad {
     public static void main(String[] args) {
        Univercidad univercidad = new Univercidad();
        univercidad.determinar_nombre("UTPL");
        univercidad.determinar_ubicacion("Loja,Loja");
        univercidad.determinar_infrestructura("Cuenta con edifios modernos");
        univercidad.determinar_tecnologia("Tecnologia de punta");
        univercidad.determinar_calidad("Desarrollo sostenible a travez de la educacion en valores");
        String id_U = univercidad.su_nombre();
        System.out.println("Nombre dela Univercidad:" + id_U);
        univercidad.informacion_univercidad();
        Univercidad identificacion_U = new Univercidad();
        

    }
    
}
