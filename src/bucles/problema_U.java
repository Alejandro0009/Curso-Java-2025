/*
 * ============================================================
 *  Proyecto:       Sueldo Máximo
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que solicita un número N de sueldos, luego
 *      ingresa N sueldos y determina cuál es el sueldo máximo.
 *
 *      Funcionalidades:
 *          1. Lectura del número de sueldos a ingresar.
 *          2. Lectura de cada sueldo mediante JOptionPane.
 *          3. Comparación de sueldos para determinar el mayor.
 *          4. Visualización del sueldo máximo en pantalla.
 *
 *      Estructuras utilizadas:
 *          - Ciclo for: Para procesar cada sueldo ingresado.
 *          - Condicional if: Para actualizar el sueldo máximo.
 * ============================================================
 */

package bucles;

import javax.swing.JOptionPane;

public class problema_U {

    public static void main(String[] args) {
        int numero;          // Número de sueldos a ingresar
        double sueldo;       // Variable para cada sueldo ingresado
        double mayor = 0;    // Variable para almacenar el sueldo máximo

        // Solicita al usuario el número de sueldos
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número de sueldos:"));

        // Ciclo para ingresar cada sueldo y comparar con el máximo
        for (int i = 1; i <= numero; i++) {
            sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el sueldo número: " + i));

            // Actualiza el sueldo máximo si el actual es mayor
            if (sueldo > mayor) {
                mayor = sueldo;
            }
        }

        // Muestra el sueldo máximo
        JOptionPane.showMessageDialog(null, "El sueldo máximo ingresado es: " + mayor);
    }
}

