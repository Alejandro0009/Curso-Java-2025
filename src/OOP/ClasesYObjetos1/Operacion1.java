package ClasesYObjetos1;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Operaciones Básicas con Clases y Objetos
 *  Clase:          Operacion1.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase que permite realizar operaciones aritméticas
 *      básicas (suma, resta, multiplicación y división) sobre
 *      dos números enteros. Incluye un método para mostrar los
 *      resultados de todas las operaciones de manera clara en
 *      consola.
 *
 *  Conceptos aprendidos:
 *      - Atributos de clase para almacenar resultados
 *      - Creación de métodos con parámetros
 *      - Operaciones aritméticas básicas en Java
 *      - Separación de lógica de cálculo y presentación
 * ============================================================
 */

public class Operacion1 {

    // Atributos para almacenar números y resultados
    int numero_uno;
    int numero_dos;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Método para sumar dos números
    public void sumar(int numero_uno, int numero_dos) {
        suma = numero_uno + numero_dos;
    }

    // Método para restar dos números
    public void resta(int numero_uno, int numero_dos) {
        resta = numero_uno - numero_dos;
    }

    // Método para multiplicar dos números
    public void multiplicar(int numero_uno, int numero_dos) {
        multiplicacion = numero_uno * numero_dos;
    }

    // Método para dividir dos números
    public void division(int numero_uno, int numero_dos) {
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
