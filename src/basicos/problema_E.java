package basicos;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_E.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Ejemplo de tipos de datos primitivos, wrappers y String en Java.
 *      Incluye comentarios explicativos sobre cada tipo y su uso.
 *
 *  Conceptos aprendidos:
 *      - Datos primitivos (int, double, char, boolean, float, long, byte, short)
 *      - Wrappers (*
*/

public class problema_E {

    public static void main(String[] args) {

        // Datos primitivos
        int edad = 25;
        char letra = 'A';
        boolean encendido = true;
        double temperatura = 36.6;
        float pi = 3.14f;

        // Wrappers (permiten métodos y null)
        Integer numero = 10;
        Integer numeroNull = null;
        Double numeroDecimal = 2.334;

        // String
        String nombre = "Alejandro";

        // Ejemplos de uso
        System.out.println("Edad: " + edad);
        System.out.println("Letra: " + letra);
        System.out.println("Encendido: " + encendido);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Número (wrapper): " + numero);
        System.out.println("Número nulo (wrapper): " + numeroNull);
        System.out.println("Decimal (wrapper): " + numeroDecimal);
        System.out.println("Nombre: " + nombre);

        // Conversión de wrappers a primitivos
        int edadPrimitive = numero.intValue();
        double decimalPrimitive = numeroDecimal.doubleValue();
        System.out.println("Edad como primitivo: " + edadPrimitive);
        System.out.println("Decimal como primitivo: " + decimalPrimitive);
    }
}
