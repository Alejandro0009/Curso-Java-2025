package ZoologicoInteligente;

/**
 * ============================================================
 * Proyecto:       Zoológico Inteligente
 * Clase:          Animal.java
 * Autor:          Alejandro Valencia Mendoza
 * Profesión:      Ingeniero en Sistemas Computacionales
 * Contacto:       alejandro.valencia.mdza@gmail.com
 * Fecha:          14/10/2025
 *
 * Descripción:
 *      Clase abstracta que representa un animal genérico.
 *      Contiene los atributos y métodos comunes a todos
 *      los animales del zoológico. Esta clase sirve como
 *      base para las subclases específicas como León, 
 *      Elefante, Tucán y Tiburón.
 *
 * Conceptos aprendidos:
 *      - Clases abstractas y métodos abstractos
 *      - Encapsulamiento mediante atributos privados
 *      - Getters y setters para acceder y modificar atributos
 *      - Polimorfismo: los métodos comer() y hacerSonido()
 *        serán implementados por las subclases.
 * ============================================================
 */
public abstract class Animal {

    /** Nombre del animal */
    private String nombre;

    /** Edad del animal en años */
    private int edad;

    /** Tipo de alimentación del animal (carnívoro, herbívoro, omnívoro) */
    private String tipoAlimentacion;

    /**
     * Constructor vacío de la clase Animal
     * Permite crear un objeto sin inicializar atributos
     */
    public Animal() {
    }

    /**
     * Constructor que inicializa todos los atributos del animal
     *
     * @param nombre Nombre del animal
     * @param edad Edad del animal
     * @param tipoAlimentacion Tipo de alimentación
     */
    public Animal(String nombre, int edad, String tipoAlimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    /**
     * Obtiene el nombre del animal
     * @return nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del animal
     * @param nombre Nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del animal
     * @return edad en años
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad del animal
     * @param edad Nueva edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el tipo de alimentación del animal
     * @return tipo de alimentación
     */
    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    /**
     * Modifica el tipo de alimentación del animal
     * @param tipoAlimentacion Nuevo tipo de alimentación
     */
    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    /**
     * Muestra la información básica del animal en consola
     * Incluye nombre, edad y tipo de alimentación
     */
    public void mostrarInformacion(){
        System.out.println("Animal: " + nombre +
                           "\nEdad: " + edad +
                           "\nTipo de alimento que come: " + tipoAlimentacion);
    }

    /**
     * Método abstracto que define cómo se alimenta el animal.
     * Cada subclase (León, Elefante, Tucán, Tiburón) debe
     * implementar este método con su comportamiento específico.
     */
    public abstract void comer();

    /**
     * Método abstracto que define el sonido que hace el animal.
     * Cada subclase debe implementar este método con su sonido
     * característico.
     */
    public abstract void hacerSonido();
}
