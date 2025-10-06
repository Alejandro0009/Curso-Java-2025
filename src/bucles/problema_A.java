package bucles;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Bucles - Problema A
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que lee un número y muestra su cuadrado. 
 *      El proceso se repite hasta que el usuario ingrese un número negativo.
 *
 *  Conceptos aprendidos:
 *      - Ciclo do-while
 *      - Entrada de datos con JOptionPane
 *      - Uso de Math.pow para calcular el cuadrado
 * ============================================================
 */

public class problema_A {

    public static void main(String[] args) {

        double numero;  // Número ingresado por el usuario
        double cuadrado; // Resultado del cuadrado

        // Primer ingreso de número
        numero = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingrese un número para determinar su cuadrado (negativo para salir):"));

        do {
            // Calcular el cuadrado
            cuadrado = Math.pow(numero, 2);

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "El cuadrado de " + numero + " es: " + cuadrado);

            // Pedir otro número
            numero = Double.parseDouble(JOptionPane.showInputDialog(
                    "Ingrese otro número para determinar su cuadrado (negativo para salir):"));

        } while (numero >= 0); // Repetir mientras el número sea positivo o cero

        // Mensaje final
        JOptionPane.showMessageDialog(null, "Programa finalizado. ¡Gracias por usarlo!");
    }
}
