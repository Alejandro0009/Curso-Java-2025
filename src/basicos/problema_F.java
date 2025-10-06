package basicos;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_F.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Ejemplo de declaración e inicialización de variables en Java
 *      para cada tipo primitivo: byte, short, int, long, float, double, char, boolean.
 *
 *  Conceptos aprendidos:
 *      - Variables: espacios de memoria para almacenar datos.
 *      - Tipos de datos primitivos y su rango.
 *      - Diferentes formas de declarar e inicializar variables.
 * ============================================================
 */
public class problema_F {

    public static void main(String[] args) {

        // ===============================
        // Enteros
        // ===============================
        byte b1 = 12;         // 1 byte, -128 a 127
        short s1 = 123;       // 2 bytes, -32,768 a 32,767
        int i1 = 12345;       // 4 bytes, -2.147.483.648 a 2.147.483.647
        long l1 = 123456789L; // 8 bytes, -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        // ===============================
        // Decimales
        // ===============================
        float f1 = 123.45f;   // 4 bytes, precisión simple
        double d1 = 123.4567; // 8 bytes, precisión doble

        // ===============================
        // Caracteres
        // ===============================
        char c1 = 'A';         // 2 bytes, un solo carácter Unicode

        // ===============================
        // Booleanos
        // ===============================
        boolean flag = true;   // true o false

        // ===============================
        // Mostrar valores en consola
        // ===============================
        System.out.println("Byte: " + b1);
        System.out.println("Short: " + s1);
        System.out.println("Int: " + i1);
        System.out.println("Long: " + l1);
        System.out.println("Float: " + f1);
        System.out.println("Double: " + d1);
        System.out.println("Char: " + c1);
        System.out.println("Boolean: " + flag);
    }
}
