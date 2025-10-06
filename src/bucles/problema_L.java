/*
 * ============================================================
 *  Proyecto:       Suma de 10 Números
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario ingresar 10 números
 *      y calcula la suma total de ellos.
 * ============================================================
 */

package bucles;

import javax.swing.JOptionPane;

public class problema_L {

    public static void main(String[] args) {
        int numeros;
        int suma = 0;

        JOptionPane.showMessageDialog(null, "Vamos a sumar 10 números que ingresarás.");

        for (int i = 1; i <= 10; i++) {
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número " + i + ": "));
            suma += numeros;
        }

        JOptionPane.showMessageDialog(null, "La suma total de los 10 números es: " + suma);
    }

}

