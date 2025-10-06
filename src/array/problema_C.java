/*
 * ============================================================
 *  Proyecto:       Arreglo de Números - Impresión Invertida
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario ingresar 5 números en un arreglo,
 *      y luego imprime los números en orden inverso, mostrando el índice 
 *      correspondiente a cada elemento.
 *
 *  Conceptos:
 *      - Arreglos (arrays) de enteros
 *      - Ciclo for
 *      - Impresión de arreglos en orden inverso
 * ============================================================
 */

package Array;

import java.util.Scanner;

public class problema_C {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Declaración del arreglo con 5 elementos
        int[] numeros = new int[5];
        
        // Ingreso de los números en el arreglo
        System.out.println("Ingresa los números del arreglo: ");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Ingresa número: ");
            numeros[i] = entrada.nextInt();
        }
        
        // Imprimir los números en orden inverso
        System.out.println("\nNúmeros del arreglo en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Índice " + (i + 1) + " = " + numeros[i]);
        }
    }
}
