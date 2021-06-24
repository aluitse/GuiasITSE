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
 */
public class g2e7 {

    public static void main(String[] args) {
        double[] a = new double[20], b = new double[20], c = new double[20];
        Scanner input = new Scanner(System.in);
        // Cargar A
        System.out.println("Ingrese los números de a:");
        for (short i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        // Cargar B
        System.out.println("Ingrese los números de b:");
        for (short i = 0; i < b.length; i++) {
            b[i] = input.nextInt();
        }
        // realizamos la operación solicitada
        for (short i = 0; i < c.length; i++) {
            c[i] = (b[i] * a[i]) / 2;
        }
        // Y nos quedamos tan panchos

        // Paso extra: Mostrar el vector c;
        System.out.println(Arrays.toString(c));
    }
}
