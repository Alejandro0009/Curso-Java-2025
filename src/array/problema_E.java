/*
 * ============================================================
 *  Proyecto:       Orden Especial de Arreglo
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario ingresar 10 números enteros
 *      en un arreglo. Luego los muestra en un orden especial:
 *      primero, último, segundo, penúltimo, tercero, antepenúltimo, etc.
 *
 *  Conceptos:
 *      - Arreglos (arrays)
 *      - Bucle for para ingreso y salida de datos
 *      - Ordenamiento conceptual (primero/último)
 * ============================================================
 */

package Array;

import java.util.Scanner;

public class problema_E {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        // Ingreso de los números en el arreglo
        System.out.println("Vas a ingresar los valores del array:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Ingresa un número: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("\nMostrando los números en el orden especial:");
        // Mostrar en orden: primero, último, segundo, penúltimo, ...
        int inicio = 0;
        int fin = numeros.length - 1;

        while (inicio <= fin) {
            System.out.println("Valor: " + numeros[inicio]);
            if (inicio != fin) { // evitar repetir si es el mismo elemento
                System.out.println("Valor: " + numeros[fin]);
            }
            inicio++;
            fin--;
        }
    }
}
