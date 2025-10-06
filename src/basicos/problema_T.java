package basicos;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_T.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario diferentes tipos de datos
 *      mediante cuadros de diálogo (JOptionPane) y los muestra
 *      de vuelta al usuario.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con JOptionPane
 *      - Conversión de String a int y double
 *      - Manejo de caracteres
 *      - Mostrar mensajes con JOptionPane.showMessageDialog
 * ============================================================
 */

public class problema_T {

    public static void main(String[] args) {

        // Solicitar cadena de texto
        String cadena = JOptionPane.showInputDialog("Digite una cadena:");

        // Solicitar número entero
        int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Digite un número entero:"));

        // Solicitar número decimal (double)
        double decimal = Double.parseDouble(
                JOptionPane.showInputDialog("Digite un número decimal:"));

        // Solicitar un carácter (primer carácter del input)
        char caracter = JOptionPane.showInputDialog("Digite un carácter:").charAt(0);

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "La cadena ingresada es: " + cadena);
        JOptionPane.showMessageDialog(null, "El número entero es: " + numero);
        JOptionPane.showMessageDialog(null, "El número decimal es: " + decimal);
        JOptionPane.showMessageDialog(null, "El carácter ingresado es: " + caracter);
    }
}
