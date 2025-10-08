package ClasesYObjetos2;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Operaciones Básicas con Clases y Objetos
 *  Clase:          main2.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase principal que prueba la funcionalidad de la clase
 *      'Operacion2'. Solicita al usuario dos números mediante
 *      cuadros de diálogo, luego realiza operaciones básicas
 *      (suma, resta, multiplicación y división) y muestra los
 *      resultados en consola.
 *
 *  Conceptos aprendidos:
 *      - Uso de JOptionPane para entrada de datos
 *      - Instanciación de objetos y llamadas a métodos
 *      - Realización de operaciones aritméticas mediante métodos
 *      - Presentación de resultados en consola
 * ============================================================
 */

public class main2 {

    public static void main(String[] args) {
        // Solicitar números al usuario mediante cuadros de diálogo
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número uno: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número dos: "));

        // Crear objeto de tipo Operacion2
        Operacion2 op = new Operacion2();

        // Llamar métodos de la clase Operacion2 y mostrar resultados
        System.out.println("El resultado de la suma es : " + op.sumar(n1, n2));
        System.out.println("El resultado de la resta es : " + op.resta(n1, n2));
        System.out.println("El resultado de la multiplicación es : " + op.multiplicacion(n1, n2));
        System.out.println("El resultado de la división es : " + op.dividir(n1, n2));
    }
}
