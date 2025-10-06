/*
 * ============================================================
 *  Proyecto:       Edades y Estaturas de Alumnos
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita la edad y estatura de 5 alumnos
 *      y muestra:
 *      - Edad media
 *      - Estatura media
 *      - Cantidad de alumnos mayores a 18 años
 *      - Cantidad de alumnos que miden más de 1.75 m
 * ============================================================
 */

package bucles;

import javax.swing.JOptionPane;

public class problema_P {

    public static void main(String[] args) {
        int edad;
        double estatura;
        double sumaEdad = 0;
        double sumaEstatura = 0;
        int mayores18 = 0;
        int estaturaMayor175 = 0;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno #" + i + " - Ingrese edad:"));
            estatura = Double.parseDouble(JOptionPane.showInputDialog("Alumno #" + i + " - Ingrese estatura (m):"));

            sumaEdad += edad;
            sumaEstatura += estatura;

            if (edad > 18) {
                mayores18++;
            }
            if (estatura > 1.75) {
                estaturaMayor175++;
            }
        }

        double edadMedia = sumaEdad / 5;
        double estaturaMedia = sumaEstatura / 5;

        JOptionPane.showMessageDialog(null, "Edad media de los alumnos: " + edadMedia);
        JOptionPane.showMessageDialog(null, "Estatura media de los alumnos: " + estaturaMedia + " m");
        JOptionPane.showMessageDialog(null, "Cantidad de alumnos mayores de 18 años: " + mayores18);
        JOptionPane.showMessageDialog(null, "Cantidad de alumnos con estatura mayor a 1.75 m: " + estaturaMayor175);
    }
}
