package basicos;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_S.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que calcula las raíces de una ecuación de segundo
 *      grado (ax^2 + bx + c = 0) con coeficientes reales.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Uso de operadores aritméticos y Math.sqrt
 *      - Manejo de discriminante para determinar las raíces
 * ============================================================
 */

public class problema_S {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar coeficientes
        System.out.print("Ingrese el valor de a: ");
        double a = entrada.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = entrada.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = entrada.nextDouble();

        // Calcular discriminante: b^2 - 4ac
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Discriminante = " + discriminante);

        // Verificar la naturaleza de las raíces
        if (discriminante > 0) {
            // Dos raíces reales y distintas
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La ecuación tiene dos raíces reales y distintas:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (discriminante == 0) {
            // Una raíz real (doble)
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una raíz real doble:");
            System.out.println("x = " + x);

        } else {
            // Raíces complejas
            double real = -b / (2 * a);
            double imaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("La ecuación tiene raíces complejas:");
            System.out.println("x1 = " + real + " + " + imaginaria + "i");
            System.out.println("x2 = " + real + " - " + imaginaria + "i");
        }

        // Cerrar Scanner
        entrada.close();
    }
}
