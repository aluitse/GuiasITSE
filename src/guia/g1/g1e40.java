/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.g1;

import java.util.Scanner;

/**
 * Enunciado: Ingresar N números de 3 dígitos, imprimir cuántos números
 * ingresados son capicúa.
 *
 * @author Kevin
 */
public class g1e40 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nNum, num, nCapicua = 0;
        short a, c;
        System.out.print("Ingrese la cantidad de números: ");
        nNum = input.nextInt();
        System.out.println("Sólo se aceptan números de 3 dígitos, eg: 123");
        for (int i = 0; i < nNum; i++) {
            System.out.print("Ingrese un número: ");
            num = input.nextInt();
            if ((num > 99) && (num < 1000)) {
                a = (short) (num / 100);
                // Opcional por si quieres el dígito del medio:
                // b = (short) (num/10 + a*10);
                c = (short) (num % 10);
                if (a == c) {
                    nCapicua++;
                    System.out.print(num + " Es Capicua");
                } else {
                    System.out.print(num + " No Es Capicua");
                }
                // Imprimimos un salto de linea
                System.out.println("");
            } else {
                System.out.println("El número "+num+" no es válido");
            }
        }
        System.out.println("El total de nros capicua son: " + nCapicua);
    }
}
