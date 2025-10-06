 /*
 * ============================================================
 *  Proyecto:       Patrones con Bucles - Cuadrado
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Imprime un cuadrado de asteriscos de tamaño N.
 * ============================================================
 */

import java.util.Scanner;

public class CuadradoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del cuadrado:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
