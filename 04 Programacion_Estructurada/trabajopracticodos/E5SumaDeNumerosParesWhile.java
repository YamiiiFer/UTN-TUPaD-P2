/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;

import java.util.Scanner;

public class E5SumaDeNumerosParesWhile {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero; // número ingresado por el usuario
        int sumaPares = 0; // acumulador para la suma de números pares

        // Pedimos el primer número al usuario
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = sc.nextInt();

        // Mientras el número no sea 0, seguimos pidiendo números
        while (numero != 0) {
            // Verificamos si el número es par
            if (numero % 2 == 0) {
                sumaPares += numero; // sumamos al acumulador
            }

            // Pedimos otro número
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();
        }

        // Al salir del bucle (cuando se ingresa 0), mostramos el resultado
        System.out.println("La suma de los números pares es: " + sumaPares);

        sc.close();

    }
    
}
