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
public class Computadora {

    private String marca;
    private String procesador;
    private String tipo;
    private String modelo;
    private String disco_duro;

    public String obtener_marca() {
        return marca;
    }

    public String obtener_procesador() {
        return procesador;
    }

    public String obtener_tipo() {
        return tipo;
    }

    public String obtener_modelo() {
        return modelo;
    }

    public String obtener_disco_duro() {
        return disco_duro;
    }

    public void determinar_marca(String su_marca) {
        marca = su_marca;
    }

    public void determinar_procesador(String su_procesador) {
        procesador = su_procesador;
    }

    public void determinar_tipo(String su_tipo) {
        tipo = su_tipo;
    }

    public void establecer_modelo(String su_modelo) {
        modelo = su_modelo;
    }

    public void establecer_dico_duro(String su_disco_duro) {
        disco_duro = su_disco_duro;
    }

    public void obtener_datos_computadora() {
        String datos_computadora = "\nMarca: " + marca + "\nProcesador: " + procesador
                + "\nTipo: " + tipo + "\nModelo:" + modelo + "\nCapacidad de disco duro:" + disco_duro;
        System.out.println("Caracteristicas de la computadora " + datos_computadora);
    }

}
