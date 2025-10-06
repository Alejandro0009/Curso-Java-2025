/*
 * ============================================================
 *  Proyecto:       Patrones con Bucles - Rectángulo
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa para imprimir un rectángulo de asteriscos de tamaño NxM.
 *      N es el número de filas y M el número de columnas.
 * ============================================================
 */

package bucles;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número de filas:");
        int filas = sc.nextInt();
        System.out.println("Ingresa el número de columnas:");
        int columnas = sc.nextInt();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
