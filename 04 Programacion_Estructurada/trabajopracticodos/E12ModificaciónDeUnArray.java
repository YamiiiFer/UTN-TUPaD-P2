/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;
 
public class E12ModificaciónDeUnArray {

    public static void main(String[] args) {
        
        // a. Declaramos e inicializamos el array con precios de productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostramos los valores originales
        System.out.println("Precios originales:");
        for (double precio : precios) { // for-each para recorrer el array
            System.out.println("Precio: $" + precio);
        }

        // c. Modificamos el precio de un producto específico
        // Por ejemplo, cambiamos el precio del tercer producto (índice 2)
        precios[2] = 129.99;

        // d. Mostramos los valores modificados
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

    }
    
}
