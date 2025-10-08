package Carro;

/*
 * ============================================================
 *  Proyecto:       Gestión de Objetos Coche
 *  Clase:          coche.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase que representa un coche con atributos básicos
 *      como color, marca y kilometraje. Se crean dos objetos
 *      distintos y se muestran sus características en consola.
 *
 *  Conceptos aprendidos:
 *      - Creación de objetos a partir de una clase
 *      - Asignación de valores a atributos
 *      - Uso de System.out.println para mostrar información
 *      - Introducción a Programación Orientada a Objetos (POO)
 * ============================================================
 */

public class coche {

    // Atributos de la clase coche
    String color;
    String marca;
    int km;

    // Método principal para crear objetos y mostrar sus datos
    public static void main(String[] args) {
        // Crear primer objeto coche1
        coche coche1 = new coche();
        coche1.color = "azul";
        coche1.km = 0;
        coche1.marca = "chevrolet";

        // Mostrar información del primer coche
        System.out.println("El color del carro es: " + coche1.color);
        System.out.println("El kilometraje del carro es: " + coche1.km);
        System.out.println("La marca del carro es: " + coche1.marca);

        // Crear segundo objeto coche2
        coche coche2 = new coche();
        coche2.color = "rojo";
        coche2.km = 100;
        coche2.marca = "audi";

        // Mostrar información del segundo coche
        System.out.println("El color del carro es: " + coche2.color);
        System.out.println("El kilometraje del carro es: " + coche2.km);
        System.out.println("La marca del carro es: " + coche2.marca);
    }
}
