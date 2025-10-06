package basicos;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_M.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que calcula el salario semanal y quincenal
 *      de un empleado a partir de:
 *          - Horas trabajadas por día
 *          - Número de días trabajados por semana
 *          - Salario por hora
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Operaciones aritméticas
 *      - Mostrar resultados en consola con System.out.println()
 * ============================================================
 */

public class problema_M {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Declaración de variables
        int horasPorDia, diasPorSemana, horasSemanales;
        double salarioPorHora, sueldoSemanal, sueldoQuincenal;

        // Solicitar al usuario los datos
        System.out.print("Digite su salario por hora: ");
        salarioPorHora = entrada.nextDouble();

        System.out.print("Digite el número de días que trabaja a la semana: ");
        diasPorSemana = entrada.nextInt();

        System.out.print("Digite el número de horas que trabaja al día: ");
        horasPorDia = entrada.nextInt();

        // Calcular horas semanales
        horasSemanales = diasPorSemana * horasPorDia;
        System.out.println("Total de horas trabajadas a la semana: " + horasSemanales);

        // Calcular sueldo semanal
        sueldoSemanal = salarioPorHora * horasSemanales;
        System.out.println("Sueldo semanal: $" + sueldoSemanal);

        // Calcular sueldo quincenal
        sueldoQuincenal = sueldoSemanal * 2;
        System.out.println("Sueldo quincenal: $" + sueldoQuincenal);

        // Cerrar Scanner
        entrada.close();
    }
}
