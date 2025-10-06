package basicos;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_G.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Ejemplo de lectura de datos desde la consola en Java
 *      usando la clase Scanner para distintos tipos de datos:
 *          - int
 *          - float
 *          - double
 *          - String
 *          - char
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Diferentes métodos de Scanner: nextInt, nextFloat, nextDouble, nextLine, next().charAt(0)
 *      - Mostrar datos en consola
 * ============================================================
 */
public class problema_G {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // ===============================
        // Número entero
        // ===============================
        System.out.print("Digite un número entero: ");
        int numeroEntero = entrada.nextInt();
        System.out.println("El número entero ingresado es: " + numeroEntero);

        // ===============================
        // Número flotante (float)
        // ===============================
        System.out.print("Digite un número de tipo float: ");
        float numeroFloat = entrada.nextFloat();
        System.out.println("El número float ingresado es: " + numeroFloat);

        // ===============================
        // Número decimal (double)
        // ===============================
        System.out.print("Digite un número de tipo double: ");
        double numeroDouble = entrada.nextDouble();
        System.out.println("El número double ingresado es: " + numeroDouble);

        // Limpiar buffer antes de leer Strings
        entrada.nextLine();

        // ===============================
        // Cadena de texto (String)
        // ===============================
        System.out.print("Digite una cadena de texto: ");
        String cadena = entrada.nextLine();
        System.out.println("La cadena ingresada es: " + cadena);

        // ===============================
        // Caracter (char)
        // ===============================
        System.out.print("Digite un caracter: ");
        char caracter = entrada.next().charAt(0);
        System.out.println("El caracter ingresado es: " + caracter);

        // ===============================
        // Cerrar Scanner
        // ===============================
        entrada.close();
    }
}
