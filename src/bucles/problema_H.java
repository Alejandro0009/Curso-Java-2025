package bucles;

import javax.swing.JOptionPane;

/*
 * Programa: Calcular la media de números positivos
 * Descripción:
 *      Se ingresan números hasta que se introduce un número negativo.
 *      Al final se muestra la media de todos los números positivos ingresados.
 */

public class problema_H {

    public static void main(String[] args) {
        double suma = 0;
        int contador = 0;
        double numero;

        numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número (negativo para terminar):"));

        while (numero >= 0) {
            suma += numero;
            contador++;
            numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro número (negativo para terminar):"));
        }

        if (contador > 0) {
            double media = suma / contador;
            JOptionPane.showMessageDialog(null, "La media de los números ingresados es: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números positivos para calcular la media.");
        }
    }
}

