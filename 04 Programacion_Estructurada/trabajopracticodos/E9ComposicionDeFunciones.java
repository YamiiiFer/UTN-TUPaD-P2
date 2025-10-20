/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;

import java.util.Scanner;

public class E9ComposicionDeFunciones {

    // Método para calcular el costo de envío según peso y zona
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0; // Nacional: $5 por kg
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0; // Internacional: $10 por kg
        } else {
            System.out.println("Zona inválida. Se asumirá Nacional.");
            costoPorKg = 5.0; 
        }

        return peso * costoPorKg;
    }
        // Método que calcula el total de la compra (producto + envío)
    public static double calcularTotalCompra(double precioProducto, double peso, String zona) {
        double costoEnvio = calcularCostoEnvio(peso, zona); // usamos la función anterior
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine();

        // Calculamos el costo de envío usando la función
        double costoEnvio = calcularCostoEnvio(peso, zona);

        // Calculamos el total de la compra usando la función que compone la anterior
        double total = calcularTotalCompra(precioProducto, peso, zona);

        // Mostramos resultados
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        sc.close();
    }
}

