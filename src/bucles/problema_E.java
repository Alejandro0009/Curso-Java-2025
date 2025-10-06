package bucles;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Juego Adivina el Número
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Juego en el que el usuario debe adivinar un número
 *      aleatorio entre 0 y 100. Se indica si el número
 *      ingresado es mayor o menor y se cuenta el número
 *      de intentos.
 * ============================================================
 */

public class problema_E {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 101); // 0-100
        int intentos = 0;
        int numeroUsuario;

        System.out.println("¡Bienvenido al juego Adivina el Número!");
        System.out.println("Estoy pensando en un número entre 0 y 100. Intenta adivinarlo.");

        do {
            System.out.print("Ingresa un número: ");
            numeroUsuario = entrada.nextInt();
            intentos++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número es menor.");
            }
        } while (numeroUsuario != numeroSecreto);

        System.out.println("¡Felicidades! Encontraste el número secreto: " + numeroSecreto);
        System.out.println("Número de intentos: " + intentos);
    }
}
