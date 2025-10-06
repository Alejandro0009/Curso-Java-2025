package bucles;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Programa: Suma de Números
 *  Autor: Alejandro Valencia
 *  Fecha: 05/10/2025
 *
 *  Descripción:
 *      Se ingresan números hasta teclear 0. 
 *      Al final se muestra la suma total.
 * ============================================================
 */

public class problema_F {

    public static void main(String[] args) {
        int numero;
        int suma = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número (0 para terminar):"));
            suma += numero; // suma = suma + numero;
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "La suma total de los números ingresados es: " + suma);
    }
}
