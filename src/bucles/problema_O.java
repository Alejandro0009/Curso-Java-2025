/*
 * ============================================================
 *  Proyecto:       Suma de Sueldos
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita 10 sueldos al usuario y muestra:
 *      - La suma total de los sueldos.
 *      - La cantidad de sueldos mayores a 1000.
 * ============================================================
 */

package bucles;

import javax.swing.JOptionPane;

public class problema_O {

    public static void main(String[] args) {
        int sueldo;
        int suma = 0;
        int mayores1000 = 0;

        for (int i = 1; i <= 10; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo #" + i + ":"));
            suma += sueldo;

            if (sueldo > 1000) {
                mayores1000++;
            }
        }

        JOptionPane.showMessageDialog(null, "La suma total de los sueldos es: " + suma);
        JOptionPane.showMessageDialog(null, "Cantidad de sueldos mayores a 1000: " + mayores1000);
    }
}
