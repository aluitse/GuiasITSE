/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.g2;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class g2e11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Contador de estados 0  1  2  3
        int[] estadov = {0, 0, 0, 0};
        // Descripción de estados
        String[] estadod = {/*0*/"Funcionando", /*1*/ "En taller mecánico", /*2*/ "En chapa y pintura", /*3*/ "Fuera de funcionamiento"};
        String[] vector_entrada = new String[10];
        // Carga de datos al vector de entrada
        for (short i = 0; i < vector_entrada.length; i += 2) {
            System.out.print("Ingrese la Patente: ");
            vector_entrada[i] = input.next();
            System.out.print("Ingrese el Estado: ");
            vector_entrada[i + 1] = input.next();
            // En el caso de querer ir viendo el array mientras se carga:
            // System.out.println(Arrays.toString(vector_entrada));
        }
        String[] patentesok = new String[vector_entrada.length];
        for (int i = 0, j = 0; i < vector_entrada.length; i += 2) {
            String patente = vector_entrada[i];
            String estado = vector_entrada[i + 1];
            switch (estado) {
                case "0":
                    patentesok[j] = patente;
                    j++;
                    estadov[0]++;
                    break;
                case "1":
                    estadov[1]++;
                    break;
                case "2":
                    estadov[2]++;
                    break;
                case "3":
                    estadov[3]++;
                    break;
                default:
                    break;
            }
        }
        // Imprimir los estados
        for (int i = 0; i < 4; i++) {
            System.out.println(estadod[i] + ": " + estadov[i]);
        }
        // Imprimir el vector resultante, omitiendo los valores nulos
        System.out.println("Patentes ok:");
        for (String el : patentesok) {
            if (el != null) {
                System.out.println(el);
            } else {
                break;
            }
        }

    }
}
