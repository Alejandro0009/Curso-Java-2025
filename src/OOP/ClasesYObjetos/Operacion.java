package ClasesYObjetos;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Operaciones Básicas con Clases y Objetos
 *  Clase:          Operacion.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase que permite realizar operaciones aritméticas
 *      básicas (suma, resta, multiplicación y división) sobre
 *      dos números enteros. Incluye métodos para leer los 
 *      números mediante cuadros de diálogo y para mostrar 
 *      los resultados de manera clara en consola.
 *
 *  Conceptos aprendidos:
 *      - Atributos de clase para almacenar números y resultados
 *      - Métodos sin parámetros para manipulación de datos
 *      - Operaciones aritméticas básicas en Java
 *      - Separación de lógica de captura, cálculo y presentación
 * ============================================================
 */

public class Operacion {

    // Atributos para almacenar números y resultados
    int numero_uno;
    int numero_dos;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Método para leer números desde cuadros de diálogo
    public void leerNumeros() {
        numero_uno = Integer.parseInt(JOptionPane.showInputDialog("Digite el número uno: "));
        numero_dos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número dos: "));
    }

    // Método para sumar los números ingresados
    public void sumar() {
        suma = numero_uno + numero_dos;
    }

    // Método para restar los números ingresados
    public void resta() {
        resta = numero_uno - numero_dos;
    }

    // Método para multiplicar los números ingresados
    public void multiplicar() {
        multiplicacion = numero_uno * numero_dos;
    }

    // Método para dividir los números ingresados
    public void division() {
        division = numero_uno / numero_dos;
    }

    // Método para mostrar los resultados de todas las operaciones
    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
    }
}
