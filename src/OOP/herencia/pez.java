package herencia;

/**
 * ============================================================
 * Proyecto:       Zoológico OOP
 * Clase:          Pez.java
 * Autor:          Alejandro Valencia Mendoza
 * Profesión:      Ingeniero en Sistemas Computacionales
 * Contacto:       alejandro.valencia.mdza@gmail.com
 * Fecha:          12/10/2025
 *
 * Descripción:
 *      Clase que representa un Pez, que hereda de Animal.
 *      Contiene atributos específicos como especie y tipo de agua
 *      donde vive (salada o dulce). Sobrescribe el método
 *      hacerSonido() para emitir el sonido característico del pez.
 *
 * Conceptos aplicados:
 *      - Herencia (Animal -> Pez)
 *      - Encapsulamiento (atributos privados con getters/setters)
 *      - Sobrescritura de métodos (@Override)
 *      - Métodos específicos de la clase hija
 * ============================================================
 */
public class pez extends animal {

    /** Especie del pez */
    private String especie;

    /** true si vive en agua salada, false si vive en agua dulce */
    private boolean aguaSalada;

    /**
     * Constructor de la clase Pez.
     * Llama al constructor de la clase padre para inicializar atributos heredados.
     *
     * @param especie Especie del pez
     * @param aguaSalada True si vive en agua salada, false si es de agua dulce
     * @param nombre Nombre del pez
     * @param edad Edad del pez
     * @param peso Peso del pez en kg
     * @param color Color del pez
     * @param numeroPatas Número de patas del pez (normalmente 0)
     */
    public pez(String especie, boolean aguaSalada, String nombre, int edad, double peso, String color, int numeroPatas) {
        super(nombre, edad, peso, color, numeroPatas);
        this.especie = especie;
        this.aguaSalada = aguaSalada;
    }

    // ===================== GETTERS Y SETTERS =====================

    /** @return la especie del pez */
    public String getEspecie() {
        return especie;
    }

    /** @param especie define la especie del pez */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /** @return true si el pez vive en agua salada, false si es de agua dulce */
    public boolean isAguaSalada() {
        return aguaSalada;
    }

    /** @param aguaSalada define si el pez vive en agua salada o dulce */
    public void setAguaSalada(boolean aguaSalada) {
        this.aguaSalada = aguaSalada;
    }

    // ===================== MÉTODOS =====================

    /**
     * Sobrescribe el método hacerSonido() de Animal.
     * Imprime el sonido característico del pez.
     */
    @Override
    public void hacerSonido() {
        System.out.println("Blub-blub");
    }

    /**
     * Muestra la información específica del tipo de agua
     * donde vive el pez, junto con su especie.
     */
    public void mostrarTipoAgua() {
        if (aguaSalada) {
            System.out.println("Especie: " + especie + "\nVive en agua salada.");
        } else {
            System.out.println("Especie: " + especie + "\nVive en agua dulce.");
        }
    }
}
