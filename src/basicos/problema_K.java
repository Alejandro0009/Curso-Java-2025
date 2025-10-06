package basicos;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_K.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que demuestra el uso de operadores de asignación 
 *      compuesta en Java: +=, -=, *=, /=, %=
 *
 *  Conceptos aprendidos:
 *      - Operadores de asignación compuesta
 *      - Modificación de variables
 *      - Mostrar resultados en consola con System.out.println()
 * ============================================================
 */

public class problema_K {
    
    public static void main(String[] args) {
        int numero = 10; 

        // Sumar 5 a numero
        numero = numero + 5; // forma "larga"
        System.out.println("Después de numero = numero + 5: " + numero);

        // Forma más corta con operador compuesto
        numero += 5; 
        System.out.println("Después de numero += 5: " + numero);

        // Resta 5
        numero -= 5; 
        System.out.println("Después de numero -= 5: " + numero);

        // Puedes usar también *=, /=, %=
        numero *= 2;
        System.out.println("Después de numero *= 2: " + numero);
    }
}
