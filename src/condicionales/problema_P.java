package Condicionales;

import javax.swing.JOptionPane;

/*
 * ============================================================
 *  Proyecto:       Condicionales
 *  Clase:          problema_P.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que convierte una cantidad de kilogramos (kg)
 *      a otras unidades de medida de masa, según la elección del usuario.
 *      Unidades disponibles:
 *          1. Hectogramo (hg)
 *          2. Decagramo (dag)
 *          3. Gramo (g)
 *          4. Decigramo (dg)
 *          5. Centigramo (cg)
 *          6. Miligramo (mg)
 *
 *  Conceptos aprendidos:
 *      - Uso de switch para seleccionar opciones
 *      - Conversión de unidades
 *      - Entrada y salida con JOptionPane
 * ============================================================
 */

public class problema_P {

    public static void main(String[] args) {

        double kg;
        int opcion;
        double resultado = 0;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Un programa que convierte kilogramos a otra unidad de masa.\n" +
                        "Seleccione la unidad a convertir:\n" +
                        "1. Hectogramo\n" +
                        "2. Decagramo\n" +
                        "3. Gramo\n" +
                        "4. Decigramo\n" +
                        "5. Centigramo\n" +
                        "6. Miligramo"));

        kg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en kilogramos:"));

        switch (opcion) {
            case 1: // Hectogramo
                resultado = kg * 10;
                JOptionPane.showMessageDialog(null, kg + " kg = " + resultado + " hg");
                break;
            case 2: // Decagramo
                resultado = kg * 100;
                JOptionPane.showMessageDialog(null, kg + " kg = " + resultado + " dag");
                break;
            case 3: // Gramo
                resultado = kg * 1000;
                JOptionPane.showMessageDialog(null, kg + " kg = " + resultado + " g");
                break;
            case 4: // Decigramo
                resultado = kg * 10000;
                JOptionPane.showMessageDialog(null, kg + " kg = " + resultado + " dg");
                break;
            case 5: // Centigramo
                resultado = kg * 100000;
                JOptionPane.showMessageDialog(null, kg + " kg = " + resultado + " cg");
                break;
            case 6: // Miligramo
                resultado = kg * 1000000;
                JOptionPane.showMessageDialog(null, kg + " kg = " + resultado + " mg");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione entre 1 y 6.");
        }

    }

}
