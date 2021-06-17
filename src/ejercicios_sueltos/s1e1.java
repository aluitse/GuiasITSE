/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_sueltos;

import java.util.Scanner;

/**
 * Enunciado: Construir un programa que lea un número entero N y que imprima los
 * números impares entre 0 y N
 *
 * @author Kevin
 */
public class s1e1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = teclado.nextInt();
        for (int i = 1; i < num; i += 2) {
            System.out.print(i);
            if (i + 2 < num) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}
