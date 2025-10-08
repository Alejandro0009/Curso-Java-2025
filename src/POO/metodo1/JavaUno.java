package metodo1;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Métodos Básicos en Java
 *  Clase:          JavaUno.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase principal que prueba los métodos de la clase
 *      'metodosBasicos'. Solicita al usuario dos números y
 *      un nombre, luego calcula la suma, determina cuál
 *      número es mayor, verifica paridad y muestra un saludo
 *      personalizado.
 *
 *  Conceptos aprendidos:
 *      - Instanciación y uso de Scanner para entrada de datos
 *      - Llamada a métodos estáticos de otra clase
 *      - Manejo de variables y almacenamiento de resultados
 *      - Presentación clara de resultados en consola
 * ============================================================
 */

public class JavaUno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar números al usuario
        System.out.print("Ingresa el número uno: ");
        int numero1 = sc.nextInt();
        sc.nextLine(); // Limpiar salto pendiente

        System.out.print("Ingresa el número dos: ");
        int numero2 = sc.nextInt();
        sc.nextLine(); // Limpiar salto pendiente

        // Solicitar nombre del usuario
        System.out.print("Ingresa tu nombre: ");
        String nombreUsuario = sc.nextLine();

        // Llamar métodos de la clase metodosBasicos
        int resultadoSuma = metodosBasicos.suma(numero1, numero2);
        int resultadoMayor = metodosBasicos.mayor(numero1, numero2);
        String resultadoPar1 = metodosBasicos.par(numero1);
        String resultadoPar2 = metodosBasicos.par(numero2);
        String saludo = metodosBasicos.name(nombreUsuario);

        // Mostrar resultados en consola
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Número mayor: " + resultadoMayor);
        System.out.println("Número uno: " + resultadoPar1);
        System.out.println("Número dos: " + resultadoPar2);
        System.out.println(saludo);
        System.out.println("Día 14 de 500 de programación");

        sc.close();
    }
}
