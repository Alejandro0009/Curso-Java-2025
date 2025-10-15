package ZoologicoInteligente;

/**
 * ============================================================
 * Proyecto:       Zoológico Inteligente
 * Clase:          Tucan.java
 * Autor:          Alejandro Valencia Mendoza
 * Profesión:      Ingeniero en Sistemas Computacionales
 * Contacto:       alejandro.valencia.mdza@gmail.com
 * Fecha:          14/10/2025
 *
 * Descripción:
 *      Clase que representa un Tucán, subclase de Animal.
 *      Hereda atributos generales de Animal y agrega atributos
 *      específicos como tipo de vuelo y color del plumaje. 
 *      Implementa los métodos abstractos comer() y hacerSonido()
 *      de manera particular para un tucán.
 *
 * Conceptos aprendidos:
 *      - Herencia: Tucan extiende Animal
 *      - Sobrescritura de métodos (override) para comportamientos específicos
 *      - Encapsulamiento: atributos privados con getters y setters
 *      - Uso de super para llamar al constructor de la clase base
 * ============================================================
 */
public class Tucan extends Animal {

    /** Tipo de vuelo del tucán (por ejemplo: planeo, vuelo rápido) */
    private String tipoVuelo;

    /** Color del plumaje del tucán (por ejemplo: negro, amarillo y rojo) */
    private String colorPlumaje;

    /**
     * Constructor que inicializa todos los atributos del Tucán
     *
     * @param tipoVuelo Tipo de vuelo del tucán
     * @param colorPlumaje Color del plumaje
     * @param nombre Nombre del tucán
     * @param edad Edad del tucán
     * @param tipoAlimentacion Tipo de alimentación
     */
    public Tucan(String tipoVuelo, String colorPlumaje, String nombre, int edad, String tipoAlimentacion) {
        super(nombre, edad, tipoAlimentacion); // Llama al constructor de Animal
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
    }

    // Getters y Setters para mantener encapsulamiento
    public String getTipoVuelo() { return tipoVuelo; }
    public void setTipoVuelo(String tipoVuelo) { this.tipoVuelo = tipoVuelo; }
    public String getColorPlumaje() { return colorPlumaje; }
    public void setColorPlumaje(String colorPlumaje) { this.colorPlumaje = colorPlumaje; }

    /**
     * Implementación específica del método comer() para Tucán
     * Muestra la dieta típica de un tucán en consola
     */
    @Override
    public void comer() {
        System.out.println(getNombre() + " se alimenta de frutas (mango, papaya, plátano).");
    }

    /**
     * Implementación específica del método hacerSonido() para Tucán
     * Muestra en consola el sonido característico del tucán
     */
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Pío pío!");
    }

    /**
     * Muestra toda la información del Tucán, incluyendo atributos
     * heredados de Animal y los propios de Tucán
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de Animal
        System.out.println("Color plumaje: " + colorPlumaje + 
                           ", tipo de vuelo: " + tipoVuelo);
    }
}
