package ZoologicoInteligente;

/**
 * ============================================================
 * Proyecto:       Zoológico Inteligente
 * Clase:          Leon.java
 * Autor:          Alejandro Valencia Mendoza
 * Profesión:      Ingeniero en Sistemas Computacionales
 * Contacto:       alejandro.valencia.mdza@gmail.com
 * Fecha:          14/10/2025
 *
 * Descripción:
 *      Clase que representa a un León, subclase de Animal.
 *      Hereda atributos y métodos generales de Animal y 
 *      agrega atributos específicos como el número de 
 *      manada. Implementa los métodos abstractos comer() 
 *      y hacerSonido() de manera específica para un león.
 *
 * Conceptos aprendidos:
 *      - Herencia: León extiende Animal
 *      - Sobrescritura de métodos (override) para comportamientos específicos
 *      - Encapsulamiento: atributo privado numeroManada con getters y setters
 *      - Uso de super para llamar al constructor de la clase base
 * ============================================================
 */
public class Leon extends Animal {

    /** Número de leones que conforman la manada */
    private int numeroManada; 

    /**
     * Constructor que inicializa todos los atributos del León
     *
     * @param numeroManada Número de la manada a la que pertenece el león
     * @param nombre Nombre del león
     * @param edad Edad del león
     * @param tipoAlimentacion Tipo de alimentación del león
     */
    public Leon(int numeroManada, String nombre, int edad, String tipoAlimentacion) {
        super(nombre, edad, tipoAlimentacion); // Llama al constructor de la clase Animal
        this.numeroManada = numeroManada;       // Inicializa el atributo específico del león
    }

    /**
     * Obtiene el número de la manada del león
     * @return número de manada
     */
    public int getNumeroManada() {
        return numeroManada;
    }

    /**
     * Modifica el número de manada del león
     * @param numeroManada Nuevo número de manada
     */
    public void setNumeroManada(int numeroManada) {
        this.numeroManada = numeroManada;
    }

    /**
     * Implementación específica del método comer() para León
     * Muestra en consola qué tipo de alimento consume el león
     */
    @Override
    public void comer(){
        System.out.println(getNombre() + " se alimenta de carne.");
    }

    /**
     * Implementación específica del método hacerSonido() para León
     * Muestra en consola el rugido característico del león
     */
    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " ruge: GRRRRR!");
    }

    /**
     * Muestra la información completa del León, incluyendo 
     * atributos heredados de Animal y su número de manada
     */
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion(); // Llama al método de la clase Animal
        System.out.println("El número de su manada es de: " + numeroManada);
    }
}
