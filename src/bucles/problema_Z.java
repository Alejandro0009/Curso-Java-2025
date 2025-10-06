/*
 * ============================================================
 *  Proyecto:       Pirámide de Asteriscos
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario el tamaño de una pirámide
 *      y la dibuja en la consola utilizando asteriscos (*). 
 *      La pirámide tiene la forma clásica, con espacios a la izquierda
 *      para centrar los asteriscos en cada fila.
 *
 *      Funcionalidades:
 *          1. Solicitar el tamaño de la pirámide al usuario.
 *          2. Calcular y mostrar los espacios y asteriscos correspondientes.
 *          3. Generar la pirámide utilizando ciclos anidados.
 *
 *      Estructuras utilizadas:
 *          - Ciclo for: Para filas y columnas.
 * ============================================================
 */

package bucles;

import java.util.Scanner;

public class problema_Z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita el tamaño de la pirámide
        System.out.println("Ingresa el tamaño de la pirámide:");
        int size = sc.nextInt();

        // Inicializa los espacios y los asteriscos
        int space = size - 1; // Cantidad de espacios iniciales
        int st = 1;           // Cantidad de asteriscos iniciales

        // Ciclo para las filas de la pirámide
        for (int i = 0; i < size; i++) {

            // Ciclo para imprimir los espacios antes de los asteriscos
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            // Ciclo para imprimir los asteriscos de la fila
            for (int j = 0; j < st; j++) {
                System.out.print("*");
            }

            // Actualiza los valores para la siguiente fila
            st += 2;    // Incrementa los asteriscos en 2
            space--;    // Disminuye los espacios en 1

            // Salto de línea para la siguiente fila
            System.out.println();
        }
    }
}
