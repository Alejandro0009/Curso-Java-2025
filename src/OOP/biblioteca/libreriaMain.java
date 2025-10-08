package biblioteca;

/*
 * ============================================================
 *  Proyecto:       Sistema de Biblioteca en Java
 *  Clase:          LibreriaMain.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase principal que simula el funcionamiento de una
 *      biblioteca. Se crean varios libros, se prueban los 
 *      métodos de préstamo, devolución, consulta de estado
 *      y muestra de información de cada libro.
 *
 *  Conceptos aplicados:
 *      - Creación de objetos e instanciación de clases
 *      - Llamada a métodos de instancia (prestar, devolver, estado)
 *      - Presentación de información en consola
 *      - Flujo de acciones entre objetos de una clase
 * ============================================================
 */

public class libreriaMain {
    
    public static void main(String[] args) {

        // Crear objetos Libro
        Libro libro1 = new Libro("Carrie", "Stephen King", 1974);
        Libro libro2 = new Libro("El resplandor", "Stephen King", 1977);
        Libro libro3 = new Libro("It", "Stephen King", 1986);
        Libro libro4 = new Libro("Misery", "Stephen King", 1987);

        // Mostrar información del primer libro y cambiar su estado
        libro1.mostrarInformacion();   // Mostrar todos los datos del libro
        libro1.prestado();             // Intentar prestarlo
        libro1.estado();               // Consultar estado actual
        System.out.println();          // Salto de línea para separar visualmente

        // Intentar devolver un libro que no fue prestado aún
        libro2.devolver();             // Debería avisar que ya está en librería
        System.out.println();

        // Probar con otros libros
        libro3.mostrarInformacion();
        libro3.prestado();
        libro3.estado();
        libro3.devolver();
        libro3.estado();
        System.out.println();

        libro4.mostrarInformacion();
        libro4.estado();
        libro4.prestado();
        libro4.estado();
        System.out.println();
    }
}
