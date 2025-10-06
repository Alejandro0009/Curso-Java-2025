package bucles;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Bucles - Problema B
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que lee un número y muestra si es positivo o negativo.
 *      El proceso se repite hasta que el usuario ingrese el valor 0.
 *
 *  Conceptos aprendidos:
 *      - Ciclo while
 *      - Condicional if-else
 *      - Entrada de datos con JOptionPane
 * ============================================================
 */

public class problema_B {

    public static void main(String[] args) {

        double numero;  // Número ingresado por el usuario

        // Primer ingreso de número
        numero = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingrese un valor (0 para salir):"));

        while (numero != 0) {
            // Verificar si es positivo o negativo
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El valor " + numero + " es positivo.");
            } else {
                JOptionPane.showMessageDialog(null, "El valor " + numero + " es negativo.");
            }

            // Pedir otro número
            numero = Double.parseDouble(JOptionPane.showInputDialog(
                    "Ingrese otro valor (0 para salir):"));
        }

        // Mensaje final al salir
        JOptionPane.showMessageDialog(null, "Se ingresó 0. Programa finalizado.");
    }
}
