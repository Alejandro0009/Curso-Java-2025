package Condicionales;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_J.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario una fecha (día, mes y año)
 *      e indica si la fecha es válida considerando:
 *          - Meses de 28, 30 y 31 días
 *          - No se consideran años bisiestos
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con JOptionPane
 *      - Uso de arreglos para representar días de cada mes
 *      - Estructuras condicionales if-else
 * ============================================================
 */

public class problema_J {

    public static void main(String[] args) {

        // Solicitar fecha al usuario
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes:"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));

        // Arreglo que indica la cantidad de días por cada mes (enero a diciembre)
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Validar mes
        if (mes < 1 || mes > 12) {
            JOptionPane.showMessageDialog(null, "Mes ingresado NO válido.");
        } else {
            // Validar día
            if (dia >= 1 && dia <= diasPorMes[mes - 1]) {
                JOptionPane.showMessageDialog(null, "Fecha correcta:");
                JOptionPane.showMessageDialog(null, "Día: " + dia);
                JOptionPane.showMessageDialog(null, "Mes: " + mes);
                JOptionPane.showMessageDialog(null, "Año: " + año);
            } else {
                JOptionPane.showMessageDialog(null, "Día ingresado NO válido para el mes indicado.");
            }
        }
    }
}

    

