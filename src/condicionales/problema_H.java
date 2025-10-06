package Condicionales;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_H.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita un número entero entre 0 y 99,999
 *      y determina cuántas cifras tiene.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Uso de operadores lógicos (&&)
 *      - Estructuras condicionales (if)
 * ============================================================
 */

public class problema_H {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar número al usuario
        System.out.print("Ingrese un número entre 0 y 99,999: ");
        int n1 = entrada.nextInt();

        // Determinar la cantidad de cifras
        if (n1 >= 0 && n1 < 10) {
            System.out.println("Tiene una cifra.");
        } else if (n1 >= 10 && n1 < 100) {
            System.out.println("Tiene dos cifras.");
        } else if (n1 >= 100 && n1 < 1000) {
            System.out.println("Tiene tres cifras.");
        } else if (n1 >= 1000 && n1 < 10000) {
            System.out.println("Tiene cuatro cifras.");
        } else if (n1 >= 10000 && n1 < 100000) {
            System.out.println("Tiene cinco cifras.");
        } else {
            System.out.println("Número fuera del rango permitido.");
        }

        // Cerrar Scanner
        entrada.close();
    }
}
