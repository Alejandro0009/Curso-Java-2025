package basicos;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_R.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que dado un número total de horas, calcula
 *      su equivalente en años, meses, semanas, días y horas.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Operaciones aritméticas y uso de divisiones y módulo
 *      - Mostrar resultados en consola con System.out.println()
 * ============================================================
 */

public class problema_R {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número total de horas: ");
        int totalHoras = entrada.nextInt();

        // Constantes aproximadas
        final int HORAS_POR_ANIO = 8760;  // 365*24
        final int HORAS_POR_MES = 720;    // 30*24
        final int HORAS_POR_SEMANA = 168; // 7*24
        final int HORAS_POR_DIA = 24;

        int años = totalHoras / HORAS_POR_ANIO;
        int horasRestantes = totalHoras % HORAS_POR_ANIO;

        int meses = horasRestantes / HORAS_POR_MES;
        horasRestantes %= HORAS_POR_MES;

        int semanas = horasRestantes / HORAS_POR_SEMANA;
        horasRestantes %= HORAS_POR_SEMANA;

        int dias = horasRestantes / HORAS_POR_DIA;
        int horas = horasRestantes % HORAS_POR_DIA;

        // Mostrar resultados
        System.out.println("\nEquivalencia del tiempo:");
        System.out.println("Años: " + años);
        System.out.println("Meses: " + meses);
        System.out.println("Semanas: " + semanas);
        System.out.println("Días: " + dias);
        System.out.println("Horas restantes: " + horas);
        System.out.println("Total de horas: " + totalHoras);

        // Cerrar Scanner
        entrada.close();
    }
}
