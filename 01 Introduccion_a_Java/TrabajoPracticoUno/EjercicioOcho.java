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
public class EjercicioOcho {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingrese un número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese otro número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        int resultado = num1 / num2;
        
        System.out.println("Resultado " + resultado + "");

    }
}
