package ZoologicoInteligente;

/**
 * ============================================================
 * Proyecto:       Zoológico Inteligente
 * Clase:          Tiburon.java
 * Autor:          Alejandro Valencia Mendoza
 * Profesión:      Ingeniero en Sistemas Computacionales
 * Contacto:       alejandro.valencia.mdza@gmail.com
 * Fecha:          14/10/2025
 *
 * Descripción:
 *      Clase que representa un Tiburón, subclase de Animal.
 *      Hereda atributos generales de Animal y agrega atributos
 *      específicos como longitud, velocidad de nado y tipo de tiburón. 
 *      Implementa los métodos abstractos comer() y hacerSonido()
 *      de manera particular para un tiburón.
 *
 * Conceptos aprendidos:
 *      - Herencia: Tiburon extiende Animal
 *      - Sobrescritura de métodos (override) para comportamientos específicos
 *      - Encapsulamiento: atributos privados con getters y setters
 *      - Uso de super para llamar al constructor de la clase base
 * ============================================================
 */
public class Tiburon extends Animal {

    /** Longitud del tiburón en metros */
    private float longitud;

    /** Velocidad de nado en km/h */
    private float velocidadNado;

    /** Tipo de tiburón (por ejemplo: blanco, toro, tigre) */
    private String tipo;

    /**
     * Constructor que inicializa todos los atributos del tiburón
     *
     * @param longitud Longitud en metros
     * @param velocidadNado Velocidad de nado en km/h
     * @param tipo Tipo de tiburón
     * @param nombre Nombre del tiburón
     * @param edad Edad del tiburón
     * @param tipoAlimentacion Tipo de alimentación
     */
    public Tiburon(float longitud, float velocidadNado, String tipo, String nombre, int edad, String tipoAlimentacion) {
        super(nombre, edad, tipoAlimentacion); // Llama al constructor de Animal
        this.longitud = longitud;
        this.velocidadNado = velocidadNado;
        this.tipo = tipo;
    }

    // Getters y Setters para mantener encapsulamiento
    public float getLongitud() { return longitud; }
    public void setLongitud(float longitud) { this.longitud = longitud; }
    public float getVelocidadNado() { return velocidadNado; }
    public void setVelocidadNado(float velocidadNado) { this.velocidadNado = velocidadNado; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    /**
     * Implementación específica del método comer() para Tiburón
     * Muestra la dieta típica de un tiburón en consola
     */
    @Override
    public void comer() {
        System.out.println(getNombre() + " se alimenta de peces, calamares y otros animales marinos.");
    }

    /**
     * Implementación específica del método hacerSonido() para Tiburón
     * Muestra en consola el sonido característico del tiburón al nadar
     */
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: ¡Splash! ¡Splash!");
    }

    /**
     * Muestra toda la información del Tiburón, incluyendo atributos
     * heredados de Animal y los propios de Tiburón
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de Animal
        System.out.println("La longitud del " + getNombre() + " es: " + longitud +
                           " m\nLa velocidad del " + getNombre() + " es: " + velocidadNado +
                           " km/h\nEl tipo del tiburón es: " + tipo);
    }
}
