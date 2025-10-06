/*
 * ============================================================
 *  Proyecto:       Media de Números
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita 10 números al usuario y muestra:
 *      - La media de los números ingresados.
 *      - La cantidad de números negativos.
 *      - La cantidad de ceros.
 * ============================================================
 */

package bucles;

import java.util.Scanner;

public class problema_N {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = entrada.nextInt();
            suma += numero;

            if (numero < 0) {
                negativos++;
            } else if (numero == 0) {
                ceros++;
            }
        }

        double media = suma / 10.0;

        System.out.println("\nResultados:");
        System.out.println("Media de los números: " + media);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
