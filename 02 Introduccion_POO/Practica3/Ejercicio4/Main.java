/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

public class Main {
      public static void main(String[] args) {
        // Crear dos gallinas
        Gallina g1 = new Gallina(1, 2); // gallina de 2 años
        Gallina g2 = new Gallina(2, 1); // gallina de 1 año

        // Mostrar estado inicial
        System.out.println("📌 Estado inicial de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();

        // Simular acciones
        System.out.println("\n🔄 Simulando acciones...");
        g1.ponerHuevo();
        g1.ponerHuevo();
        g2.ponerHuevo();

        g1.envejecer();
        g2.envejecer();

        // Mostrar estado final
        System.out.println("\n📌 Estado final de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
