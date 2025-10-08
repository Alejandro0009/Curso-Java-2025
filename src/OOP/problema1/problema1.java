package problema1;

/*
 * ============================================================
 *  Proyecto:       Registro de Usuarios
 *  Clase:          problema1.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase principal que prueba la funcionalidad de la clase
 *      'nombre'. Se crean dos objetos para capturar y mostrar
 *      información de distintos usuarios (nombre, edad y 
 *      nacionalidad) mediante la consola.
 *
 *  Conceptos aprendidos:
 *      - Instanciación de objetos
 *      - Llamada a métodos de captura y visualización de datos
 *      - Manejo de múltiples objetos de una misma clase
 *      - Separación de lógica entre métodos y clase principal
 * ============================================================
 */

public class problema1 {

    public static void main(String[] args) {

        // Crear dos objetos de tipo 'nombre'
        nombre name = new nombre();
        nombre name1 = new nombre();

        // Pedir datos para cada usuario
        name.pedirDatos();
        name1.pedirDatos();

        // Mostrar los datos ingresados por cada usuario
        name.mostrarDatos();
        name1.mostrarDatos();
    }
}
