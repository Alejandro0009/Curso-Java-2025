package sistemaAlumnos;

/*
 * ============================================================
 *  Proyecto:       Sistema de Gestión de Alumnos
 *  Clase:          Alumno.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase que representa a un alumno con atributos básicos
 *      como nombre, edad, promedio y grado. Permite crear
 *      objetos de tipo Alumno usando tres tipos de constructores
 *      (completo, parcial y vacío), mostrar información, 
 *      saludar y cumplir años.
 *
 *  Conceptos aprendidos:
 *      - Programación Orientada a Objetos (POO)
 *      - Encapsulamiento básico de atributos
 *      - Sobrecarga de constructores
 *      - Sobrecarga de métodos
 *      - Uso de métodos para manipular y mostrar datos
 * ============================================================
 */

public class Alumno {
    String nombre;
    int edad;
    double promedio;
    String grado;

    // Constructor que recibe todos los datos del alumno
    public Alumno(String nombre, int edad, double promedio, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.grado = grado;
    }

    // Constructor que solo recibe nombre y edad, asignando valores por defecto
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = 0.0;  // valor por defecto
        this.grado = "Sin asignar";  // valor por defecto
    }

    // Constructor vacío que asigna valores predeterminados
    public Alumno() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.promedio = 0.0;
        this.grado = "Sin asignar";
    }

    // Método para mostrar los datos del alumno
    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El grado es: " + grado);
    }

    // Método para saludar de forma estándar
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ". Un placer conocerte.");
    }

    // Sobrecarga del método saludar con mensaje personalizado
    public void saludar(String mensaje) {
        System.out.println("Tu mensaje personalizado es: " + mensaje);
    }

    // Método para incrementar la edad del alumno
    public void cumplirAños() {
        edad++;
        System.out.println("Ahora tu edad es: " + edad);
    }
}
