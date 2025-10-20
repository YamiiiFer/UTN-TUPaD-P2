/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;

import java.util.Scanner;

public class E1AnioBisiesto {

    
    public static void main(String[] args) {
         // Creamos un objeto Scanner para leer datos desde el teclado
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que ingrese un año
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();
        
        /*
         * Reglas para determinar si un año es bisiesto:
         * - Un año es bisiesto si es divisible entre 4.
         * - Pero si también es divisible entre 100, entonces no es bisiesto,
         *   excepto que sea divisible entre 400.
         * 
         * Ejemplos:
         * 2024 → divisible entre 4 y no entre 100 → bisiesto
         * 1900 → divisible entre 4 y entre 100 pero NO entre 400 → no bisiesto
         * 2000 → divisible entre 400 → bisiesto
         */
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

        // Cerramos el Scanner para liberar recursos
        sc.close();
        
    }
    
}
