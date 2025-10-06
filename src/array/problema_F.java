/*
 * ============================================================
 *  Proyecto:       Mezcla de Arreglos
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que lee dos arreglos de 10 números enteros cada uno
 *      y genera un tercer arreglo de 20 elementos combinando los
 *      valores de forma alterna: primero de A, primero de B,
 *      segundo de A, segundo de B, y así sucesivamente.
 *
 *  Conceptos:
 *      - Arreglos (arrays)
 *      - Bucle for para ingreso de datos
 *      - Mezcla de arreglos
 * ============================================================
 */

package Array;

import java.util.Scanner;

public class problema_F {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] a = new int[10]; // Primer arreglo
        int[] b = new int[10]; // Segundo arreglo
        int[] c = new int[20]; // Arreglo que contendrá la mezcla

        // Ingreso de elementos del primer arreglo
        System.out.println("\nDigite los elementos del primer arreglo:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            a[i] = entrada.nextInt();
        }

        // Ingreso de elementos del segundo arreglo
        System.out.println("\nDigite los elementos del segundo arreglo:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            b[i] = entrada.nextInt();
        }

        // Mezcla de los dos arreglos en el arreglo c
        int j = 0; // índice para el arreglo c
        for (int i = 0; i < 10; i++) {
            c[j++] = a[i]; // primero elemento de A
            c[j++] = b[i]; // luego elemento de B
        }

        // Mostrar el arreglo resultante
        System.out.println("\nEl tercer arreglo mezclado es:");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i] + "  ");
        }
        System.out.println(); // salto de línea final
    }
}
