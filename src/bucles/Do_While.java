package bucles;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Bucles
 *  Clase:          Do_While.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que utiliza un ciclo do-while para imprimir 
 *      todos los números desde 1 hasta el número ingresado
 *      por el usuario.
 *
 *  Conceptos aprendidos:
 *      - Uso del ciclo do-while
 *      - Entrada de datos con Scanner
 *      - Variables de control de bucle
 * ============================================================
 */

public class Do_While {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i = 1;          // Variable de control del bucle
        int contador;        // Número hasta el cual se imprimen los números

        // Pedir al usuario un número entero positivo
        System.out.print("Digite un número entero positivo: ");
        contador = entrada.nextInt();

        // Ciclo do-while: primero ejecuta, luego verifica la condición
        do {
            System.out.println(i);
            i++;
        } while (i <= contador);

        // Cerrar el Scanner
        entrada.close();
    }
}

