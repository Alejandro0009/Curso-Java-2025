/*
 * ============================================================
 *  Proyecto:       Conteo de Alumnos Reprobados
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que solicita las calificaciones de N alumnos
 *      y determina cuántos reprobaron. Se considera aprobado
 *      una calificación mayor o igual a 6 y menor o igual a 10.
 *
 *      Funcionalidades:
 *          1. Leer número de alumnos.
 *          2. Solicitar la calificación de cada alumno mediante JOptionPane.
 *          3. Contar cuántos alumnos reprobaron.
 *          4. Mostrar un mensaje para cada alumno reprobado.
 *          5. Mostrar el total de alumnos reprobados.
 *
 *      Estructuras utilizadas:
 *          - Ciclo for: Para iterar las calificaciones de los alumnos.
 *          - Condicional if-else: Para identificar si un alumno reproba.
 * ============================================================
 */

package bucles;

import javax.swing.JOptionPane;

public class problema_W {

    public static void main(String[] args) {
        int numeroAlumnos;        // Número total de alumnos
        double calificacion;      // Calificación de cada alumno
        int contadorReprobados = 0; // Contador de alumnos reprobados

        // Solicita el número de alumnos
        numeroAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de alumnos:"));

        // Ciclo para leer las calificaciones de cada alumno
        for (int i = 1; i <= numeroAlumnos; i++) {
            calificacion = Double.parseDouble(JOptionPane.showInputDialog(i + "- Ingresa la calificación:"));

            // Verifica si el alumno está reprobado
            if (calificacion >= 0 && calificacion < 6) {
                contadorReprobados++;
                JOptionPane.showMessageDialog(null, i + "- Alumno reprobado\nCalificación: " + calificacion);
            } 
            // Verifica si la calificación está fuera del rango válido
            else if (calificacion < 0 || calificacion > 10) {
                JOptionPane.showMessageDialog(null, i + "- La calificación ingresada no es válida.");
            }
        }

        // Muestra el total de alumnos reprobados
        JOptionPane.showMessageDialog(null, "Número total de alumnos reprobados: " + contadorReprobados);
    }
}
