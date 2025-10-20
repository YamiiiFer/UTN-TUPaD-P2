/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;

import java.util.Scanner;

public class E7ValidacionNotaDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota; // Variable para almacenar la nota ingresada

        /*
         * Usamos do-while para pedir la nota al menos una vez
         * y repetir mientras la nota esté fuera del rango 0-10
         */
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();

            // Verificamos si la nota es inválida
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        // Si llegamos aquí, la nota es válida
        System.out.println("Nota guardada correctamente.");

        sc.close();
    }
    
}
