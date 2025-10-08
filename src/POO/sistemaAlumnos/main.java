package sistemaAlumnos;

/*
 * ============================================================
 *  Proyecto:       Sistema de Gestión de Alumnos
 *  Clase:          main.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          07/10/2025
 *
 *  Descripción:
 *      Clase principal que prueba la funcionalidad de la clase
 *      Alumno. Se crean tres objetos usando diferentes
 *      constructores (completo, parcial y vacío), se muestran
 *      sus datos, se realizan saludos estándar y personalizados,
 *      y se simula el incremento de edad mediante el método
 *      cumplirAños().
 *
 *  Conceptos aprendidos:
 *      - Instanciación de objetos
 *      - Llamada a métodos de instancia
 *      - Sobrecarga de métodos y constructores
 *      - Manipulación de atributos de objetos a través de métodos
 * ============================================================
 */

public class main {

    public static void main(String[] args) {

        // Crear objetos de tipo Alumno usando diferentes constructores
        Alumno alumnoUno = new Alumno("Alejandro", 25, 8.3, "Primer Grado");
        Alumno alumnoDos = new Alumno("Pedro", 20);
        Alumno alumnoTres = new Alumno();

        // Mostrar y probar datos del primer objeto
        System.out.println("Los datos del primer Objeto son: ");
        alumnoUno.mostrarDatos();
        alumnoUno.saludar();                           // saludo estándar
        alumnoUno.saludar("Hola soy el primer Objeto."); // saludo personalizado
        alumnoUno.cumplirAños();                       // incrementar edad
        System.out.println("");

        // Mostrar y probar datos del segundo objeto
        System.out.println("Los datos del Segundo Objeto son: ");
        alumnoDos.mostrarDatos();
        alumnoDos.saludar();                           
        alumnoDos.saludar("Hola soy el segundo Objeto."); 
        alumnoDos.cumplirAños();                       
        System.out.println("");

        // Mostrar y probar datos del tercer objeto
        System.out.println("Los datos del Tercer Objeto son: ");
        alumnoTres.mostrarDatos();
        alumnoTres.saludar();                           
        alumnoTres.saludar("Hola soy el tercer Objeto."); 
        alumnoTres.cumplirAños();                       
        System.out.println("");
    }
}
