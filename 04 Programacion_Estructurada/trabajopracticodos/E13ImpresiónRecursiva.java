/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;

public class E13ImpresiónRecursiva {
    
    // Función recursiva para imprimir los precios
    public static void imprimirPrecios(double[] precios, int indice) {
        // Caso base: si el índice supera la longitud del array, terminamos
        if (indice >= precios.length) {
            return;
        }

        // Imprimimos el precio actual
        System.out.println("Precio: $" + precios[indice]);

        // Llamada recursiva para el siguiente elemento
        imprimirPrecios(precios, indice + 1);
    
    }
    
    public static void main(String[] args) {
        // a. Declaramos e inicializamos el array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostramos los precios originales usando la función recursiva
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0); // empezamos desde el índice 0

        // c. Modificamos el precio de un producto específico
        precios[2] = 129.99; // cambiamos el tercer producto (índice 2)

        // d. Mostramos los precios modificados usando la función recursiva
        System.out.println("\nPrecios modificados:");
        imprimirPrecios(precios, 0); // volvemos a empezar desde el índice 0

    
    }
    
}
