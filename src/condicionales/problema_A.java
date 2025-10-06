package Condicionales;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_A.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que lee un número entero ingresado por el usuario
 *      y determina si es múltiplo de 10.
 *
 *  Conceptos aprendidos:
 *      - Uso de Scanner para entrada de datos
 *      - Operador módulo (%) para determinar múltiplos
 *      - Estructura condicional if-else
 * ============================================================
 */

public class problema_A {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario un número entero
        System.out.print("Por favor ingrese un número entero: ");
        int numero = entrada.nextInt();

        // Verificar si el número es múltiplo de 10
        if (numero % 10 == 0) {
            System.out.println("El número ingresado es múltiplo de 10.");
        } else {
            System.out.println("El número ingresado NO es múltiplo de 10.");
        }

        // Mostrar el número ingresado
        System.out.println("Número ingresado: " + numero);

        // Cerrar Scanner
        entrada.close();
    }
}
