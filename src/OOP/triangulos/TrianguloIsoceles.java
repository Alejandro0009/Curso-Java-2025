package triangulos;

/*
 * ============================================================
 *  Proyecto:       Cálculo de Triángulos Isósceles
 *  Clase:          TriangulosIsoseles.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          09/10/2025
 *
 *  Descripción:
 *      Clase que representa un triángulo isósceles con base y lados iguales.
 *      Permite calcular el perímetro, el área y mostrar todos los datos
 *      del triángulo de manera estructurada.
 *
 *  Conceptos aprendidos:
 *      - Programación Orientada a Objetos (POO)
 *      - Encapsulamiento de atributos con 'private'
 *      - Uso de constructores para inicializar objetos
 *      - Creación de métodos para calcular propiedades geométricas
 *      - Retorno de datos desde métodos
 * ============================================================
 */

public class TrianguloIsoceles {
    // Atributos privados del triángulo
    private double base;
    private double lado;

    // Constructor que recibe base y lado del triángulo
    public TrianguloIsoceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    // Método para calcular el perímetro del triángulo
    public double obtenerPerimetro() {
        return (2 * lado) + base;
    }

    // Método para calcular el área usando la fórmula de triángulo isósceles
    public double obtenerArea() {
        return (base * Math.sqrt((lado * lado) - ((base * base) / 4))) / 2;
    }

    // Método para mostrar todos los datos del triángulo
    public String mostrarDatos() {
        return "Base: " + base +
               "\nLado: " + lado +
               "\nPerímetro: " + obtenerPerimetro() +
               "\nÁrea: " + obtenerArea() + "\n";
    }
}
