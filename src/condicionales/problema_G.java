package Condicionales;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_G.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita tres números enteros al usuario
 *      y los muestra en orden descendente (de mayor a menor).
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Uso de operadores de comparación (>, <)
 *      - Estructuras condicionales anidadas (if-else)
 * ============================================================
 */

public class problema_G {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario tres números
        System.out.print("Ingrese por favor 3 números enteros: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();

        System.out.println("\nOrden de los números de mayor a menor:");

        // Comparar los números y mostrarlos en orden descendente
        if ((n1 >= n2) && (n1 >= n3)) {
            if (n2 >= n3) {
                System.out.println(n1 + " > " + n2 + " > " + n3);
            } else {
                System.out.println(n1 + " > " + n3 + " > " + n2);
            }
        } else if ((n2 >= n1) && (n2 >= n3)) {
            if (n1 >= n3) {
                System.out.println(n2 + " > " + n1 + " > " + n3);
            } else {
                System.out.println(n2 + " > " + n3 + " > " + n1);
            }
        } else { // n3 es el mayor
            if (n1 >= n2) {
                System.out.println(n3 + " > " + n1 + " > " + n2);
            } else {
                System.out.println(n3 + " > " + n2 + " > " + n1);
            }
        }

        // Cerrar Scanner
        entrada.close();
    }
}
