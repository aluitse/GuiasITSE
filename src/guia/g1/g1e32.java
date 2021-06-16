/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.g1;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class g1e32 {
    public static void main(String[] args) {
        int num;
        boolean es_primo = false;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        num = teclado.nextInt();
        for(int div = 2; div < num; div++){
            if(num % div == 0){
                es_primo = true;
            }
        }
        if (es_primo == true){
            System.out.println("No Es Primo");
        }else{
            System.out.println("Es Primo");
        }
    }
}