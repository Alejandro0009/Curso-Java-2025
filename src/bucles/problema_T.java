/*
 * ============================================================
 *  Proyecto:       Conteo de Aprobados y Reprobados
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que permite ingresar las calificaciones de 6 alumnos 
 *      y determina cuántos alumnos aprobaron y cuántos no.
 *      
 *      Reglas:
 *          - La calificación válida está entre 0 y 10.
 *          - Se considera aprobado una calificación mayor o igual a 4.
 *
 *      Funcionalidades:
 *          1. Lectura de calificaciones mediante JOptionPane.
 *          2. Validación de calificaciones fuera del rango permitido.
 *          3. Conteo de alumnos aprobados.
 *          4. Visualización de resultados en pantalla.
 *
 *      Estructuras utilizadas:
 *          - Ciclo for: Para procesar cada alumno.
 *          - Condicionales if/else: Para validar calificaciones y contar aprobados.
 * ============================================================
 */

package bucles;

import javax.swing.JOptionPane;

public class problema_T {

    public static void main(String[] args) {
        double calificacion;
        int contadorAprobados = 0;

        for (int i = 1; i <= 6; i++) {
            // Solicita la calificación del alumno
            calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificación número " + i));

            // Validación de calificación válida
            while (calificacion < 0 || calificacion > 10) {
                calificacion = Double.parseDouble(JOptionPane.showInputDialog("Calificación inválida. Ingresa la calificación número " + i + " (0-10)"));
            }

            // Conteo de aprobados
            if (calificacion >= 4) {
                contadorAprobados++;
            }

            // Muestra la calificación ingresada
            System.out.println("La calificación del alumno " + i + " es: " + calificacion);
        }

        // Muestra el número de alumnos aprobados
        JOptionPane.showMessageDialog(null, "El número de alumnos aprobados es: " + contadorAprobados +
                                            "\nEl número de alumnos reprobados es: " + (6 - contadorAprobados));
    }
}
