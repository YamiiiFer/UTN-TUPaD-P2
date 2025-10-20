/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticodos;

import java.util.Scanner;

public class E3ClasificacionDeEdad {
    
    // Constantes para los límites de edad
    private static final int LIMITE_NINIO = 12;        // Menor de 12 → Niño
    private static final int LIMITE_ADOLESCENTE = 17;  // De 12 a 17 → Adolescente
    private static final int LIMITE_ADULTO = 59;       // De 18 a 59 → Adulto
    // 60 o más → Adulto mayor
        public static void main(String[] args) {
        // Creamos el objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario su edad
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        String clasificacion; // Variable donde guardamos la etapa de vida

        // Clasificación usando las constantes en vez de números "duros"
        if (edad < LIMITE_NINIO) {
            clasificacion = "Niño";
        } else if (edad <= LIMITE_ADOLESCENTE) {
            clasificacion = "Adolescente";
        } else if (edad <= LIMITE_ADULTO) {
            clasificacion = "Adulto";
        } else {
            clasificacion = "Adulto mayor";
        }

        System.out.println("Eres un " + clasificacion + ".");

        sc.close();   
    }
    
}
