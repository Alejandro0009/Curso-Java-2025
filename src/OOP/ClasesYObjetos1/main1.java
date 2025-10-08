package ClasesYObjetos1;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Operaciones Básicas con Clases y Objetos
 *  Clase:          main1.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase principal que prueba la funcionalidad de la clase
 *      'Operacion1'. Solicita al usuario dos números mediante
 *      cuadros de diálogo, luego realiza las operaciones básicas
 *      (suma, resta, multiplicación y división) y muestra los
 *      resultados en consola.
 *
 *  Conceptos aprendidos:
 *      - Uso de JOptionPane para entrada de datos
 *      - Instanciación de objetos y llamadas a métodos
 *      - Uso de métodos con parámetros y argumentos
 *      - Presentación clara de resultados en consola
 * ============================================================
 */

public class main1 {

    public static void main(String[] args) {
        // Solicitar números al usuario mediante cuadros de diálogo
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número uno: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número dos: "));

        // Crear objeto de tipo Operacion1
        Operacion1 op = new Operacion1();

        // Llamar métodos de la clase Operacion1 con argumentos
        op.sumar(n1, n2);
        op.resta(n1, n2);
        op.multiplicar(n1, n2);
        op.division(n1, n2);

        // Mostrar resultados en consola
        op.mostrarResultados();
    }
}
