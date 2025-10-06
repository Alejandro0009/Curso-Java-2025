package bucles;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Bucles - Problema D
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que pide números hasta que se ingrese un número
 *      negativo y muestra cuántos números positivos se introdujeron.
 *
 *  Conceptos aplicados:
 *      - Ciclo while
 *      - Contador
 *      - Entrada de datos con JOptionPane
 * ============================================================
 */

public class problema_D {

    public static void main(String[] args) {
        int numero;
        int contador = 0;

        // Primer ingreso
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (negativo para salir):"));

        while (numero >= 0) {
            contador++; // Contar número válido
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número (negativo para salir):"));
        }

        JOptionPane.showMessageDialog(null, "Se introdujeron " + contador + " números positivos.");
    }
}

