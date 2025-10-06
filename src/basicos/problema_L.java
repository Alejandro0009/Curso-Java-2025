package basicos;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_L.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que solicita al usuario 3 calificaciones y 
 *      calcula la suma de las mismas.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Operadores aritméticos (+)
 *      - Mostrar resultados en consola con System.out.println()
 * ============================================================
 */

public class problema_L {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Declarar variables para las calificaciones
        float calificacion1, calificacion2, calificacion3; 
        float suma; 

        // Pedir al usuario las calificaciones
        System.out.println("Digite la primera calificación: ");
        calificacion1 = entrada.nextFloat();

        System.out.println("Digite la segunda calificación: ");
        calificacion2 = entrada.nextFloat();

        System.out.println("Digite la tercera calificación: ");
        calificacion3 = entrada.nextFloat();

        // Calcular la suma
        suma = calificacion1 + calificacion2 + calificacion3;

        // Mostrar el resultado
        System.out.println("La suma de las calificaciones es: " + suma);

        // Cerrar Scanner
        entrada.close();
    }
}
