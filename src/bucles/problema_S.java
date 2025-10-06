/*
 * ============================================================
 *  Proyecto:       Gestión de Ventas de Desinfectantes
 *  Autor:          Alejandro Valencia Mendoza
 *  Fecha:          06/10/2025
 *
 *  Descripción:
 *      Programa para registrar las ventas de una empresa de desinfectantes.
 *      Permite ingresar múltiples facturas con:
 *          - Código del producto
 *          - Cantidad vendida en litros
 *          - Precio por litro (opciones en dólares o euros)
 *
 *      Funcionalidades:
 *          1. Calcula la facturación total.
 *          2. Muestra el total de litros vendidos por producto.
 *          3. Indica cuántas facturas superan los $600.
 *          4. Convierte automáticamente euros a dólares si se selecciona la opción correspondiente.
 *
 *      Estructuras utilizadas:
 *          - Ciclo do-while: Para validar la selección de la opción de precio.
 *          - Ciclo for: Para procesar cada factura.
 *          - Condicionales if: Para calcular valores según la opción elegida y contar facturas mayores a 600.
 *          - Variables acumuladoras y contadores: Para la facturación total y seguimiento de litros y facturas.
 *
 *      Tecnologías y técnicas aplicadas:
 *          - Conversión de tipos numéricos (int, double)
 *          - Interacción con el usuario mediante JOptionPane
 *          - Lógica de acumuladores y contadores
 *          - Control de flujo mediante bucles y condicionales
 * ============================================================
 */

package bucles;

import javax.swing.JOptionPane;

public class problema_S {
    
    public static void main(String[] args){
        int codigo;
        double facturacionTotal = 0;
        double cantidadLitrosVendidos;
        double opcion1 = 0.6;    // Precio por litro en dólares
        int opcion2 = 3;          // Precio por litro en dólares
        double opcion3 = 1.25;    // Precio por litro en euros
        int numero;
        double multiplicacion;
        double suma = 0;
        int contador = 0;
        double transformacion;
        double res;
        
        JOptionPane.showMessageDialog(null, "El siguiente programa te ayudará a calcular tus ventas por litro.");
        
        // Validación de la opción de precio
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(
                "Por favor ingrese un número de las siguientes opciones:\n"
                + "1- 0.6 dólares el litro\n"
                + "2- 3 dólares el litro\n"
                + "3- 1.25 euros el litro"
            ));
        } while(numero >= 4);
        
        // Procesamiento de las facturas
        for(int i = 1; i <= 2; i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el código del producto número: " + i));
            cantidadLitrosVendidos = Double.parseDouble(JOptionPane.showInputDialog("¿Cuántos litros vendiste del producto número " + i + "?"));
            
            // Cálculo del precio según la opción elegida
            if(numero == 1){
                multiplicacion = cantidadLitrosVendidos * opcion1;
                suma += multiplicacion;
                facturacionTotal = suma;
            }
            
            if(numero == 2){
                multiplicacion = cantidadLitrosVendidos * opcion2;
                suma += multiplicacion;
                facturacionTotal = suma;
            }
            
            if(numero == 3){
                multiplicacion = cantidadLitrosVendidos * opcion3;
                suma += multiplicacion;
                res = suma;
                transformacion = res / 0.85; // Conversión de euros a dólares
                facturacionTotal = transformacion;
                JOptionPane.showMessageDialog(null, "El valor de la suma de euros a dólares del producto número " + i + " es de:\n" + transformacion);
            }
            
            // Contador de facturas mayores a $600
            if(facturacionTotal > 600){
                contador++;
            }
            
            // Resultados por producto
            JOptionPane.showMessageDialog(null, "Total de litros vendidos del producto número " + i + " es de:\n" + cantidadLitrosVendidos);
            JOptionPane.showMessageDialog(null, "La factura total del producto número " + i + " es de:\n" + facturacionTotal);
            JOptionPane.showMessageDialog(null, "Número de facturas mayores a $600 hasta el producto número " + i + " es de:\n" + contador);
        }
    }
}
