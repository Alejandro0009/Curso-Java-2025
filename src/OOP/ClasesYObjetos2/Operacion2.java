package ClasesYObjetos2;

/*
 * ============================================================
 *  Proyecto:       Operaciones Básicas con Clases y Objetos
 *  Clase:          Operacion2.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase que contiene métodos para realizar operaciones
 *      aritméticas básicas (suma, resta, multiplicación y
 *      división) sobre dos números enteros. También incluye
 *      un método para mostrar los resultados de forma clara
 *      en consola.
 *
 *  Conceptos aprendidos:
 *      - Creación de métodos que retornan valores
 *      - Operaciones aritméticas básicas en Java
 *      - Separación de lógica de cálculo y presentación
 *      - Uso de parámetros y retorno de resultados
 * ============================================================
 */

public class Operacion2 {

    // Método para sumar dos números
    public int sumar(int numero_uno, int numero_dos) {
        int adicion = numero_uno + numero_dos;
        return adicion;
    }

    // Método para restar dos números
    public int resta(int numero_uno, int numero_dos) {
        int diferencia = numero_uno - numero_dos;
        return diferencia;
    }

    // Método para multiplicar dos números
    public int multiplicacion(int numero_uno, int numero_dos) {
        int multiplicar = numero_uno * numero_dos;
        return multiplicar;
    }

    // Método para dividir dos números
    public int dividir(int numero_uno, int numero_dos) {
        int division = numero_uno / numero_dos;
        return division;
    }

    // Método para mostrar resultados en consola
    public void mostrarResultados(int adicion, int diferencia, int multiplicar, int division) {
        System.out.println("El resultado de la suma es: " + adicion);
        System.out.println("El resultado de la resta es: " + diferencia);
        System.out.println("El resultado de la multiplicación es: " + multiplicar);
        System.out.println("El resultado de la división es: " + division);
    }
}
