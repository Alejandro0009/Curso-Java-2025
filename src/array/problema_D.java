/*
 * ============================================================
 *  Proyecto:       Análisis de Arreglo de Números
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario ingresar 5 números en un arreglo.
 *      Calcula y muestra:
 *          - Media de los números positivos
 *          - Media de los números negativos
 *          - Cantidad de ceros ingresados
 *
 *  Conceptos:
 *      - Arreglos (arrays) de enteros
 *      - Condicionales (if/else)
 *      - Conteo y acumulación de valores
 * ============================================================
 */

package Array;

import java.util.Scanner;

public class problema_D {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int suma_positivos = 0, suma_negativos = 0;
        int media_positivos, media_negativos;
        int conteo_positivos = 0, conteo_negativos = 0, conteo_ceros = 0;
        int[] numero = new int[5];
        
        // Ingreso de los números en el arreglo
        System.out.println("Ingresa los números del arreglo:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Ingresa el valor del arreglo: ");
            numero[i] = entrada.nextInt();
            
            // Clasificación del número
            if (numero[i] == 0) {
                conteo_ceros++;
            } else if (numero[i] > 0) {
                suma_positivos += numero[i];
                conteo_positivos++;
            } else {
                suma_negativos += numero[i];
                conteo_negativos++;
            }
        }
        
        // Cálculo y muestra de la media de los positivos
        if (conteo_positivos == 0) {
            System.out.println("No se puede calcular la media de los números positivos");
        } else {
            media_positivos = suma_positivos / conteo_positivos;
            System.out.println("La media de los números positivos es: " + media_positivos);
        }
        
        // Cálculo y muestra de la media de los negativos
        if (conteo_negativos == 0) {
            System.out.println("No se puede calcular la media de los números negativos");
        } else {
            media_negativos = suma_negativos / conteo_negativos;
            System.out.println("La media de los números negativos es: " + media_negativos);
        }
        
        // Mostrar la cantidad de ceros
        System.out.println("La cantidad de ceros ingresados es: " + conteo_ceros);
    }
}
