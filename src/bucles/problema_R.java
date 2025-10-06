/*
 * ============================================================
 *  Proyecto:       Gestión de Facturas - Desinfectantes
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa para registrar 5 facturas con código de artículo,
 *      cantidad vendida en litros y precio por litro. 
 *      Calcula facturación total, litros vendidos del artículo 1 
 *      y cuántas facturas superan los $600.
 * ============================================================
 */

package bucles;

import javax.swing.JOptionPane;

public class problema_R {

    public static void main(String[] args) {
        int codigo;
        double litros;
        double precioPorLitro;
        double facturacionTotal = 0;
        double litrosArticulo1 = 0;
        int contadorFacturasMayores600 = 0;
        int totalFacturas = 5; // Cambia este valor si quieres procesar más facturas

        for (int i = 1; i <= totalFacturas; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del artículo de la factura #" + i));
            precioPorLitro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio por litro del artículo #" + i));
            litros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de litros vendidos del artículo #" + i));

            double totalFactura = precioPorLitro * litros;
            facturacionTotal += totalFactura;

            if (codigo == 1) {
                litrosArticulo1 += litros;
            }

            if (totalFactura > 600) {
                contadorFacturasMayores600++;
            }
        }

        String resultado = "Facturación total: $" + facturacionTotal + "\n"
                         + "Litros vendidos del artículo 1: " + litrosArticulo1 + "\n"
                         + "Número de facturas mayores a $600: " + contadorFacturasMayores600;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
