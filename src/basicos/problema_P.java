package basicos;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_P.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que calcula la calificación final de un estudiante
 *      de informática tomando en cuenta:
 *          - Participación: 10%
 *          - Primer examen parcial: 25%
 *          - Segundo examen parcial: 25%
 *          - Examen final: 40%
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Operaciones aritméticas y porcentajes
 *      - Mostrar resultados en consola con System.out.println()
 * ============================================================
 */

public class problema_P {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar notas al usuario
        System.out.print("Ingrese la nota de participación: ");
        float participacion = entrada.nextFloat();

        System.out.print("Ingrese la nota del primer examen parcial: ");
        float primerParcial = entrada.nextFloat();

        System.out.print("Ingrese la nota del segundo examen parcial: ");
        float segundoParcial = entrada.nextFloat();

        System.out.print("Ingrese la nota del examen final: ");
        float examenFinal = entrada.nextFloat();

        // Aplicar los porcentajes
        participacion *= 0.10f;
        primerParcial *= 0.25f;
        segundoParcial *= 0.25f;
        examenFinal *= 0.40f;

        // Calcular nota final
        float notaFinal = participacion + primerParcial + segundoParcial + examenFinal;

        // Mostrar resultados
        System.out.println("\nNotas ponderadas:");
        System.out.println("Participación (10%): " + participacion);
        System.out.println("Primer parcial (25%): " + primerParcial);
        System.out.println("Segundo parcial (25%): " + segundoParcial);
        System.out.println("Examen final (40%): " + examenFinal);

        System.out.println("\nLa calificación final del estudiante es: " + notaFinal);

        // Cerrar Scanner
        entrada.close();
    }
}
