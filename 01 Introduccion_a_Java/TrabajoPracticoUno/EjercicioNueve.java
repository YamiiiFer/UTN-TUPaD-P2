/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopracticouno;

import java.util.Scanner;

/**
 *
 * @author el10d
 */
public class EjercicioNueve {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.next(); // ERROR
        System.out.println("Hola, " + nombre); */
        
        Scanner input = new Scanner(System.in);
        String nombre;
        System.out.print("Ingresa tu nombre: ");
        nombre = input.nextLine();

        System.out.println("Hola, " + nombre);


        

    }
}
