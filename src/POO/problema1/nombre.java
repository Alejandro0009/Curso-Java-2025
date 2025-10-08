package problema1;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Registro de Usuarios
 *  Clase:          nombre.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase que permite capturar y mostrar información de un usuario.
 *      Se solicitan datos como nombre, edad y nacionalidad mediante
 *      la consola, y posteriormente se muestran de forma clara y
 *      personalizada.
 *
 *  Conceptos aprendidos:
 *      - Entrada de datos con Scanner
 *      - Uso de variables de tipo String e int
 *      - Creación de métodos para capturar y mostrar información
 *      - Separación de lógica en métodos para mayor claridad
 * ============================================================
 */

public class nombre {
    // Objeto Scanner para entrada de datos
    Scanner sc = new Scanner(System.in);

    // Atributos del usuario
    String nombre;
    int edad;
    String nacionalida;

    // Método para solicitar los datos del usuario
    public void pedirDatos() {
        System.out.println("Ingresa el nombre del usuario: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa la edad del usuario: ");
        edad = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingresa la nacionalidad del usuario: ");
        nacionalida = sc.nextLine();
    }

    // Método para mostrar los datos del usuario
    public void mostrarDatos() {
        System.out.println("Bienvenido " + nombre + ", un gusto volver a platicar.");
        System.out.println("El usuario tiene: " + edad + " años de edad.");
        System.out.println("La nacionalidad del usuario es: " + nacionalida);
    }
}
