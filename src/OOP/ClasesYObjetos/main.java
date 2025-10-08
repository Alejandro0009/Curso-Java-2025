package ClasesYObjetos;

/*
 * ============================================================
 *  Proyecto:       Operaciones Básicas con Clases y Objetos
 *  Clase:          main.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase principal que prueba la funcionalidad de la clase
 *      'Operacion'. Solicita al usuario dos números mediante
 *      cuadros de diálogo, realiza operaciones básicas
 *      (suma, resta, multiplicación y división) y muestra los
 *      resultados en consola.
 *
 *  Conceptos aprendidos:
 *      - Instanciación de objetos y llamadas a métodos
 *      - Uso de métodos sin parámetros para encapsular lógica
 *      - Separación de captura de datos, cálculos y presentación
 *      - Manejo de resultados de operaciones aritméticas
 * ============================================================
 */

public class main {

    public static void main(String[] args) {
        // Crear objeto de tipo Operacion
        Operacion op = new Operacion();

        // Llamar métodos para leer números y realizar operaciones
        op.leerNumeros();
        op.sumar();
        op.resta();
        op.multiplicar();
        op.division();

        // Mostrar resultados en consola
        op.mostrarResultados();
    }
}
