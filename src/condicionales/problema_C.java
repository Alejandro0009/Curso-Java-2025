package Condicionales;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_C.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario ingresar un carácter
 *      y verifica si es una letra mayúscula.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con JOptionPane
 *      - Uso de la clase Character y sus métodos
 *      - Estructura condicional if-else
 * ============================================================
 */

public class problema_C {

    public static void main(String[] args) {

        // Solicitar un carácter al usuario mediante un cuadro de diálogo
        char letra = JOptionPane.showInputDialog("Ingrese una letra:").charAt(0);

        // Verificar si el carácter ingresado es una letra mayúscula
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "Esta es una letra mayúscula: " + letra);
        } else {
            JOptionPane.showMessageDialog(null, "Esta no es una letra mayúscula: " + letra);
        }
    }
}
