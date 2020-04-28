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
public class EjecutaAnimal {

    public static void main(String[] args) {
        Animal ide_animal = new Animal();
        ide_animal.determinar_clase("Mamifero");
        ide_animal.determinar_tipo("Domestico");
        ide_animal.determinar_alimentacion(" Son Hervivoros");
        ide_animal.determinar_nombre("Vaca");
        ide_animal.determinar_aporte("Aporta leche y carne para la alimentacion humana");
        String idAnimal = ide_animal.su_nombre();
        System.out.println("Nombre del Animal:" + idAnimal);
        ide_animal.informacion_animal();
        Animal identificacion_a = new Animal();
        

    }

}
