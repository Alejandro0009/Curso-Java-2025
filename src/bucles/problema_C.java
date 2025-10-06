package bucles;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Bucles - Problema C
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que lee números hasta que se ingrese 0,
 *      e indica para cada uno si es par o impar.
 *
 *  Conceptos aplicados:
 *      - Ciclo while
 *      - Condicional if-else
 *      - Operador módulo (%)
 *      - Entrada de datos con JOptionPane
 * ============================================================
 */

public class problema_C {

    public static void main(String[] args) {

        int numero;  // Número ingresado por el usuario

        // Primer ingreso
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (0 para salir):"));

        while (numero != 0) {
            // Verificar si es par o impar
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es par.");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es impar.");
            }

            // Pedir otro número
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número (0 para salir):"));
        }

        // Mensaje final
        JOptionPane.showMessageDialog(null, "Se ingresó 0. Programa finalizado.");
    }
}

