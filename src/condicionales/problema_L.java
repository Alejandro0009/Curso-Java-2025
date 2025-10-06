package Condicionales;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_L.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario una fecha y verifica 
 *      si es correcta utilizando switch para los meses.
 *      Se consideran los días correctos para cada mes (sin años bisiestos).
 *
 *  Conceptos aprendidos:
 *      - Uso de switch
 *      - Entrada de datos con JOptionPane
 *      - Validación de datos
 * ============================================================
 */

public class problema_L {

    public static void main(String[] args) {

        String mes = JOptionPane.showInputDialog("Ingrese el mes (en minúsculas, ejemplo: enero):");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día:"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));

        int maxDia;

        // Determinar el número máximo de días según el mes
        switch (mes) {
            case "enero": case "marzo": case "mayo": case "julio":
            case "agosto": case "octubre": case "diciembre":
                maxDia = 31;
                break;
            case "abril": case "junio": case "septiembre": case "noviembre":
                maxDia = 30;
                break;
            case "febrero":
                maxDia = 28;
                break;
            default:
                maxDia = -1; // Mes inválido
        }

        // Verificar si la fecha es válida
        if (maxDia == -1) {
            JOptionPane.showMessageDialog(null, "Mes inválido: " + mes);
        } else if (dia > 0 && dia <= maxDia) {
            JOptionPane.showMessageDialog(null, "Fecha correcta:\nDía: " + dia + "\nMes: " + mes + "\nAño: " + año);
        } else {
            JOptionPane.showMessageDialog(null, "Fecha inválida:\nDía: " + dia + "\nMes: " + mes + "\nAño: " + año);
        }
    }
}
