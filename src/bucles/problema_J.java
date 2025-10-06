/*
 * ============================================================
 *  Proyecto:       Mostrar Números Introducidos
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario ingresar números
 *      positivos de manera consecutiva. Se muestran todos
 *      los números ingresados cuando el usuario introduce
 *      un número negativo o cero, indicando el fin del proceso.
 * ============================================================
 */

package bucles;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class problema_J {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        String almacenamiento = "";

        // Solicitar primer número
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (0 o negativo para terminar):"));

        // Bucle para almacenar números mientras sean positivos
        while (numero > 0) {
            almacenamiento += numero + "\n";
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número (0 o negativo para terminar):"));
        }

        // Mostrar todos los números ingresados
        System.out.println("Números ingresados:");
        System.out.println(almacenamiento);
    }
}
