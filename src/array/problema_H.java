/*
 * ============================================================
 *  Proyecto:       Ejemplo Básico de Arreglos
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que muestra el uso de un arreglo unidimensional
 *      (array) de enteros. Se inicializan 3 valores en el arreglo
 *      y se imprimen utilizando un bucle for.
 *
 *  Conceptos:
 *      - Arreglos unidimensionales (vectores)
 *      - Índices de un arreglo comienzan desde 0
 *      - Sintaxis de declaración de arreglo:
 *          Tipo[] nombre = new Tipo[tamaño];
 * ============================================================
 */

package Array;

public class problema_H {

    public static void main(String[] args) {
        // Declaración e inicialización de un arreglo de 3 enteros
        int[] numeros = new int[3];

        numeros[0] = 2;
        numeros[1] = 7;
        numeros[2] = 4;

        // Imprimir los elementos del arreglo usando un bucle for
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento en posición " + i + ": " + numeros[i]);
        }
    }
}
