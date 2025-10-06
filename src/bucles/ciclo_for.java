package bucles;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Bucles
 *  Clase:          ciclo_for.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que utiliza un ciclo for para imprimir 
 *      todos los números desde 1 hasta el número de términos
 *      ingresado por el usuario.
 *
 *  Conceptos aprendidos:
 *      - Uso del ciclo for
 *      - Inicialización, condición y actualización de la variable de control
 *      - Entrada de datos con Scanner
 * ============================================================
 */

public class ciclo_for {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int contador; // Número de términos a imprimir

        // Solicitar al usuario la cantidad de términos
        System.out.print("Digite la cantidad de términos: ");
        contador = entrada.nextInt();

        // Ciclo for: inicialización, condición y actualización
        for (int i = 1; i <= contador; i++) {
            System.out.println(i);
        }

        // Ejemplos adicionales comentados:
        // Imprimir del 1 al 10
        // for(int i = 1; i <= 10; i++){
        //     System.out.println(i);
        // }

        // Imprimir del 10 al 1
        // for(int a = 10; a >= 1; a--){
        //     System.out.println(a);
        // }

        // Cerrar Scanner
        entrada.close();
    }
}
