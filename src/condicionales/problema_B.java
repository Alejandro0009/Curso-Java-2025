package Condicionales;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_B.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario dos números enteros
 *      y determina cuál es el mayor o si ambos son iguales.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Uso de estructuras condicionales if-else anidadas
 *      - Comparación de números
 * ============================================================
 */

public class problema_B {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar los dos números enteros al usuario
        System.out.print("Por favor ingrese el primer número: ");
        int num1 = entrada.nextInt();

        System.out.print("Por favor ingrese el segundo número: ");
        int num2 = entrada.nextInt();

        // Comparar los números
        if (num1 != num2) {
            if (num1 > num2) {
                System.out.println("El número mayor es el primero: " + num1);
            } else {
                System.out.println("El número mayor es el segundo: " + num2);
            }
        } else {
            System.out.println("Los números son iguales: " + num1);
        }

        // Cerrar Scanner
        entrada.close();
    }
}
