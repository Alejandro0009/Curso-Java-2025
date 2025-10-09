package triangulos;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       Gestión de Triángulos Isósceles
 *  Clase:          TriangulosIsoselesMain.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          09/10/2025
 *
 *  Descripción:
 *      Clase principal que permite al usuario crear múltiples
 *      triángulos isósceles, calcular su perímetro, área y
 *      determinar cuál de ellos tiene la mayor superficie.
 *
 *  Conceptos aprendidos:
 *      - Programación Orientada a Objetos (POO)
 *      - Uso de arreglos de objetos
 *      - Creación y uso de métodos estáticos
 *      - Interacción con el usuario usando Scanner
 *      - Recorrido de arreglos y comparación de valores
 * ============================================================
 */

public class TriangulosIsocelesMain {

    // Método para encontrar el área más grande entre varios triángulos
    public static double mayorArea(TrianguloIsoceles triangulos[]) {
        double areaMaxima = triangulos[0].obtenerArea();

        for (int i = 1; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea() > areaMaxima) {
                areaMaxima = triangulos[i].obtenerArea();
            }
        }
        return areaMaxima;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, lado;
        int nTriangulos;

        System.out.println("¿Cuántos triángulos quieres crear?");
        nTriangulos = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        // Crear un arreglo para almacenar los triángulos
        TrianguloIsoceles triangulos[] = new TrianguloIsoceles[nTriangulos];

        // Llenar los datos de cada triángulo
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nDigite los datos para el triángulo " + (i + 1) + ":");
            System.out.print("Introduzca la base: ");
            base = sc.nextDouble();
            sc.nextLine();

            System.out.print("Introduzca el valor de los lados: ");
            lado = sc.nextDouble();
            sc.nextLine();

            triangulos[i] = new TrianguloIsoceles(base, lado);

            System.out.println("\nPerímetro del triángulo: " + triangulos[i].obtenerPerimetro());
            System.out.println("Área del triángulo: " + triangulos[i].obtenerArea());
        }

        // Mostrar cuál triángulo tiene la mayor área
        System.out.println("\nEl área del triángulo con mayor superficie es: " + mayorArea(triangulos));

        sc.close();
    }
}
