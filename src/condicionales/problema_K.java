package Condicionales;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_K.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que simula una calculadora básica con operaciones:
 *          - Suma
 *          - Resta
 *          - Multiplicación
 *          - División
 *      El usuario selecciona la operación ingresando la inicial
 *      en mayúscula (S, R, M, D).
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con JOptionPane
 *      - Uso de estructuras condicionales if-else
 *      - Operaciones aritméticas básicas
 * ============================================================
 */

public class problema_K {

    public static void main(String[] args) {

        // Solicitar números al usuario
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 1:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 2:"));

        // Solicitar operación
        char operacion = JOptionPane.showInputDialog(
                "Ingrese la inicial EN MAYÚSCULAS de la operación que desea realizar:\n" +
                "S = Suma\nR = Resta\nM = Multiplicación\nD = División").charAt(0);

        double resultado;

        // Calcular según la operación seleccionada
        if (operacion == 'S') {
            resultado = n1 + n2;
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
        } else if (operacion == 'R') {
            resultado = n1 - n2;
            JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado);
        } else if (operacion == 'M') {
            resultado = n1 * n2;
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + resultado);
        } else if (operacion == 'D') {
            if (n2 != 0) {
                resultado = (double) n1 / n2;
                JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
            } else {
                JOptionPane.showMessageDialog(null, "Error: División entre cero no permitida.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operación no reconocida. Por favor ingrese S, R, M o D.");
        }
    }
}
