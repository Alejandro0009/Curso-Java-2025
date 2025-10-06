package Condicionales;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_F.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita dos números enteros al usuario
 *      e indica para cada uno si es par o impar.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Uso de operadores aritméticos (%)
 *      - Estructura condicional if-else
 * ============================================================
 */

public class problema_F {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario dos números
        System.out.print("Ingresa dos números enteros: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        // Verificar si el primer número es par o impar
        if (num1 % 2 == 0) {
            System.out.println("El primer número ingresado es par: " + num1);
        } else {
            System.out.println("El primer número ingresado es impar: " + num1);
        }

        // Verificar si el segundo número es par o impar
        if (num2 % 2 == 0) {
            System.out.println("El segundo número ingresado es par: " + num2);
        } else {
            System.out.println("El segundo número ingresado es impar: " + num2);
        }

        // Cerrar Scanner
        entrada.close();
    }
}
