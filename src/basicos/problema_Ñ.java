package basicos;

import java.util.Scanner;

/*
 * ============================================================
 *  Proyecto:       basicos
 *  Clase:          problema_Ñ.java
 *  Autor:          Alejandro Valencia Mendoza
 *  Profesión:      Ingeniero en Sistemas Computacionales
 *  Contacto:       alejandro.valencia.mdza@gmail.com
 *  Fecha:          05/10/2025
 *
 *  Descripción:
 *      Programa que calcula el salario total de un vendedor
 *      en una compañía de autos, considerando:
 *          - Salario base mensual
 *          - Comisión fija por carro vendido
 *          - 5% del valor de cada carro vendido
 *
 *  Conceptos aprendidos:
 *      - Operaciones aritméticas
 *      - Entrada de datos con Scanner
 *      - Uso de variables double e int
 * ============================================================
 */

public class problema_Ñ {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Valores de los autos por gama
        int gamaAlta = 1_000_000;
        int gamaMedia = 500_000;
        int gamaBaja = 150_000;

        // Salario base y comisión fija
        double salarioBase = 1000.0;
        int comisionPorCarro = 150;

        // Variables para almacenar cantidad vendida
        int vendidosAlta, vendidosMedia, vendidosBaja;

        // Pedir al usuario los datos
        System.out.print("Cuántos carros vendiste de gama alta: ");
        vendidosAlta = entrada.nextInt();

        System.out.print("Cuántos carros vendiste de gama media: ");
        vendidosMedia = entrada.nextInt();

        System.out.print("Cuántos carros vendiste de gama baja: ");
        vendidosBaja = entrada.nextInt();

        // Cálculo de comisiones
        double comisionAlta = vendidosAlta * (gamaAlta * 0.05);
        double comisionMedia = vendidosMedia * (gamaMedia * 0.05);
        double comisionBaja = vendidosBaja * (gamaBaja * 0.05);

        // Comisión fija total
        int totalCarrosVendidos = vendidosAlta + vendidosMedia + vendidosBaja;
        int comisionFijaTotal = totalCarrosVendidos * comisionPorCarro;

        // Salario total
        double salarioTotal = salarioBase + comisionFijaTotal + comisionAlta + comisionMedia + comisionBaja;

        // Mostrar resultados
        System.out.println("\n=== Resumen de Ganancias ===");
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Comisión fija por carros vendidos: $" + comisionFijaTotal);
        System.out.println("Comisión por venta de gama alta: $" + comisionAlta);
        System.out.println("Comisión por venta de gama media: $" + comisionMedia);
        System.out.println("Comisión por venta de gama baja: $" + comisionBaja);
        System.out.println("Salario total a recibir: $" + salarioTotal);

        // Cerrar Scanner
        entrada.close();
    }
}

