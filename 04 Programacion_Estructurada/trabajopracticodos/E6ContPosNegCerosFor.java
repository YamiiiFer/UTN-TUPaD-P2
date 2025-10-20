/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;

import java.util.Scanner;

public class E6ContPosNegCerosFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Contadores para positivos, negativos y ceros
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Usamos un bucle for para pedir 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = sc.nextInt();

            // Clasificamos el número ingresado
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostramos los resultados
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        sc.close();

    }
    
}
