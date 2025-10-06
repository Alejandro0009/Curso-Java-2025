/*
 * ============================================================
 *  Proyecto:       Patrones con Bucles - Diamante
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Imprime un diamante de asteriscos con altura N (mitad superior e inferior).
 * ============================================================
 */

import java.util.Scanner;

public class Diamante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la mitad de la altura del diamante:");
        int altura = sc.nextInt();

        int espacios = altura - 1;
        int asteriscos = 1;

        // Parte superior
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espacios; j++) System.out.print(" ");
            for (int j = 0; j < asteriscos; j++) System.out.print("*");
            System.out.println();
            asteriscos += 2;
            espacios--;
        }

        // Parte inferior
        asteriscos -= 2;
        espacios = 1;
        for (int i = 1; i < altura; i++) {
            asteriscos -= 2;
            for (int j = 0; j < espacios; j++) System.out.print(" ");
            for (int j = 0; j < asteriscos; j++) System.out.print("*");
            System.out.println();
            espacios++;
        }
    }
}
