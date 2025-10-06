package basicos;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_D.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Ejemplos de métodos y propiedades de la clase String y Math.
 *      Se muestran operaciones básicas: longitud, caracter en posición,
 *      subcadenas y operaciones matemáticas.
 *
 *  Conceptos aprendidos:
 *      - String.length(), String.charAt(), String.substring()
 *      - Math.abs(), Math.max(), Math.min(), Math.pow(), Math.sqrt()
 *      - Math.round(), Math.floor(), Math.ceil(), Math.random()
 * ============================================================
 */
public class problema_D {

    public static void main(String[] args) {

        final int numeroC = 1; // Constante, valor fijo
        String name = "Alejandro";

        // Longitud del String
        System.out.println("Longitud del nombre: " + name.length());

        // Caracter en la posición 3 (cuarta letra)
        System.out.println("Caracter en posición 3: " + name.charAt(3));

        // Subcadena desde posición 0 hasta 3
        System.out.println("Subcadena (0-4): " + name.substring(0, 4));

        // Ejemplos de operaciones matemáticas (descomenta según necesites)
        System.out.println("Valor absoluto de -5: " + Math.abs(-5));
        System.out.println("Máximo entre 10 y 20: " + Math.max(10, 20));
        System.out.println("Mínimo entre 10 y 20: " + Math.min(10, 20));
        System.out.println("2 elevado a 3: " + Math.pow(2, 3));
        System.out.println("Raíz cuadrada de 25: " + Math.sqrt(25));
        System.out.println("Redondeo de 4.6: " + Math.round(4.6));
        System.out.println("Floor de 4.8: " + Math.floor(4.8));
        System.out.println("Ceil de 4.1: " + Math.ceil(4.1));
        System.out.println("Número aleatorio: " + Math.random());
        System.out.println("Constante PI: " + Math.PI);
        System.out.println("Constante E: " + Math.E);
    }
}
