/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;

import java.util.Scanner;

public class E11CalculoDeDescuento {

    // Variable global (constante) para el descuento especial del 10%
    public static final double DESCUENTO_ESPECIAL = 0.10;

    // Método que calcula y muestra el descuento usando la variable global
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local para almacenar el monto del descuento aplicado
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;

        // Calculamos el precio final con descuento
        double precioFinal = precio - descuentoAplicado;

        // Mostramos los resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        // Llamamos al método para calcular el descuento especial
        calcularDescuentoEspecial(precio);

        sc.close();
    }
    
}
