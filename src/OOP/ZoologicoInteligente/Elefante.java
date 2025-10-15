package ZoologicoInteligente;

/**
 * ============================================================
 * Proyecto:       Zoológico Inteligente
 * Clase:          Elefante.java
 * Autor:          Alejandro Valencia Mendoza
 * Profesión:      Ingeniero en Sistemas Computacionales
 * Contacto:       alejandro.valencia.mdza@gmail.com
 * Fecha:          14/10/2025
 *
 * Descripción:
 *      Clase que representa a un Elefante, subclase de Animal.
 *      Hereda atributos generales de Animal y agrega atributos
 *      específicos como longitud de colmillos, longitud de trompa,
 *      peso y altura. Implementa los métodos abstractos comer() 
 *      y hacerSonido() de manera particular para un elefante.
 *
 * Conceptos aprendidos:
 *      - Herencia: Elefante extiende Animal
 *      - Sobrescritura de métodos (override) para comportamientos específicos
 *      - Encapsulamiento: atributos privados con getters y setters
 *      - Uso de super para llamar al constructor de la clase base
 * ============================================================
 */
public class Elefante extends Animal {

    /** Longitud de los colmillos del elefante en metros */
    private float longitudColmillos;

    /** Longitud de la trompa en metros */
    private float longitudTrompa;

    /** Peso del elefante en kilogramos */
    private float peso;

    /** Altura del elefante en metros */
    private float altura;

    /**
     * Constructor que inicializa todos los atributos del Elefante
     *
     * @param longitudColmillos Longitud de los colmillos
     * @param longitudTrompa Longitud de la trompa
     * @param peso Peso del elefante
     * @param altura Altura del elefante
     * @param nombre Nombre del elefante
     * @param edad Edad del elefante
     * @param tipoAlimentacion Tipo de alimentación del elefante
     */
    public Elefante(float longitudColmillos, float longitudTrompa, float peso, float altura, 
                    String nombre, int edad, String tipoAlimentacion) {
        super(nombre, edad, tipoAlimentacion); // Llama al constructor de Animal
        this.longitudColmillos = longitudColmillos;
        this.longitudTrompa = longitudTrompa;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters y Setters para encapsulamiento
    public float getLongitudColmillos() { return longitudColmillos; }
    public void setLongitudColmillos(float longitudColmillos) { this.longitudColmillos = longitudColmillos; }
    public float getLongitudTrompa() { return longitudTrompa; }
    public void setLongitudTrompa(float longitudTrompa) { this.longitudTrompa = longitudTrompa; }
    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }
    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }

    /**
     * Implementación específica del método comer() para Elefante
     * Muestra en consola la dieta típica de un elefante
     */
    @Override
    public void comer() {
        System.out.println(getNombre() + " se alimenta de hojas, ramas, frutas y pasto.");
    }

    /**
     * Implementación específica del método hacerSonido() para Elefante
     * Muestra en consola el sonido característico de un elefante
     */
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " Pawooo! Pawooo!");
    }

    /**
     * Muestra toda la información del Elefante, incluyendo los atributos
     * heredados de Animal y los atributos propios
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de Animal
        System.out.println("La longitud de los colmillos es: " + longitudColmillos +
                           "\nLa longitud de la trompa es: " + longitudTrompa +
                           "\nSu peso es: " + peso +
                           "\nSu altura es: " + altura);
    }
}
