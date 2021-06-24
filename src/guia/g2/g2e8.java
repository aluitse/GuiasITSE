/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.g2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kevin
 * 
 * Enunciado: Dado un vector de 20 elementos sumar aquellos
 * elementos que sean distintos de su índice. Imprimir la suma.
 */
public class g2e8 {

    public static void main(String[] args) {
        int[] a = new int[20];
        int suma = 0;
        Scanner input = new Scanner(System.in);
        for (short i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
            if (a[i] != i) {
                suma += a[i];
            }
        }
        System.out.println("La suma es: " + suma);
    }
}
