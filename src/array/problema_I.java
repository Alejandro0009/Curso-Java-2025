/*
 * ============================================================
 *  Proyecto:       Rotación de Array
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          24/09/2025
 *
 *  Descripción:
 *      Programa que rota un arreglo (array) hacia la derecha
 *      un número k de posiciones. El programa imprime el 
 *      arreglo original y el arreglo resultante tras la rotación.
 *
 *  Ejemplo:
 *      Entrada:  [1, 2, 3, 4, 5], k = 2
 *      Salida:   [4, 5, 1, 2, 3]
 *
 *  Conceptos:
 *      - Arreglos unidimensionales
 *      - Indexación de arreglos (comienza en 0)
 *      - Rotación de elementos
 * ============================================================
 */

package array;

public class problema_I {

    public static void main(String[] args) {
        int k = 2;           // Número de posiciones a rotar
        int size = 5;        // Tamaño del arreglo
        int[] original = {1, 2, 3, 4, 5};
        int[] ultimos = new int[k];       // Almacena los últimos k elementos
        int[] primeros = new int[size - k]; // Almacena el resto de elementos

        // Mostrar arreglo original
        System.out.println("Arreglo original:");
        for (int i = 0; i < original.length; i++) {
            System.out.print(" " + original[i]);
        }
        System.out.println();

        // Separar los últimos k elementos
        for (int i = 0; i < k; i++) {
            ultimos[i] = original[size - k + i];
        }

        // Separar los primeros elementos
        for (int i = 0; i < size - k; i++) {
            primeros[i] = original[i];
        }

        // Mostrar resultado de la rotación
        System.out.println("Arreglo tras rotar " + k + " posiciones a la derecha:");
        for (int i = 0; i < ultimos.length; i++) {
            System.out.print(" " + ultimos[i]);
        }
        for (int i = 0; i < primeros.length; i++) {
            System.out.print(" " + primeros[i]);
        }
        System.out.println();
    }
}
