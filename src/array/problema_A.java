/*
 * ============================================================
 *  Proyecto:       Arreglo de Caracteres
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario el tamaño de un arreglo de caracteres,
 *      permite ingresar los elementos uno por uno, y finalmente muestra 
 *      en pantalla todos los caracteres almacenados en el arreglo.
 *
 *  Conceptos:
 *      - Arreglos (arrays)
 *      - Entrada y salida de datos
 *      - Ciclo for
 * ============================================================
 */

package Array;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class problema_A {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nElementos;

        // Solicitar tamaño del arreglo al usuario
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo:"));

        JOptionPane.showMessageDialog(null, "Digite los elementos de la matriz:");

        // Declaración del arreglo de caracteres
        char[] letras = new char[nElementos];

        // Ingreso de los elementos del arreglo
        for (int i = 0; i < nElementos; i++) {
            System.out.print("Digite el elemento #" + (i + 1) + ": ");
            letras[i] = entrada.next().charAt(0);
        }

        // Mostrar los elementos almacenados en el arreglo
        System.out.println("\nLos caracteres del arreglo son:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(letras[i] + " ");
        }
        System.out.println(); // salto de línea al final
    }
}
