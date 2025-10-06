/*
 * ============================================================
 *  Proyecto:       Ordenar un Arreglo
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          26/09/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario un arreglo de números enteros,
 *      muestra todos los valores ingresados y permite ordenarlo
 *      de menor a mayor o de mayor a menor usando un algoritmo de burbuja.
 *
 *  Funcionalidad:
 *      - Solicitar tamaño del arreglo
 *      - Ingresar los valores del arreglo
 *      - Mostrar el arreglo original
 *      - Preguntar al usuario si desea ordenarlo ascendente o descendente
 *      - Ordenar usando algoritmo de burbuja
 *      - Mostrar arreglo ordenado
 * ============================================================
 */

package array;

import java.util.Scanner;

public class problema_K {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar tamaño del arreglo
        System.out.print("Ingresa tamaño del array: ");
        int size = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        int[] numeros = new int[size];
        int temp;

        // Ingreso de datos
        System.out.println("Ingresa los números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        // Mostrar arreglo original
        System.out.print("El array ingresado es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Preguntar cómo quiere ordenar
        System.out.print("¿Quieres ordenar el array de Mayor a Menor o de Menor a Mayor?\n"
                + "Ingresa 'Mayor' para descendente o 'Menor' para ascendente: ");
        String orden = sc.nextLine();

        // Ordenamiento de mayor a menor (descendente)
        if (orden.equalsIgnoreCase("mayor")) {
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - 1 - i; j++) {
                    if (numeros[j] < numeros[j + 1]) {
                        temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
        }

        // Ordenamiento de menor a mayor (ascendente)
        if (orden.equalsIgnoreCase("menor")) {
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - 1 - i; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
        }

        // Mostrar arreglo ordenado
        System.out.print("El array ordenado es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
