package herencia;

import java.util.Scanner;

/**
 * ============================================================
 * Proyecto:       Zoológico OOP
 * Clase:          main.java
 * Autor:          Alejandro Valencia Mendoza
 * Profesión:      Ingeniero en Sistemas Computacionales
 * Contacto:       alejandro.valencia.mdza@gmail.com
 * Fecha:          12/10/2025
 *
 * Descripción:
 *      Clase principal del proyecto que permite crear un
 *      zoológico con diferentes animales (Perro, Gato, Pez).
 *      Se solicita al usuario la cantidad de animales y los
 *      datos específicos de cada uno, luego se muestran sus
 *      características y comportamientos.
 *
 * Conceptos aplicados:
 *      - Arreglos de objetos (Animal[])
 *      - Entrada de datos por consola (Scanner)
 *      - Herencia y polimorfismo
 *      - Sobrescritura de métodos
 *      - Uso de instanceof para determinar tipo de objeto
 * ============================================================
 */
public class main {

    /**
     * Método principal que ejecuta el programa.
     * @param args argumentos de línea de comando (no se usan)
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario la cantidad de animales
        System.out.println("¿Cuantos animales quieres en tu ZOOLOGICO MAIN?");
        int numeroAnimales = sc.nextInt();
        sc.nextLine();

        // Crear arreglo de objetos Animal para almacenar los animales
        animal[] zologico = new animal[numeroAnimales];

        // Bucle para llenar el arreglo con datos proporcionados por el usuario
        for (int i = 0; i < zologico.length; i++) {
            System.out.println("Elige el tipo de animal para la pocion " + (i + 1) + ": ");
            System.out.println("1) Perro | 2) Gato | 3) Pez");
            int opcion = sc.nextInt();
            sc.nextLine();

            // ================= PERRO =================
            if (opcion == 1) {
                System.out.println("Ingresar datos del Perro:");
                System.out.print("Nombre: "); 
                String nombre = sc.nextLine();
                System.out.print("Edad: "); 
                int edad = sc.nextInt();
                System.out.print("Peso: "); 
                double peso = sc.nextDouble();
                sc.nextLine();
                System.out.print("Color: "); 
                String color = sc.nextLine();
                System.out.print("Numero de patas: "); 
                int patas = sc.nextInt();
                sc.nextLine();
                System.out.print("Raza: "); 
                String raza = sc.nextLine();
                System.out.print("Tiene collar (true/false): "); 
                boolean collar = sc.nextBoolean();
                sc.nextLine();

                zologico[i] = new perro(raza, collar, nombre, edad, peso, color, patas);
                System.out.println("===============================");

            // ================= GATO =================
            } else if (opcion == 2) {
                System.out.println("Ingresar datos del Gato:");
                System.out.print("Nombre: "); 
                String nombre = sc.nextLine();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                System.out.print("Peso: ");
                double peso = sc.nextDouble();
                sc.nextLine();
                System.out.print("Color: "); 
                String color = sc.nextLine();
                System.out.print("Numero de patas: "); 
                int patas = sc.nextInt();
                sc.nextLine();
                System.out.print("Raza: ");
                String raza = sc.nextLine();
                System.out.print("Tiene garras (true/false): ");
                boolean garras = sc.nextBoolean();
                sc.nextLine();

                zologico[i] = new gato(raza, garras, nombre, edad, peso, color, patas);
                System.out.println("===============================");

            // ================= PEZ =================
            } else {
                System.out.println("Ingresar datos del Pez:");
                System.out.print("Nombre: "); 
                String nombre = sc.nextLine();
                System.out.print("Edad: "); 
                int edad = sc.nextInt();
                System.out.print("Peso: "); 
                double peso = sc.nextDouble();
                sc.nextLine();
                System.out.print("Color: "); 
                String color = sc.nextLine();
                System.out.print("Numero de patas: "); 
                int patas = sc.nextInt();
                sc.nextLine();
                System.out.print("Especie: "); 
                String especie = sc.nextLine();
                System.out.print("Vive en agua salada (true/false): "); 
                boolean salada = sc.nextBoolean();
                sc.nextLine();

                zologico[i] = new pez(especie, salada, nombre, edad, peso, color, patas);
                System.out.println("===============================");
            }
        }

        // Bucle para mostrar los datos y comportamientos de cada animal
        for (int i = 0; i < zologico.length; i++) {
            System.out.println("===============================");
            zologico[i].mostrarDatos();    // Mostrar datos genéricos de Animal
            zologico[i].hacerSonido();     // Mostrar sonido según tipo de animal

            // Determinar tipo específico y mostrar atributos propios
            if (zologico[i] instanceof perro) {
                ((perro) zologico[i]).mostrarCollar();
            } else if (zologico[i] instanceof gato) {
                ((gato) zologico[i]).mostrarGarras();
            } else if (zologico[i] instanceof pez) {
                ((pez) zologico[i]).mostrarTipoAgua();
            }

            System.out.println("===============================");
        }
    }
}
