
import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_B.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Ejemplos del uso de la clase Math en Java.
 *      Se practican operaciones como: raíces, potencias, redondeo,
 *      números aleatorios y cálculo de hipotenusa.
 *
 *  Conceptos aprendidos:
 *      - Math.sqrt(), Math.pow(), Math.round(), Math.random()
 *      - Math.hypot() para hipotenusa
 *      - Casting de double a int
 * ============================================================
 */public class problema_C {

    public static void main(String[] args) {

        // Valor fijo para comparar
        int dato = 5;

        // Entrada del usuario a través de un cuadro de diálogo
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número: "));

        // Comparación usando el operador de desigualdad
        if (numero != dato) {
            JOptionPane.showMessageDialog(null, "El número es diferente de: " + dato);
        } else {
            JOptionPane.showMessageDialog(null, "El número es igual a: " + numero);
        }
    }
}
