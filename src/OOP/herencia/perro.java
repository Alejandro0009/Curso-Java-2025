package herencia;

/**
 * ============================================================
 * Proyecto:       Zoológico OOP
 * Clase:          Perro.java
 * Autor:          Alejandro Valencia Mendoza
 * Profesión:      Ingeniero en Sistemas Computacionales
 * Contacto:       alejandro.valencia.mdza@gmail.com
 * Fecha:          12/10/2025
 *
 * Descripción:
 *      Clase que representa un Perro, que hereda de Animal.
 *      Contiene atributos específicos como raza y si tiene collar.
 *      También sobrescribe el método hacerSonido() para emitir
 *      el ladrido característico.
 *
 * Conceptos aplicados:
 *      - Herencia (Animal -> Perro)
 *      - Encapsulamiento (atributos privados con getters/setters)
 *      - Sobrescritura de métodos (@Override)
 *      - Métodos específicos de la clase hija
 * ============================================================
 */
public class perro extends animal {

    /** Raza del perro */
    private String raza;

    /** Indica si el perro tiene collar */
    private boolean tieneCollar;

    /**
     * Constructor de la clase Perro.
     * Llama al constructor de la clase padre para inicializar atributos heredados.
     *
     * @param raza Raza del perro
     * @param tieneCollar Indica si tiene collar
     * @param nombre Nombre del perro
     * @param edad Edad del perro
     * @param peso Peso del perro en kg
     * @param color Color del perro
     * @param numeroPatas Número de patas del perro
     */
    public perro(String raza, boolean tieneCollar, String nombre, int edad, double peso, String color, int numeroPatas) {
        super(nombre, edad, peso, color, numeroPatas);
        this.raza = raza;
        this.tieneCollar = tieneCollar;
    }

    // ===================== GETTERS Y SETTERS =====================

    /** @return la raza del perro */
    public String getRaza() {
        return raza;
    }

    /** @param raza la nueva raza del perro */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /** @return true si el perro tiene collar, false en caso contrario */
    public boolean isTieneCollar() {
        return tieneCollar;
    }

    /** @param tieneCollar define si el perro tiene collar */
    public void setTieneCollar(boolean tieneCollar) {
        this.tieneCollar = tieneCollar;
    }

    // ===================== MÉTODOS =====================

    /**
     * Sobrescribe el método hacerSonido() de Animal.
     * Imprime el ladrido característico del perro.
     */
    @Override
    public void hacerSonido() {
        System.out.println("Ladra: ¡Guau guau!");
    }

    /**
     * Muestra la información específica del collar del perro.
     * También indica la raza del perro.
     */
    public void mostrarCollar() {
        if (tieneCollar) {
            System.out.println("Raza: " + raza + "\nSí cuenta con su collar.");
        } else {
            System.out.println("Raza: " + raza + "\nNo cuenta con su collar.");
        }
    }
}
