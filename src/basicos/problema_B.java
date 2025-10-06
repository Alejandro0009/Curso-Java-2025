package basicos;

public class problema_B {
    
    /*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_B.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Ejemplos del uso de la clase Math en Java.
 *      Se practican operaciones como: raíces, potencias, redondeo,
 *      números aleatorios y cálculo de hipotenusa.
 *
 *  Conceptos aprendidos:
 *      - Math.sqrt(), Math.pow(), Math.round(), Math.random()
 *      - Math.hypot() para hipotenusa
 *      - Casting de double a int
 * ============================================================
 */


    public static void main(String[] args) {

        // Raíz cuadrada
        double raiz = Math.sqrt(144);
        System.out.println("La raíz cuadrada es: " + raiz);

        // Raíz cuadrada entera
        int resultado = (int) Math.sqrt(16.0);
        System.out.println("El resultado entero es: " + resultado);

        // Potencia
        double base = 5, exponente = 2;
        double resultado1 = Math.pow(base, exponente);
        System.out.println("5 elevado a 2 es: " + resultado1);

        // Redondeo
        double numeroUno = 4.15;
        long resultado3 = Math.round(numeroUno);
        System.out.println("Número redondeado: " + resultado3);

        // Número aleatorio
        double numero3 = Math.random();
        System.out.println("Número random: " + numero3);

        // Hipotenusa
        double catetoA = 3;
        double catetoB = 4;
        double resultadoHipotenusa = Math.hypot(catetoA, catetoB);
        System.out.println("Hipotenusa: " + resultadoHipotenusa);
    }
}
