package bucles;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Bucles
 *  Clase:          While.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que utiliza un ciclo while para imprimir 
 *      todos los números desde 1 hasta el número ingresado
 *      por el usuario.
 *
 *  Conceptos aprendidos:
 *      - Uso del ciclo while
 *      - Diferencia entre while y do-while
 *      - Entrada de datos con Scanner
 * ============================================================
 */

public class While {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i = 1;          // Variable de control del bucle
        int contador;        // Número hasta el cual se imprimen los números

        // Pedir al usuario un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");
        contador = entrada.nextInt();

        // Ciclo while: se repite mientras la condición sea verdadera
        while (i <= contador) {
            System.out.println(i);
            i++;
        }

        // Diferencia clave con do-while:
        // while verifica la condición antes de ejecutar el bloque,
        // do-while ejecuta primero y luego verifica.

        // Cerrar el Scanner
        entrada.close();
    }
}
