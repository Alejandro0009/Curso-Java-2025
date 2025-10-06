package basicos;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_O.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que calcula el cuadrado de una suma utilizando
 *      la fórmula: (a + b)^2 = a^2 + b^2 + 2ab
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Operaciones aritméticas y potencias con Math.pow()
 *      - Mostrar resultados en consola con System.out.println()
 * ============================================================
 */

public class problema_O {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar valores al usuario
        System.out.print("Ingrese el valor de 'a': ");
        double a = entrada.nextDouble();

        System.out.print("Ingrese el valor de 'b': ");
        double b = entrada.nextDouble();

        // Cálculos del cuadrado de la suma
        double aAlCuadrado = Math.pow(a, 2);
        double bAlCuadrado = Math.pow(b, 2);
        double dosPorAB = 2 * a * b;

        double resultado = aAlCuadrado + bAlCuadrado + dosPorAB;

        // Mostrar resultados
        System.out.println("\nFórmula utilizada: (a + b)^2 = a^2 + b^2 + 2ab");
        System.out.println("Cálculo paso a paso: " + aAlCuadrado + " + " + bAlCuadrado + " + " + dosPorAB);
        System.out.println("Resultado final: " + resultado);

        // Cerrar Scanner
        entrada.close();
    }
}
