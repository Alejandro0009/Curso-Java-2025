package herencia;

import java.util.Scanner;

/**
 * ============================================================
 * Proyecto:       Zoológico OOP
 * Clase:          Animal.java
 * Autor:          Alejandro Valencia Mendoza
 * Profesión:      Ingeniero en Sistemas Computacionales
 * Contacto:       alejandro.valencia.mdza@gmail.com
 * Fecha:          12/10/2025
 *
 * Descripción:
 *      Clase que representa un animal genérico. Incluye atributos
 *      comunes a todos los animales como nombre, edad, peso,
 *      color y número de patas. También proporciona métodos para
 *      mostrar información, emitir sonidos genéricos y pedir datos
 *      desde consola.
 *
 * Conceptos aplicados:
 *      - Programación Orientada a Objetos (POO)
 *      - Encapsulamiento (atributos privados con getters/setters)
 *      - Constructores (vacío y con parámetros)
 *      - Uso de Scanner para entrada de datos
 *      - Sobrescritura de métodos en clases hijas
 * ============================================================
 */
public class animal {
    
    /** Nombre del animal */
    private String nombre;
    
    /** Edad del animal en años */
    private int edad;
    
    /** Peso del animal en kilogramos */
    private double peso;
    
    /** Color predominante del animal */
    private String color;
    
    /** Número de patas del animal */
    private int numeroPatas;
    
    /**
     * Constructor vacío.
     * Permite crear un objeto animal sin inicializar atributos.
     */
    public animal() {
    }

    /**
     * Constructor con parámetros.
     * Inicializa todos los atributos del animal.
     *
     * @param nombre Nombre del animal
     * @param edad Edad del animal
     * @param peso Peso del animal en kg
     * @param color Color del animal
     * @param numeroPatas Número de patas del animal
     */
    public animal(String nombre, int edad, double peso, String color, int numeroPatas) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
        this.numeroPatas = numeroPatas;
    }

    // ===================== GETTERS Y SETTERS =====================

    /** @return el nombre del animal */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre el nuevo nombre del animal */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return la edad del animal */
    public int getEdad() {
        return edad;
    }

    /** @param edad la nueva edad del animal */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /** @return el peso del animal */
    public double getPeso() {
        return peso;
    }

    /** @param peso el nuevo peso del animal */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /** @return el color del animal */
    public String getColor() {
        return color;
    }

    /** @param color el nuevo color del animal */
    public void setColor(String color) {
        this.color = color;
    }

    /** @return el número de patas del animal */
    public int getNumeroPatas() {
        return numeroPatas;
    }

    /** @param numeroPatas el nuevo número de patas del animal */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    // ===================== MÉTODOS =====================

    /**
     * Método genérico para emitir sonido.
     * Puede ser sobrescrito por las clases hijas para sonidos específicos.
     */
    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    /**
     * Muestra todos los datos del animal en consola.
     */
    public void mostrarDatos() {
        System.out.println(
                "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nPeso: " + peso +
                "\nColor: " + color +
                "\nNúmero de patas: " + numeroPatas
        );
    }

    /**
     * Pide al usuario ingresar los datos del animal mediante consola.
     * Utiliza Scanner para lectura de datos y asigna los valores a los atributos.
     */
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del animal: ");
        nombre = sc.nextLine();

        System.out.print("Ingresa la edad del animal: ");
        edad = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        System.out.print("Ingresa el peso del animal: ");
        peso = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingresa el color del animal: ");
        color = sc.nextLine();

        System.out.print("Ingresa el número de patas del animal: ");
        numeroPatas = sc.nextInt();
        sc.nextLine();
    }
}
