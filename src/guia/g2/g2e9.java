/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.g2;

import java.util.Scanner;

/**
 * @author Kevin
 */
public class g2e9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] edad = new int[50];
        // Cargamos edad
        System.out.println("Inserte las edades de los chicos:");
        for(short i=0; i< edad.length;i++){
            edad[i] = input.nextInt();
        }
        int may = edad[0], men = edad[0], men12 = 0, entre_13y16 = 0, entre_17y20 = 0, may20 = 0;
        for (int i = 0; i < edad.length; i++) {
            int el = edad[i];
            if (el > may) {
                may = el;
            }else if (el < men) {
                men = el;
            }
            if (el > 20) {
                may20++;
            } else if (el > 16) {
                entre_17y20++;
            } else if (el > 12) {
                entre_13y16++;
            } else {
                men12++;
            }
        }
        // Imprimir los resultados
        System.out.print  ("Mayor: "+may+", "       );
        System.out.println("Menor: "+men            );
        System.out.print  ("Mayores de 20: "+may20+", ");
        System.out.print  ("Entre 17 y 20: "+entre_17y20+", ");
        System.out.print  ("Entre 13 y 16: "+entre_13y16+", ");
        System.out.println("Menor o igual a 12: "+men12);
    }
}
