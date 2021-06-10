/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.g2;

/**
 *
 * @author snob
 */
public class g2e11 {
    public static void main(String[] args) {
        // Contador de estados 0  1  2  3
        int[] estadov    =    {0, 0, 0, 0};
        // Descripción de estados
        String[]estadod = {/*0*/"Funcionando", /*1*/"En taller mecánico", /*2*/"En chapa y pintura", /*3*/"Fuera de funcionamiento"};
        String[] vector_entrada = {"brd123","1","sol231","2","lop132","3","bep132","0"};
        String[] patentesok = new String[vector_entrada.length];
        for (int i=0; i< vector_entrada.length; i+=2) {
            String patente = vector_entrada[i];
            String estado = vector_entrada[i+1];
            if(estado.equals("0")){
                patentesok[i] = patente;
                estadov[0]++;
            }else if (estado.equals("1")){
                estadov[1]++;
            }else if (estado.equals("2")){
                estadov[2]++;
            }else if (estado.equals("3")){
                estadov[3]++;
            }
        }
        // Imprimir los estados
        for (int i=0; i < 4; i++) {
            System.out.println(estadod[i] + ": " + estadov[i]);
        }
        // Imprimir el vector resultante, omitiendo los valores nulos
        System.out.println("Patentes ok:");
        for (String el : patentesok) {
            if(el != null){
                System.out.println(el);
            }
        }
        
    }
}
