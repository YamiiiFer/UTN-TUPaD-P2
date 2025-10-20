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
public class EjercicioCinco {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        int suma;
        int resta;
        int division;
        int multiplicacion;
        
        System.out.print("Ingrese un número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese otro número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        division = num1 / num2;
        multiplicacion = num1 * num2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("División: " + division);
        System.out.println("Multiplicación: " + multiplicacion);

        

    }
    
}
