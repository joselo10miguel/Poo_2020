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
public class Celular {
    private String  marca;
    private String modelo;
    private String capacidad;
    private String sistema_operativo;
    private String procesador;
    public String su_marca(){
    return marca;
    }
    public String su_modelo(){
    return modelo;
    }
    public String su_capacidad(){
    return capacidad;
    }
    public String su_Sistema_operativo(){
    return sistema_operativo;
    }
    public String su_procesador(){
    return procesador;
    }
    public void determinar_marca(String su_marca){
    marca=su_marca;
    }
    public void determinar_modelo(String su_modelo){
    modelo=su_modelo;
    }
    public void determinar_capacidad(String su_capacidad){
    capacidad=su_capacidad;
    }
    public void determinar_SistemaO(String su_SistemaO){
    sistema_operativo=su_SistemaO;
    }
    public void determinar_procesador(String su_procesador){
    procesador=su_procesador;
    }
    public void informacion_celular(){
        String id_celular="\nMarca:"+marca+"\nModelo:"+modelo+"\nAlmacenamiento:"+capacidad
                +"\nSistema Operativo:"+sistema_operativo+"\nProcesador:"+procesador;
        System.out.println("Informacion del celular"+id_celular);
    }
}

