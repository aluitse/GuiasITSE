/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.g1;

import java.util.Scanner;

/**
 * Enunciado: Ingrese N números de 8 dígitos cada uno, donde los dos primeros
 * representan el día, los dos siguientes el mes y los cuatro últimos el año
 *
 * @author Kevin
 */
public class g1e39 {

    public static void main(String[] args) {
        int num, n_nums, dia, mes, anio;
        String val, inval;
        val = "El código es válido";
        inval = "El código no es válido";
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba la cantidad de códigos a procesar: ");
        n_nums = input.nextInt();
        System.out.println("Los códigos deben ser insertados en el siguiente formato: 'DDMMAAAA' \n(Por ejemplo: 12/11/2020 -> 12112020)");
        for (int i = 0; i < n_nums; i++) {
            System.out.print("Escriba el código: ");
            num = input.nextInt();
            dia = num / 1000000;
            mes = (num / 10000) - (dia * 100);
            anio = num % 10000;
            // Chequear si el día es válido según el rango (1;31)
            if ((dia <= 0) && (dia >= 31)) {
                System.out.println(inval);
                break;
            }
            // Validar según mes
            switch (mes) {
                // Meses de 31 días
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia <= 31) {
                        System.out.println(val);
                    } else {
                        System.out.println(inval);
                    }
                    break;
                // Meses de 30 días
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia <= 30) {
                        System.out.println(val);
                    } else {
                        System.out.println(inval);
                    }
                    break;
                // Acciones por febrero
                case 2:
                    // Corroborando si es bisiesto
                    if ((anio % 4 == 0) && ((anio % 100 != 0)
                            || (anio % 400 == 0))) {
                        if (dia <= 29) {
                            System.out.println(val);
                        }
                    } else if (dia <= 28) {
                        System.out.println(val);
                    } else {
                        System.out.println(inval);
                    }
                    break;
                default:
                    System.out.println(inval);
            }
        }
    }
}
