/*
 * ============================================================
 *  Proyecto:       Arreglo de Números Enteros
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario el tamaño de un arreglo de números enteros,
 *      permite ingresar los elementos del arreglo uno por uno, y finalmente 
 *      muestra en pantalla todos los números almacenados.
 *
 *  Conceptos:
 *      - Arreglos (arrays) de enteros
 *      - Entrada y salida de datos
 *      - Ciclo for
 * ============================================================
 */

package Array;

import java.util.Scanner;

public class problema_B {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar tamaño del arreglo al usuario
        int nElementos;
        System.out.print("¿Cuántos elementos tendrá su array?: ");
        nElementos = entrada.nextInt();

        // Declaración del arreglo de enteros
        int[] numeros = new int[nElementos];

        // Ingreso de los elementos del arreglo
        System.out.println("Digite los elementos del array:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print("Elemento #" + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Mostrar los elementos almacenados en el arreglo
        System.out.println("\nLos números del arreglo son:");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(numeros[i]);
        }
    }
}
