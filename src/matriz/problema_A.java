/*
 * ============================================================
 *  Proyecto:       Resolución de Sistema de Ecuaciones 3x3
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que resuelve un sistema de 3 ecuaciones lineales
 *      con 3 incógnitas utilizando el método de Gauss-Jordan.
 *      
 *      Permite al usuario ingresar los coeficientes de las ecuaciones
 *      y los términos independientes, mostrando paso a paso
 *      la matriz aumentada y el resultado final.
 *
 *  Método:
 *      - Gauss-Jordan: transforma la matriz aumentada a forma escalonada reducida
 *        para obtener directamente los valores de las incógnitas.
 *
 *  Sistema de ejemplo:
 *      a1*x + b1*y + c1*z = d1
 *      a2*x + b2*y + c2*z = d2
 *      a3*x + b3*y + c3*z = d3
 * ============================================================
 */

package matriz;

import java.util.Scanner;

public class problema_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[3][4]; // Matriz aumentada 3x4
        double[] resultado = new double[3];

        System.out.println("Resolver sistema de 3 ecuaciones con 3 incógnitas (Gauss-Jordan).");
        System.out.println("Ingrese los coeficientes y términos independientes de cada ecuación:");

        // Lectura de datos
        for (int i = 0; i < 3; i++) {
            System.out.println("Ecuación " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                if (j < 3) {
                    System.out.print("Coeficiente de variable " + (j + 1) + ": ");
                } else {
                    System.out.print("Término independiente: ");
                }
                matriz[i][j] = sc.nextDouble();
            }
        }

        // Aplicando Gauss-Jordan
        for (int i = 0; i < 3; i++) {
            // Hacer 1 el pivote
            double pivote = matriz[i][i];
            for (int j = 0; j < 4; j++) {
                matriz[i][j] /= pivote;
            }

            // Hacer 0 los demás elementos de la columna
            for (int k = 0; k < 3; k++) {
                if (k != i) {
                    double factor = matriz[k][i];
                    for (int j = 0; j < 4; j++) {
                        matriz[k][j] -= factor * matriz[i][j];
                    }
                }
            }
        }

        // Guardar resultados
        for (int i = 0; i < 3; i++) {
            resultado[i] = matriz[i][3];
        }

        // Mostrar resultados
        System.out.println("\nResultados del sistema:");
        System.out.printf("x = %.2f\n", resultado[0]);
        System.out.printf("y = %.2f\n", resultado[1]);
        System.out.printf("z = %.2f\n", resultado[2]);
    }
}
