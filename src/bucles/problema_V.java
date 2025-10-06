/*
 * ============================================================
 *  Proyecto:       Conteo de Números Negativos
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que solicita 10 números al usuario y determina
 *      cuántos de ellos son negativos.
 *
 *      Funcionalidades:
 *          1. Lectura de 10 números mediante JOptionPane.
 *          2. Conteo de los números negativos.
 *          3. Visualización del total de números negativos ingresados.
 *
 *      Estructuras utilizadas:
 *          - Ciclo for: Para iterar los 10 números.
 *          - Condicional if: Para identificar si un número es negativo.
 * ============================================================
 */

package bucles;

import javax.swing.JOptionPane;

public class problema_V {

    public static void main(String[] args) {
        int numero;        // Variable para cada número ingresado
        int contador = 0;  // Contador de números negativos

        // Ciclo para solicitar 10 números
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog(i + "- Ingresa un número:"));

            // Incrementa el contador si el número es negativo
            if (numero < 0) {
                contador++;
            }
        }

        // Muestra el total de números negativos
        JOptionPane.showMessageDialog(null, "El total de números negativos es: " + contador);
    }
}
