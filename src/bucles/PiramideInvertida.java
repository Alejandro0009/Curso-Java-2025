 /*
 * ============================================================
 *  Proyecto:       Patrones con Bucles - Pirámide Invertida
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Imprime una pirámide invertida de asteriscos.
 * ============================================================
 */

import java.util.Scanner;

public class PiramideInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la altura de la pirámide invertida:");
        int altura = sc.nextInt();

        int espacios = 0;
        int asteriscos = altura * 2 - 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            asteriscos -= 2;
            espacios++;
            System.out.println();
        }
    }
}
