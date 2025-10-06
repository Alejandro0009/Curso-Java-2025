package basicos;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_J.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que realiza operaciones básicas entre dos números:
 *      suma, resta, multiplicación, división y módulo.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Operadores aritméticos (+, -, *, /, %)
 *      - Mostrar resultados en consola con System.out.println()
 * ============================================================
 */

public class problema_J {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario los dos números
        System.out.print("Digite el numero uno: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite el numero dos: ");
        int numero2 = entrada.nextInt();

        // Operaciones aritméticas
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int resto = numero1 % numero2;

        // Mostrar resultados
        System.out.println("Resultado de la suma: " + suma);
        System.out.println("Resultado de la resta: " + resta);
        System.out.println("Resultado de la multiplicación: " + multiplicacion);
        System.out.println("Resultado de la división: " + division);
        System.out.println("Resto de la división: " + resto);

        // Cerrar Scanner
        entrada.close();
    }
}
