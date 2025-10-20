/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;

import java.util.Scanner;

public class E2MayorDe3Numeros {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer datos del teclado
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que ingrese tres números enteros
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt(); // guardamos el primero

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt(); // guardamos el segundo

        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt(); // guardamos el tercero
        
        // Variable para almacenar el mayor de los tres
        int mayor;

        /*
         * Lógica:
         * Comparamos los tres números utilizando condicionales.
         * - Si num1 es mayor que num2 y también mayor que num3 → el mayor es num1
         * - Sino, si num2 es mayor que num1 y num3 → el mayor es num2
         * - Si no se cumple ninguno de los anteriores → el mayor es num3
         */
        
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        // Mostramos el resultado
        System.out.println("El mayor es: " + mayor);

        // Cerramos el Scanner para liberar recursos
        sc.close();

    }
    
}
