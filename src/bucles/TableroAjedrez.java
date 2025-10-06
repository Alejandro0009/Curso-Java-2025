/*
 * ============================================================
 *  Proyecto:       Patrones con Bucles - Tablero de ajedrez
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que imprime un tablero de ajedrez de tamaño NxN.
 *      Se alternan asteriscos y espacios para simular las casillas.
 * ============================================================
 */

package bucles;

import java.util.Scanner;

public class TableroAjedrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del tablero:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { // filas
            for (int j = 0; j < n; j++) { // columnas
                if ((i + j) % 2 == 0) { // alternancia
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
