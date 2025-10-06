/*
 * ============================================================
 *  Proyecto:       Patrones con Bucles - Pirámide
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que imprime una pirámide de asteriscos de altura N.
 *      Se centran los asteriscos con espacios.
 * ============================================================
 */

package bucles;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la altura de la pirámide:");
        int altura = sc.nextInt();

        int espacios = altura - 1;
        int asteriscos = 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            asteriscos += 2;
            espacios--;
            System.out.println();
        }
    }
}
