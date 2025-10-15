package ZoologicoInteligente;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ============================================================
 * Proyecto:       Zoológico Inteligente
 * Clase:          zoologico.java
 * Autor:          Alejandro Valencia Mendoza
 * Profesión:      Ingeniero en Sistemas Computacionales
 * Contacto:       alejandro.valencia.mdza@gmail.com
 * Fecha:          14/10/2025
 *
 * Descripción:
 *      Clase principal que contiene el método main y simula
 *      la gestión de un zoológico. Permite al usuario agregar
 *      animales (León, Elefante, Tucán, Tiburón) y mostrar
 *      la información de todos los animales ingresados. 
 *      Se utiliza un menú interactivo con Scanner y ArrayList
 *      para almacenar objetos de tipo Animal.
 *
 * Conceptos aprendidos:
 *      - ArrayList para almacenar objetos de manera dinámica
 *      - Scanner para entrada de datos desde consola
 *      - Uso de bucles while y for
 *      - Sentencias switch para decisiones múltiples
 *      - Polimorfismo: ArrayList almacena distintas subclases
 *      - Sobrescritura de métodos: mostrarInformacion()
 * ============================================================
 */
public class zoologico {

    /**
     * Método principal que se ejecuta al iniciar el programa
     */
    public static void main(String[] args) {
        // Scanner para leer datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);

        // ArrayList que almacenará cualquier objeto que sea subclase de Animal
        ArrayList<Animal> zoologico = new ArrayList<>();

        // Variable de control para el bucle del menú
        boolean salir = false;

        // Mensajes iniciales de bienvenida
        System.out.println("Bienvenido al Zoologico de ALEJANDRO V.");
        System.out.println("Ahora tú eres el cuidador del zoologico.");

        // Bucle principal del menú, se repetirá hasta que salir sea true
        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1) Agregar animales");
            System.out.println("2) Ver información de todos los animales");
            System.out.println("3) Salir");
            System.out.print("Elige una opción: ");

            // Leer la opción del usuario
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer del Scanner para evitar saltos de línea

            // Switch principal para manejar las opciones del menú
            switch (opcion) {

                case 1: // Agregar animales
                    System.out.println("\n¿Qué tipo de animal quieres agregar?");
                    System.out.println("1) León");
                    System.out.println("2) Elefante");
                    System.out.println("3) Tucán");
                    System.out.println("4) Tiburón");
                    System.out.print("Elige una opción: ");

                    int tipoAnimal = sc.nextInt();
                    sc.nextLine();

                    System.out.print("¿Cuántos quieres agregar? ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    // Bucle para agregar múltiples animales según la cantidad indicada
                    for (int i = 0; i < cantidad; i++) {
                        switch (tipoAnimal) {

                            case 1: // León
                                System.out.print("Nombre del leon: ");
                                String nombreL = sc.nextLine();
                                System.out.print("Edad: ");
                                int edadL = sc.nextInt(); sc.nextLine();
                                System.out.print("Tipo de alimentación: ");
                                String alimentoL = sc.nextLine();
                                System.out.print("Número de manada: ");
                                int manada = sc.nextInt(); sc.nextLine();

                                // Crear un objeto León y agregarlo al ArrayList
                                zoologico.add(new Leon(manada, nombreL, edadL, alimentoL));
                                break;

                            case 2: // Elefante
                                System.out.print("Nombre del elefante: ");
                                String nombreE = sc.nextLine();
                                System.out.print("Edad: ");
                                int edadE = sc.nextInt(); sc.nextLine();
                                System.out.print("Tipo de alimentación: ");
                                String alimentoE = sc.nextLine();
                                System.out.print("Longitud colmillos (m): ");
                                float colmillos = sc.nextFloat(); sc.nextLine();
                                System.out.print("Longitud trompa (m): ");
                                float trompa = sc.nextFloat(); sc.nextLine();
                                System.out.print("Peso (kg): ");
                                float peso = sc.nextFloat(); sc.nextLine();
                                System.out.print("Altura (m): ");
                                float altura = sc.nextFloat(); sc.nextLine();

                                // Crear objeto Elefante y agregarlo al ArrayList
                                zoologico.add(new Elefante(colmillos, trompa, peso, altura, nombreE, edadE, alimentoE));
                                break;

                            case 3: // Tucán
                                System.out.print("Nombre del tucán: ");
                                String nombreT = sc.nextLine();
                                System.out.print("Edad: ");
                                int edadT = sc.nextInt(); sc.nextLine();
                                System.out.print("Tipo de alimentación: ");
                                String alimentoT = sc.nextLine();
                                System.out.print("Tipo de vuelo: ");
                                String vuelo = sc.nextLine();
                                System.out.print("Color del plumaje: ");
                                String color = sc.nextLine();

                                // Crear objeto Tucan y agregarlo al ArrayList
                                zoologico.add(new Tucan(vuelo, color, nombreT, edadT, alimentoT));
                                break;

                            case 4: // Tiburón
                                System.out.print("Nombre del tiburón: ");
                                String nombreTb = sc.nextLine();
                                System.out.print("Edad: ");
                                int edadTb = sc.nextInt(); sc.nextLine();
                                System.out.print("Tipo de alimentación: ");
                                String alimentoTb = sc.nextLine();
                                System.out.print("Longitud (m): ");
                                float longitud = sc.nextFloat(); sc.nextLine();
                                System.out.print("Velocidad de nado (km/h): ");
                                float velocidad = sc.nextFloat(); sc.nextLine();
                                System.out.print("Tipo de tiburón: ");
                                String tipo = sc.nextLine();

                                // Crear objeto Tiburon y agregarlo al ArrayList
                                zoologico.add(new Tiburon(longitud, velocidad, tipo, nombreTb, edadTb, alimentoTb));
                                break;

                            default:
                                System.out.println("Opción inválida.");
                        }
                    }
                    break;

                case 2: // Mostrar información de todos los animales
                    System.out.println("\n--- INFORMACIÓN DEL ZOOLÓGICO ---");
                    if (zoologico.isEmpty()) { // Verificar si no hay animales
                        System.out.println("No hay animales ingresados aún.");
                    } else {
                        // Recorrer el ArrayList y mostrar información de cada animal
                        for (Animal a : zoologico) {
                            a.mostrarInformacion(); // Polimorfismo: llama al método correspondiente según el tipo
                            System.out.println("-----------------------------");
                        }
                    }
                    break;

                case 3: // Salir
                    System.out.println("Saliendo del zoológico...");
                    salir = true; // Cambia la variable para terminar el bucle while
                    break;

                default: // Opción no válida
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }

        // Cerrar el Scanner para liberar recursos
        sc.close();
    }
}
