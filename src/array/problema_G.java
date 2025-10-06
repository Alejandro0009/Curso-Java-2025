/*
 * ============================================================
 *  Proyecto:       Mezcla de Arreglos en Bloques
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que lee dos arreglos de 12 números enteros cada uno
 *      y genera un tercer arreglo de 24 elementos combinando los
 *      valores de forma alterna en bloques de 3: tres elementos de A,
 *      tres elementos de B, y así sucesivamente.
 *
 *  Conceptos:
 *      - Arreglos (arrays)
 *      - Bucle for para ingreso de datos
 *      - Mezcla de arreglos en bloques
 * ============================================================
 */

package Array;

import java.util.Scanner;

public class problema_G {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] a = new int[12]; // Primer arreglo
        int[] b = new int[12]; // Segundo arreglo
        int[] c = new int[24]; // Arreglo que contendrá la mezcla

        // Ingreso de elementos del primer arreglo
        System.out.println("Vamos a ingresar los valores del primer arreglo:");
        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + ". Ingresa un número: ");
            a[i] = entrada.nextInt();
        }

        // Ingreso de elementos del segundo arreglo
        System.out.println("\nVamos a ingresar los valores del segundo arreglo:");
        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + ". Ingresa un número: ");
            b[i] = entrada.nextInt();
        }

        // Mezcla de los arreglos en bloques de 3
        int j = 0; // índice para el arreglo c
        for (int i = 0; i < 12; i++) {
            c[j++] = a[i];
            c[j++] = b[i];
        }

        // Mostrar el arreglo resultante
        System.out.println("\nEl tercer arreglo mezclado es:");
        for (int i = 0; i < 24; i++) {
            System.out.print(c[i] + "  ");
        }
        System.out.println(); // salto de línea final
    }
}
