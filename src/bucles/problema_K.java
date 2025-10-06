/*
 * ============================================================
 *  Proyecto:       Producto de Números Impares
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que calcula el producto de los 10 primeros
 *      números impares ingresados por el usuario.
 * ============================================================
 */

package bucles;

import java.util.Scanner;

public class problema_K {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int producto = 1;
        int contador = 0;
        int numero;

        System.out.println("Vamos a calcular el producto de los 10 primeros números impares que ingreses.");

        while (contador < 10) {
            System.out.print("Ingresa un número: ");
            numero = entrada.nextInt();

            if (numero % 2 != 0) { // verificar si es impar
                producto *= numero;
                contador++;
            } else {
                System.out.println("El número no es impar, intenta de nuevo.");
            }
        }

        System.out.println("El producto de los 10 primeros números impares ingresados es: " + producto);
    }
}
