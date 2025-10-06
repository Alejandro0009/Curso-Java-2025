package Condicionales;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_E.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que calcula el salario semanal de un obrero
 *      considerando:
 *          - 16 pesos por hora hasta 40 horas
 *          - 20 pesos por hora extra a partir de la hora 41
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Uso de variables int
 *      - Estructura condicional if-else
 *      - Operaciones aritméticas
 * ============================================================
 */

public class problema_E {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario el número de horas trabajadas
        System.out.print("¿Cuántas horas trabajaste esta semana? Te voy a ayudar a calcular tu salario: ");
        int horasTrabajadas = entrada.nextInt();

        int salario;

        // Verificar si hay horas extra
        if (horasTrabajadas > 40) {
            int horasExtra = horasTrabajadas - 40;
            int pagoBase = 40 * 16; // pago por las primeras 40 horas
            int pagoExtra = horasExtra * 20; // pago por horas extra
            salario = pagoBase + pagoExtra;
        } else {
            salario = horasTrabajadas * 16; // pago normal sin horas extra
        }

        // Mostrar resultado
        System.out.println("Tu salario semanal es: $" + salario);

        // Cerrar Scanner
        entrada.close();
    }
}

