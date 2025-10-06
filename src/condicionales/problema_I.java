package Condicionales;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_I.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario una fecha (día, mes y año)
 *      e indica si la fecha es válida, considerando que todos los meses
 *      tienen 30 días.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Estructuras condicionales (if-else)
 *      - Uso de operadores lógicos
 * ============================================================
 */

public class problema_I {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar día, mes y año al usuario
        System.out.print("Ingrese el día del mes: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese el mes del año: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese el año: ");
        int año = entrada.nextInt();

        // Validar día
        if (dia >= 1 && dia <= 30) {
            System.out.println("El día ingresado es correcto: " + dia);
        } else {
            System.out.println("El día ingresado NO es válido.");
        }

        // Validar mes
        if (mes >= 1 && mes <= 12) {
            System.out.println("El mes ingresado es correcto: " + mes);
        } else {
            System.out.println("El mes ingresado NO es válido.");
        }

        // Validar año (solo ver si es positivo)
        if (año > 0) {
            System.out.println("Año correcto: " + año);
        } else {
            System.out.println("El año ingresado NO es válido.");
        }

        // Cerrar Scanner
        entrada.close();
    }
}
