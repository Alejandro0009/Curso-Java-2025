package herencia;

/**
 * ============================================================
 * Proyecto:       Zoológico OOP
 * Clase:          Gato.java
 * Autor:          Alejandro Valencia Mendoza
 * Profesión:      Ingeniero en Sistemas Computacionales
 * Contacto:       alejandro.valencia.mdza@gmail.com
 * Fecha:          12/10/2025
 *
 * Descripción:
 *      Clase que representa un Gato, que hereda de Animal.
 *      Contiene atributos específicos como raza y si tiene garras afiladas.
 *      También sobrescribe el método hacerSonido() para emitir
 *      el maullido característico.
 *
 * Conceptos aplicados:
 *      - Herencia (Animal -> Gato)
 *      - Encapsulamiento (atributos privados con getters/setters)
 *      - Sobrescritura de métodos (@Override)
 *      - Métodos específicos de la clase hija
 * ============================================================
 */
public class gato extends animal {

    /** Raza del gato */
    private String raza;

    /** Indica si el gato tiene garras afiladas */
    private boolean tieneGarras;

    /**
     * Constructor de la clase Gato.
     * Llama al constructor de la clase padre para inicializar atributos heredados.
     *
     * @param raza Raza del gato
     * @param tieneGarras Indica si tiene garras afiladas
     * @param nombre Nombre del gato
     * @param edad Edad del gato
     * @param peso Peso del gato en kg
     * @param color Color del gato
     * @param numeroPatas Número de patas del gato
     */
    public gato(String raza, boolean tieneGarras, String nombre, int edad, double peso, String color, int numeroPatas) {
        super(nombre, edad, peso, color, numeroPatas);
        this.raza = raza;
        this.tieneGarras = tieneGarras;
    }

    // ===================== GETTERS Y SETTERS =====================

    /** @return la raza del gato */
    public String getRaza() {
        return raza;
    }

    /** @param raza la nueva raza del gato */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /** @return true si el gato tiene garras afiladas, false en caso contrario */
    public boolean isTieneGarras() {
        return tieneGarras;
    }

    /** @param tieneGarras define si el gato tiene garras afiladas */
    public void setTieneGarras(boolean tieneGarras) {
        this.tieneGarras = tieneGarras;
    }

    // ===================== MÉTODOS =====================

    /**
     * Sobrescribe el método hacerSonido() de Animal.
     * Imprime el maullido característico del gato.
     */
    @Override
    public void hacerSonido() {
        System.out.println("Miu, Miu");
    }

    /**
     * Muestra la información específica de las garras del gato.
     * También indica la raza del gato.
     */
    public void mostrarGarras() {
        if (tieneGarras) {
            System.out.println("Raza: " + raza + "\nTiene garras afiladas.");
        } else {
            System.out.println("Raza: " + raza + "\nNo tiene garras afiladas.");
        }
    }
}
