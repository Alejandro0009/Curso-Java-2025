/*
 * ============================================================
 *  Proyecto:       Tabla de Multiplicar
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Solicita un número del 0 al 10 y muestra su
 *      tabla de multiplicar del 1 al 10.
 * ============================================================
 */

package bucles;

import javax.swing.JOptionPane;

public class problema_Q {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número del 0 al 10:"));
        String tabla = "Tabla de multiplicar del " + numero + ":\n";

        for (int i = 1; i <= 10; i++) {
            int res = numero * i;
            tabla += numero + " x " + i + " = " + res + "\n";
        }

        JOptionPane.showMessageDialog(null, tabla);
    }
}
