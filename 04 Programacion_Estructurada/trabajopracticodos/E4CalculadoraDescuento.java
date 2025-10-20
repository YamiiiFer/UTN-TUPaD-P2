/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;

import java.util.Scanner;

public class E4CalculadoraDescuento {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Pedimos al usuario el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = sc.nextDouble();

        // Pedimos la categoría del producto
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0); 
        // .toUpperCase() convierte a mayúscula (por si ponen "a", "b" o "c")

        double descuento = 0; // guardará el porcentaje de descuento en decimal
        int porcentaje = 0;   // guardará el descuento en número entero (10, 15, 20)
        
        
        /*
         * Asignamos el descuento según la categoría
         */
        if (categoria == 'A') {
            descuento = 0.10; // 10%
            porcentaje = 10;
        } else if (categoria == 'B') {
            descuento = 0.15; // 15%
            porcentaje = 15;
        } else if (categoria == 'C') {
            descuento = 0.20; // 20%
            porcentaje = 20;
        } else {
            System.out.println("Categoría inválida. Debe ser A, B o C.");
            sc.close();
            return; // salimos del programa si la categoría no es válida
        }

        // Calculamos el precio final aplicando el descuento
        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;

        // Mostramos los resultados
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Descuento aplicado: " + porcentaje + "%");
        System.out.println("Precio final: " + precioFinal);

        sc.close();

    }
    
}
