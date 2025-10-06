/*
 * ============================================================
 *  Proyecto:       Número más repetido en un arreglo
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          25/09/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario un arreglo de números
 *      enteros, muestra todos los valores ingresados, y determina
 *      cuál es el número que más se repite dentro del arreglo,
 *      indicando también cuántas veces se repite.
 *
 *  Funcionalidad:
 *      - Solicitar tamaño del arreglo al usuario
 *      - Ingresar los valores del arreglo
 *      - Mostrar todos los valores del arreglo
 *      - Determinar el número más repetido y su frecuencia
 * ============================================================
 */

package array;

import java.util.Scanner;

public class problema_J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar tamaño del arreglo
        System.out.println("¿De qué tamaño quieres tu arreglo?");
        int size = sc.nextInt();
        int[] array = new int[size];

        // Variables para determinar el número más repetido
        int contadorR = 0;
        int numeroRep = 0;
        int contadorG = 0;

        // Ingreso de datos en el arreglo
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingresa el valor del array en la posición " + i + ": ");
            array[i] = sc.nextInt();
        }

        // Mostrar los valores del arreglo
        System.out.print("Los valores ingresados son:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        // Determinar el número que más se repite
        for (int i = 0; i < array.length; i++) {
            contadorR = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    contadorR++;
                }
            }
            if (contadorR > contadorG) {
                numeroRep = array[i];
                contadorG = contadorR;
            }
        }

        // Mostrar resultado
        System.out.println("El número que más se repite es: " + numeroRep +
                           " y aparece " + contadorG + " veces.");
    }
}
