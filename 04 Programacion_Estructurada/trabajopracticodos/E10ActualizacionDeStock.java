/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;

import java.util.Scanner;

public class E10ActualizacionDeStock {

     // Método que calcula el nuevo stock después de ventas y recepción
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        // Fórmula: NuevoStock = StockActual - CantidadVendida + CantidadRecibida
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = sc.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = sc.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = sc.nextInt();

        // Llamamos al método para calcular el nuevo stock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostramos el resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        sc.close();
    }
    }
    

