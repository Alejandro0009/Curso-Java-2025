package Condicionales;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_D.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que calcula el monto a pagar de un cliente
 *      en Mega Plaza, aplicando un 20% de descuento si la
 *      compra supera los 300 pesos.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Uso de variables double
 *      - Estructura condicional if-else
 *      - Operaciones aritméticas
 * ============================================================
 */

public class problema_D {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar el monto de la compra al usuario
        System.out.print("¿Cuánto vas a pagar? Calcularemos tu descuento: ");
        double montoPagar = entrada.nextDouble();
        double rebaja;

        // Verificar si aplica descuento
        if (montoPagar >= 300) {
            rebaja = montoPagar - (montoPagar * 0.20); // 20% de descuento
            System.out.println("El monto a pagar con descuento es: " + rebaja);
        } else {
            System.out.println("No tienes descuento. Monto a pagar: " + montoPagar);
        }

        // Cerrar Scanner
        entrada.close();
    }
}
