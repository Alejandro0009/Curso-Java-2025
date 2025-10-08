package metodo1;

/*
 * ============================================================
 *  Proyecto:       Métodos Básicos en Java
 *  Clase:          metodosBasicos.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase que contiene métodos básicos para operaciones
 *      aritméticas y lógicas sobre números, así como métodos
 *      de saludo personalizado. Permite reutilizar código y
 *      practicar la creación de métodos estáticos.
 *
 *  Conceptos aprendidos:
 *      - Creación de métodos estáticos
 *      - Retorno de valores (int y String)
 *      - Uso de estructuras condicionales (if-else)
 *      - Concatenación de cadenas y formato de salida
 * ============================================================
 */

public class metodosBasicos {

    // Método para sumar dos números
    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    // Método para verificar qué número es mayor
    public static int mayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    // Método para comprobar si un número es par o impar
    public static String par(int numero1) {
        if (numero1 % 2 == 0) {
            return "El número es par: " + numero1;
        } else {
            return "El número es impar: " + numero1;
        }
    }

    // Método para mostrar un saludo personalizado en dos líneas
    public static String name(String nombreUsuario) {
        return "Hola " + nombreUsuario + "\nBienvenid@ al reto de métodos guap@!";
    }
}
