/*
 * ============================================================
 *  Proyecto:       Patrones con Bucles - Cuadrado
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa para imprimir un cuadrado de asteriscos de tamaño N.
 *      Se pide al usuario el tamaño de lado del cuadrado.
 * ============================================================
 */

package bucles;

import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del cuadrado:");
        int n = sc.nextInt(); // tamaño del lado del cuadrado

        for (int i = 0; i < n; i++) { // filas
            for (int j = 0; j < n; j++) { // columnas
                System.out.print("* ");
            }
            System.out.println(); // salto de línea al final de cada fila
        }
    }
}
