/*
 * ============================================================
 *  Proyecto:       Cálculo del Factorial
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario un número entero
 *      positivo y calcula su factorial usando un bucle while.
 * ============================================================
 */

package Ciclos;

import java.util.Scanner;

public class problema_M {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        long factorial = 1;  // long para manejar números grandes

        System.out.println("Ingrese un número entero positivo para calcular su factorial: ");
        n = entrada.nextInt();

        if (n < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
        } else if (n == 0) {
            System.out.println("El factorial de 0 es 1.");
        } else {
            int i = n;
            while (i > 0) {
                factorial *= i;
                i--;
            }
            System.out.println("El factorial de " + n + " es: " + factorial);
        }
    }
}
