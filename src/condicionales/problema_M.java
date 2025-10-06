package Condicionales;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_M.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita una nota del 0 al 10 y muestra
 *      su calificación correspondiente:
 *          - Insuficiente
 *          - Suficiente
 *          - Bien
 *          - Notable
 *          - Sobresaliente
 *
 *  Conceptos aprendidos:
 *      - Uso de switch y condicionales
 *      - Entrada de datos con JOptionPane
 *      - Validación de rangos
 * ============================================================
 */

public class problema_M {

    public static void main(String[] args) {

        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota (0-10):"));

        if (nota >= 0 && nota <= 10) {
            String calificacion;

            switch (nota) {
                case 10:
                    calificacion = "Sobresaliente";
                    break;
                case 9:
                    calificacion = "Notable";
                    break;
                case 8:
                case 7:
                    calificacion = "Bien";
                    break;
                case 6:
                case 5:
                    calificacion = "Suficiente";
                    break;
                default:
                    calificacion = "Insuficiente";
            }

            JOptionPane.showMessageDialog(null, "Nota: " + nota + "\nCalificación: " + calificacion);
        } else {
            JOptionPane.showMessageDialog(null, "La nota ingresada no es válida: " + nota);
        }
    }
}
