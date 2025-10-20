/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;

import java.util.Scanner;

public class E8PrecioFinal {

    // Método que calcula el precio final con impuesto y descuento
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convertimos los porcentajes a decimal
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        // Fórmula: PrecioFinal = PrecioBase + (PrecioBase*Impuesto) - (PrecioBase*Descuento)
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        return precioFinal;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario los datos
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = sc.nextDouble();

        // Llamamos al método para calcular el precio final
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostramos el resultado
        System.out.println("El precio final del producto es: " + precioFinal);

        sc.close();
    }
}
