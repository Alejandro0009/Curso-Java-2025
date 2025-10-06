/*
 * ============================================================
 *  Proyecto:       Números de 0 a 100 de 7 en 7
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que muestra todos los números del 0 al 100
 *      aumentando de 7 en 7. Se utilizan bucles para lograrlo.
 * ============================================================
 */

package bucles;

public class problema_I {

    public static void main(String[] args) {
        System.out.println("Números del 0 al 100 en pasos de 7:");

        for (int i = 0; i <= 100; i += 7) {
            System.out.print(i + " "); // Imprime todos en la misma línea separados por espacio
        }

        System.out.println(); // Salto de línea al final
    }
}
