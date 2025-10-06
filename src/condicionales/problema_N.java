package Condicionales;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_N.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Simulación de un cajero automático con saldo inicial de 1000 dólares.
 *      El usuario puede:
 *          - Ingresar dinero a la cuenta
 *          - Retirar dinero de la cuenta
 *          - Salir
 *
 *  Conceptos aprendidos:
 *      - Uso de switch y bucles
 *      - Validación de entrada de datos
 *      - Operaciones aritméticas con saldo
 *      - Entrada y salida con JOptionPane
 * ============================================================
 */

public class problema_N {

    public static void main(String[] args) {

        float saldo = 1000.0f; // saldo inicial
        int opcion;
        boolean salir = false;

        while (!salir) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Bienvenido a su cajero automático\n" +
                    "Saldo actual: $" + saldo + "\n" +
                    "1. Ingresar dinero\n" +
                    "2. Retirar dinero\n" +
                    "3. Salir"));

            switch (opcion) {
                case 1:
                    float ingreso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                    if (ingreso > 0) {
                        saldo += ingreso;
                        JOptionPane.showMessageDialog(null, "Depósito exitoso.\nSaldo actual: $" + saldo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cantidad no válida.");
                    }
                    break;

                case 2:
                    float retiro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        JOptionPane.showMessageDialog(null, "Retiro exitoso.\nSaldo actual: $" + saldo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cantidad no válida o saldo insuficiente.");
                    }
                    break;

                case 3:
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Gracias por usar el cajero. Su saldo final es: $" + saldo);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
            }
        }
    }
}
