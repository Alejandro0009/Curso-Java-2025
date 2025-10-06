 /*
 * ============================================================
 *  Proyecto:       Patrones con Bucles - Corazón
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Imprime un corazón formado por asteriscos.
 * ============================================================
 */

public class Corazon {
    public static void main(String[] args) {
        int n = 6; // tamaño del corazón

        // Parte superior
        for (int i = n/2; i <= n; i+=2) {
            for (int j = 1; j < n-i; j+=2) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= n-i; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        // Parte inferior
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (i*2)-1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
