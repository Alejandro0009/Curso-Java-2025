package basicos;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_N.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que calcula la cantidad de dinero que tienen 
 *      Guillermo, Luis y Juan según las siguientes reglas:
 *          - Luis tiene la mitad de lo que posee Guillermo.
 *          - Juan tiene la mitad de lo que poseen Guillermo y Luis juntos.
 *      Finalmente muestra la suma total entre los tres.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Operaciones aritméticas con decimales
 *      - Mostrar resultados en consola con System.out.println()
 * ============================================================
 */

public class problema_N {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Solicitar dinero de Guillermo
        System.out.print("Digite cuántos dólares tiene Guillermo: ");
        double dineroGuillermo = entrada.nextDouble();

        // Calcular dinero de Luis (la mitad de Guillermo)
        double dineroLuis = dineroGuillermo / 2;

        // Calcular dinero de Juan (la mitad de lo que poseen Guillermo + Luis)
        double dineroJuan = (dineroGuillermo + dineroLuis) / 2;

        // Mostrar resultados
        System.out.println("Dinero de Guillermo: $" + dineroGuillermo);
        System.out.println("Dinero de Luis: $" + dineroLuis);
        System.out.println("Dinero de Juan: $" + dineroJuan);

        // Suma total
        double total = dineroGuillermo + dineroLuis + dineroJuan;
        System.out.println("Dinero total entre los tres: $" + total);

        // Cerrar Scanner
        entrada.close();
    }
}
