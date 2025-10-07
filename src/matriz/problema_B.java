package matriz;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       matrices
 *  Clase:          problema_B.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa que crea una matriz de 3x3, solicita al usuario
 *      ingresar los valores de cada posición y muestra el resultado
 *      en formato de tabla. Este ejercicio es útil para entender
 *      la indexación en arrays bidimensionales, el uso de bucles
 *      anidados y la lectura de datos por consola.
 *
 *  Conceptos aprendidos:
 *      - Declaración y creación de matrices en Java
 *      - Uso de bucles for anidados para recorrer filas y columnas
 *      - Lectura de datos con la clase Scanner (entrada por teclado)
 *      - Imprimir estructuras bidimensionales en formato tabular
 *      - Buenas prácticas: cerrar el Scanner al finalizar
 * ============================================================
 */

public class problema_B {
    
    public static void main(String[] args) {
        // Creamos un Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Declaramos e inicializamos una matriz de enteros 3x3
        int[][] matriz = new int[3][3];
        
        // ============================
        //   LLENAR LA MATRIZ (Entrada)
        // ============================
        // Recorremos la matriz con dos bucles for anidados:
        //  - i controla las filas (0..2)
        //  - j controla las columnas (0..2)
        System.out.println("Llena la matriz 3x3 con números enteros:");
        for (int i = 0; i < 3; i++) {            // recorre filas
            for (int j = 0; j < 3; j++) {        // recorre columnas
                System.out.print("Ingresa el número para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();     // lee y guarda el valor en la posición [i][j]
            }
        }
        
        // ============================
        //   MOSTRAR LA MATRIZ (Salida)
        // ============================
        // Imprimimos la matriz fila por fila para verla en forma de tabla
        System.out.println("\n Matriz 3x3 ingresada:");
        for (int i = 0; i < 3; i++) {            // recorre filas
            for (int j = 0; j < 3; j++) {        // recorre columnas
                System.out.print(matriz[i][j] + " "); // imprime cada elemento con un espacio
            }
            System.out.println(); // salto de línea al terminar cada fila
        }

        // Cerramos el Scanner para liberar recursos del sistema
        sc.close();
    }
}
