package biblioteca;

/*
 * ============================================================
 *  Proyecto:       Sistema de Biblioteca en Java
 *  Clase:          Libro.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase que representa un libro dentro de una biblioteca.
 *      Permite almacenar información básica del libro, 
 *      consultar su estado, prestar, devolver y mostrar detalles.
 *      Los métodos mantienen la lógica que controla el estado 
 *      del libro y muestran mensajes en consola según la acción.
 *
 *  Conceptos aplicados:
 *      - Programación Orientada a Objetos (POO)
 *      - Encapsulamiento de atributos con getters y setters
 *      - Control de flujo con condicionales (if/else)
 *      - Métodos de acción para manipular objetos
 *      - Impresión de información en consola con saltos de línea
 * ============================================================
 */

public class Libro {
    
    // Atributos privados
    private String titulo;
    private String autor;
    private int agePublicacion;
    private boolean prestado; 

    // Constructor
    public Libro(String titulo, String autor, int agePublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.agePublicacion = agePublicacion;
        this.prestado = false; // Inicialmente el libro no está prestado
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getagePublicacion() {
        return agePublicacion;
    }

    public void setagePublicacion(int agePublicacion) {
        this.agePublicacion = agePublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    // Métodos de acción
    
    // Muestra el estado actual del libro
    public void estado() {
        if (!prestado) {
            System.out.println("El libro se encuentra en librería.");
        } else {
            System.out.println("El libro no se encuentra en librería.");
        }
    }

    // Muestra toda la información del libro
    public void mostrarInformacion() {
        System.out.println("----- Información del Libro -----");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + agePublicacion);
        System.out.println("--------------------------------");
    }

    // Marca el libro como prestado si está disponible
    public void prestado() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado exitosamente");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    // Marca el libro como disponible si estaba prestado
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro se regresó correctamente.");
        } else {
            System.out.println("Libro ya está en Librería");
        }
    }
}
